package com.raquo.dombuilder.definitions.tags

import com.raquo.dombuilder.builders.{Tag, TagBuilder}
import com.raquo.dombuilder.nodes.Element

/**
  * Contains HTML tags which are used less frequently. These are generally
  * imported individually as needed.
  */
trait Tags2[El <: Element[N, DomElement], N, DomElement] { self: TagBuilder[El, N, DomElement] =>

  // @TODO[API] Specify different Ref for different tags

  type T2 = Tag[El, N, DomElement]

  // Document Metadata

  /**
    * Defines the title of the document, shown in a browser's title bar or on the
    * page's tab. It can only contain text and any contained tags are not
    * interpreted.
    *
    * MDN
    */
  lazy val title: T2 = tag("title")

  /**
    * Used to write inline CSS.
    *
    *  MDN
    */
  lazy val style: T2 = tag("style")

  // Scripting

  /**
    * Defines alternative content to display when the browser doesn't support
    * scripting.
    *
    *  MDN
    */
  lazy val noScript: T2 = tag("noscript")

  // Sections

  /**
    * Represents a generic section of a document, i.e., a thematic grouping of
    * content, typically with a heading.
    *
    *  MDN
    */
  lazy val section: T2 = tag("section")

  /**
    * Represents a section of a page that links to other pages or to parts within
    * the page: a section with navigation links.
    *
    *  MDN
    */
  lazy val nav: T2 = tag("nav")

  /**
    * Defines self-contained content that could exist independently of the rest
    * of the content.
    *
    *  MDN
    */
  lazy val article: T2 = tag("article")

  /**
    * Defines some content loosely related to the page content. If it is removed,
    * the remaining content still makes sense.
    *
    *  MDN
    */
  lazy val aside: T2 = tag("aside")

  /**
    * Defines a section containing contact information.
    *
    *  MDN
    */
  lazy val address: T2 = tag("address")

  /**
    * Defines the main or important content in the document. There is only one
    * main element in the document.
    *
    *  MDN
    */
  lazy val main: T2 = tag("main")

  // Text level semantics

  /**
    * An inline quotation.
    *
    *  MDN
    */
  lazy val q: T2 = tag("q")

  /**
    * Represents a term whose definition is contained in its nearest ancestor
    * content.
    *
    *  MDN
    */
  lazy val dfn: T2 = tag("dfn")

  /**
    * An abbreviation or acronym; the expansion of the abbreviation can be
    * represented in the title attribute.
    *
    *  MDN
    */
  lazy val abbr: T2 = tag("abbr")

  /**
    * Associates to its content a machine-readable equivalent.
    *
    *  MDN
    */
  lazy val data: T2 = tag("data")

  /**
    * Represents a date and time value; the machine-readable equivalent can be
    * represented in the datetime attribetu
    *
    *  MDN
    */
  lazy val time: T2 = tag("time")

  /**
    * Represents a variable.
    *
    *  MDN
    */
  lazy val `var`: T2 = tag("var")

  /**
    * Represents the output of a program or a computer.
    *
    *  MDN
    */
  lazy val samp: T2 = tag("samp")

  /**
    * Represents user input, often from a keyboard, but not necessarily.
    *
    *  MDN
    */
  lazy val kbd: T2 = tag("kbd")

  /**
    * Defines a mathematical formula.
    *
    *  MDN
    */
  lazy val math: T2 = tag("math")

  /**
    * Represents text highlighted for reference purposes, that is for its
    * relevance in another context.
    *
    *  MDN
    */
  lazy val mark: T2 = tag("mark")

  /**
    * Represents content to be marked with ruby annotations, short runs of text
    * presented alongside the text. This is often used in conjunction with East
    * Asian language where the annotations act as a guide for pronunciation, like
    * the Japanese furigana .
    *
    *  MDN
    */
  lazy val ruby: T2 = tag("ruby")

  /**
    * Represents the text of a ruby annotation.
    *
    *  MDN
    */
  lazy val rt: T2 = tag("rt")

  /**
    * Represents parenthesis around a ruby annotation, used to display the
    * annotation in an alternate way by browsers not supporting the standard
    * display for annotations.
    *
    *  MDN
    */
  lazy val rp: T2 = tag("rp")

  /**
    * Represents text that must be isolated from its surrounding for bidirectional
    * text formatting. It allows embedding a span of text with a different, or
    * unknown, directionality.
    *
    *  MDN
    */
  lazy val bdi: T2 = tag("bdi")

  /**
    * Represents the directionality of its children, in order to explicitly
    * override the Unicode bidirectional algorithm.
    *
    *  MDN
    */
  lazy val bdo: T2 = tag("bdo")

  // Forms

  /**
    * A key-pair generator control.
    *
    *  MDN
    */
  lazy val keyGen: T2 = tag("keygen")

  /**
    * The result of a calculation
    *
    *  MDN
    */
  lazy val output: T2 = tag("output")

  /**
    * A progress completion bar
    *
    *  MDN
    */
  lazy val progress: T2 = tag("progress")

  /**
    * A scalar measurement within a known range.
    *
    *  MDN
    */
  lazy val meter: T2 = tag("meter")

  // Interactive elements

  /**
    * A widget from which the user can obtain additional information
    * or controls.
    *
    *  MDN
    */
  lazy val details: T2 = tag("details")

  /**
    * A summary, caption, or legend for a given details.
    *
    *  MDN
    */
  lazy val summary: T2 = tag("summary")

  /**
    * A command that the user can invoke.
    *
    *  MDN
    */
  lazy val command: T2 = tag("command")

  /**
    * A list of commands
    *
    *  MDN
    */
  lazy val menu: T2 = tag("menu")
}
