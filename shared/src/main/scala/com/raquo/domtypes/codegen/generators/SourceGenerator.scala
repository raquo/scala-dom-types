package com.raquo.domtypes.codegen.generators

import com.raquo.domtypes.codegen.{CodeFormatting, SourceRepr}
import com.raquo.domtypes.common.TagType

import scala.collection.mutable

abstract class SourceGenerator(format: CodeFormatting) extends SourceRepr {

  private val output: mutable.StringBuilder = new mutable.StringBuilder

  private var currentIndent = format.printIndentChars(0)

  def clearOutput(): Unit = {
    output.clear()
  }

  /** Also clears the output */
  def getOutput(): String = {
    val str = output.mkString
    output.clear()
    str
  }

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
    ()
  }

  protected def line(strs: String*): Unit = {
    line(strs.mkString)
  }

  protected def line(): Unit = {
    output.append("\n")
    ()
  }

  protected def classParamLine(name: String, value: String): Unit = {
    line(s"${name} = ${repr(value)},")
  }

  protected def classParamLine(name: String, value: TagType): Unit = {
    line(s"${name} = ${repr(value.sourceStr)},")
  }

  protected def classParamLine(name: String, value: Boolean): Unit = {
    line(s"${name} = ${repr(value)},")
  }

  protected def classParamLine(name: String, list: List[String]): Unit = {
    if (list.isEmpty) {
      line(s"${name} = Nil,")
    } else {
      line(s"${name} = List(${list.map(repr).mkString(", ")}),")
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
    line(s"${name} = ${option.map(repr).toString},")
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

}
