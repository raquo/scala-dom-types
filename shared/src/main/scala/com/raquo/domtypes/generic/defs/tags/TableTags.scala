package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.HtmlTagBuilder

trait TableTags[T[_ <: DomHtmlElement], DomHtmlElement, HtmlTable <: DomHtmlElement, HtmlTableCaption <: DomHtmlElement, HtmlTableCol <: DomHtmlElement, HtmlTableSection <: DomHtmlElement, HtmlTableRow <: DomHtmlElement, HtmlTableCell <: DomHtmlElement] {
  this: HtmlTagBuilder[T, DomHtmlElement] =>

  // @TODO[Docs] add links to canonical ScalaJS types in comments

  /**
    * Represents data with more than one dimension.
    *
    *  MDN
    */
  lazy val table: T[HtmlTable] = htmlTag("table")

  /**
    * The title of a table.
    *
    *  MDN
    */
  lazy val caption: T[HtmlTableCaption] = htmlTag("caption")

  /**
    * A set of columns.
    *
    *  MDN
    */
  lazy val colGroup: T[HtmlTableCol] = htmlTag("colgroup")

  /**
    * A single column.
    *
    *  MDN
    */
  lazy val col: T[HtmlTableCol] = htmlTag("col", void = true)

  /**
    * The table body.
    *
    *  MDN
    */
  lazy val tbody: T[HtmlTableSection] = htmlTag("tbody")

  /**
    * The table headers.
    *
    *  MDN
    */
  lazy val thead: T[HtmlTableSection] = htmlTag("thead")

  /**
    * The table footer.
    *
    *  MDN
    */
  lazy val tfoot: T[HtmlTableSection] = htmlTag("tfoot")

  /**
    * A single row in a table.
    *
    *  MDN
    */
  lazy val tr: T[HtmlTableRow] = htmlTag("tr")

  /**
    * A single cell in a table.
    *
    *  MDN
    */
  lazy val td: T[HtmlTableCell] = htmlTag("td")

  /**
    * A header cell in a table.
    *
    *  MDN
    */
  lazy val th: T[HtmlTableCell] = htmlTag("th")
}
