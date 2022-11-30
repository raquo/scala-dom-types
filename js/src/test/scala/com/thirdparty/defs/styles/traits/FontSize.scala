package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait FontSize { this: StyleProp[_] => 

  lazy val xxSmall: StyleSetter[_] = this := "xx-small"

  lazy val xSmall: StyleSetter[_] = this := "x-small"

  lazy val small: StyleSetter[_] = this := "small"

  lazy val medium: StyleSetter[_] = this := "medium"

  lazy val large: StyleSetter[_] = this := "large"

  lazy val xLarge: StyleSetter[_] = this := "x-large"

  lazy val xxLarge: StyleSetter[_] = this := "xx-large"

  /**
    * Larger than the parent element's font size, by roughly the ratio used to
    * separate the absolute size keywords above.
    */
  lazy val larger: StyleSetter[_] = this := "larger"

  /**
    * Smaller than the parent element's font size, by roughly the ratio used to
    * separate the absolute size keywords above.
    */
  lazy val smaller: StyleSetter[_] = this := "smaller"

}
