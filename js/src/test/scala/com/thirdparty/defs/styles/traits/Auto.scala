package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait Auto { this: StyleProp[_] => 

  lazy val auto: StyleSetter[_] = this := "auto"

}
