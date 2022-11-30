package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait FontStyle extends Normal { this: StyleProp[_] => 

  /**
    * Selects a font that is labeled italic, if that is not available,
    * one labeled oblique
    */
  lazy val italic: StyleSetter[_] = this := "italic"

  /** Selects a font that is labeled oblique */
  lazy val oblique: StyleSetter[_] = this := "oblique"

}
