package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter
import com.thirdparty.defs.styles.{units => u}
import com.thirdparty.keys.DerivedStyleProp

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait LineWidth extends u.Length[DerivedStyleProp, Int] { this: StyleProp[_] =>

  /** Typically 1px in desktop browsers like Firefox. */
  lazy val thin: StyleSetter[_] = this := "thin"

  /** Typically 3px in desktop browsers like Firefox. */
  lazy val medium: StyleSetter[_] = this := "medium"

  /** Typically 5px in desktop browsers like Firefox. */
  lazy val thick: StyleSetter[_] = this := "thick"

}
