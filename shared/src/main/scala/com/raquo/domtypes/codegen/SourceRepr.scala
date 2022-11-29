package com.raquo.domtypes.codegen

trait SourceRepr {

  protected def repr(str: String): String = {
    // if (tripleQuotes) {
    //   s"\"\"\"${str.replace("\\", "\\\\").replace("\"", "\\\"")}\"\"\""
    // } else {
    s"\"${str.replace("\\", "\\\\").replace("\"", "\\\"")}\""
    // }
  }

  protected def repr(value: Boolean): String = {
    if (value) "true" else "false"
  }

}

object SourceRepr extends SourceRepr {

  // Make public

  def apply(str: String): String = repr(str)

  def apply(value: Boolean): String = repr(value)
}
