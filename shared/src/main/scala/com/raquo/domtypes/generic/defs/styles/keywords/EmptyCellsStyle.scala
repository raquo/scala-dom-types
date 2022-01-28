package com.raquo.domtypes.generic.defs.styles.keywords

import com.raquo.domtypes.generic.builders.StyleStringValueBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/empty-cells */
trait EmptyCellsStyle[T] extends StyleStringValueBuilder[T] {

  /** Borders and backgrounds should be drawn like in a normal cells.  --MDN */
  lazy val show: T = buildStringValue("show")

  /** No border or backgrounds of empty cells should be drawn.  --MDN */
  lazy val hide: T = buildStringValue("hide")
}
