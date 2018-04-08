package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.TagBuilder

trait TableTags[T[_ <: DomHtmlElement], DomHtmlElement, HtmlTable <: DomHtmlElement, HtmlTableCaption <: DomHtmlElement, HtmlTableCol <: DomHtmlElement, HtmlTableSection <: DomHtmlElement, HtmlTableRow <: DomHtmlElement, HtmlTableCell <: DomHtmlElement, HtmlTableHeaderCell <: DomHtmlElement] {
  this: TagBuilder[T, DomHtmlElement] =>

  // @TODO[Docs] add links to canonical ScalaJS types in comments

  /**
    * Represents data with more than one dimension.
    *
    *  MDN
    */
  lazy val table: T[HtmlTable] = tag("table")

  /**
    * The title of a table.
    *
    *  MDN
    */
  lazy val caption: T[HtmlTableCaption] = tag("caption")

  /**
    * A set of columns.
    *
    *  MDN
    */
  lazy val colGroup: T[HtmlTableCol] = tag("colgroup")

  /**
    * A single column.
    *
    *  MDN
    */
  lazy val col: T[HtmlTableCol] = tag("col", void = true)

  /**
    * The table body.
    *
    *  MDN
    */
  lazy val tbody: T[HtmlTableSection] = tag("tbody")

  /**
    * The table headers.
    *
    *  MDN
    */
  lazy val thead: T[HtmlTableSection] = tag("thead")

  /**
    * The table footer.
    *
    *  MDN
    */
  lazy val tfoot: T[HtmlTableSection] = tag("tfoot")

  /**
    * A single row in a table.
    *
    *  MDN
    */
  lazy val tr: T[HtmlTableRow] = tag("tr")

  /**
    * A single cell in a table.
    *
    *  MDN
    */
  lazy val td: T[HtmlTableCell] = tag("td")

  /**
    * A header cell in a table.
    *
    *  MDN
    */
  lazy val th: T[HtmlTableHeaderCell] = tag("th")
}
