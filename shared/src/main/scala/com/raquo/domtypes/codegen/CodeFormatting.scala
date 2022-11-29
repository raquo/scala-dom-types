package com.raquo.domtypes.codegen

case class CodeFormatting(
  indentStepChars: String = "  ",
  indentStartLevel: Int = 0,
  indentEmptyLines: Boolean = false,
) {

  def printIndentChars(extraLevel: Int): String = {
    indentStepChars * (indentStartLevel + extraLevel)
  }
}
