package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.TagBuilder

trait SectionTags[T[_ <: DomHtmlElement], DomHtmlElement, HtmlBody <: DomHtmlElement, HtmlElement <: DomHtmlElement, HtmlHeading <: DomHtmlElement] {
  this: TagBuilder[T, DomHtmlElement] =>

  /**
    * Represents the content of an HTML document. There is only one body
    *   element in a document.
    *
    *  MDN  [[org.scalajs.dom.html.Body]]
    */
  lazy val body: T[HtmlBody] = tag("body")

  /**
    * Defines the header of a page or section. It often contains a logo, the
    * title of the Web site, and a navigational table of content.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val header: T[HtmlElement] = tag("header")

  /**
    * Defines the footer for a page or section. It often contains a copyright
    * notice, some links to legal information, or addresses to give feedback.
    *
    *  MDN  [[org.scalajs.dom.html.Element]]
    */
  lazy val footer: T[HtmlElement] = tag("footer")

  /**
    * Heading level 1
    *
    *  MDN  [[org.scalajs.dom.html.Heading]]
    */
  lazy val h1: T[HtmlHeading] = tag("h1")

  /**
    * Heading level 2
    *
    *  MDN  [[org.scalajs.dom.html.Heading]]
    */
  lazy val h2: T[HtmlHeading] = tag("h2")

  /**
    * Heading level 3
    *
    *  MDN  [[org.scalajs.dom.html.Heading]]
    */
  lazy val h3: T[HtmlHeading] = tag("h3")

  /**
    * Heading level 4
    *
    *  MDN  [[org.scalajs.dom.html.Heading]]
    */
  lazy val h4: T[HtmlHeading] = tag("h4")

  /**
    * Heading level 5
    *
    *  MDN  [[org.scalajs.dom.html.Heading]]
    */
  lazy val h5: T[HtmlHeading] = tag("h5")

  /**
    * Heading level 6
    *
    *  MDN  [[org.scalajs.dom.html.Heading]]
    */
  lazy val h6: T[HtmlHeading] = tag("h6")
}
