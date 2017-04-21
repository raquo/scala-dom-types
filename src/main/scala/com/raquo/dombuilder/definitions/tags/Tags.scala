package com.raquo.dombuilder.definitions.tags

import com.raquo.dombuilder.builders.{Tag, TagBuilder}
import com.raquo.dombuilder.nodes.Element

/**
  * Trait that contains the contents of the `Tags` object, so they can be mixed
  * in to other objects if needed.
  */
trait Tags[El <: Element[N, DomElement, DomNode], N, DomElement <: DomNode, DomNode] {
  this: TagBuilder[El, N, DomElement, DomNode] =>

  type Tg = Tag[El, N, DomElement, DomNode]

  /**
    * Represents the root of an HTML or XHTML document. All other elements must
    * be descendants of this element.
    *
    *  MDN
    */
  lazy val html: Tg = tag("html")

  /**
    * Represents a collection of metadata about the document, including links to,
    * or definitions of, scripts and style sheets.
    *
    *  MDN
    */
  lazy val head: Tg = tag("head")

  /**
    * Defines the base URL for relative URLs in the page.
    *
    *  MDN
    */
  lazy val base: Tg = tag("base")

  /**
    * Used to link JavaScript and external CSS with the current HTML document.
    *
    *  MDN
    */
  lazy val link: Tg = tag("link")

  /**
    * Defines metadata that can't be defined using another HTML element.
    *
    *  MDN
    */
  lazy val meta: Tg = tag("meta")

  /**
    * Defines either an internal script or a link to an external script. The
    * script language is JavaScript.
    *
    *  MDN
    */
  lazy val script: Tg = tag("script")

  /**
    * Represents the content of an HTML document. There is only one body
    *   element in a document.
    *
    *  MDN
    */
  lazy val body: Tg = tag("body")

  // Sections

  /**
    * Heading level 1
    *
    *  MDN
    */
  lazy val h1: Tg = tag("h1")

  /**
    * Heading level 2
    *
    *  MDN
    */
  lazy val h2: Tg = tag("h2")

  /**
    * Heading level 3
    *
    *  MDN
    */
  lazy val h3: Tg = tag("h3")

  /**
    * Heading level 4
    *
    *  MDN
    */
  lazy val h4: Tg = tag("h4")

  /**
    * Heading level 5
    *
    *  MDN
    */
  lazy val h5: Tg = tag("h5")

  /**
    * Heading level 6
    *
    *  MDN
    */
  lazy val h6: Tg = tag("h6")

  /**
    * Defines the header of a page or section. It often contains a logo, the
    * title of the Web site, and a navigational table of content.
    *
    *  MDN
    */
  lazy val header: Tg = tag("header")

  /**
    * Defines the footer for a page or section. It often contains a copyright
    * notice, some links to legal information, or addresses to give feedback.
    *
    *  MDN
    */
  lazy val footer: Tg = tag("footer")

  // Grouping content

  /**
    * Defines a portion that should be displayed as a paragraph.
    *
    *  MDN
    */
  lazy val p: Tg = tag("p")

  /**
    * Represents a thematic break between paragraphs of a section or article or
    * any longer content.
    *
    *  MDN
    */
  lazy val hr: Tg = tag("hr")

  /**
    * Indicates that its content is preformatted and that this format must be
    * preserved.
    *
    *  MDN
    */
  lazy val pre: Tg = tag("pre")

  /**
    * Represents a content that is quoted from another source.
    *
    *  MDN
    */
  lazy val blockQuote: Tg = tag("blockquote")

  /**
    * Defines an ordered list of items.
    *
    *  MDN
    */
  lazy val ol: Tg = tag("ol")

  /**
    * Defines an unordered list of items.
    *
    *  MDN
    */
  lazy val ul: Tg = tag("ul")

  /**
    * Defines an item of an list.
    *
    *  MDN
    */
  lazy val li: Tg = tag("li")

  /**
    * Defines a definition list; a list of terms and their associated definitions.
    *
    *  MDN
    */
  lazy val dl: Tg = tag("dl")

  /**
    * Represents a term defined by the next dd
    *
    *  MDN
    */
  lazy val dt: Tg = tag("dt")

  /**
    * Represents the definition of the terms immediately listed before it.
    *
    *  MDN
    */
  lazy val dd: Tg = tag("dd")

  /**
    * Represents a figure illustrated as part of the document.
    *
    *  MDN
    */
  lazy val figure: Tg = tag("figure")

  /**
    * Represents the legend of a figure.
    *
    *  MDN
    */
  lazy val figCaption: Tg = tag("figcaption")

  /**
    * Represents a generic container with no special meaning.
    *
    *  MDN
    */
  lazy val div: Tg = tag("div")

  // Text-level semantics

  /**
    * Represents a hyperlink, linking to another resource.
    *
    *  MDN
    */
  lazy val a: Tg = tag("a")

  /**
    * Represents emphasized text.
    *
    *  MDN
    */
  lazy val em: Tg = tag("em")

  /**
    * Represents especially important text.
    *
    *  MDN
    */
  lazy val strong: Tg = tag("strong")

  /**
    * Represents a side comment; text like a disclaimer or copyright, which is not
    * essential to the comprehension of the document.
    *
    *  MDN
    */
  lazy val small: Tg = tag("small")

  /**
    * Strikethrough element, used for that is no longer accurate or relevant.
    *
    *  MDN
    */
  lazy val s: Tg = tag("s")

  /**
    * Represents the title of a work being cited.
    *
    *  MDN
    */
  lazy val cite: Tg = tag("cite")

  /**
    * Represents computer code.
    *
    *  MDN
    */
  lazy val code: Tg = tag("code")

  /**
    * Subscript tag
    *
    *  MDN
    */
  lazy val sub: Tg = tag("sub")

