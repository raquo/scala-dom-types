package com.raquo.domtypes.defs.tags

import com.raquo.domtypes.common.{HtmlTagType, TagDef}

/**
  * Contains HTML tags which are used less frequently. These are generally
  * imported individually as needed.
  * 
  */
object MiscTagDefs {
  
  val defs: List[TagDef] = List(
    
    TagDef(
      tagType = HtmlTagType,
      scalaName = "titleTag",
      domName = "title",
      isVoid = false,
      scalaJsElementType = "dom.html.Title",
      javascriptElementType = "HTMLTitleElement",
      commentLines = List(
        "Defines the title of the document, shown in a browser's title bar or on the",
        "page's tab. It can only contain text and any contained tags are not",
        "interpreted.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/title",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLTitleElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "styleTag",
      domName = "style",
      isVoid = false,
      scalaJsElementType = "dom.html.Style",
      javascriptElementType = "HTMLStyleElement",
      commentLines = List(
        "Used to write inline CSS.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/style",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLStyleElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "section",
      domName = "section",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents a generic section of a document, i.e., a thematic grouping of",
        "content, typically with a heading.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/section",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "nav",
      domName = "nav",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents a section of a page that links to other pages or to parts within",
        "the page: a section with navigation links.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/nav",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "article",
      domName = "article",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Defines self-contained content that could exist independently of the rest",
        "of the content.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/article",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "aside",
      domName = "aside",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Defines some content loosely related to the page content. If it is removed,",
        "the remaining content still makes sense.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/aside",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "address",
      domName = "address",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Defines a section containing contact information.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/address",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "main",
      domName = "main",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Defines the main or important content in the document. There is only one",
        "main element in the document.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/main",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "q",
      domName = "q",
      isVoid = false,
      scalaJsElementType = "dom.html.Quote",
      javascriptElementType = "HTMLQuoteElement",
      commentLines = List(
        "An inline quotation.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/q",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLQuoteElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "dfn",
      domName = "dfn",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents a term whose definition is contained in its nearest ancestor",
        "content.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/dfn",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "abbr",
      domName = "abbr",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "An abbreviation or acronym; the expansion of the abbreviation can be",
        "represented in the title attribute.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/abbr",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "dataTag",
      domName = "data",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Associates to its content a machine-readable equivalent.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/data",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "time",
      domName = "time",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents a date and time value; the machine-readable equivalent can be",
        "represented in the datetime attribute",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/time",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "`var`",
      domName = "var",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents a variable.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/var",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "samp",
      domName = "samp",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents the output of a program or a computer.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/samp",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "kbd",
      domName = "kbd",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents user input, often from a keyboard, but not necessarily.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/kbd",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "math",
      domName = "math",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Defines a mathematical formula.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/math",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "mark",
      domName = "mark",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents text highlighted for reference purposes, that is for its",
        "relevance in another context.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/mark",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "ruby",
      domName = "ruby",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents content to be marked with ruby annotations, short runs of text",
        "presented alongside the text. This is often used in conjunction with East",
        "Asian language where the annotations act as a guide for pronunciation, like",
        "the Japanese furigana .",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/ruby",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "rt",
      domName = "rt",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents the text of a ruby annotation.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/rt",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "rp",
      domName = "rp",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents parenthesis around a ruby annotation, used to display the",
        "annotation in an alternate way by browsers not supporting the standard",
        "display for annotations.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/rp",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "bdi",
      domName = "bdi",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents text that must be isolated from its surrounding for bidirectional",
        "text formatting. It allows embedding a span of text with a different, or",
        "unknown, directionality.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/bdi",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "bdo",
      domName = "bdo",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents the directionality of its children, in order to explicitly",
        "override the Unicode bidirectional algorithm.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/bdo",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "keyGen",
      domName = "keygen",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "A key-pair generator control.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/keygen",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "output",
      domName = "output",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "The result of a calculation",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/output",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "progress",
      domName = "progress",
      isVoid = false,
      scalaJsElementType = "dom.html.Progress",
      javascriptElementType = "HTMLProgressElement",
      commentLines = List(
        "A progress completion bar",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/progress",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLProgressElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "meter",
      domName = "meter",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "A scalar measurement within a known range.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/meter",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "details",
      domName = "details",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "A widget from which the user can obtain additional information",
        "or controls.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/details",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "summary",
      domName = "summary",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "A summary, caption, or legend for a given details.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/summary",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "command",
      domName = "command",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "A command that the user can invoke.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/command",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "menu",
      domName = "menu",
      isVoid = false,
      scalaJsElementType = "dom.html.Menu",
      javascriptElementType = "HTMLMenuElement",
      commentLines = List(
        "A list of commands",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/menu",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMenuElement",
      ),
    ),

  )
  
}
