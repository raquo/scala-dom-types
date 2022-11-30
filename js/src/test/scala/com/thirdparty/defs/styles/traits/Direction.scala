package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait Direction { this: StyleProp[_] => 

  /** Text and other elements go from left to right. */
  lazy val ltr: StyleSetter[_] = this := "ltr"

  /** Text and other elements go from right to left. */
  lazy val rtl: StyleSetter[_] = this := "rtl"

}
