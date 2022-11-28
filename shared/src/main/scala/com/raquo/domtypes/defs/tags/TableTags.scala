package com.raquo.domtypes.defs.tags

import com.raquo.domtypes.common.{HtmlTagType, TagDef}

object TableTags {
  
  val defs: List[TagDef] = List(
    
    TagDef(
      tagType = HtmlTagType,
      scalaName = "table",
      domName = "table",
      isVoid = false,
      scalaJsElementType = "dom.html.Table",
      javascriptElementType = "HTMLTableElement",
      implName = "htmlTag",
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
      scalaJsElementType = "dom.html.TableCaption",
      javascriptElementType = "HTMLTableCaptionElement",
      implName = "htmlTag",
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
      scalaJsElementType = "dom.html.TableCol",
      javascriptElementType = "HTMLTableColElement",
      implName = "htmlTag",
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
      scalaJsElementType = "dom.html.TableCol",
      javascriptElementType = "HTMLTableColElement",
      implName = "htmlTag",
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
      scalaJsElementType = "dom.html.TableSection",
      javascriptElementType = "HTMLTableSectionElement",
      implName = "htmlTag",
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
      scalaJsElementType = "dom.html.TableSection",
      javascriptElementType = "HTMLTableSectionElement",
      implName = "htmlTag",
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
      scalaJsElementType = "dom.html.TableSection",
      javascriptElementType = "HTMLTableSectionElement",
      implName = "htmlTag",
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
      scalaJsElementType = "dom.html.TableRow",
      javascriptElementType = "HTMLTableRowElement",
      implName = "htmlTag",
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
      scalaJsElementType = "dom.html.TableCell",
      javascriptElementType = "HTMLTableCellElement",
      implName = "htmlTag",
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
      scalaJsElementType = "dom.html.TableCell",
      javascriptElementType = "HTMLTableCellElement",
      implName = "htmlTag",
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
