package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait BorderCollapse { this: StyleProp[_] =>

  /** Use separated-border table rendering model. This is the default. */
  lazy val separate: StyleSetter[_] = this := "separate"

  /** Use collapsed-border table rendering model. */
  lazy val collapse: StyleSetter[_] = this := "collapse"

}
