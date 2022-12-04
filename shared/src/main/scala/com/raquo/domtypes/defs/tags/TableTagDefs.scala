package com.raquo.domtypes.defs.tags

import com.raquo.domtypes.common.{HtmlTagType, TagDef}

object TableTagDefs {
  
  val defs: List[TagDef] = List(
    
    TagDef(
      tagType = HtmlTagType,
      scalaName = "table",
      domName = "table",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Table",
      javascriptElementType = "HTMLTableElement",
      commentLines = List(
        "Represents data with more than one dimension.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/table",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "caption",
      domName = "caption",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.TableCaption",
      javascriptElementType = "HTMLTableCaptionElement",
      commentLines = List(
        "The title of a table.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/caption",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableCaptionElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "colGroup",
      domName = "colgroup",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.TableCol",
      javascriptElementType = "HTMLTableColElement",
      commentLines = List(
        "A set of columns.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/colgroup",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableColElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "col",
      domName = "col",
      isVoid = true,
      scalaJsElementTypeAlias = "dom.html.TableCol",
      javascriptElementType = "HTMLTableColElement",
      commentLines = List(
        "A single column.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/col",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableColElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "tbody",
      domName = "tbody",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.TableSection",
      javascriptElementType = "HTMLTableSectionElement",
      commentLines = List(
        "The table body.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/tbody",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableSectionElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "thead",
      domName = "thead",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.TableSection",
      javascriptElementType = "HTMLTableSectionElement",
      commentLines = List(
        "The table headers.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/thead",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableSectionElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "tfoot",
      domName = "tfoot",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.TableSection",
      javascriptElementType = "HTMLTableSectionElement",
      commentLines = List(
        "The table footer.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/tfoot",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableSectionElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "tr",
      domName = "tr",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.TableRow",
      javascriptElementType = "HTMLTableRowElement",
      commentLines = List(
        "A single row in a table.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/tr",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "td",
      domName = "td",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.TableCell",
      javascriptElementType = "HTMLTableCellElement",
      commentLines = List(
        "A single cell in a table.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/td",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableCellElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "th",
      domName = "th",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.TableCell",
      javascriptElementType = "HTMLTableCellElement",
      commentLines = List(
        "A header cell in a table.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/th",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableCellElement",
      ),
    ),

  )
  
}
