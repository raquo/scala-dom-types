package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait JustifyContent extends AlignContent { this: StyleProp[_] => 

  lazy val left: StyleSetter[_] = this := "left"

  lazy val right: StyleSetter[_] = this := "right"

}
