package com.raquo.domtypes.old.defs.styles.keywords

import com.raquo.domtypes.old.builders.StyleStringValueBuilder
import com.raquo.domtypes.old.defs.styles.units.LengthUnits

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/font-size */
trait FontSizeStyle[T, DerivedProp[_], Num] extends LengthUnits[DerivedProp, Num] with StyleStringValueBuilder[T] {

  lazy val xxSmall: T = buildStringValue("xx-small")

  lazy val xSmall: T = buildStringValue("x-small")

  lazy val small: T = buildStringValue("small")

  lazy val medium: T = buildStringValue("medium")

  lazy val large: T = buildStringValue("large")

  lazy val xLarge: T = buildStringValue("x-large")

  lazy val xxLarge: T = buildStringValue("xx-large")

  /**
    * Larger than the parent element's font size, by roughly the ratio used to
    * separate the absolute size keywords above.  --MDN
    */
  lazy val larger: T = buildStringValue("larger")

  /**
    * Smaller than the parent element's font size, by roughly the ratio used to
    * separate the absolute size keywords above.  --MDN
    */
  lazy val smaller: T = buildStringValue("smaller")
}
