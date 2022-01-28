package com.raquo.domtypes.generic.defs.styles.keywords

import com.raquo.domtypes.generic.builders.StyleStringValueBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/position */
trait PositionStyle[T] extends StyleStringValueBuilder[T] {

  /**
    * This keyword let the element use the normal behavior, that is it is laid
    * out in its current position in the flow.  The top, right, bottom, and left
    * properties do not apply.  --MDN
    */
  lazy val static: T = buildStringValue("static")

  /**
    * This keyword lays out all elements as though the element were not
    * positioned, and then adjust the element's position, without changing
    * layout (and thus leaving a gap for the element where it would have been
    * had it not been positioned). The effect of position:relative on
    * table-*-group, table-row, table-column, table-cell, and table-caption
    * elements is undefined.  --MDN
    */
  lazy val relative: T = buildStringValue("relative")

  /**
    * Do not leave space for the element. Instead, position it at a specified
    * position relative to its closest positioned ancestor or to the containing
    * block. Absolutely positioned boxes can have margins, they do not collapse
    * with any other margins.  --MDN
    */
  lazy val absolute: T = buildStringValue("absolute")

  /**
    * Do not leave space for the element. Instead, position it at a specified
    * position relative to the screen's viewport and doesn't move when scrolled.
    * When printing, position it at that fixed position on every page.  --MDN
    */
  lazy val fixed: T = buildStringValue("fixed")
}
