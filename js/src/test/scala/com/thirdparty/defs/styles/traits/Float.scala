package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait Float extends None { this: StyleProp[_] => 

  /** Element must float on the left side of its containing block. */
  lazy val left: StyleSetter[_] = this := "left"

  /** Element must float on the right side of its containing block. */
  lazy val right: StyleSetter[_] = this := "right"

}
