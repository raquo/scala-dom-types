package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait FontWeight extends Normal { this: StyleProp[_] => 

  /** Normal font weight. Same as 400. */
  override lazy val normal: StyleSetter[_] = super.normal

  /** Bold font weight. Same as 700. */
  lazy val bold: StyleSetter[_] = this := "bold"

  /**
    * One font weight lighter than the parent element (among the available
    * weights of the font).
    */
  lazy val lighter: StyleSetter[_] = this := "lighter"

  /**
    * One font weight darker than the parent element (among the available
    * weights of the font)
    */
  lazy val bolder: StyleSetter[_] = this := "bolder"

}
