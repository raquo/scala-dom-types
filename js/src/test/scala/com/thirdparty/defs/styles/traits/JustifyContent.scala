package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait JustifyContent extends AlignContent { this: StyleProp[_] =>

  lazy val left: StyleSetter[_] = this := "left"

  lazy val right: StyleSetter[_] = this := "right"

}
