package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait BackfaceVisibility { this: StyleProp[_] => 

  /** The back face is visible. */
  lazy val visible: StyleSetter[_] = this := "visible"

  /** The back face is not visible. */
  lazy val hidden: StyleSetter[_] = this := "hidden"

}
