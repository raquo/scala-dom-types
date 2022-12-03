package com.raquo.domtypes.defs.attrs

import com.raquo.domtypes.common.{AttrDef, HtmlTagType}

/** HTML attributes that don't reflect onto props. See also: Props, ReflectedHtmlAttrs, SvgAttrs */
object HtmlAttrs {
  
  val defs: List[AttrDef] = List(
    
    AttrDef(
      tagType = HtmlTagType,
      scalaName = "charset",
      domName = "charset",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Declares the character encoding of the page or script. Used on meta and",
        "script elements.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/object#attr-charset",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "contentEditable",
      domName = "contenteditable",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsTrueFalseString",
      commentLines = List(
        "Indicates whether the element should be editable by the user.",
        "If so, the browser modifies its widget to allow editing.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/contentEditable",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "contextMenuId",
      domName = "contextmenu",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Specifies a context menu for an element by its element id.",
        "The context menu appears when a user right-clicks on the element",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/contextmenu",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "dropZone",
      domName = "dropzone",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Specifies whether the dragged data is copied, moved, or linked, when dropped",
        "Acceptable values: `copy` | `move` | `link`",
      ),
      docUrls = Nil,
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "formId",
      domName = "form",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "The form attribute specifies an ID of the form an `<input>` element belongs to.",
      ),
      docUrls = Nil,
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "heightAttr",
      domName = "height",
      namespace = None,
      scalaValueType = "Int",
      codec = "IntAsString",
      commentLines = List(
        "The `height` attribute specifies the pixel height of the following elements:",
        "`<canvas>, <embed>, <iframe>, <img>, <input type=\"image\">, <object>, <video>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/object#attr-height",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "listId",
      domName = "list",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "Identifies a list of pre-defined options to suggest to the user. The value must be",
        "the id of a [[FormTags.dataList]] element in",
        "the same document. The browser displays only options that are valid values for this",
        "input element. This attribute is ignored when the type attribute's value is hidden,",
        "checkbox, radio, file, or a button type.",
      ),
      docUrls = Nil,
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "maxAttr",
      domName = "max",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "The max attribute specifies the maximum value for an <input> element of type",
        "number, range, date, datetime, datetime-local, month, time, or week.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/max",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "minAttr",
      domName = "min",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "The min attribute specifies the minimum value for an <input> element of type",
        "number, range, date, datetime, datetime-local, month, time, or week.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/min",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "stepAttr",
      domName = "step",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "The step attribute specifies the numeric intervals for an <input> element",
        "that should be considered legal for the input. For example, if step is 2",
        "on a number typed <input> then the legal numbers could be -2, 0, 2, 4, 6",
        "etc. The step attribute should be used in conjunction with the min and",
        "max attributes to specify the full range and interval of the legal values.",
        "The step attribute is applicable to <input> elements of the following",
        "types: number, range, date, datetime, datetime-local, month, time and week.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/step",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "`type`",
      scalaAliases = List("typ", "tpe"),
      domName = "type",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = List(
        "This attribute is used to define the type of the content linked to. The",
        "value of the attribute should be a MIME type such as text/html, text/css,",
        "and so on. The common use of this attribute is to define the type of style",
        "sheet linked and the most common current value is text/css, which indicates",
        "a Cascading Style Sheet format. You can use tpe as an alias for this",
        "attribute so you don't have to backtick-escape this attribute.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/object#attr-type",
      ),
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "unselectable",
      domName = "unselectable",
      namespace = None,
      scalaValueType = "Boolean",
      codec = "BooleanAsOnOffString",
      commentLines = List(
        "IE-specific property to prevent user selection",
      ),
      docUrls = Nil,
    ),

    AttrDef(
      tagType = HtmlTagType,
      scalaName = "widthAttr",
      domName = "width",
      namespace = None,
      scalaValueType = "Int",
      codec = "IntAsString",
      commentLines = List(
        "The `width` attribute specifies the pixel width of the following elements:",
        "`<canvas>, <embed>, <iframe>, <img>, <input type=\"image\">, <object>, <video>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/object#attr-width",
      ),
    ),

  )
  
}
