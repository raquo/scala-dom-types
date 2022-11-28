package com.raquo.domtypes.old.defs.tags

import com.raquo.domtypes.old.builders.HtmlTagBuilder

trait TextTags[T[_ <: DomHtmlElement], DomHtmlElement, HtmlAnchor <: DomHtmlElement, HtmlElement <: DomHtmlElement, HtmlSpan <: DomHtmlElement, HtmlBr <: DomHtmlElement, HtmlMod <: DomHtmlElement] {
  this: HtmlTagBuilder[T, DomHtmlElement] =>

  /**
    * Represents a hyperlink, linking to another resource.
    *
    *  MDN  [[org.scalajs.dom.html.Anchor]]
    */
  lazy val a: T[HtmlAnchor] = htmlTag("a")

  /**
    * Represents emphasized text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val em: T[HtmlElement] = htmlTag("em")

  /**
    * Represents especially important text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val strong: T[HtmlElement] = htmlTag("strong")

  /**
    * Represents a side comment; text like a disclaimer or copyright, which is not
    * essential to the comprehension of the document.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val small: T[HtmlElement] = htmlTag("small")

  /**
    * Strikethrough element, used for that is no longer accurate or relevant.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val s: T[HtmlElement] = htmlTag("s")

  /**
    * Represents the title of a work being cited.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val cite: T[HtmlElement] = htmlTag("cite")

  /**
    * Represents computer code.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val code: T[HtmlElement] = htmlTag("code")

  /**
    * Subscript tag
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val sub: T[HtmlElement] = htmlTag("sub")

  /**
    * Superscript tag.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val sup: T[HtmlElement] = htmlTag("sup")

  /**
    * Italicized text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val i: T[HtmlElement] = htmlTag("i")

  /**
    * Bold text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val b: T[HtmlElement] = htmlTag("b")

  /**
    * Underlined text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val u: T[HtmlElement] = htmlTag("u")

  /**
    * Represents text with no specific meaning. This has to be used when no other
    * text-semantic element conveys an adequate meaning, which, in this case, is
    * often brought by global attributes like class, lang, or dir.
    *
    *  MDN  [[org.scalajs.dom.html.Span]]
    */
  lazy val span: T[HtmlSpan] = htmlTag("span")

  /**
    * Represents a line break.
    *
    *  MDN  [[org.scalajs.dom.html.BR]]
    */
  lazy val br: T[HtmlBr] = htmlTag("br", void = true)

  /**
    * Represents a line break opportunity, that is a suggested point for wrapping
    * text in order to improve readability of text split on several lines.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val wbr: T[HtmlElement] = htmlTag("wbr", void = true)

  /**
    * Defines an addition to the document.
    *
    *  MDN  [[org.scalajs.dom.html.Mod]]
    */
  lazy val ins: T[HtmlMod] = htmlTag("ins")

  /**
    * Defines a remolazy val from the document.
    *
    *  MDN  [[org.scalajs.dom.html.Mod]]
    */
  lazy val del: T[HtmlMod] = htmlTag("del")
}
