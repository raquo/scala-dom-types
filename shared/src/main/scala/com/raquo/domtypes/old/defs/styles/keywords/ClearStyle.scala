package com.raquo.domtypes.old.defs.styles.keywords

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/clear */
trait ClearStyle[T] extends NoneStyle[T] {

  /** The element is moved down to clear past left floats.  --MDN */
  lazy val left: T = buildStringValue("left")

  /** The element is moved down to clear past right floats.  --MDN */
  lazy val right: T = buildStringValue("right")

  /** The element is moved down to clear past both left and right floats. --MDN */
  lazy val both: T = buildStringValue("both")
}
