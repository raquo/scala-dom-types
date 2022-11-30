package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait Float extends None { this: StyleProp[_] => 

  /** Element must float on the left side of its containing block. */
  lazy val left: StyleSetter[_] = this := "left"

  /** Element must float on the right side of its containing block. */
  lazy val right: StyleSetter[_] = this := "right"

}
