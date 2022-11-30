package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait EmptyCells { this: StyleProp[_] => 

  /** Borders and backgrounds should be drawn like in a normal cells. */
  lazy val show: StyleSetter[_] = this := "show"

  /** No border or backgrounds of empty cells should be drawn. */
  lazy val hide: StyleSetter[_] = this := "hide"

}
