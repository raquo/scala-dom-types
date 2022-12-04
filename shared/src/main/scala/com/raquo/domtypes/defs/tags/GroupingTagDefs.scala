package com.raquo.domtypes.defs.tags

import com.raquo.domtypes.common.{HtmlTagType, TagDef}

object GroupingTagDefs {
  
  val defs: List[TagDef] = List(
    
    TagDef(
      tagType = HtmlTagType,
      scalaName = "p",
      domName = "p",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Paragraph",
      javascriptElementType = "HTMLParagraphElement",
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
      scalaJsElementTypeAlias = "dom.html.HR",
      javascriptElementType = "HTMLHRElement",
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
      scalaJsElementTypeAlias = "dom.html.Pre",
      javascriptElementType = "HTMLPreElement",
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
      scalaJsElementTypeAlias = "dom.html.Quote",
      javascriptElementType = "HTMLQuoteElement",
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
      scalaJsElementTypeAlias = "dom.html.OList",
      javascriptElementType = "HTMLOListElement",
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
      scalaJsElementTypeAlias = "dom.html.UList",
      javascriptElementType = "HTMLUListElement",
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
      scalaJsElementTypeAlias = "dom.html.LI",
      javascriptElementType = "HTMLLIElement",
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
      scalaJsElementTypeAlias = "dom.html.DList",
      javascriptElementType = "HTMLDListElement",
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
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
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
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
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
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
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
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
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
      scalaJsElementTypeAlias = "dom.html.Div",
      javascriptElementType = "HTMLDivElement",
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
