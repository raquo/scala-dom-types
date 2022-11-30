package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait ListStylePosition { this: StyleProp[_] => 

  /** The marker box is outside the principal block box. */
  lazy val outside: StyleSetter[_] = this := "outside"

  /**
    * The marker box is the first inline box in the principal block box, after
    * which the element's content flows.
    */
  lazy val inside: StyleSetter[_] = this := "inside"

}
