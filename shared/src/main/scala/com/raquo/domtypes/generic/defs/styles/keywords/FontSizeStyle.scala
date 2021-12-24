package com.raquo.domtypes.generic.defs.styles.keywords

import com.raquo.domtypes.generic.builders.StyleStringValueBuilder
import com.raquo.domtypes.generic.defs.styles.units.LengthUnits

// #Note: these types are provided for reference, but they are not used in the Styles trait
//  because I don't think they are useful enough to force their overhead onto every consumer.
//  Font size is usually set in length units, not with keywords.

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/font-size */
trait FontSizeStyle[T, DerivedProp[_]] extends LengthUnits[DerivedProp] with StyleStringValueBuilder[T] {

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
