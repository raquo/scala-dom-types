package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait TableLayout extends Auto { this: StyleProp[_] => 

  /**
    * An automatic table layout algorithm is commonly used by most browsers for
    * table layout. The width of the table and its cells depends on the content
    * thereof.
    */
  override lazy val auto: StyleSetter[_] = super.auto

  /**
    * Table and column widths are set by the widths of table and col elements
    * or by the width of the first row of cells. Cells in subsequent rows do
    * not affect column widths.
    */
  lazy val fixed: StyleSetter[_] = this := "fixed"

}
