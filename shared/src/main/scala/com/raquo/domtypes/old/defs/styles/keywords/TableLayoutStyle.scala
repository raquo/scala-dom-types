package com.raquo.domtypes.old.defs.styles.keywords

import com.raquo.domtypes.old.builders.StyleStringValueBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/table-layout */
trait TableLayoutStyle[T] extends StyleStringValueBuilder[T] with AutoStyle[T] {

  /**
    * An automatic table layout algorithm is commonly used by most browsers for
    * table layout. The width of the table and its cells depends on the content
    * thereof.  --MDN
    */
  override lazy val auto: T = buildStringValue("auto")

  /**
    * Table and column widths are set by the widths of table and col elements
    * or by the width of the first row of cells. Cells in subsequent rows do
    * not affect column widths.  --MDN
    */
  lazy val fixed: T = buildStringValue("fixed")
}
