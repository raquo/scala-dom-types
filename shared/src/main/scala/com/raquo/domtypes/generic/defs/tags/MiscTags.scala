package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.TagBuilder

/**
  * Contains HTML tags which are used less frequently. These are generally
  * imported individually as needed.
  */
trait MiscTags[T[_ <: DomElement], DomElement, HtmlTitle <: DomElement, HtmlStyle <: DomElement, HtmlElement <: DomElement, HtmlQuote <: DomElement, HtmlProgress <: DomElement, HtmlMenu <: DomElement] {
  this: TagBuilder[T, DomElement] =>

  // Document Metadata

  /**
    * Defines the title of the document, shown in a browser's title bar or on the
    * page's tab. It can only contain text and any contained tags are not
    * interpreted.
    *
    * MDN
    */
  lazy val title: T[HtmlTitle] = tag("title")

  /**
    * Used to write inline CSS.
    *
    *  MDN
    */
  lazy val style: T[HtmlStyle] = tag("style")

  // Sections

  /**
    * Represents a generic section of a document, i.e., a thematic grouping of
    * content, typically with a heading.
    *
    *  MDN
    */
  lazy val section: T[HtmlElement] = tag("section")

  /**
    * Represents a section of a page that links to other pages or to parts within
    * the page: a section with navigation links.
    *
    *  MDN
    */
  lazy val nav: T[HtmlElement] = tag("nav")

  /**
    * Defines self-contained content that could exist independently of the rest
    * of the content.
    *
    *  MDN
    */
  lazy val article: T[HtmlElement] = tag("article")

  /**
    * Defines some content loosely related to the page content. If it is removed,
    * the remaining content still makes sense.
    *
    *  MDN
    */
  lazy val aside: T[HtmlElement] = tag("aside")

  /**
    * Defines a section containing contact information.
    *
    *  MDN
    */
  lazy val address: T[HtmlElement] = tag("address")

  /**
    * Defines the main or important content in the document. There is only one
    * main element in the document.
    *
    *  MDN
    */
  lazy val main: T[HtmlElement] = tag("main")

  // Text level semantics

  /**
    * An inline quotation.
    *
    *  MDN
    */
  lazy val q: T[HtmlQuote] = tag("q")

  /**
    * Represents a term whose definition is contained in its nearest ancestor
    * content.
    *
    *  MDN
    */
  lazy val dfn: T[HtmlElement] = tag("dfn")

  /**
    * An abbreviation or acronym; the expansion of the abbreviation can be
    * represented in the title attribute.
    *
    *  MDN
    */
  lazy val abbr: T[HtmlElement] = tag("abbr")

  /**
    * Associates to its content a machine-readable equivalent.
    *
    *  MDN
    */
  lazy val data: T[HtmlElement] = tag("data")

  /**
    * Represents a date and time value; the machine-readable equivalent can be
    * represented in the datetime attribute
    *
    *  MDN
    */
  lazy val time: T[HtmlElement] = tag("time")

  /**
    * Represents a variable.
    *
    *  MDN
    */
  lazy val `var`: T[HtmlElement] = tag("var")

  /**
    * Represents the output of a program or a computer.
    *
    *  MDN
    */
  lazy val samp: T[HtmlElement] = tag("samp")

  /**
    * Represents user input, often from a keyboard, but not necessarily.
    *
    *  MDN
    */
  lazy val kbd: T[HtmlElement] = tag("kbd")

  /**
    * Defines a mathematical formula.
    *
    *  MDN
    */
  lazy val math: T[HtmlElement] = tag("math")

  /**
    * Represents text highlighted for reference purposes, that is for its
    * relevance in another context.
    *
    *  MDN
    */
  lazy val mark: T[HtmlElement] = tag("mark")

  /**
    * Represents content to be marked with ruby annotations, short runs of text
    * presented alongside the text. This is often used in conjunction with East
    * Asian language where the annotations act as a guide for pronunciation, like
    * the Japanese furigana .
    *
    *  MDN
    */
  lazy val ruby: T[HtmlElement] = tag("ruby")

  /**
    * Represents the text of a ruby annotation.
    *
    *  MDN
    */
  lazy val rt: T[HtmlElement] = tag("rt")

  /**
    * Represents parenthesis around a ruby annotation, used to display the
    * annotation in an alternate way by browsers not supporting the standard
    * display for annotations.
    *
    *  MDN
    */
  lazy val rp: T[HtmlElement] = tag("rp")

  /**
    * Represents text that must be isolated from its surrounding for bidirectional
    * text formatting. It allows embedding a span of text with a different, or
    * unknown, directionality.
    *
    *  MDN
    */
  lazy val bdi: T[HtmlElement] = tag("bdi")

  /**
    * Represents the directionality of its children, in order to explicitly
    * override the Unicode bidirectional algorithm.
    *
    *  MDN
    */
  lazy val bdo: T[HtmlElement] = tag("bdo")

  // Forms

  /**
    * A key-pair generator control.
    *
    *  MDN
    */
  lazy val keyGen: T[HtmlElement] = tag("keygen")

  /**
    * The result of a calculation
    *
    *  MDN
    */
  lazy val output: T[HtmlElement] = tag("output")

  /**
    * A progress completion bar
    *
    *  MDN
    */
  lazy val progress: T[HtmlProgress] = tag("progress")

  /**
    * A scalar measurement within a known range.
    *
    *  MDN
    */
  lazy val meter: T[HtmlElement] = tag("meter")

  // Interactive elements

  /**
    * A widget from which the user can obtain additional information
    * or controls.
    *
    *  MDN
    */
  lazy val details: T[HtmlElement] = tag("details")

  /**
    * A summary, caption, or legend for a given details.
    *
    *  MDN
    */
  lazy val summary: T[HtmlElement] = tag("summary")

  /**
    * A command that the user can invoke.
    *
    *  MDN
    */
  lazy val command: T[HtmlElement] = tag("command")

  /**
    * A list of commands
    *
    *  MDN
    */
  lazy val menu: T[HtmlMenu] = tag("menu")
}
