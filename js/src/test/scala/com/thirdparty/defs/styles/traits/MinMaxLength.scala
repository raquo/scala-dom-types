package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter
import com.thirdparty.defs.styles.units
import com.thirdparty.keys.DerivedStyleProp

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait MinMaxLength extends units.Length[DerivedStyleProp, Int] { this: StyleProp[_] => 

  /** The intrinsic preferred length. */
  lazy val maxContent: StyleSetter[_] = this := "max-content"

  /** The intrinsic minimum length. */
  lazy val minContent: StyleSetter[_] = this := "min-content"

  /** Defined as min(max-content, max(min-content, fill-available)). */
  lazy val fitContent: StyleSetter[_] = this := "fit-content"

  /** The containing block width minus margin, border and padding. */
  lazy val fillAvailable: StyleSetter[_] = this := "fill-available"

}
