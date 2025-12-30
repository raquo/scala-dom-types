package com.raquo.domtypes.common

// #TODO[API] Maybe just use strings. Everything else is strings.

trait TagType {

  val sourceStr: String

  override def toString: String = sourceStr
}

trait SomeTagType extends TagType

object AnyTagType extends TagType {
  override val sourceStr: String = "AnyTagType"
}

object HtmlTagType extends SomeTagType {
  override val sourceStr: String = "HtmlTagType"
}

object SvgTagType extends SomeTagType {
  override val sourceStr: String = "SvgTagType"
}

object MathMlTagType extends SomeTagType {
  override val sourceStr: String = "MathMlTagType"
}
