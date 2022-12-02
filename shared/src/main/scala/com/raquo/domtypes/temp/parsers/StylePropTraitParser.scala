package com.raquo.domtypes.temp.parsers

import com.raquo.domtypes.common.StylePropDef

import scala.io.Source

object StylePropTraitParser {

  /** @return (list of defs, list of global comment lines) */
  def apply(
    inputFileName: String,
    inputFile: Source,
  ): (Array[StylePropDef], List[String]) = {

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
                      || trimmedCommentLine.startsWith("@see https://developer.mozilla.org")
                  ) {
                    // ignore
                  } else {
                    // println("// " + trimmedCommentLine)
                    val cleanedCommentLine = commentLine.replace("*/", "").replace("--MDN", "").replaceAll("^\\s", "").replaceAll("\\s+$", "") // trimLeft(one) + trimRight
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

  def parseDef(inputFileName: String, line: String, accumulatedCommentLines: List[String]): StylePropDef = {
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
    val (typeParam, valueTraits) = rest.takePrefix(": SP") match {
      case ParseExtracted(_, _) =>
        skip(rest.takePrefix(": SP"))
        val typeParam = extract(rest.takeTypeParams)
        val valueTraits = Array[String]()
        (typeParam, valueTraits)
      case ParseFailed(_, _) =>
        skip(rest.takePrefix(": "))
        // val typeParam = "String"
        val rawTypes = extract(rest.takeUntil(" = "))
        val r = """\[[A-Za-z]+\]""".r
        val typeParam = r.findFirstIn(rawTypes).getOrElse("String").replace("[", "").replace("]", "")
        val valueTraits = rawTypes.split(" with ").map(_.replaceAll("\\[[A-Za-z]+]", "[_]").replaceAll("Style$", "").replaceAll("""Style\[_\]$""", "[_]"))
        (typeParam, valueTraits)
    }

    // val concreteTypeName = concreteTypeParamName(typeParam, inputFileName)
    skip(rest.takePrefix(" = "))
    val implName = extract(rest.takeCallableName) match {
      case "noneStyle" => "noneStyle[_]"
      case "autoStyle" => "autoStyle[_]"
      case "normalStyle" => "normalStyle[_]"
      case other => other
    }
    // val implName = {
    //       val rawName = extract(rest.takeCallableName)
    //       if (valueTraits.exists(_.contains("[_]"))) {
    //         rawName + "[_]"
    //       } else {
    //         rawName
    //       }
    //     }
    val implParams = extract(rest.takeParams)
    if (rest.nonEmpty) {
      throw new Exception(s"[$inputFileName] Failed to parse `$line`. Remaining unparsed after all is done: ${rest}")
    }
    val domName = extract(implParams.takeStringLiteral)
    // skip(rest.takePrefix(", "))
    // val domPropName = extract(rest.takeStringLiteral)

    if (rest.nonEmpty) {
      throw new Exception(s"[$inputFileName] Failed to parse `$line`. Remaining unparsed impl params: ${rest}")
    }

    val possibleUnitTraits = List("Calc", "Length", "Time", "Url")

    StylePropDef(
      scalaName = defName,
      domName = domName,
      valueType = typeParam,
      valueTraits = valueTraits.filterNot(possibleUnitTraits.contains).toList,
      valueUnits = valueTraits.filter((possibleUnitTraits :+ "Color").contains).toList,
      implName = implName,
      commentLines = accumulatedCommentLines,
      docUrls = List(
        s"https://developer.mozilla.org/en-US/docs/Web/CSS/${domName}"
      )
    )
  }
}
