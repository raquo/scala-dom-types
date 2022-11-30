package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait TextTransform extends None { this: StyleProp[_] => 

  /**
    * Forces the first letter of each word to be converted to
    * uppercase. Other characters are unchanged.
    */
  lazy val capitalize: StyleSetter[_] = this := "capitalize"

  /** Forces all characters to be converted to uppercase. */
  lazy val uppercase: StyleSetter[_] = this := "uppercase"

  /** Forces all characters to be converted to lowercase. */
  lazy val lowercase: StyleSetter[_] = this := "lowercase"

}
