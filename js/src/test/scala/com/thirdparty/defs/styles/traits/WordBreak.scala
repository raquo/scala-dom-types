package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait WordBreak extends Normal { this: StyleProp[_] =>

  /**
    * To prevent overflow, word breaks should be inserted between any two
    * characters (excluding Chinese/Japanese/Korean text).
    */
  lazy val breakAll: StyleSetter[_] = this := "break-all"

  /**
    * Word breaks should not be used for Chinese/Japanese/Korean (CJK) text.
    * Non-CJK text behavior is the same as for normal.
    */
  lazy val keepAll: StyleSetter[_] = this := "keep-all"

  /**
    * To prevent overflow, normally unbreakable words may be broken at
    * arbitrary points if there are no otherwise acceptable break points
    * in the line.
    * 
    * Note: IE does not support this value
    */
  lazy val breakWord: StyleSetter[_] = this := "break-word"

}
