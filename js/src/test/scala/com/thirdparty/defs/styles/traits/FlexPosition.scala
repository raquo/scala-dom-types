package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait FlexPosition extends Normal { this: StyleProp[_] => 

  lazy val flexStart: StyleSetter[_] = this := "flex-start"

  lazy val flexEnd: StyleSetter[_] = this := "flex-end"

  lazy val center: StyleSetter[_] = this := "center"

  lazy val start: StyleSetter[_] = this := "start"

  lazy val end: StyleSetter[_] = this := "end"

  lazy val selfStart: StyleSetter[_] = this := "self-start"

  lazy val selfEnd: StyleSetter[_] = this := "self-end"

  lazy val baseline: StyleSetter[_] = this := "baseline"

  lazy val firstBaseline: StyleSetter[_] = this := "first baseline"

  lazy val lastBaseline: StyleSetter[_] = this := "last baseline"

  lazy val stretch: StyleSetter[_] = this := "stretch"

}
