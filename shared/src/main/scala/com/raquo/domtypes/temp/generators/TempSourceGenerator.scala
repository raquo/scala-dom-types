package com.raquo.domtypes.temp.generators

import com.raquo.domtypes.codegen.CodeFormatting
import com.raquo.domtypes.common.TagType

import scala.collection.mutable

abstract class TempSourceGenerator(/*outputFile: File,*/ format: CodeFormatting) {

  private val output: mutable.StringBuilder = new mutable.StringBuilder

  // private lazy val printStream = {
  //   outputFile.getParentFile.mkdirs()
  //   new PrintStream(new FileOutputStream(outputFile))
  // }

  private var currentIndent = format.printIndentChars(0)

  final def generate(): String = {
    apply()
    output.mkString
  }

  /** Override this to implement the generator. */
  protected def apply(): Unit

  /** Call this to run the generator. */
  // final def run(): List[File] = {
  //   apply()
  //   printStream.close()
  //   List(outputFile)
  // }

  protected def enter(prefix: String, suffix: String = "")(inside: => Unit): Unit = {
    line(prefix)
    val originalIndent = currentIndent
    currentIndent = currentIndent + format.indentStepChars
    inside
    currentIndent = originalIndent
    if (suffix.nonEmpty) {
      line(suffix)
    }
  }

  protected def line(str: String): Unit = {
    output.append(currentIndent)
    output.append(str)
    output.append("\n")
    // printStream.print(currentIndent)
    // printStream.println(str)
  }

  protected def line(): Unit = {
    output.append("\n")
    // printStream.println()
  }

  protected def classParamLine(name: String, value: String): Unit = {
    line(s"${name} = ${repr(value)},")
  }

  protected def classParamLine(name: String, value: TagType): Unit = {
    line(s"${name} = ${repr(value)},")
  }

  protected def classParamLine(name: String, value: Boolean): Unit = {
    line(s"${name} = ${repr(value)},")
  }

  protected def classParamLine(name: String, list: List[String]): Unit = {
    if (list.isEmpty) {
      line(s"${name} = Nil,")
    } else {
      if ((name == "docUrls" || name == "commentLines")) {
        enter(s"${name} = List(", "),") {
          list.foreach { l =>
            line(repr(l) + ",")
          }
        }
      } else {
        line(s"${name} = List(${list.map(repr).mkString(", ")}),")
      }
    }
  }

  protected def classParamLine[A](name: String, list: List[A], renderItem: A => Unit): Unit = {
    enter(s"${name} = List(", "),") {
      list.foreach { v =>
        renderItem(v)
      }
    }
  }

  protected def classParamLine(name: String, option: Option[String]): Unit = {
    line(s"${name} = ${option.map(repr(_)).toString},")
  }

  protected def blockCommentLines(commentLines: List[String]): Unit = {
    if (commentLines.nonEmpty) {
      if (commentLines.size == 1) {
        line("/** " + commentLines.head + " */")
      } else {
        line("/**")
        commentLines.foreach { l =>
          line("  * " + l)
        }
        line("  */")
      }

    }
  }

  protected def repr(str: String): String = {
    // if (tripleQuotes) {
    //   s"\"\"\"${str.replace("\\", "\\\\").replace("\"", "\\\"")}\"\"\""
    // } else {
      "\"" + str.replace("\\", "\\\\").replace("\"", "\\\"") + "\""
    // }
  }

  protected def repr(tagType: TagType): String = {
    tagType.sourceStr
  }

  protected def repr(value: Boolean): String = {
    if (value) "true" else "false"
  }

  protected def tupleType(size: Int, prefix: String = "T", suffix: String = "", separator: String = ", "): String =
    tupleTypeRaw(size, prefix, suffix).mkString(separator)

  protected def tupleAccess(size: Int, varName: String): String = {
    tupleAccessRaw(size, varName).mkString(", ")
  }

  private def tupleTypeRaw(size: Int, prefix: String = "T", suffix: String = ""): Seq[String] = {
    (1 to size).map(i => s"${prefix}${i}${suffix}")
  }

  private def tupleAccessRaw(size: Int, varName: String): Seq[String] = {
    (1 to size).map(i => s"${varName}._${i}")
  }

}
