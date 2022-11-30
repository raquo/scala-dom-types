package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait Clear extends None { this: StyleProp[_] => 

  /** The element is moved down to clear past left floats. */
  lazy val left: StyleSetter[_] = this := "left"

  /** The element is moved down to clear past right floats. */
  lazy val right: StyleSetter[_] = this := "right"

  /** The element is moved down to clear past both left and right floats. */
  lazy val both: StyleSetter[_] = this := "both"

}