  /**
    * Superscript tag.
    *
    *  MDN
    */
  lazy val sup: Tg = tag("sup")

  /**
    * Italicized text.
    *
    *  MDN
    */
  lazy val i: Tg = tag("i")

  /**
    * Bold text.
    *
    *  MDN
    */
  lazy val b: Tg = tag("b")

  /**
    * Underlined text.
    *
    *  MDN
    */
  lazy val u: Tg = tag("u")

  /**
    * Represents text with no specific meaning. This has to be used when no other
    * text-semantic element conveys an adequate meaning, which, in this case, is
    * often brought by global attributes like class, lang, or dir.
    *
    *  MDN
    */
  lazy val span: Tg = tag("span")

  /**
    * Represents a line break.
    *
    *  MDN
    */
  lazy val br: Tg = tag("br")

  /**
    * Represents a line break opportunity, that is a suggested point for wrapping
    * text in order to improve readability of text split on several lines.
    *
    *  MDN
    */
  lazy val wbr: Tg = tag("wbr")

  // Edits

  /**
    * Defines an addition to the document.
    *
    *  MDN
    */
  lazy val ins: Tg = tag("ins")

  /**
    * Defines a remolazy val from the document.
    *
    *  MDN
    */
  lazy val del: Tg = tag("del")

  // Embedded content

  /**
    * Represents an image.
    *
    *  MDN
    */
  lazy val img: Tg = tag("img")

  /**
    * Represents a nested browsing context, that is an embedded HTML document.
    *
    *  MDN
    */
  lazy val iframe: Tg = tag("iframe")

  /**
    * Represents a integration point for an external, often non-HTML, application
    * or interactive content.
    *
    *  MDN
    */
  lazy val embed: Tg = tag("embed")

  /**
    * Represents an external resource, which is treated as an image, an HTML
    * sub-document, or an external resource to be processed by a plug-in.
    *
    *  MDN
    */
  lazy val `object`: Tg = tag("object")

  /**
    * Defines parameters for use by plug-ins invoked by object elements.
    *
    *  MDN
    */
  lazy val param: Tg = tag("param")

  /**
    * Represents a video, and its associated audio files and captions, with the
    * necessary interface to play it.
    *
    *  MDN
    */
  lazy val video: Tg = tag("video")

  /**
    * Represents a sound or an audio stream.
    *
    *  MDN
    */
  lazy val audio: Tg = tag("audio")

  /**
    * Allows the authors to specify alternate media resources for media elements
    * like video or audio
    *
    *  MDN
    */
  lazy val source: Tg = tag("source")

  /**
    * Allows authors to specify timed text track for media elements like video or
    * audio
    *
    *  MDN
    */
  lazy val track: Tg = tag("track")

  /**
    * Represents a bitmap area that scripts can use to render graphics like graphs,
    * games or any visual images on the fly.
    *
    *  MDN
    */
  lazy val canvas: Tg = tag("canvas")

  /**
    * In conjunction with area, defines an image map.
    *
    *  MDN
    */
  lazy val map: Tg = tag("map")

  /**
    * In conjunction with map, defines an image map
    *
    *  MDN
    */
  lazy val area: Tg = tag("area")

  // Tabular data

  /**
    * Represents data with more than one dimension.
    *
    *  MDN
    */
  lazy val table: Tg = tag("table")

  /**
    * The title of a table.
    *
    *  MDN
    */
  lazy val caption: Tg = tag("caption")

  /**
    * A set of columns.
    *
    *  MDN
    */
  lazy val colGroup: Tg = tag("colgroup")

  /**
    * A single column.
    *
    *  MDN
    */
  lazy val col: Tg = tag("col")

  /**
    * The table body.
    *
    *  MDN
    */
  lazy val tbody: Tg = tag("tbody")

  /**
    * The table headers.
    *
    *  MDN
    */
  lazy val thead: Tg = tag("thead")

  /**
    * The table footer.
    *
    *  MDN
    */
  lazy val tfoot: Tg = tag("tfoot")

  /**
    * A single row in a table.
    *
    *  MDN
    */
  lazy val tr: Tg = tag("tr")

  /**
    * A single cell in a table.
    *
    *  MDN
    */
  lazy val td: Tg = tag("td")

  /**
    * A header cell in a table.
    *
    *  MDN
    */
  lazy val th: Tg = tag("th")

  // Forms

  /**
    * Represents a form, consisting of controls, that can be submitted to a
    * server for processing.
    *
    *  MDN
    */
  lazy val form: Tg = tag("form")

  /**
    * A set of fields.
    *
    *  MDN
    */
  lazy val fieldSet: Tg = tag("fieldset")

  /**
    * The caption for a fieldset.
    *
    *  MDN
    */
  lazy val legend: Tg = tag("legend")

  /**
    * The caption of a single field
    *
    *  MDN
    */
  lazy val label: Tg = tag("label")

  /**
    * A typed data field allowing the user to input data.
    *
    *  MDN
    */
  lazy val input: Tg = tag("input")

  /**
    * A button
    *
    *  MDN
    */
  lazy val button: Tg = tag("button")

  /**
    * A control that allows the user to select one of a set of options.
    *
    *  MDN
    */
  lazy val select: Tg = tag("select")

  /**
    * A set of predefined options for other controls.
    *
    *  MDN
    */
  lazy val dataList: Tg = tag("datalist")

  /**
    * A set of options, logically grouped.
    *
    *  MDN
    */
  lazy val optGroup: Tg = tag("optgroup")

  /**
    * An option in a select element.
    *
    *  MDN
    */
  lazy val option: Tg = tag("option")

  /**
    * A multiline text edit control.
    *
    *  MDN
    */
  lazy val textArea: Tg = tag("textarea")
}
