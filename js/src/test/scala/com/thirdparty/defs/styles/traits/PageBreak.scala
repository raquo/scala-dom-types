package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait PageBreak extends Auto { this: StyleProp[_] => 

  /** Always force page breaks. */
  lazy val always: StyleSetter[_] = this := "always"

  /** Avoid page breaks. */
  lazy val avoid: StyleSetter[_] = this := "avoid"

  /** Force page breaks so that the next page is formatted as a left page. */
  lazy val left: StyleSetter[_] = this := "left"

  /** Force page breaks so that the next page is formatted as a right page. */
  lazy val right: StyleSetter[_] = this := "right"

}
