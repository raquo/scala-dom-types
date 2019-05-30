package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.HtmlTagBuilder

trait TextTags[T[_ <: DomHtmlElement], DomHtmlElement, HtmlAnchor <: DomHtmlElement, HtmlElement <: DomHtmlElement, HtmlSpan <: DomHtmlElement, HtmlBr <: DomHtmlElement, HtmlMod <: DomHtmlElement] {
  this: HtmlTagBuilder[T, DomHtmlElement] =>

  /**
    * Represents a hyperlink, linking to another resource.
    *
    *  MDN  [[org.scalajs.dom.html.Anchor]]
    */
  @inline def a: T[HtmlAnchor] = htmlTag("a")

  /**
    * Represents emphasized text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  @inline def em: T[HtmlElement] = htmlTag("em")

  /**
    * Represents especially important text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  @inline def strong: T[HtmlElement] = htmlTag("strong")

  /**
    * Represents a side comment; text like a disclaimer or copyright, which is not
    * essential to the comprehension of the document.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  @inline def small: T[HtmlElement] = htmlTag("small")

  /**
    * Strikethrough element, used for that is no longer accurate or relevant.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  @inline def s: T[HtmlElement] = htmlTag("s")

  /**
    * Represents the title of a work being cited.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  @inline def cite: T[HtmlElement] = htmlTag("cite")

  /**
    * Represents computer code.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  @inline def code: T[HtmlElement] = htmlTag("code")

  /**
    * Subscript tag
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  @inline def sub: T[HtmlElement] = htmlTag("sub")

  /**
    * Superscript tag.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  @inline def sup: T[HtmlElement] = htmlTag("sup")

  /**
    * Italicized text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  @inline def i: T[HtmlElement] = htmlTag("i")

  /**
    * Bold text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  @inline def b: T[HtmlElement] = htmlTag("b")

  /**
    * Underlined text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  @inline def u: T[HtmlElement] = htmlTag("u")

  /**
    * Represents text with no specific meaning. This has to be used when no other
    * text-semantic element conveys an adequate meaning, which, in this case, is
    * often brought by global attributes like class, lang, or dir.
    *
    *  MDN  [[org.scalajs.dom.html.Span]]
    */
  @inline def span: T[HtmlSpan] = htmlTag("span")

  /**
    * Represents a line break.
    *
    *  MDN  [[org.scalajs.dom.html.BR]]
    */
  @inline def br: T[HtmlBr] = htmlTag("br", void = true)

  /**
    * Represents a line break opportunity, that is a suggested point for wrapping
    * text in order to improve readability of text split on several lines.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  @inline def wbr: T[HtmlElement] = htmlTag("wbr", void = true)

  /**
    * Defines an addition to the document.
    *
    *  MDN  [[org.scalajs.dom.html.Mod]]
    */
  @inline def ins: T[HtmlMod] = htmlTag("ins")

  /**
    * Defines a remo@inline def from the document.
    *
    *  MDN  [[org.scalajs.dom.html.Mod]]
    */
  @inline def del: T[HtmlMod] = htmlTag("del")
}
