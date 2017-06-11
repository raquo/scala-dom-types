package com.raquo.dombuilder.definitions.tags

import com.raquo.dombuilder.builders.{Tag, TagBuilder}
import com.raquo.dombuilder.nodes.Element

/**
  * Contains HTML tags which are used less frequently. These are generally
  * imported individually as needed.
  */
trait Tags2[El <: Element[N], N] {
  this: TagBuilder[El, N] =>

  // @TODO[API] Specify different Ref for different tags

  type Tg2 = Tag[El, N]

  // Document Metadata

  /**
    * Defines the title of the document, shown in a browser's title bar or on the
    * page's tab. It can only contain text and any contained tags are not
    * interpreted.
    *
    * MDN
    */
  lazy val title: Tg2 = tag("title")

  /**
    * Used to write inline CSS.
    *
    *  MDN
    */
  lazy val style: Tg2 = tag("style")

  // Scripting

  /**
    * Defines alternative content to display when the browser doesn't support
    * scripting.
    *
    *  MDN
    */
  lazy val noScript: Tg2 = tag("noscript")

  // Sections

  /**
    * Represents a generic section of a document, i.e., a thematic grouping of
    * content, typically with a heading.
    *
    *  MDN
    */
  lazy val section: Tg2 = tag("section")

  /**
    * Represents a section of a page that links to other pages or to parts within
    * the page: a section with navigation links.
    *
    *  MDN
    */
  lazy val nav: Tg2 = tag("nav")

  /**
    * Defines self-contained content that could exist independently of the rest
    * of the content.
    *
    *  MDN
    */
  lazy val article: Tg2 = tag("article")

  /**
    * Defines some content loosely related to the page content. If it is removed,
    * the remaining content still makes sense.
    *
    *  MDN
    */
  lazy val aside: Tg2 = tag("aside")

  /**
    * Defines a section containing contact information.
    *
    *  MDN
    */
  lazy val address: Tg2 = tag("address")

  /**
    * Defines the main or important content in the document. There is only one
    * main element in the document.
    *
    *  MDN
    */
  lazy val main: Tg2 = tag("main")

  // Text level semantics

  /**
    * An inline quotation.
    *
    *  MDN
    */
  lazy val q: Tg2 = tag("q")

  /**
    * Represents a term whose definition is contained in its nearest ancestor
    * content.
    *
    *  MDN
    */
  lazy val dfn: Tg2 = tag("dfn")

  /**
    * An abbreviation or acronym; the expansion of the abbreviation can be
    * represented in the title attribute.
    *
    *  MDN
    */
  lazy val abbr: Tg2 = tag("abbr")

  /**
    * Associates to its content a machine-readable equivalent.
    *
    *  MDN
    */
  lazy val data: Tg2 = tag("data")

  /**
    * Represents a date and time value; the machine-readable equivalent can be
    * represented in the datetime attribetu
    *
    *  MDN
    */
  lazy val time: Tg2 = tag("time")

  /**
    * Represents a variable.
    *
    *  MDN
    */
  lazy val `var`: Tg2 = tag("var")

  /**
    * Represents the output of a program or a computer.
    *
    *  MDN
    */
  lazy val samp: Tg2 = tag("samp")

  /**
    * Represents user input, often from a keyboard, but not necessarily.
    *
    *  MDN
    */
  lazy val kbd: Tg2 = tag("kbd")

  /**
    * Defines a mathematical formula.
    *
    *  MDN
    */
  lazy val math: Tg2 = tag("math")

  /**
    * Represents text highlighted for reference purposes, that is for its
    * relevance in another context.
    *
    *  MDN
    */
  lazy val mark: Tg2 = tag("mark")

  /**
    * Represents content to be marked with ruby annotations, short runs of text
    * presented alongside the text. This is often used in conjunction with East
    * Asian language where the annotations act as a guide for pronunciation, like
    * the Japanese furigana .
    *
    *  MDN
    */
  lazy val ruby: Tg2 = tag("ruby")

  /**
    * Represents the text of a ruby annotation.
    *
    *  MDN
    */
  lazy val rt: Tg2 = tag("rt")

  /**
    * Represents parenthesis around a ruby annotation, used to display the
    * annotation in an alternate way by browsers not supporting the standard
    * display for annotations.
    *
    *  MDN
    */
  lazy val rp: Tg2 = tag("rp")

  /**
    * Represents text that must be isolated from its surrounding for bidirectional
    * text formatting. It allows embedding a span of text with a different, or
    * unknown, directionality.
    *
    *  MDN
    */
  lazy val bdi: Tg2 = tag("bdi")

  /**
    * Represents the directionality of its children, in order to explicitly
    * override the Unicode bidirectional algorithm.
    *
    *  MDN
    */
  lazy val bdo: Tg2 = tag("bdo")

  // Forms

  /**
    * A key-pair generator control.
    *
    *  MDN
    */
  lazy val keyGen: Tg2 = tag("keygen")

  /**
    * The result of a calculation
    *
    *  MDN
    */
  lazy val output: Tg2 = tag("output")

  /**
    * A progress completion bar
    *
    *  MDN
    */
  lazy val progress: Tg2 = tag("progress")

  /**
    * A scalar measurement within a known range.
    *
    *  MDN
    */
  lazy val meter: Tg2 = tag("meter")

  // Interactive elements

  /**
    * A widget from which the user can obtain additional information
    * or controls.
    *
    *  MDN
    */
  lazy val details: Tg2 = tag("details")

  /**
    * A summary, caption, or legend for a given details.
    *
    *  MDN
    */
  lazy val summary: Tg2 = tag("summary")

  /**
    * A command that the user can invoke.
    *
    *  MDN
    */
  lazy val command: Tg2 = tag("command")

  /**
    * A list of commands
    *
    *  MDN
    */
  lazy val menu: Tg2 = tag("menu")
}
