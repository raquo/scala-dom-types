package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.HtmlTagBuilder

trait SectionTags[T[_ <: DomHtmlElement], DomHtmlElement, HtmlBody <: DomHtmlElement, HtmlElement <: DomHtmlElement, HtmlHeading <: DomHtmlElement] {
  this: HtmlTagBuilder[T, DomHtmlElement] =>

  /**
    * Represents the content of an HTML document. There is only one body
    *   element in a document.
    *
    *  MDN  [[org.scalajs.dom.html.Body]]
    */
  @inline final def body: T[HtmlBody] = htmlTag("body")

  /**
    * Defines the header of a page or section. It often contains a logo, the
    * title of the Web site, and a navigational table of content.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  @inline final def header: T[HtmlElement] = htmlTag("header")

  /**
    * Defines the footer for a page or section. It often contains a copyright
    * notice, some links to legal information, or addresses to give feedback.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  @inline final def footer: T[HtmlElement] = htmlTag("footer")

  /**
    * Heading level 1
    *
    *  MDN  [[org.scalajs.dom.html.Heading]]
    */
  @inline final def h1: T[HtmlHeading] = htmlTag("h1")

  /**
    * Heading level 2
    *
    *  MDN  [[org.scalajs.dom.html.Heading]]
    */
  @inline final def h2: T[HtmlHeading] = htmlTag("h2")

  /**
    * Heading level 3
    *
    *  MDN  [[org.scalajs.dom.html.Heading]]
    */
  @inline final def h3: T[HtmlHeading] = htmlTag("h3")

  /**
    * Heading level 4
    *
    *  MDN  [[org.scalajs.dom.html.Heading]]
    */
  @inline final def h4: T[HtmlHeading] = htmlTag("h4")

  /**
    * Heading level 5
    *
    *  MDN  [[org.scalajs.dom.html.Heading]]
    */
  @inline final def h5: T[HtmlHeading] = htmlTag("h5")

  /**
    * Heading level 6
    *
    *  MDN  [[org.scalajs.dom.html.Heading]]
    */
  @inline final def h6: T[HtmlHeading] = htmlTag("h6")
}
