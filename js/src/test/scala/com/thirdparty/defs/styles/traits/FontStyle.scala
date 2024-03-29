package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait FontStyle extends Normal { this: StyleProp[_] =>

  /**
    * Selects a font that is labeled italic, if that is not available,
    * one labeled oblique
    */
  lazy val italic: StyleSetter[_] = this := "italic"

  /** Selects a font that is labeled oblique */
  lazy val oblique: StyleSetter[_] = this := "oblique"

}
