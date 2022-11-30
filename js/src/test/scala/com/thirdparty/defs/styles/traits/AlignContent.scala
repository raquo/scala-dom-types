package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait AlignContent extends FlexPosition { this: StyleProp[_] => 

  lazy val spaceBetween: StyleSetter[_] = this := "space-between"

  lazy val spaceAround: StyleSetter[_] = this := "space-around"

  lazy val spaceEvenly: StyleSetter[_] = this := "space-evenly"

}
