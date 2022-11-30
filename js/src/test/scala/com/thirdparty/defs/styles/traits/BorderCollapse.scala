package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait BorderCollapse { this: StyleProp[_] => 

  /** Use separated-border table rendering model. This is the default. */
  lazy val separate: StyleSetter[_] = this := "separate"

  /** Use collapsed-border table rendering model. */
  lazy val collapse: StyleSetter[_] = this := "collapse"

}
