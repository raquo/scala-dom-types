package com.raquo.domtypes.generic.defs.styles.keywords

import com.raquo.domtypes.generic.builders.StyleStringValueBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/backface-visibility */
trait BackfaceVisibilityStyle[T] extends StyleStringValueBuilder[T] {

  /** The back face is visible.  --MDN */
  lazy val visible: T = buildStringValue("visible")

  /** The back face is not visible.  --MDN */
  lazy val hidden: T = buildStringValue("hidden")
}
