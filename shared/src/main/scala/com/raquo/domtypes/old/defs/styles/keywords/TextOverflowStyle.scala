package com.raquo.domtypes.old.defs.styles.keywords

import com.raquo.domtypes.old.builders.StyleStringValueBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/text-overflow */
trait TextOverflowStyle[T] extends StyleStringValueBuilder[T] {

  /**
    * This keyword value indicates to truncate the text at the limit of the
    * content area, therefore the truncation can happen in the middle of a
    * character. To truncate at the transition between two characters, the
    * empty string value must be used. The value clip is the default for
    * this property.  --MDN
    */
  lazy val clip: T = buildStringValue("clip")

  /**
    * This keyword value indicates to display an ellipsis ('…', U+2026 HORIZONTAL
    * ELLIPSIS) to represent clipped text. The ellipsis is displayed inside the
    * content area, decreasing the amount of text displayed. If there is not
    * enough space to display the ellipsis, it is clipped.  --MDN
    */
  lazy val ellipsis: T = buildStringValue("ellipsis")
}
