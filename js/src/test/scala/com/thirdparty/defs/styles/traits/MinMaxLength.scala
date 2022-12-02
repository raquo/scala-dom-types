package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter
import com.thirdparty.defs.styles.{units => u}
import com.thirdparty.keys.DerivedStyleProp

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait MinMaxLength extends u.Length[DerivedStyleProp, Int] { this: StyleProp[_] => 

  /** The intrinsic preferred length. */
  lazy val maxContent: StyleSetter[_] = this := "max-content"

  /** The intrinsic minimum length. */
  lazy val minContent: StyleSetter[_] = this := "min-content"

  /** Defined as min(max-content, max(min-content, fill-available)). */
  lazy val fitContent: StyleSetter[_] = this := "fit-content"

  /** The containing block width minus margin, border and padding. */
  lazy val fillAvailable: StyleSetter[_] = this := "fill-available"

}
