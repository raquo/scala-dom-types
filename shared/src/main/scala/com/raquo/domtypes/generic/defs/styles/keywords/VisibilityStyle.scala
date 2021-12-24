package com.raquo.domtypes.generic.defs.styles.keywords

import com.raquo.domtypes.generic.builders.StyleStringValueBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/visibility */
trait VisibilityStyle[T] extends StyleStringValueBuilder[T] {

  /** Default value, the box is visible  --MDN */
  lazy val visible: T = buildStringValue("visible")

  /**
    * The box is invisible (fully transparent, nothing is drawn), but still
    * affects layout.  Descendants of the element will be visible if they have
    * visibility:visible  --MDN
    */
  lazy val hidden: T = buildStringValue("hidden")

  /**
    * For table rows, columns, column groups, and row groups the row(s) or
    * column(s) are hidden and the space they would have occupied is (as if
    * display: none were applied to the column/row of the table)  --MDN
    */
  lazy val collapse: T = buildStringValue("collapse")
}
