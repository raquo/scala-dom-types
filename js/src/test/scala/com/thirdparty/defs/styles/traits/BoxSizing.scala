package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait BoxSizing { this: StyleProp[_] => 

  lazy val borderBox: StyleSetter[_] = this := "border-box"

  lazy val contentBox: StyleSetter[_] = this := "content-box"

}
