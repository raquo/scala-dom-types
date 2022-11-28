package com.raquo.domtypes.old.defs.styles.keywords

import com.raquo.domtypes.old.builders.StyleStringValueBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/border-collapse */
trait BorderCollapseStyle[T] extends StyleStringValueBuilder[T] {

  /** Use separated-border table rendering model. This is the default.  --MDN */
  lazy val separate: T = buildStringValue("separate")

  /** Use collapsed-border table rendering model.  --MDN */
  lazy val collapse: T = buildStringValue("collapse")
}
