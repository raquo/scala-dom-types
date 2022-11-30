package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait FlexDirection { this: StyleProp[_] => 

  /**
    * The flex container's main-axis is the same as the block-axis.
    * The main-start and main-end points are the same as the before
    * and after points of the writing-mode.
    */
  lazy val column: StyleSetter[_] = this := "column"

  /** Behaves the same as column but the main-start and main-end are permuted. */
  lazy val columnReverse: StyleSetter[_] = this := "column-reverse"

  /**
    * The flex container's main-axis is defined to be the same as the text direction.
    * The main-start and main-end points are the same as the content direction.
    */
  lazy val row: StyleSetter[_] = this := "row"

  /** Behaves the same as row but the main-start and main-end points are permuted. */
  lazy val rowReverse: StyleSetter[_] = this := "row-reverse"

}
