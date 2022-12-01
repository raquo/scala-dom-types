package com.raquo.domtypes.temp.parsers

import com.raquo.domtypes.common.{HtmlTagType, SvgTagType, TagDef, TagType}

import scala.io.Source

object TagTraitParser {

  /** @return (list of defs, list of global comment lines) */
  def apply(
    inputFileName: String,
    inputFile: Source,
    tagType: TagType,
  ): (Array[TagDef], List[String]) = {

    val lines = inputFile.mkString.split("\n")

    var accumulatedCommentLines: List[String] = Nil

    var accumulatedGlobalCommentLines: List[String] = Nil

    var traitDefinitionLineNumber = 0
    var lineNumber = 0

    val tagDefs = lines.flatMap { line =>
      lineNumber += 1
      line.takePrefix("  ") match {
        case ParseExtracted(indentedLine, _) =>
          indentedLine.takePrefix("lazy val ") match {
            case ParseExtracted(_, _) =>
              accumulatedCommentLines = accumulatedCommentLines.reverse.dropWhile(_.isEmpty).reverse
              val tagDef = parseDef(tagType, inputFileName, indentedLine, accumulatedCommentLines)
              accumulatedCommentLines = Nil
              Some(tagDef)
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
                  } else if ((indentedLine.startsWith("Svg") && indentedLine.contains(" <: "))) {
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

    (tagDefs, accumulatedGlobalCommentLines)
  }

  def parseDef(tagType: TagType, inputFileName: String, line: String, accumulatedCommentLines: List[String]): TagDef = {
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

    // extract and ignore
    def skip(result: ParseResult): Unit = {
      extract(result)
      ()
    }

    skip(rest.takePrefix("lazy val "))
    val defName = extract(rest.takeDefName)
    skip(rest.takePrefix(": T"))
    val typeParam = extract(rest.takeTypeParams)
    val concreteTypeName = concreteTypeParamName(typeParam)
    skip(rest.takePrefix(" = "))
    val implName = extract(rest.takeCallableName)
    val implParams = extract(rest.takeParams)
    if (rest.nonEmpty) {
      throw new Exception(s"[$inputFileName] Failed to parse `$line`. Remaining unparsed after all is done: ${rest}")
    }
    val domTagName = extract(implParams.takeStringLiteral)

    // after extracting from implParams, `rest` is now the remainder of `implParams`
    val isVoid = if (rest.contains(",")) {
      extract(rest.takeSuffix(", void = true")) // proof
      true
    } else {
      false
    }

    if (rest.nonEmpty) {
      throw new Exception(s"[$inputFileName] Failed to parse `$line`. Remaining unparsed impl params: ${rest}")
    }

    val docsUrlKey = tagType match {
      case HtmlTagType => "HTML"
      case SvgTagType => "SVG"
    }
    val javascriptElementType = (concreteTypeName match {
      case "dom.html.Html" => "HTMLHtmlElement"
      case "dom.html.Element" => "HTMLElement"
      case "dom.svg.Element" => "SVGElement"
      case "dom.svg.A" => "SVGAElement"
      case "dom.svg.SVG" => "SVGSVGElement"
      case el if el.startsWith("dom.html.") =>
        el.replace("dom.html.", "HTML") + "Element"
      case el if el.startsWith("dom.svg.") =>
        el.replace("dom.svg.", "SVG") + "Element"
      case other =>
        throw new Exception(s"unknown element type: $other")
    }) match {
      case "HTMLHrElement" => "HTMLHRElement"
      case "HTMLBrElement" => "HTMLBRElement"
      case x => x
    }

    val docUrls = if (javascriptElementType != "HTMLElement" && javascriptElementType != "SVGElement") {
      List(
        s"https://developer.mozilla.org/en-US/docs/Web/${docsUrlKey}/Element/${domTagName}",
        s"https://developer.mozilla.org/en-US/docs/Web/API/$javascriptElementType"
      )
    } else {
      List(
        s"https://developer.mozilla.org/en-US/docs/Web/${docsUrlKey}/Element/${domTagName}"
      )
    }

    TagDef(
      tagType = tagType,
      scalaName = defName,
      domName = domTagName,
      isVoid = isVoid,
      scalaJsElementType = concreteTypeName,
      javascriptElementType = javascriptElementType,
      commentLines = accumulatedCommentLines,
      docUrls = docUrls
    )
  }

  def concreteTypeParamName(typeParamName: String): String = {
    if (typeParamName == "Html") {
      "dom.html.Html"
    } else if (typeParamName == "SvgAnchor") {
      "dom.svg.A"
    } else if (typeParamName == "Svg") {
      "dom.svg.SVG"
    } else if (typeParamName.startsWith("Html")) {
      typeParamName.replace("Html", "dom.html.")
    } else if (typeParamName.startsWith("Svg")) {
      typeParamName.replace("Svg", "dom.svg.")
    } else {
      typeParamName
    }
  }
}
