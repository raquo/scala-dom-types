package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait TextDecoration extends None { this: StyleProp[_] =>

  /** Each line of text is underlined. */
  lazy val underline: StyleSetter[_] = this := "underline"

  /** Each line of text has a line above it. */
  lazy val overline: StyleSetter[_] = this := "overline"

  /** Each line of text has a line through the middle. */
  lazy val lineThrough: StyleSetter[_] = this := "line-through"

}
