package com.raquo.domtypes.old.defs.styles.keywords

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/justify-content */
trait JustifyContentStyle[T] extends AlignContentStyle[T] {

  lazy val left: T = buildStringValue("left")

  lazy val right: T = buildStringValue("right")
}
