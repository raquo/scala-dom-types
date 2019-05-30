package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.HtmlTagBuilder

trait GroupingTags[T[_ <: DomHtmlElement], DomHtmlElement, HtmlParagraph <: DomHtmlElement, HtmlHr <: DomHtmlElement, HtmlPre <: DomHtmlElement, HtmlQuote <: DomHtmlElement, HtmlOlist <: DomHtmlElement, HtmUlist <: DomHtmlElement, HtmlLi <: DomHtmlElement, HtmlDlist <: DomHtmlElement, HtmlDt <: DomHtmlElement, HtmlDd <: DomHtmlElement, HtmlElement <: DomHtmlElement, HtmlDiv <: DomHtmlElement] {
  this: HtmlTagBuilder[T, DomHtmlElement] =>

  // @TODO[Docs] add links to canonical ScalaJS types in comments

  /**
    * Defines a portion that should be displayed as a paragraph.
    *
    *  MDN
    */
  @inline def p: T[HtmlParagraph] = htmlTag("p")

  /**
    * Represents a thematic break between paragraphs of a section or article or
    * any longer content.
    *
    *  MDN
    */
  @inline def hr: T[HtmlHr] = htmlTag("hr", void = true)

  /**
    * Indicates that its content is preformatted and that this format must be
    * preserved.
    *
    *  MDN
    */
  @inline def pre: T[HtmlPre] = htmlTag("pre")

  /**
    * Represents a content that is quoted from another source.
    *
    *  MDN
    */
  @inline def blockQuote: T[HtmlQuote] = htmlTag("blockquote")

  /**
    * Defines an ordered list of items.
    *
    *  MDN
    */
  @inline def ol: T[HtmlOlist] = htmlTag("ol")

  /**
    * Defines an unordered list of items.
    *
    *  MDN
    */
  @inline def ul: T[HtmUlist] = htmlTag("ul")

  /**
    * Defines an item of an list.
    *
    *  MDN
    */
  @inline def li: T[HtmlLi] = htmlTag("li")

  /**
    * Defines a definition list; a list of terms and their associated definitions.
    *
    *  MDN
    */
  @inline def dl: T[HtmlDlist] = htmlTag("dl")

  /**
    * Represents a term defined by the next dd
    *
    *  MDN
    */
  @inline def dt: T[HtmlDt] = htmlTag("dt")

  /**
    * Represents the definition of the terms immediately listed before it.
    *
    *  MDN
    */
  @inline def dd: T[HtmlDd] = htmlTag("dd")

  /**
    * Represents a figure illustrated as part of the document.
    *
    *  MDN
    */
  @inline def figure: T[HtmlElement] = htmlTag("figure")

  /**
    * Represents the legend of a figure.
    *
    *  MDN
    */
  @inline def figCaption: T[HtmlElement] = htmlTag("figcaption")

  /**
    * Represents a generic container with no special meaning.
    *
    *  MDN
    */
  @inline def div: T[HtmlDiv] = htmlTag("div")
}
