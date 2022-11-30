package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait Overflow extends Auto { this: StyleProp[_] => 

  /**
    * Default value. Content is not clipped, it may be rendered outside the
    * content box.
    */
  lazy val visible: StyleSetter[_] = this := "visible"

  /** The content is clipped and no scrollbars are provided. */
  lazy val hidden: StyleSetter[_] = this := "hidden"

  /**
    * The content is clipped and desktop browsers use scrollbars, whether or
    * not any content is clipped. This avoids any problem with scrollbars
    * appearing and disappearing in a dynamic environment. Printers may print
    * overflowing content.
    */
  lazy val scroll: StyleSetter[_] = this := "scroll"

}
