package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait PaddingBoxSizing extends BoxSizing { this: StyleProp[_] => 

  lazy val paddingBox: StyleSetter[_] = this := "padding-box"

}
