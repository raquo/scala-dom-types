package com.raquo.domtypes.old.defs.tags

import com.raquo.domtypes.old.builders.HtmlTagBuilder

trait GroupingTags[T[_ <: DomHtmlElement], DomHtmlElement, HtmlParagraph <: DomHtmlElement, HtmlHr <: DomHtmlElement, HtmlPre <: DomHtmlElement, HtmlQuote <: DomHtmlElement, HtmlOList <: DomHtmlElement, HtmlUList <: DomHtmlElement, HtmlLI <: DomHtmlElement, HtmlDList <: DomHtmlElement, HtmlElement <: DomHtmlElement, HtmlDiv <: DomHtmlElement] {
  this: HtmlTagBuilder[T, DomHtmlElement] =>

  // @TODO[Docs] add links to canonical ScalaJS types in comments

  /**
    * Defines a portion that should be displayed as a paragraph.
    *
    *  MDN
    */
  lazy val p: T[HtmlParagraph] = htmlTag("p")

  /**
    * Represents a thematic break between paragraphs of a section or article or
    * any longer content.
    *
    *  MDN
    */
  lazy val hr: T[HtmlHr] = htmlTag("hr", void = true)

  /**
    * Indicates that its content is preformatted and that this format must be
    * preserved.
    *
    *  MDN
    */
  lazy val pre: T[HtmlPre] = htmlTag("pre")

  /**
    * Represents a content that is quoted from another source.
    *
    *  MDN
    */
  lazy val blockQuote: T[HtmlQuote] = htmlTag("blockquote")

  /**
    * Defines an ordered list of items.
    *
    *  MDN
    */
  lazy val ol: T[HtmlOList] = htmlTag("ol")

  /**
    * Defines an unordered list of items.
    *
    *  MDN
    */
  lazy val ul: T[HtmlUList] = htmlTag("ul")

  /**
    * Defines an item of an list.
    *
    *  MDN
    */
  lazy val li: T[HtmlLI] = htmlTag("li")

  /**
    * Defines a definition list; a list of terms and their associated definitions.
    *
    *  MDN
    */
  lazy val dl: T[HtmlDList] = htmlTag("dl")

  /**
    * Represents a term defined by the next dd
    *
    *  MDN
    */
  lazy val dt: T[HtmlElement] = htmlTag("dt")

  /**
    * Represents the definition of the terms immediately listed before it.
    *
    *  MDN
    */
  lazy val dd: T[HtmlElement] = htmlTag("dd")

  /**
    * Represents a figure illustrated as part of the document.
    *
    *  MDN
    */
  lazy val figure: T[HtmlElement] = htmlTag("figure")

  /**
    * Represents the legend of a figure.
    *
    *  MDN
    */
  lazy val figCaption: T[HtmlElement] = htmlTag("figcaption")

  /**
    * Represents a generic container with no special meaning.
    *
    *  MDN
    */
  lazy val div: T[HtmlDiv] = htmlTag("div")
}
