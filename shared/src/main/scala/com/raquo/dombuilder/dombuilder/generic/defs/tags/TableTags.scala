package com.raquo.dombuilder.dombuilder.generic.defs.tags

import com.raquo.dombuilder.dombuilder.generic.builders.TagBuilder

trait TableTags[T[_ <: DomElement], DomElement, HtmlTable <: DomElement, HtmlTableCaption <: DomElement, HtmlTableCol <: DomElement, HtmlTableSection <: DomElement, HtmlTableRow <: DomElement, HtmlTableCell <: DomElement, HtmlTableHeaderCell <: DomElement] {
  this: TagBuilder[T, DomElement] =>

  // @TODO[Docs] add links to canonical ScalaJS types in comments

  /**
    * Represents data with more than one dimension.
    *
    *  MDN
    */
  lazy val table: T[HtmlTable] = build("table")

  /**
    * The title of a table.
    *
    *  MDN
    */
  lazy val caption: T[HtmlTableCaption] = build("caption")

  /**
    * A set of columns.
    *
    *  MDN
    */
  lazy val colGroup: T[HtmlTableCol] = build("colgroup")

  /**
    * A single column.
    *
    *  MDN
    */
  lazy val col: T[HtmlTableCol] = build("col")

  /**
    * The table body.
    *
    *  MDN
    */
  lazy val tbody: T[HtmlTableSection] = build("tbody")

  /**
    * The table headers.
    *
    *  MDN
    */
  lazy val thead: T[HtmlTableSection] = build("thead")

  /**
    * The table footer.
    *
    *  MDN
    */
  lazy val tfoot: T[HtmlTableSection] = build("tfoot")

  /**
    * A single row in a table.
    *
    *  MDN
    */
  lazy val tr: T[HtmlTableRow] = build("tr")

  /**
    * A single cell in a table.
    *
    *  MDN
    */
  lazy val td: T[HtmlTableCell] = build("td")

  /**
    * A header cell in a table.
    *
    *  MDN
    */
  lazy val th: T[HtmlTableHeaderCell] = build("th")
}
