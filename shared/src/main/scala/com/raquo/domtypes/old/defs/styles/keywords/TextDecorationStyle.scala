package com.raquo.domtypes.old.defs.styles.keywords

trait TextDecorationStyle[T] extends NoneStyle[T] {

  /** Each line of text is underlined.  --MDN */
  lazy val underline: T = buildStringValue("underline")

  /** Each line of text has a line above it.  --MDN */
  lazy val overline: T = buildStringValue("overline")

  /** Each line of text has a line through the middle.  --MDN */
  lazy val lineThrough: T = buildStringValue("line-through")
}
