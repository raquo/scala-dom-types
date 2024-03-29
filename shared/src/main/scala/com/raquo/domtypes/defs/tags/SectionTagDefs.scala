package com.raquo.domtypes.defs.tags

import com.raquo.domtypes.common.{HtmlTagType, TagDef}

object SectionTagDefs {
  
  val defs: List[TagDef] = List(
    
    TagDef(
      tagType = HtmlTagType,
      scalaName = "bodyTag",
      domName = "body",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Body",
      javascriptElementType = "HTMLBodyElement",
      commentLines = List(
        "Represents the content of an HTML document. There is only one body",
        "  element in a document.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/body",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLBodyElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "headerTag",
      domName = "header",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Defines the header of a page or section. It often contains a logo, the",
        "title of the Web site, and a navigational table of content.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/header",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "footerTag",
      domName = "footer",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Defines the footer for a page or section. It often contains a copyright",
        "notice, some links to legal information, or addresses to give feedback.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/footer",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "h1",
      domName = "h1",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Heading",
      javascriptElementType = "HTMLHeadingElement",
      commentLines = List(
        "Heading level 1",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/h1",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLHeadingElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "h2",
      domName = "h2",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Heading",
      javascriptElementType = "HTMLHeadingElement",
      commentLines = List(
        "Heading level 2",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/h2",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLHeadingElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "h3",
      domName = "h3",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Heading",
      javascriptElementType = "HTMLHeadingElement",
      commentLines = List(
        "Heading level 3",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/h3",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLHeadingElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "h4",
      domName = "h4",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Heading",
      javascriptElementType = "HTMLHeadingElement",
      commentLines = List(
        "Heading level 4",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/h4",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLHeadingElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "h5",
      domName = "h5",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Heading",
      javascriptElementType = "HTMLHeadingElement",
      commentLines = List(
        "Heading level 5",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/h5",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLHeadingElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "h6",
      domName = "h6",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Heading",
      javascriptElementType = "HTMLHeadingElement",
      commentLines = List(
        "Heading level 6",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/h6",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLHeadingElement",
      ),
    ),

  )
  
}
