package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait ListStylePosition { this: StyleProp[_] =>

  /** The marker box is outside the principal block box. */
  lazy val outside: StyleSetter[_] = this := "outside"

  /**
    * The marker box is the first inline box in the principal block box, after
    * which the element's content flows.
    */
  lazy val inside: StyleSetter[_] = this := "inside"

}
