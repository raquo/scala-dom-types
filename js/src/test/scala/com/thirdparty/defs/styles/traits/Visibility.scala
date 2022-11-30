package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait Visibility { this: StyleProp[_] => 

  /** Default value, the box is visible */
  lazy val visible: StyleSetter[_] = this := "visible"

  /**
    * The box is invisible (fully transparent, nothing is drawn), but still
    * affects layout.  Descendants of the element will be visible if they have
    * visibility:visible
    */
  lazy val hidden: StyleSetter[_] = this := "hidden"

  /**
    * For table rows, columns, column groups, and row groups the row(s) or
    * column(s) are hidden and the space they would have occupied is (as if
    * display: none were applied to the column/row of the table)
    */
  lazy val collapse: StyleSetter[_] = this := "collapse"

}
