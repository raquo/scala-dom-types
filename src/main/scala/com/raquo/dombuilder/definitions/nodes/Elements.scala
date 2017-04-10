package com.raquo.dombuilder.definitions.nodes

import com.raquo.dombuilder.NodeBuilder
import com.raquo.dombuilder.nodes.Element

/**
  * Trait that contains the contents of the `Tags` object, so they can be mixed
  * in to other objects if needed.
  */
trait Elements[El <: Element[N], N] { self: NodeBuilder[El, _, _, N] =>

  /**
    * Represents the root of an HTML or XHTML document. All other elements must
    * be descendants of this element.
    *
    *  MDN
    */
  def html: El = element("html")

  /**
    * Represents a collection of metadata about the document, including links to,
    * or definitions of, scripts and style sheets.
    *
    *  MDN
    */
  def head: El = element("head")

  /**
    * Defines the base URL for relative URLs in the page.
    *
    *  MDN
    */
  def base: El = element("base")

  /**
    * Used to link JavaScript and external CSS with the current HTML document.
    *
    *  MDN
    */
  def link: El = element("link")

  /**
    * Defines metadata that can't be defined using another HTML element.
    *
    *  MDN
    */
  def meta: El = element("meta")

  /**
    * Defines either an internal script or a link to an external script. The
    * script language is JavaScript.
    *
    *  MDN
    */
  def script: El = element("script")

  /**
    * Represents the content of an HTML document. There is only one body
    *   element in a document.
    *
    *  MDN
    */
  def body: El = element("body")

  // Sections

  /**
    * Heading level 1
    *
    *  MDN
    */
  def h1: El = element("h1")

  /**
    * Heading level 2
    *
    *  MDN
    */
  def h2: El = element("h2")

  /**
    * Heading level 3
    *
    *  MDN
    */
  def h3: El = element("h3")

  /**
    * Heading level 4
    *
    *  MDN
    */
  def h4: El = element("h4")

  /**
    * Heading level 5
    *
    *  MDN
    */
  def h5: El = element("h5")

  /**
    * Heading level 6
    *
    *  MDN
    */
  def h6: El = element("h6")

  /**
    * Defines the header of a page or section. It often contains a logo, the
    * title of the Web site, and a navigational table of content.
    *
    *  MDN
    */
  def header: El = element("header")

  /**
    * Defines the footer for a page or section. It often contains a copyright
    * notice, some links to legal information, or addresses to give feedback.
    *
    *  MDN
    */
  def footer: El = element("footer")

  // Grouping content

  /**
    * Defines a portion that should be displayed as a paragraph.
    *
    *  MDN
    */
  def p: El = element("p")

  /**
    * Represents a thematic break between paragraphs of a section or article or
    * any longer content.
    *
    *  MDN
    */
  def hr: El = element("hr")

  /**
    * Indicates that its content is preformatted and that this format must be
    * preserved.
    *
    *  MDN
    */
  def pre: El = element("pre")

  /**
    * Represents a content that is quoted from another source.
    *
    *  MDN
    */
  def blockQuote: El = element("blockquote")

  /**
    * Defines an ordered list of items.
    *
    *  MDN
    */
  def ol: El = element("ol")

  /**
    * Defines an unordered list of items.
    *
    *  MDN
    */
  def ul: El = element("ul")

  /**
    * Defines an item of an list.
    *
    *  MDN
    */
  def li: El = element("li")

  /**
    * Defines a definition list; a list of terms and their associated definitions.
    *
    *  MDN
    */
  def dl: El = element("dl")

  /**
    * Represents a term defined by the next dd
    *
    *  MDN
    */
  def dt: El = element("dt")

  /**
    * Represents the definition of the terms immediately listed before it.
    *
    *  MDN
    */
  def dd: El = element("dd")

  /**
    * Represents a figure illustrated as part of the document.
    *
    *  MDN
    */
  def figure: El = element("figure")

  /**
    * Represents the legend of a figure.
    *
    *  MDN
    */
  def figCaption: El = element("figcaption")

  /**
    * Represents a generic container with no special meaning.
    *
    *  MDN
    */
  def div: El = element("div")

  // Text-level semantics

  /**
    * Represents a hyperlink, linking to another resource.
    *
    *  MDN
    */
  def a: El = element("a")

  /**
    * Represents emphasized text.
    *
    *  MDN
    */
  def em: El = element("em")

  /**
    * Represents especially important text.
    *
    *  MDN
    */
  def strong: El = element("strong")

  /**
    * Represents a side comment; text like a disclaimer or copyright, which is not
    * essential to the comprehension of the document.
    *
    *  MDN
    */
  def small: El = element("small")

  /**
    * Strikethrough element, used for that is no longer accurate or relevant.
    *
    *  MDN
    */
  def s: El = element("s")

  /**
    * Represents the title of a work being cited.
    *
    *  MDN
    */
  def cite: El = element("cite")

  /**
    * Represents computer code.
    *
    *  MDN
    */
  def code: El = element("code")

  /**
    * Subscript tag
    *
    *  MDN
    */
  def sub: El = element("sub")

