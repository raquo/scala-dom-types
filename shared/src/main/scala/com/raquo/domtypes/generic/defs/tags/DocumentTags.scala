package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.TagBuilder

trait DocumentTags[T[_ <: DomElement], DomElement, Html <: DomElement, HtmlHead <: DomElement, HtmlBase <: DomElement, HtmlLink <: DomElement, HtmlMeta <: DomElement, HtmlScript <: DomElement, HtmlElement <: DomElement] {
  this: TagBuilder[T, DomElement] =>

  /**
    * Represents the root of an HTML or XHTML document. All other elements must
    * be descendants of this element.
    *
    *  MDN
    */
  lazy val html: T[Html] = tag("html")

  /**
    * Represents a collection of metadata about the document, including links to,
    * or definitions of, scripts and style sheets.
    *
    *  MDN
    */
  lazy val head: T[HtmlHead] = tag("head")

  /**
    * Defines the base URL for relative URLs in the page.
    *
    *  MDN
    */
  lazy val base: T[HtmlBase] = tag("base", void = true)

  /**
    * Used to link JavaScript and external CSS with the current HTML document.
    *
    *  MDN
    */
  lazy val link: T[HtmlLink] = tag("link", void = true)

  /**
    * Defines metadata that can't be defined using another HTML element.
    *
    *  MDN
    */
  lazy val meta: T[HtmlMeta] = tag("meta", void = true)

  /**
    * Defines either an internal script or a link to an external script. The
    * script language is JavaScript.
    *
    *  MDN
    */
  lazy val script: T[HtmlScript] = tag("script")

  /**
    * Defines alternative content to display when the browser doesn't support
    * scripting.
    *
    *  MDN
    */
  lazy val noScript: T[HtmlElement] = tag("noscript")
}
