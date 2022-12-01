package com.raquo.domtypes.temp.parsers

import com.raquo.domtypes.common.EventPropDef

import scala.io.Source

object EventPropTraitParser {

  /** @return (list of defs, list of global comment lines) */
  def apply(
    inputFileName: String,
    inputFile: Source,
  ): (Array[EventPropDef], List[String]) = {

    val lines = inputFile.mkString.split("\n")

    var accumulatedCommentLines: List[String] = Nil

    var accumulatedGlobalCommentLines: List[String] = Nil

    var traitDefinitionLineNumber = 0
    var lineNumber = 0

    val eventPropDefs = lines.flatMap { line =>
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

    (eventPropDefs, accumulatedGlobalCommentLines)
  }

  def parseDef(inputFileName: String, line: String, accumulatedCommentLines: List[String]): EventPropDef = {
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
    skip(rest.takePrefix(": EP"))
    val typeParam = extract(rest.takeTypeParams)
    val concreteTypeName = concreteTypeParamName(typeParam, inputFileName)
    skip(rest.takePrefix(" = "))
    val implName = extract(rest.takeCallableName)
    val implParams = extract(rest.takeParams)
    if (rest.nonEmpty) {
      throw new Exception(s"[$inputFileName] Failed to parse `$line`. Remaining unparsed after all is done: ${rest}")
    }
    val domEventName = extract(implParams.takeStringLiteral)

    if (rest.nonEmpty) {
      throw new Exception(s"[$inputFileName] Failed to parse `$line`. Remaining unparsed impl params: ${rest}")
    }

    val javascriptEventType = concreteTypeName.replace("dom.", "")

    val mainDocUrl = if (defName == "onSubmit" || defName == "onReset") {
      s"https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/${domEventName}_event"
    } else if (defName == "onInvalid" || defName == "onSearch") {
      s"https://developer.mozilla.org/en-US/docs/Web/API/HTMLInputElement/${domEventName}_event"
    } else if (inputFileName == "WindowOnlyEventProps.scala" || defName == "onLoad" || defName == "onResize" || defName == "onScroll") {
      s"https://developer.mozilla.org/en-US/docs/Web/API/Window/${domEventName}_event"
    } else if (defName == "onCueChange") {
      s"https://developer.mozilla.org/en-US/docs/Web/API/TextTrack/${domEventName}_event"
    } else if (defName.startsWith("onDrag") || defName.startsWith("onDrop")) {
      s"https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/${domEventName}_event"
    } else if (inputFileName == "DocumentOnlyEventProps.scala") {
      s"https://developer.mozilla.org/en-US/docs/Web/API/Document/${domEventName}_event"
    } else if (inputFileName == "MediaEventProps.scala") {
      s"https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/${domEventName}_event"
    } else {
      s"https://developer.mozilla.org/en-US/docs/Web/API/Element/${domEventName}_event"
    }

    val docUrls = if (javascriptEventType == "Event") {
      List(mainDocUrl)
    } else (
      List(mainDocUrl, s"https://developer.mozilla.org/en-US/docs/Web/API/$javascriptEventType")
    )
    EventPropDef(
      scalaName = defName,
      domName = domEventName,
      scalaJsEventType = concreteTypeName,
      javascriptEventType = javascriptEventType,
      commentLines = accumulatedCommentLines,
      docUrls = docUrls
    )
  }

  def concreteTypeParamName(typeParamName: String, inputFileName: String): String = {
    val map = Map(
      "DomElementMouseEvent" -> "dom.MouseEvent",
      "DomElementTargetEvent" -> "dom.Event",
      "DomHtmlElementTargetEvent" -> "dom.Event",
      "DomFormElementTargetEvent" -> "dom.Event",
      "DomInputElementTargetEvent" -> "dom.Event",
      "DomElementFocusEvent" -> "dom.FocusEvent",
      "DomElementPointerEvent" -> "dom.PointerEvent",
    )
    map.getOrElse(typeParamName, {
      if (typeParamName.startsWith("Dom")) {
        typeParamName.replace("Dom", "dom.")
      } else {
        throw new Exception(s"[$inputFileName] Unknown type: " + typeParamName)
      }
    })
  }
}
