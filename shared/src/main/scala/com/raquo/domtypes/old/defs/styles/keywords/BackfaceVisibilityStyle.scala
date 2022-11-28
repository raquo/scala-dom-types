package com.raquo.domtypes.old.defs.styles.keywords

import com.raquo.domtypes.old.builders.StyleStringValueBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/backface-visibility */
trait BackfaceVisibilityStyle[T] extends StyleStringValueBuilder[T] {

  /** The back face is visible.  --MDN */
  lazy val visible: T = buildStringValue("visible")

  /** The back face is not visible.  --MDN */
  lazy val hidden: T = buildStringValue("hidden")
}
