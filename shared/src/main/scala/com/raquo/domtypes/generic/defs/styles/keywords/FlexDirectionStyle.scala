package com.raquo.domtypes.generic.defs.styles.keywords

import com.raquo.domtypes.generic.builders.StyleStringValueBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction */
trait FlexDirectionStyle[T] extends StyleStringValueBuilder[T] {

  /**
    * The flex container's main-axis is the same as the block-axis.
    * The main-start and main-end points are the same as the before
    * and after points of the writing-mode.  --MDN
    */
  lazy val column: T = buildStringValue("column")

  /** Behaves the same as column but the main-start and main-end are permuted.  --MDN */
  lazy val columnReverse: T = buildStringValue("column-reverse")

  /**
    * The flex container's main-axis is defined to be the same as the text direction.
    * The main-start and main-end points are the same as the content direction.  --MDN
    */
  lazy val row: T = buildStringValue("row")

  /** Behaves the same as row but the main-start and main-end points are permuted.  --MDN */
  lazy val rowReverse: T = buildStringValue("row-reverse")
}
