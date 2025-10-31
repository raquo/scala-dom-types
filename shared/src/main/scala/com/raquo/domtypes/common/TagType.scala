package com.raquo.domtypes.common

// #TODO[API] Maybe just use strings. Everything else is strings.

trait TagType {

  val sourceStr: String

  override def toString: String = sourceStr
}

object HtmlTagType extends TagType {
  override val sourceStr: String = "HtmlTagType"
}

object SvgTagType extends TagType {
  override val sourceStr: String = "SvgTagType"
}

object MathMlTagType extends TagType {
  override val sourceStr: String = "MathMlTagType"
}
