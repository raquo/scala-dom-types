package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait BackfaceVisibility { this: StyleProp[_] => 

  /** The back face is visible. */
  lazy val visible: StyleSetter[_] = this := "visible"

  /** The back face is not visible. */
  lazy val hidden: StyleSetter[_] = this := "hidden"

}