  /**
    * Superscript tag.
    *
    *  MDN
    */
  def sup: El = element("sup")

  /**
    * Italicized text.
    *
    *  MDN
    */
  def i: El = element("i")

  /**
    * Bold text.
    *
    *  MDN
    */
  def b: El = element("b")

  /**
    * Underlined text.
    *
    *  MDN
    */
  def u: El = element("u")

  /**
    * Represents text with no specific meaning. This has to be used when no other
    * text-semantic element conveys an adequate meaning, which, in this case, is
    * often brought by global attributes like class, lang, or dir.
    *
    *  MDN
    */
  def span: El = element("span")

  /**
    * Represents a line break.
    *
    *  MDN
    */
  def br: El = element("br")

  /**
    * Represents a line break opportunity, that is a suggested point for wrapping
    * text in order to improve readability of text split on several lines.
    *
    *  MDN
    */
  def wbr: El = element("wbr")

  // Edits

  /**
    * Defines an addition to the document.
    *
    *  MDN
    */
  def ins: El = element("ins")

  /**
    * Defines a remodef from the document.
    *
    *  MDN
    */
  def del: El = element("del")

  // Embedded content

  /**
    * Represents an image.
    *
    *  MDN
    */
  def img: El = element("img")

  /**
    * Represents a nested browsing context, that is an embedded HTML document.
    *
    *  MDN
    */
  def iframe: El = element("iframe")

  /**
    * Represents a integration point for an external, often non-HTML, application
    * or interactive content.
    *
    *  MDN
    */
  def embed: El = element("embed")

  /**
    * Represents an external resource, which is treated as an image, an HTML
    * sub-document, or an external resource to be processed by a plug-in.
    *
    *  MDN
    */
  def `object`: El = element("object")

  /**
    * Defines parameters for use by plug-ins invoked by object elements.
    *
    *  MDN
    */
  def param: El = element("param")

  /**
    * Represents a video, and its associated audio files and captions, with the
    * necessary interface to play it.
    *
    *  MDN
    */
  def video: El = element("video")

  /**
    * Represents a sound or an audio stream.
    *
    *  MDN
    */
  def audio: El = element("audio")

  /**
    * Allows the authors to specify alternate media resources for media elements
    * like video or audio
    *
    *  MDN
    */
  def source: El = element("source")

  /**
    * Allows authors to specify timed text track for media elements like video or
    * audio
    *
    *  MDN
    */
  def track: El = element("track")

  /**
    * Represents a bitmap area that scripts can use to render graphics like graphs,
    * games or any visual images on the fly.
    *
    *  MDN
    */
  def canvas: El = element("canvas")

  /**
    * In conjunction with area, defines an image map.
    *
    *  MDN
    */
  def map: El = element("map")

  /**
    * In conjunction with map, defines an image map
    *
    *  MDN
    */
  def area: El = element("area")

  // Tabular data

  /**
    * Represents data with more than one dimension.
    *
    *  MDN
    */
  def table: El = element("table")

  /**
    * The title of a table.
    *
    *  MDN
    */
  def caption: El = element("caption")

  /**
    * A set of columns.
    *
    *  MDN
    */
  def colGroup: El = element("colgroup")

  /**
    * A single column.
    *
    *  MDN
    */
  def col: El = element("col")

  /**
    * The table body.
    *
    *  MDN
    */
  def tbody: El = element("tbody")

  /**
    * The table headers.
    *
    *  MDN
    */
  def thead: El = element("thead")

  /**
    * The table footer.
    *
    *  MDN
    */
  def tfoot: El = element("tfoot")

  /**
    * A single row in a table.
    *
    *  MDN
    */
  def tr: El = element("tr")

  /**
    * A single cell in a table.
    *
    *  MDN
    */
  def td: El = element("td")

  /**
    * A header cell in a table.
    *
    *  MDN
    */
  def th: El = element("th")

  // Forms

  /**
    * Represents a form, consisting of controls, that can be submitted to a
    * server for processing.
    *
    *  MDN
    */
  def form: El = element("form")

  /**
    * A set of fields.
    *
    *  MDN
    */
  def fieldSet: El = element("fieldset")

  /**
    * The caption for a fieldset.
    *
    *  MDN
    */
  def legend: El = element("legend")

  /**
    * The caption of a single field
    *
    *  MDN
    */
  def label: El = element("label")

  /**
    * A typed data field allowing the user to input data.
    *
    *  MDN
    */
  def input: El = element("input")

  /**
    * A button
    *
    *  MDN
    */
  def button: El = element("button")

  /**
    * A control that allows the user to select one of a set of options.
    *
    *  MDN
    */
  def select: El = element("select")

  /**
    * A set of predefined options for other controls.
    *
    *  MDN
    */
  def dataList: El = element("datalist")

  /**
    * A set of options, logically grouped.
    *
    *  MDN
    */
  def optGroup: El = element("optgroup")

  /**
    * An option in a select element.
    *
    *  MDN
    */
  def option: El = element("option")

  /**
    * A multiline text edit control.
    *
    *  MDN
    */
  def textArea: El = element("textarea")
}
