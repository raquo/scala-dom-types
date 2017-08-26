package com.raquo.dom.types.generic.defs.tags

import com.raquo.dom.types.generic.builders.TagBuilder

trait TextTags[T[_ <: DomElement], DomElement, HtmlAnchor <: DomElement, HtmlElement <: DomElement, HtmlSpan <: DomElement, HtmlBr <: DomElement, HtmlMod <: DomElement] {
  this: TagBuilder[T, DomElement] =>

  /**
    * Represents a hyperlink, linking to another resource.
    *
    *  MDN  [[org.scalajs.dom.html.Anchor]]
    */
  lazy val a: T[HtmlAnchor] = build("a")

  /**
    * Represents emphasized text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val em: T[HtmlElement] = build("em")

  /**
    * Represents especially important text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val strong: T[HtmlElement] = build("strong")

  /**
    * Represents a side comment; text like a disclaimer or copyright, which is not
    * essential to the comprehension of the document.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val small: T[HtmlElement] = build("small")

  /**
    * Strikethrough element, used for that is no longer accurate or relevant.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val s: T[HtmlElement] = build("s")

  /**
    * Represents the title of a work being cited.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val cite: T[HtmlElement] = build("cite")

  /**
    * Represents computer code.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val code: T[HtmlElement] = build("code")

  /**
    * Subscript tag
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val sub: T[HtmlElement] = build("sub")

  /**
    * Superscript tag.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val sup: T[HtmlElement] = build("sup")

  /**
    * Italicized text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val i: T[HtmlElement] = build("i")

  /**
    * Bold text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val b: T[HtmlElement] = build("b")

  /**
    * Underlined text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val u: T[HtmlElement] = build("u")

  /**
    * Represents text with no specific meaning. This has to be used when no other
    * text-semantic element conveys an adequate meaning, which, in this case, is
    * often brought by global attributes like class, lang, or dir.
    *
    *  MDN  [[org.scalajs.dom.html.Span]]
    */
  def span: T[HtmlSpan] = build("span")

  /**
    * Represents a line break.
    *
    *  MDN  [[org.scalajs.dom.html.BR]]
    */
  lazy val br: T[HtmlBr] = build("br")

  /**
    * Represents a line break opportunity, that is a suggested point for wrapping
    * text in order to improve readability of text split on several lines.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val wbr: T[HtmlElement] = build("wbr")

  /**
    * Defines an addition to the document.
    *
    *  MDN  [[org.scalajs.dom.html.Mod]]
    */
  lazy val ins: T[HtmlMod] = build("ins")

  /**
    * Defines a remolazy val from the document.
    *
    *  MDN  [[org.scalajs.dom.html.Mod]]
    */
  lazy val del: T[HtmlMod] = build("del")
}
