package com.raquo.domtypes.generators

case class IndentationParams(
  indentStepChars: String = "  ",
  indentStartLevel: Int = 0,
  indentEmptyLines: Boolean = false,
) {

  def withLevel(mod: Int => Int): IndentationParams = {
    copy(indentStartLevel = mod(indentStartLevel))
  }

  def printIndentChars(extraLevel: Int): String = {
    indentStepChars * (indentStartLevel + extraLevel)
  }
}
