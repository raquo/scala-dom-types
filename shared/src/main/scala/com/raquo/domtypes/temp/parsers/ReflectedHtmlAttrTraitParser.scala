package com.raquo.domtypes.temp.parsers

import com.raquo.domtypes.common.ReflectedHtmlAttrDef

import scala.io.Source

object ReflectedHtmlAttrTraitParser {

  /** @return (list of defs, list of global comment lines) */
  def apply(
    inputFileName: String,
    inputFile: Source,
  ): (Array[ReflectedHtmlAttrDef], List[String]) = {

    val lines = inputFile.mkString.split("\n")

    var accumulatedCommentLines: List[String] = Nil

    var accumulatedGlobalCommentLines: List[String] = Nil

    var traitDefinitionLineNumber = 0
    var lineNumber = 0

    val defs = lines.flatMap { line =>
      lineNumber += 1
      line.takePrefix("  ") match {
        case ParseExtracted(indentedLine, _) =>
          indentedLine.takePrefix("lazy val ") match {
            case ParseExtracted(_, _) =>
              accumulatedCommentLines = accumulatedCommentLines.reverse.dropWhile(_.isEmpty).reverse
              val eventPropDef = parseDef(inputFileName, indentedLine, accumulatedCommentLines)
              accumulatedCommentLines = Nil
              Some(eventPropDef)
            case ParseFailed(_, _) =>
              indentedLine.trim.takeAnyOnePrefix("/**", "/*", "*/", "*") match {
                case ParseExtracted(commentLine, _) =>
                  val trimmedCommentLine = commentLine.trim
                  if (trimmedCommentLine.isEmpty) {
                    if (accumulatedCommentLines.nonEmpty) {
                      accumulatedCommentLines = accumulatedCommentLines :+ ""
                    } else {
                      // ignore
                    }
                  } else if (
                    trimmedCommentLine == "MDN"
                      || trimmedCommentLine.startsWith("MDN  ")
                      || trimmedCommentLine.startsWith("https://developer.mozilla.org/")
                      || trimmedCommentLine.startsWith("@see https://developer.mozilla.org/")
                  ) {
                    // ignore
                  } else {
                    // println("// " + trimmedCommentLine)
                    val cleanedCommentLine = commentLine.replace("--MDN", "").replaceAll("^\\s", "").replaceAll("\\s+$", "") // trimLeft(one) + trimRight
                    accumulatedCommentLines = accumulatedCommentLines :+ cleanedCommentLine
                  }
                case _ =>
                  if (indentedLine.trim.isEmpty) {
                    if (accumulatedCommentLines.isEmpty) {
                      // ignore
                    } else {
                      throw new Exception(s"[$inputFileName] Found empty line after comment lines:\n${accumulatedCommentLines.mkString("\n")}")
                    }
                  } else if (indentedLine == "DomEvent," || indentedLine.startsWith("EP[_ <: ") || indentedLine.contains("Event <: Dom")) {
                    // ignore
                  } else if (indentedLine.trim.startsWith("this: ")) {
                    if (accumulatedCommentLines.isEmpty) {
                      // ignore
                    } else {
                      throw new Exception(s"[$inputFileName] There were accumulated comments prior to the `this: ` block:\n${accumulatedCommentLines.mkString("\n")}")
                    }
                  } else if (indentedLine.trim.startsWith("// ")) {
                    // ignore
                  } else {
                    throw new Exception(s"[$inputFileName] Unknown kind of indented line: ${indentedLine}")
                  }
              }
              None
          }
        case ParseFailed(_, _) =>
          // println("-" + line)
          if (
            line.startsWith("trait ")
          ) {
            assert(traitDefinitionLineNumber == 0)
            traitDefinitionLineNumber = lineNumber
            // Ugly and fragile AF, but we want to make sure that all comments on top of the trait are recorded separately.
            // Indent alone doesn't help to distinguish comments.
            accumulatedGlobalCommentLines = accumulatedGlobalCommentLines ++ accumulatedCommentLines
            accumulatedCommentLines = Nil
          }
          if (
            line.startsWith("package ")
              || line.startsWith("import ")
              || line.startsWith("trait ")
              || line.startsWith("this: ")
              || line.startsWith("] { this: ")
              || line.startsWith("/**")
              || line.startsWith(" *")
              || line.trim == "}"
              || line.trim == "] {"
              || line.trim.isEmpty
          ) {
            // println(">>>>")
            // println(line)
            // println(accumulatedCommentLines)
            // ignore
          } else {
            // println(line)
            throw new Exception(s"[$inputFileName] Unknown kind of line: ${line}")
          }
          None
      }
    }

    (defs, accumulatedGlobalCommentLines)
  }

