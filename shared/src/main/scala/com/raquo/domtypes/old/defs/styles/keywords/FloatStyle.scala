package com.raquo.domtypes.old.defs.styles.keywords

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/float */
trait FloatStyle[T] extends NoneStyle[T] {

  /** Element must float on the left side of its containing block.  --MDN */
  lazy val left: T = buildStringValue("left")

  /** Element must float on the right side of its containing block.  --MDN */
  lazy val right: T = buildStringValue("right")

}
