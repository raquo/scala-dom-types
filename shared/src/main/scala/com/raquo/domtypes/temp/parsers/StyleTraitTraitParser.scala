package com.raquo.domtypes.temp.parsers

import com.raquo.domtypes.common.{StyleKeywordDef, StyleTraitDef}

import scala.io.Source

object StyleTraitTraitParser {

  /** @return (list of defs, list of global comment lines) */
  def apply(
    inputFileName: String,
    inputFile: Source,
  ): StyleTraitDef = {

    val lines = inputFile.mkString.split("\n")

    var accumulatedCommentLines: List[String] = Nil

    var accumulatedGlobalCommentLines: List[String] = Nil

    var traitDefinitionLineNumber = 0
    var lineNumber = 0

    var allExtends: Array[String] = Array()

    val keywordDefs = lines.flatMap { line =>
      lineNumber += 1
      line.takePrefix("  ") match {
        case ParseExtracted(rawIndentedLine, _) =>
          val scalaOverride = rawIndentedLine.startsWith("override ")
          val indentedLine = if (scalaOverride) rawIndentedLine.substring(9) else rawIndentedLine
          indentedLine.takePrefix("lazy val ") match {
            case ParseExtracted(_, _) =>
              accumulatedCommentLines = accumulatedCommentLines.reverse.dropWhile(_.isEmpty).reverse
              val eventPropDef = parseKeywordDef(inputFileName, indentedLine, accumulatedCommentLines, scalaOverride)
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

            val r = """[A-Za-z]+""".r
            allExtends = line.substring(6).split("extends|with").drop(1).flatMap { chunk =>
              val result = r.findFirstIn(chunk.trim)
              if (result.contains("StyleStringValueBuilder")) {
                None
              } else {
                result
              }
            }
          }
          if (
            line.startsWith("package ")
              || line.startsWith("import ")
              || line.startsWith("trait ")
              || line.startsWith("this: ")
              || line.startsWith("] { this: ")
              || line.startsWith("/**")
              || line.startsWith(" *")
              || line.startsWith("//")
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

    val extendsTraits = allExtends.filter(_.endsWith("Style")).map(_.replaceAll("Style$", ""))

    val extendsUnits = allExtends.filter(_.endsWith("Units")).map(_.replaceAll("Units$", ""))

    if (allExtends.length != extendsTraits.length + extendsUnits.length) {
      throw new Exception(s"[$inputFileName]: Undetected trait here: ${extendsTraits.toList}")
    }

    StyleTraitDef(
      scalaName = inputFileName.replace("Style.scala", ""),
      extendsTraits = extendsTraits.toList,
      extendsUnits = extendsUnits.toList,
      keywords = keywordDefs.toList
    )
  }

  def parseKeywordDef(inputFileName: String, line: String, accumulatedCommentLines: List[String], scalaOverride: Boolean): StyleKeywordDef = {
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
    val _ = extract(rest.takePrefix(": T"))

    // val concreteTypeName = concreteTypeParamName(typeParam, inputFileName)
    val _ = extract(rest.takePrefix(" = "))
    val implName = extract(rest.takeCallableName)
    val implParams = extract(rest.takeParams)
    if (rest.nonEmpty) {
      throw new Exception(s"[$inputFileName] Failed to parse `$line`. Remaining unparsed after all is done: ${rest}")
    }
    val domName = extract(implParams.takeStringLiteral)
    // val _ = extract(rest.takePrefix(", "))
    // val domPropName = extract(rest.takeStringLiteral)

    if (rest.nonEmpty) {
      throw new Exception(s"[$inputFileName] Failed to parse `$line`. Remaining unparsed impl params: ${rest}")
    }

    val isOverride = List("auto", "normal", "none").contains(domName) && !inputFileName.toLowerCase.startsWith(domName)

    StyleKeywordDef(
      scalaOverride = scalaOverride,
      scalaName = defName,
      domName = domName,
      isOverride = isOverride,
      commentLines = accumulatedCommentLines,
      docUrls = Nil
    )
  }
}
