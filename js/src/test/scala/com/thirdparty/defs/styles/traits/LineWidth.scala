package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait LineWidth { this: StyleProp[_] => 

  /** Typically 1px in desktop browsers like Firefox. */
  lazy val thin: StyleSetter[_] = this := "thin"

  /** Typically 3px in desktop browsers like Firefox. */
  lazy val medium: StyleSetter[_] = this := "medium"

  /** Typically 5px in desktop browsers like Firefox. */
  lazy val thick: StyleSetter[_] = this := "thick"

}
