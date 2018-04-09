package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.TagBuilder

trait GroupingTags[T[_ <: DomHtmlElement], DomHtmlElement, HtmlParagraph <: DomHtmlElement, HtmlHr <: DomHtmlElement, HtmlPre <: DomHtmlElement, HtmlQuote <: DomHtmlElement, HtmlOlist <: DomHtmlElement, HtmUlist <: DomHtmlElement, HtmlLi <: DomHtmlElement, HtmlDlist <: DomHtmlElement, HtmlDt <: DomHtmlElement, HtmlDd <: DomHtmlElement, HtmlElement <: DomHtmlElement, HtmlDiv <: DomHtmlElement] {
  this: TagBuilder[T, DomHtmlElement] =>

  // @TODO[Docs] add links to canonical ScalaJS types in comments

  /**
    * Defines a portion that should be displayed as a paragraph.
    *
    *  MDN
    */
  lazy val p: T[HtmlParagraph] = tag("p")

  /**
    * Represents a thematic break between paragraphs of a section or article or
    * any longer content.
    *
    *  MDN
    */
  lazy val hr: T[HtmlHr] = tag("hr", void = true)

  /**
    * Indicates that its content is preformatted and that this format must be
    * preserved.
    *
    *  MDN
    */
  lazy val pre: T[HtmlPre] = tag("pre")

  /**
    * Represents a content that is quoted from another source.
    *
    *  MDN
    */
  lazy val blockQuote: T[HtmlQuote] = tag("blockquote")

  /**
    * Defines an ordered list of items.
    *
    *  MDN
    */
  lazy val ol: T[HtmlOlist] = tag("ol")

  /**
    * Defines an unordered list of items.
    *
    *  MDN
    */
  lazy val ul: T[HtmUlist] = tag("ul")

  /**
    * Defines an item of an list.
    *
    *  MDN
    */
  lazy val li: T[HtmlLi] = tag("li")

  /**
    * Defines a definition list; a list of terms and their associated definitions.
    *
    *  MDN
    */
  lazy val dl: T[HtmlDlist] = tag("dl")

  /**
    * Represents a term defined by the next dd
    *
    *  MDN
    */
  lazy val dt: T[HtmlDt] = tag("dt")

  /**
    * Represents the definition of the terms immediately listed before it.
    *
    *  MDN
    */
  lazy val dd: T[HtmlDd] = tag("dd")

  /**
    * Represents a figure illustrated as part of the document.
    *
    *  MDN
    */
  lazy val figure: T[HtmlElement] = tag("figure")

  /**
    * Represents the legend of a figure.
    *
    *  MDN
    */
  lazy val figCaption: T[HtmlElement] = tag("figcaption")

  /**
    * Represents a generic container with no special meaning.
    *
    *  MDN
    */
  lazy val div: T[HtmlDiv] = tag("div")
}
