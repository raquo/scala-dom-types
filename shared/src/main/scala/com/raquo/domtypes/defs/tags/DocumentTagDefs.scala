package com.raquo.domtypes.defs.tags

import com.raquo.domtypes.common.{HtmlTagType, TagDef}

object DocumentTagDefs {
  
  val defs: List[TagDef] = List(
    
    TagDef(
      tagType = HtmlTagType,
      scalaName = "htmlTag",
      domName = "html",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Html",
      javascriptElementType = "HTMLHtmlElement",
      commentLines = List(
        "Represents the root of an HTML or XHTML document. All other elements must",
        "be descendants of this element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/html",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLHtmlElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "headTag",
      domName = "head",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Head",
      javascriptElementType = "HTMLHeadElement",
      commentLines = List(
        "Represents a collection of metadata about the document, including links to,",
        "or definitions of, scripts and style sheets.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/head",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLHeadElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "baseTag",
      domName = "base",
      isVoid = true,
      scalaJsElementTypeAlias = "dom.html.Base",
      javascriptElementType = "HTMLBaseElement",
      commentLines = List(
        "Defines the base URL for relative URLs in the page.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/base",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLBaseElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "linkTag",
      domName = "link",
      isVoid = true,
      scalaJsElementTypeAlias = "dom.html.Link",
      javascriptElementType = "HTMLLinkElement",
      commentLines = List(
        "Used to link JavaScript and external CSS with the current HTML document.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/link",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLLinkElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "metaTag",
      domName = "meta",
      isVoid = true,
      scalaJsElementTypeAlias = "dom.html.Meta",
      javascriptElementType = "HTMLMetaElement",
      commentLines = List(
        "Defines metadata that can't be defined using another HTML element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/meta",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLMetaElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "scriptTag",
      domName = "script",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Script",
      javascriptElementType = "HTMLScriptElement",
      commentLines = List(
        "Defines either an internal script or a link to an external script. The",
        "script language is JavaScript.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/script",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLScriptElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "noScriptTag",
      domName = "noscript",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "HTMLElement",
      commentLines = List(
        "Defines alternative content to display when the browser doesn't support",
        "scripting.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/noscript",
      ),
    ),

  )
  
}
