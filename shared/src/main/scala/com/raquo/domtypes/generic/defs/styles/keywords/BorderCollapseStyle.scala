package com.raquo.domtypes.generic.defs.styles.keywords

import com.raquo.domtypes.generic.builders.StyleStringValueBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/border-collapse */
trait BorderCollapseStyle[T] extends StyleStringValueBuilder[T] {

  /** Use separated-border table rendering model. This is the default.  --MDN */
  lazy val separate: T = buildStringValue("separate")

  /** Use collapsed-border table rendering model.  --MDN */
  lazy val collapse: T = buildStringValue("collapse")
}
