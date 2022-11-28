package com.raquo.domtypes.defs.tags

import com.raquo.domtypes.common.{HtmlTagType, TagDef}

object GroupingTags {
  
  val defs: List[TagDef] = List(
    
    TagDef(
      tagType = HtmlTagType,
      scalaName = "p",
      domName = "p",
      isVoid = false,
      scalaJsElementType = "dom.html.Paragraph",
      javascriptElementType = "HTMLParagraphElement",
      implName = "htmlTag",
      commentLines = List(
        "Defines a portion that should be displayed as a paragraph.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/p",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLParagraphElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "hr",
      domName = "hr",
      isVoid = true,
      scalaJsElementType = "dom.html.Hr",
      javascriptElementType = "HTMLHRElement",
      implName = "htmlTag",
      commentLines = List(
        "Represents a thematic break between paragraphs of a section or article or",
        "any longer content.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/hr",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLHRElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "pre",
      domName = "pre",
      isVoid = false,
      scalaJsElementType = "dom.html.Pre",
      javascriptElementType = "HTMLPreElement",
      implName = "htmlTag",
      commentLines = List(
        "Indicates that its content is preformatted and that this format must be",
        "preserved.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/pre",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLPreElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "blockQuote",
      domName = "blockquote",
      isVoid = false,
      scalaJsElementType = "dom.html.Quote",
      javascriptElementType = "HTMLQuoteElement",
      implName = "htmlTag",
      commentLines = List(
        "Represents a content that is quoted from another source.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/blockquote",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLQuoteElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "ol",
      domName = "ol",
      isVoid = false,
      scalaJsElementType = "dom.html.OList",
      javascriptElementType = "HTMLOListElement",
      implName = "htmlTag",
      commentLines = List(
        "Defines an ordered list of items.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/ol",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLOListElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "ul",
      domName = "ul",
      isVoid = false,
      scalaJsElementType = "dom.html.UList",
      javascriptElementType = "HTMLUListElement",
      implName = "htmlTag",
      commentLines = List(
        "Defines an unordered list of items.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/ul",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLUListElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "li",
      domName = "li",
      isVoid = false,
      scalaJsElementType = "dom.html.LI",
      javascriptElementType = "HTMLLIElement",
      implName = "htmlTag",
      commentLines = List(
        "Defines an item of an list.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/li",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLLIElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "dl",
      domName = "dl",
      isVoid = false,
      scalaJsElementType = "dom.html.DList",
      javascriptElementType = "HTMLDListElement",
      implName = "htmlTag",
      commentLines = List(
        "Defines a definition list; a list of terms and their associated definitions.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/dl",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLDListElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "dt",
      domName = "dt",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      implName = "htmlTag",
      commentLines = List(
        "Represents a term defined by the next dd",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/dt",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "dd",
      domName = "dd",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      implName = "htmlTag",
      commentLines = List(
        "Represents the definition of the terms immediately listed before it.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/dd",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "figure",
      domName = "figure",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      implName = "htmlTag",
      commentLines = List(
        "Represents a figure illustrated as part of the document.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/figure",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "figCaption",
      domName = "figcaption",
      isVoid = false,
      scalaJsElementType = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      implName = "htmlTag",
      commentLines = List(
        "Represents the legend of a figure.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/figcaption",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "div",
      domName = "div",
      isVoid = false,
      scalaJsElementType = "dom.html.Div",
      javascriptElementType = "HTMLDivElement",
      implName = "htmlTag",
      commentLines = List(
        "Represents a generic container with no special meaning.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/div",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLDivElement",
      ),
    ),

  )
  
}
