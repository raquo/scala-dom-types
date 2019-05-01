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
  @inline final def p: T[HtmlParagraph] = htmlTag("p")

  /**
    * Represents a thematic break between paragraphs of a section or article or
    * any longer content.
    *
    *  MDN
    */
  @inline final def hr: T[HtmlHr] = htmlTag("hr", void = true)

  /**
    * Indicates that its content is preformatted and that this format must be
    * preserved.
    *
    *  MDN
    */
  @inline final def pre: T[HtmlPre] = htmlTag("pre")

  /**
    * Represents a content that is quoted from another source.
    *
    *  MDN
    */
  @inline final def blockQuote: T[HtmlQuote] = htmlTag("blockquote")

  /**
    * Defines an ordered list of items.
    *
    *  MDN
    */
  @inline final def ol: T[HtmlOlist] = htmlTag("ol")

  /**
    * Defines an unordered list of items.
    *
    *  MDN
    */
  @inline final def ul: T[HtmUlist] = htmlTag("ul")

  /**
    * Defines an item of an list.
    *
    *  MDN
    */
  @inline final def li: T[HtmlLi] = htmlTag("li")

  /**
    * Defines a definition list; a list of terms and their associated definitions.
    *
    *  MDN
    */
  @inline final def dl: T[HtmlDlist] = htmlTag("dl")

  /**
    * Represents a term defined by the next dd
    *
    *  MDN
    */
  @inline final def dt: T[HtmlDt] = htmlTag("dt")

  /**
    * Represents the definition of the terms immediately listed before it.
    *
    *  MDN
    */
  @inline final def dd: T[HtmlDd] = htmlTag("dd")

  /**
    * Represents a figure illustrated as part of the document.
    *
    *  MDN
    */
  @inline final def figure: T[HtmlElement] = htmlTag("figure")

  /**
    * Represents the legend of a figure.
    *
    *  MDN
    */
  @inline final def figCaption: T[HtmlElement] = htmlTag("figcaption")

  /**
    * Represents a generic container with no special meaning.
    *
    *  MDN
    */
  @inline final def div: T[HtmlDiv] = htmlTag("div")
}
