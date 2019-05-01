package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.HtmlTagBuilder

trait DocumentTags[T[_ <: DomHtmlElement], DomHtmlElement, Html <: DomHtmlElement, HtmlHead <: DomHtmlElement, HtmlBase <: DomHtmlElement, HtmlLink <: DomHtmlElement, HtmlMeta <: DomHtmlElement, HtmlScript <: DomHtmlElement, HtmlElement <: DomHtmlElement] {
  this: HtmlTagBuilder[T, DomHtmlElement] =>

  /**
    * Represents the root of an HTML or XHTML document. All other elements must
    * be descendants of this element.
    *
    *  MDN
    */
  @inline final def html: T[Html] = htmlTag("html")

  /**
    * Represents a collection of metadata about the document, including links to,
    * or definitions of, scripts and style sheets.
    *
    *  MDN
    */
  @inline final def head: T[HtmlHead] = htmlTag("head")

  /**
    * Defines the base URL for relative URLs in the page.
    *
    *  MDN
    */
  @inline final def base: T[HtmlBase] = htmlTag("base", void = true)

  /**
    * Used to link JavaScript and external CSS with the current HTML document.
    *
    *  MDN
    */
  @inline final def link: T[HtmlLink] = htmlTag("link", void = true)

  /**
    * Defines metadata that can't be defined using another HTML element.
    *
    *  MDN
    */
  @inline final def meta: T[HtmlMeta] = htmlTag("meta", void = true)

  /**
    * Defines either an internal script or a link to an external script. The
    * script language is JavaScript.
    *
    *  MDN
    */
  @inline final def script: T[HtmlScript] = htmlTag("script")

  /**
    * Defines alternative content to display when the browser doesn't support
    * scripting.
    *
    *  MDN
    */
  @inline final def noScript: T[HtmlElement] = htmlTag("noscript")
}
