package com.raquo.dombuilder.definitions.nodes

import com.raquo.dombuilder.builders.NodeBuilder
import com.raquo.dombuilder.nodes.Element

/**
  * Contains HTML tags which are used less frequently. These are generally
  * imported individually as needed.
  */
trait Elements2[El <: Element[N], N] { self: NodeBuilder[El, _, _, N] =>

  // Document Metadata

  /**
    * Defines the title of the document, shown in a browser's title bar or on the
    * page's tab. It can only contain text and any contained tags are not
    * interpreted.
    *
    * MDN
    */
  def title: El = element("title")

  /**
    * Used to write inline CSS.
    *
    *  MDN
    */
  def style: El = element("style")

  // Scripting

  /**
    * Defines alternative content to display when the browser doesn't support
    * scripting.
    *
    *  MDN
    */
  def noScript: El = element("noscript")

  // Sections

  /**
    * Represents a generic section of a document, i.e., a thematic grouping of
    * content, typically with a heading.
    *
    *  MDN
    */
  def section: El = element("section")

  /**
    * Represents a section of a page that links to other pages or to parts within
    * the page: a section with navigation links.
    *
    *  MDN
    */
  def nav: El = element("nav")

  /**
    * Defines self-contained content that could exist independently of the rest
    * of the content.
    *
    *  MDN
    */
  def article: El = element("article")

  /**
    * Defines some content loosely related to the page content. If it is removed,
    * the remaining content still makes sense.
    *
    *  MDN
    */
  def aside: El = element("aside")

  /**
    * Defines a section containing contact information.
    *
    *  MDN
    */
  def address: El = element("address")

  /**
    * Defines the main or important content in the document. There is only one
    * main element in the document.
    *
    *  MDN
    */
  def main: El = element("main")

  // Text level semantics

  /**
    * An inline quotation.
    *
    *  MDN
    */
  def q: El = element("q")

  /**
    * Represents a term whose definition is contained in its nearest ancestor
    * content.
    *
    *  MDN
    */
  def dfn: El = element("dfn")

  /**
    * An abbreviation or acronym; the expansion of the abbreviation can be
    * represented in the title attribute.
    *
    *  MDN
    */
  def abbr: El = element("abbr")

  /**
    * Associates to its content a machine-readable equivalent.
    *
    *  MDN
    */
  def data: El = element("data")

  /**
    * Represents a date and time value; the machine-readable equivalent can be
    * represented in the datetime attribetu
    *
    *  MDN
    */
  def time: El = element("time")

  /**
    * Represents a variable.
    *
    *  MDN
    */
  def `var`: El = element("var")

  /**
    * Represents the output of a program or a computer.
    *
    *  MDN
    */
  def samp: El = element("samp")

  /**
    * Represents user input, often from a keyboard, but not necessarily.
    *
    *  MDN
    */
  def kbd: El = element("kbd")

  /**
    * Defines a mathematical formula.
    *
    *  MDN
    */
  def math: El = element("math")

  /**
    * Represents text highlighted for reference purposes, that is for its
    * relevance in another context.
    *
    *  MDN
    */
  def mark: El = element("mark")

  /**
    * Represents content to be marked with ruby annotations, short runs of text
    * presented alongside the text. This is often used in conjunction with East
    * Asian language where the annotations act as a guide for pronunciation, like
    * the Japanese furigana .
    *
    *  MDN
    */
  def ruby: El = element("ruby")

  /**
    * Represents the text of a ruby annotation.
    *
    *  MDN
    */
  def rt: El = element("rt")

  /**
    * Represents parenthesis around a ruby annotation, used to display the
    * annotation in an alternate way by browsers not supporting the standard
    * display for annotations.
    *
    *  MDN
    */
  def rp: El = element("rp")

  /**
    * Represents text that must be isolated from its surrounding for bidirectional
    * text formatting. It allows embedding a span of text with a different, or
    * unknown, directionality.
    *
    *  MDN
    */
  def bdi: El = element("bdi")

  /**
    * Represents the directionality of its children, in order to explicitly
    * override the Unicode bidirectional algorithm.
    *
    *  MDN
    */
  def bdo: El = element("bdo")

  // Forms

  /**
    * A key-pair generator control.
    *
    *  MDN
    */
  def keyGen: El = element("keygen")

  /**
    * The result of a calculation
    *
    *  MDN
    */
  def output: El = element("output")

  /**
    * A progress completion bar
    *
    *  MDN
    */
  def progress: El = element("progress")

  /**
    * A scalar measurement within a known range.
    *
    *  MDN
    */
  def meter: El = element("meter")

  // Interactive elements

  /**
    * A widget from which the user can obtain additional information
    * or controls.
    *
    *  MDN
    */
  def details: El = element("details")

  /**
    * A summary, caption, or legend for a given details.
    *
    *  MDN
    */
  def summary: El = element("summary")

  /**
    * A command that the user can invoke.
    *
    *  MDN
    */
  def command: El = element("command")

  /**
    * A list of commands
    *
    *  MDN
    */
  def menu: El = element("menu")
}
