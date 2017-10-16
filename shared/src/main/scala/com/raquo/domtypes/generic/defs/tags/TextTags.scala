package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.TagBuilder

trait TextTags[T[_ <: DomElement], DomElement, HtmlAnchor <: DomElement, HtmlElement <: DomElement, HtmlSpan <: DomElement, HtmlBr <: DomElement, HtmlMod <: DomElement] {
  this: TagBuilder[T, DomElement] =>

  /**
    * Represents a hyperlink, linking to another resource.
    *
    *  MDN  [[org.scalajs.dom.html.Anchor]]
    */
  lazy val a: T[HtmlAnchor] = tag("a")

  /**
    * Represents emphasized text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val em: T[HtmlElement] = tag("em")

  /**
    * Represents especially important text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val strong: T[HtmlElement] = tag("strong")

  /**
    * Represents a side comment; text like a disclaimer or copyright, which is not
    * essential to the comprehension of the document.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val small: T[HtmlElement] = tag("small")

  /**
    * Strikethrough element, used for that is no longer accurate or relevant.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val s: T[HtmlElement] = tag("s")

  /**
    * Represents the title of a work being cited.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val cite: T[HtmlElement] = tag("cite")

  /**
    * Represents computer code.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val code: T[HtmlElement] = tag("code")

  /**
    * Subscript tag
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val sub: T[HtmlElement] = tag("sub")

  /**
    * Superscript tag.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val sup: T[HtmlElement] = tag("sup")

  /**
    * Italicized text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val i: T[HtmlElement] = tag("i")

  /**
    * Bold text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val b: T[HtmlElement] = tag("b")

  /**
    * Underlined text.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val u: T[HtmlElement] = tag("u")

  /**
    * Represents text with no specific meaning. This has to be used when no other
    * text-semantic element conveys an adequate meaning, which, in this case, is
    * often brought by global attributes like class, lang, or dir.
    *
    *  MDN  [[org.scalajs.dom.html.Span]]
    */
  def span: T[HtmlSpan] = tag("span")

  /**
    * Represents a line break.
    *
    *  MDN  [[org.scalajs.dom.html.BR]]
    */
  lazy val br: T[HtmlBr] = tag("br", void = true)

  /**
    * Represents a line break opportunity, that is a suggested point for wrapping
    * text in order to improve readability of text split on several lines.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val wbr: T[HtmlElement] = tag("wbr", void = true)

  /**
    * Defines an addition to the document.
    *
    *  MDN  [[org.scalajs.dom.html.Mod]]
    */
  lazy val ins: T[HtmlMod] = tag("ins")

  /**
    * Defines a remolazy val from the document.
    *
    *  MDN  [[org.scalajs.dom.html.Mod]]
    */
  lazy val del: T[HtmlMod] = tag("del")
}
