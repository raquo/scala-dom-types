package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.HtmlTagBuilder

trait TableTags[T[_ <: DomHtmlElement], DomHtmlElement, HtmlTable <: DomHtmlElement, HtmlTableCaption <: DomHtmlElement, HtmlTableCol <: DomHtmlElement, HtmlTableSection <: DomHtmlElement, HtmlTableRow <: DomHtmlElement, HtmlTableCell <: DomHtmlElement, HtmlTableHeaderCell <: DomHtmlElement] {
  this: HtmlTagBuilder[T, DomHtmlElement] =>

  // @TODO[Docs] add links to canonical ScalaJS types in comments

  /**
    * Represents data with more than one dimension.
    *
    *  MDN
    */
  @inline final def table: T[HtmlTable] = htmlTag("table")

  /**
    * The title of a table.
    *
    *  MDN
    */
  @inline final def caption: T[HtmlTableCaption] = htmlTag("caption")

  /**
    * A set of columns.
    *
    *  MDN
    */
  @inline final def colGroup: T[HtmlTableCol] = htmlTag("colgroup")

  /**
    * A single column.
    *
    *  MDN
    */
  @inline final def col: T[HtmlTableCol] = htmlTag("col", void = true)

  /**
    * The table body.
    *
    *  MDN
    */
  @inline final def tbody: T[HtmlTableSection] = htmlTag("tbody")

  /**
    * The table headers.
    *
    *  MDN
    */
  @inline final def thead: T[HtmlTableSection] = htmlTag("thead")

  /**
    * The table footer.
    *
    *  MDN
    */
  @inline final def tfoot: T[HtmlTableSection] = htmlTag("tfoot")

  /**
    * A single row in a table.
    *
    *  MDN
    */
  @inline final def tr: T[HtmlTableRow] = htmlTag("tr")

  /**
    * A single cell in a table.
    *
    *  MDN
    */
  @inline final def td: T[HtmlTableCell] = htmlTag("td")

  /**
    * A header cell in a table.
    *
    *  MDN
    */
  @inline final def th: T[HtmlTableHeaderCell] = htmlTag("th")
}
