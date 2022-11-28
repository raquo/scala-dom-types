package com.raquo.domtypes.old.defs.styles.keywords

import com.raquo.domtypes.old.builders.StyleStringValueBuilder
import com.raquo.domtypes.old.defs.styles.units.LengthUnits

trait MinMaxLengthStyle[T, DerivedProp[_], Num] extends LengthUnits[DerivedProp, Num] with StyleStringValueBuilder[T] {

  /** The intrinsic preferred length.  --MDN */
  lazy val maxContent: T = buildStringValue("max-content")

  /** The intrinsic minimum length.  --MDN */
  lazy val minContent: T = buildStringValue("min-content")

  /** Defined as min(max-content, max(min-content, fill-available)).  --MDN */
  lazy val fitContent: T = buildStringValue("fit-content")

  /** The containing block width minus margin, border and padding.  --MDN */
  lazy val fillAvailable: T = buildStringValue("fill-available")
}
