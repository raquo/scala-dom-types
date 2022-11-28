package com.raquo.domtypes.defs.tags

import com.raquo.domtypes.common.{HtmlTagType, TagDef}

object FormTags {
  
  val defs: List[TagDef] = List(
    
    TagDef(
      tagType = HtmlTagType,
      scalaName = "form",
      domName = "form",
      isVoid = false,
      scalaJsElementType = "dom.html.Form",
      javascriptElementType = "HTMLFormElement",
      implName = "htmlTag",
      commentLines = List(
        "Represents a form, consisting of controls, that can be submitted to a",
        "server for processing.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/form",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "fieldSet",
      domName = "fieldset",
      isVoid = false,
      scalaJsElementType = "dom.html.FieldSet",
      javascriptElementType = "HTMLFieldSetElement",
      implName = "htmlTag",
      commentLines = List(
        "A set of fields.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/fieldset",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLFieldSetElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "legend",
      domName = "legend",
      isVoid = false,
      scalaJsElementType = "dom.html.Legend",
      javascriptElementType = "HTMLLegendElement",
      implName = "htmlTag",
      commentLines = List(
        "The caption for a fieldset.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/legend",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLLegendElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "label",
      domName = "label",
      isVoid = false,
      scalaJsElementType = "dom.html.Label",
      javascriptElementType = "HTMLLabelElement",
      implName = "htmlTag",
      commentLines = List(
        "The caption of a single field",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/label",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLLabelElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "input",
      domName = "input",
      isVoid = true,
      scalaJsElementType = "dom.html.Input",
      javascriptElementType = "HTMLInputElement",
      implName = "htmlTag",
      commentLines = List(
        "A typed data field allowing the user to input data.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLInputElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "button",
      domName = "button",
      isVoid = false,
      scalaJsElementType = "dom.html.Button",
      javascriptElementType = "HTMLButtonElement",
      implName = "htmlTag",
      commentLines = List(
        "A button",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/button",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLButtonElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "select",
      domName = "select",
      isVoid = false,
      scalaJsElementType = "dom.html.Select",
      javascriptElementType = "HTMLSelectElement",
      implName = "htmlTag",
      commentLines = List(
        "A control that allows the user to select one of a set of options.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/select",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "dataList",
      domName = "datalist",
      isVoid = false,
      scalaJsElementType = "dom.html.DataList",
      javascriptElementType = "HTMLDataListElement",
      implName = "htmlTag",
      commentLines = List(
        "A set of predefined options for other controls.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/datalist",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLDataListElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "optGroup",
      domName = "optgroup",
      isVoid = false,
      scalaJsElementType = "dom.html.OptGroup",
      javascriptElementType = "HTMLOptGroupElement",
      implName = "htmlTag",
      commentLines = List(
        "A set of options, logically grouped.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/optgroup",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLOptGroupElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "option",
      domName = "option",
      isVoid = false,
      scalaJsElementType = "dom.html.Option",
      javascriptElementType = "HTMLOptionElement",
      implName = "htmlTag",
      commentLines = List(
        "An option in a select element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/option",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLOptionElement",
      ),
    ),

    TagDef(
      tagType = HtmlTagType,
      scalaName = "textArea",
      domName = "textarea",
      isVoid = false,
      scalaJsElementType = "dom.html.TextArea",
      javascriptElementType = "HTMLTextAreaElement",
      implName = "htmlTag",
      commentLines = List(
        "A multiline text edit control.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/textarea",
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLTextAreaElement",
      ),
    ),

  )
  
}
