package com.raquo.domtypes.old.defs.styles.keywords

import com.raquo.domtypes.old.builders.StyleStringValueBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/direction */
trait DirectionStyle[T] extends StyleStringValueBuilder[T] {

  /** Text and other elements go from left to right.  --MDN */
  lazy val ltr: T = buildStringValue("ltr")

  /** Text and other elements go from right to left.  --MDN */
  lazy val rtl: T = buildStringValue("rtl")

}
