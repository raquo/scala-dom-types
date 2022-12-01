package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter
import com.thirdparty.defs.styles.units
import com.thirdparty.keys.DerivedStyleProp

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait BackgroundSize extends Auto with units.Length[DerivedStyleProp, Int] { this: StyleProp[_] => 

  /**
    * This keyword specifies that the background image should be scaled to be
    * as small as possible while ensuring both its dimensions are greater than
    * or equal to the corresponding dimensions of the background positioning
    * area.
    */
  lazy val cover: StyleSetter[_] = this := "cover"

  /**
    * This keyword specifies that the background image should be scaled to be
    * as large as possible while ensuring both its dimensions are less than or
    * equal to the corresponding dimensions of the background positioning area.
    */
  lazy val contain: StyleSetter[_] = this := "contain"

}