  def parseDef(inputFileName: String, line: String, accumulatedCommentLines: List[String]): ReflectedHtmlAttrDef = {
    var rest = line

    def extract(result: ParseResult): String = {
      result match {
        case ParseExtracted(_rest, whatTaken) =>
          rest = _rest
          whatTaken
        case ParseFailed(originalRest, errorMessage) =>
          throw new Exception(s"""[$inputFileName] Failed to parse `$line` because "${errorMessage}". Remaining unparsed: ${originalRest}""")
      }
    }

    val _ = extract(rest.takePrefix("lazy val "))
    val defName = extract(rest.takeDefName)
    val _ = extract(rest.takePrefix(": RA"))
    val typeParams = extract(rest.takeTypeParams).split(", ")
    assert(typeParams.length == 2)
    val scalaType = typeParams(0)
    val domPropType = typeParams(1)
    // val concreteTypeName = concreteTypeParamName(typeParam, inputFileName)
    val _ = extract(rest.takePrefix(" = "))
    val implName = extract(rest.takeCallableName)
    val implParams = extract(rest.takeParams)
    if (rest.nonEmpty) {
      throw new Exception(s"[$inputFileName] Failed to parse `$line`. Remaining unparsed after all is done: ${rest}")
    }
    val domAttrName = extract(implParams.takeStringLiteral)
    val _ = extract(rest.takePrefix(", "))
    val domPropName = extract(rest.takeStringLiteral)

    if (rest.nonEmpty) {
      throw new Exception(s"[$inputFileName] Failed to parse `$line`. Remaining unparsed impl params: ${rest}")
    }

    val (attrCodec, propCodec) = attrAndPropCodecs(domAttrName, implName, inputFileName)

    ReflectedHtmlAttrDef(
      scalaName = defName,
      domAttrName = domAttrName,
      domPropName = domPropName,
      scalaValueType = scalaType,
      domPropValueType = domPropType,
      attrCodec = attrCodec,
      propCodec = propCodec,
      commentLines = accumulatedCommentLines,
      docUrls = docUrls(domAttrName, defName, inputFileName)
    )
  }

  def attrAndPropCodecs(domAttrName: String, implName: String, inputFileName: String): (String, String) = {
    implName match {
      case "intReflectedAttr" => ("IntAsString", "IntAsIs")
      case "doubleReflectedAttr" => ("DoubleAsString", "DoubleAsIs")
      case "stringReflectedAttr" => ("StringAsIs", "StringAsIs")
      case "booleanAsPresenceReflectedAttr" => ("BooleanAsAttrPresence", "BooleanAsIs")
      case "booleanAsTrueFalseReflectedAttr" => ("BooleanAsTrueFalseString", "BooleanAsIs")
      case "booleanAsYesNoReflectedAttr" => ("BooleanAsYesNoString", "BooleanAsIs")
      case _ => throw new Exception(s"[$inputFileName] Not sure what codec to use for attr $domAttrName ($implName)")
    }
  }

