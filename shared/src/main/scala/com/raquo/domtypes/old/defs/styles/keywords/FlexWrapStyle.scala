package com.raquo.domtypes.old.defs.styles.keywords

import com.raquo.domtypes.old.builders.StyleStringValueBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/flex-wrap */
trait FlexWrapStyle[T] extends StyleStringValueBuilder[T] {

  /**
    * The flex items are laid out in a single line which may cause the
    * flex container to overflow. The cross-start is either equivalent
    * to start or before depending flex-direction value.  --MDN
    */
  lazy val nowrap: T = buildStringValue("nowrap")

  /**
    * The flex items break into multiple lines. The cross-start is
    * either equivalent to start or before depending flex-direction
    * value and the cross-end is the opposite of the specified
    * cross-start.  --MDN
    */
  lazy val wrap: T = buildStringValue("wrap")

  /**
    * Behaves the same as wrap but cross-start and cross-end are
    * permuted.  --MDN
    */
  lazy val wrapReverse: T = buildStringValue("wrap-reverse")
}
