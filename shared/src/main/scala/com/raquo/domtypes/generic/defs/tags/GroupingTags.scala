package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.TagBuilder

trait GroupingTags[T[_ <: DomElement], DomElement, HtmlParagraph <: DomElement, HtmlHr <: DomElement, HtmlPre <: DomElement, HtmlQuote <: DomElement, HtmlOlist <: DomElement, HtmUlist <: DomElement, HtmlLi <: DomElement, HtmlDlist <: DomElement, HtmlDt <: DomElement, HtmlDd <: DomElement, HtmlElement <: DomElement, HtmlDiv <: DomElement] {
  this: TagBuilder[T, DomElement] =>

  // @TODO[Docs] add links to canonical ScalaJS types in comments

  /**
    * Defines a portion that should be displayed as a paragraph.
    *
    *  MDN
    */
  lazy val p: T[HtmlParagraph] = build("p")

  /**
    * Represents a thematic break between paragraphs of a section or article or
    * any longer content.
    *
    *  MDN
    */
  lazy val hr: T[HtmlHr] = build("hr", void = true)

  /**
    * Indicates that its content is preformatted and that this format must be
    * preserved.
    *
    *  MDN
    */
  lazy val pre: T[HtmlPre] = build("pre")

  /**
    * Represents a content that is quoted from another source.
    *
    *  MDN
    */
  lazy val blockQuote: T[HtmlQuote] = build("blockquote")

  /**
    * Defines an ordered list of items.
    *
    *  MDN
    */
  lazy val ol: T[HtmlOlist] = build("ol")

  /**
    * Defines an unordered list of items.
    *
    *  MDN
    */
  lazy val ul: T[HtmUlist] = build("ul")

  /**
    * Defines an item of an list.
    *
    *  MDN
    */
  lazy val li: T[HtmlLi] = build("li")

  /**
    * Defines a definition list; a list of terms and their associated definitions.
    *
    *  MDN
    */
  lazy val dl: T[HtmlDlist] = build("dl")

  /**
    * Represents a term defined by the next dd
    *
    *  MDN
    */
  lazy val dt: T[HtmlDt] = build("dt")

  /**
    * Represents the definition of the terms immediately listed before it.
    *
    *  MDN
    */
  lazy val dd: T[HtmlDd] = build("dd")

  /**
    * Represents a figure illustrated as part of the document.
    *
    *  MDN
    */
  lazy val figure: T[HtmlElement] = build("figure")

  /**
    * Represents the legend of a figure.
    *
    *  MDN
    */
  lazy val figCaption: T[HtmlElement] = build("figcaption")

  /**
    * Represents a generic container with no special meaning.
    *
    *  MDN
    */
  lazy val div: T[HtmlDiv] = build("div")
}
