package com.raquo.domtypes.defs.tags

import com.raquo.domtypes.common.{HtmlTagType, TagDef}

object TextTagDefs {
  
  val defs: List[TagDef] = List(
    
    TagDef(
      tagType = HtmlTagType,
      scalaName = "a",
      domName = "a",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Anchor",
      javascriptElementType = "HTMLAnchorElement",
      commentLines = List(
        "Represents a hyperlink, linking to another resource.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/a",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "em",
      domName = "em",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents emphasized text.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/em",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "strong",
      domName = "strong",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents especially important text.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/strong",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "small",
      domName = "small",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents a side comment; text like a disclaimer or copyright, which is not",
        "essential to the comprehension of the document.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/small",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "s",
      domName = "s",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Strikethrough element, used for that is no longer accurate or relevant.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/s",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "cite",
      domName = "cite",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents the title of a work being cited.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/cite",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "code",
      domName = "code",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents computer code.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/code",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "sub",
      domName = "sub",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Subscript tag",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/sub",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "sup",
      domName = "sup",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Superscript tag.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/sup",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "i",
      domName = "i",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Italicized text.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/i",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "b",
      domName = "b",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Bold text.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/b",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "u",
      domName = "u",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Underlined text.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/u",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "span",
      domName = "span",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Span",
      javascriptElementType = "HTMLSpanElement",
      commentLines = List(
        "Represents text with no specific meaning. This has to be used when no other",
        "text-semantic element conveys an adequate meaning, which, in this case, is",
        "often brought by global attributes like class, lang, or dir.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/span",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLSpanElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "br",
      domName = "br",
      isVoid = true,
      scalaJsElementTypeAlias = "dom.html.BR",
      javascriptElementType = "HTMLBRElement",
      commentLines = List(
        "Represents a line break.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/br",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLBRElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "wbr",
      domName = "wbr",
      isVoid = true,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Represents a line break opportunity, that is a suggested point for wrapping",
        "text in order to improve readability of text split on several lines.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/wbr",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "ins",
      domName = "ins",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Mod",
      javascriptElementType = "HTMLModElement",
      commentLines = List(
        "Defines an addition to the document.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/ins",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLModElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "del",
      domName = "del",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Mod",
      javascriptElementType = "HTMLModElement",
      commentLines = List(
        "Defines a remolazy val from the document.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/del",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLModElement",
      ),
    ),

  )
  
}