  def docUrls(domAttrName: String, defName: String, inputFileName: String): List[String] = {
    domAttrName match {
      // case "dropzone" | "form" | "list" | "unselectable" => Nil
      // case "contenteditable" => List(
      //   "https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/contentEditable"
      // )
      // case "max" | "min" | "step" => List(
      //   s"https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/$domAttrName"
      // )
      // case "contextmenu" => List(
      //   "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/contextmenu"
      // )
      case "cols" | "rows" =>
        List(
          s"https://developer.mozilla.org/en-US/docs/Web/HTML/Element/textarea#attr-$domAttrName"
        )
      case "colspan" | "rowspan" =>
        List(
          s"https://developer.mozilla.org/en-US/docs/Web/HTML/Element/td#attr-$domAttrName"
        )
      case "content" | "http-equiv" =>
        List(
          s"https://developer.mozilla.org/en-US/docs/Web/HTML/Element/meta#attr-$domAttrName"
        )
      case "checked" =>
        List(
          s"https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#attr-$domAttrName"
        )
      case "selected" =>
        List(
          s"https://developer.mozilla.org/en-US/docs/Web/HTML/Element/option#attr-$domAttrName"
        )
      case "method" | "novalidate" | "enctype" =>
        List(
          s"https://developer.mozilla.org/en-US/docs/Web/HTML/Element/form#attr-$domAttrName"
        )
      case "scoped" =>
        List("https://developer.mozilla.org/en-US/docs/Web/API/HTMLStyleElement/scoped")
      case "src" =>
        List(
          "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img#attr-src",
          "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#src",
          "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/iframe#attr-src"
        )
      case "value" | "formaction" | "formenctype" | "formmethod" | "formnovalidate" | "formtarget" | "multiple" | "name" | "placeholder" =>
        List(
          s"https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#$domAttrName"
        )
      case "media" =>
        List("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/link#attr-media")
      case "loading" =>
        List(
          "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img#attr-loading",
          "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/iframe#attr-loading"
        )
      case "label" | "xmlns" =>
        Nil
      case "high" | "low" | "min" | "max" | "optimum" =>
        List(
          s"https://developer.mozilla.org/en-US/docs/Web/HTML/Element/meter#attr-$domAttrName"
        )
      case "href" | "download" | "target" =>
        List(
          s"https://developer.mozilla.org/en-US/docs/Web/HTML/Element/a#attr-$domAttrName"
        )
      // case "enctype" =>
      //   List("https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/enctype")
      case "accesskey" | "autocapitalize" | "autofocus" | "class" | "contenteditable" | "contextmenu" | "dir" | "draggable" | "enterkeyhint" | "hidden" | "id" | "inert" | "inputmode" | "lang" | "role" | "slot" | "spellcheck" | "style" | "tabindex" | "title" | "translate" =>
        List(
          s"https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/$domAttrName"
        )
      case _ =>
        List(
          // if (inputFileName.contains("Aria")) {
          //   s"https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/$domAttrName"
          // } else if (inputFileName.contains("Svg")) {
          //   s"https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/$domAttrName"
          // } else {
            s"https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/$domAttrName"
          // }
        )
    }
  }

  def concreteTypeParamName(typeParamName: String, inputFileName: String): String = {
    val asIsTypes = Set("Double", "String", "Int", "Boolean")
    if (asIsTypes.contains(typeParamName)) {
      typeParamName
    } else {
      val map = Map[String, String](
      )
      map.getOrElse(typeParamName, {
        if (typeParamName.startsWith("DomHtml")) {
          typeParamName.replace("DomHtml", "dom.html.")
        } else if (typeParamName.startsWith("DomSvg")) {
          typeParamName.replace("DomSvg", "dom.svg.")
        } else if (typeParamName.startsWith("Dom")) {
          typeParamName.replace("Dom", "dom.")
        } else {
          throw new Exception(s"[$inputFileName] Unknown type: " + typeParamName)
        }
      })
    }
  }
}
