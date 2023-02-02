package com.raquo.domtypes.defs.reflectedAttrs

import com.raquo.domtypes.common.ReflectedHtmlAttrDef

/**
  * Reflected attributes are attributes that can be set using either a DOM property
  * or an HTML attribute. In practical terms, you don't need to load both props
  * and attrs for these properties, using just one would be enough as they are
  * interchangeable.
  * 
  * Note that in JS browser engines, using props has better performance than using attributes.
  * 
  * For more background on reflected attributes, see:
  * - Our own README file.
  * - https://stackoverflow.com/a/6004028/2601788
  * - https://html.spec.whatwg.org/multipage/common-dom-interfaces.html#reflecting-content-attributes-in-idl-attributes
  *   (NOTE: The specification calls DOM properties "IDL attributes" and HTML attributes "Content attributes")
  *
  * @see https://developer.mozilla.org/en-US/docs/Glossary/Attribute#reflection_of_an_attribute
  * @see https://html.spec.whatwg.org/multipage/common-dom-interfaces.html#reflecting-content-attributes-in-idl-attributes
  */
object ReflectedHtmlAttrDefs {
  
  val defs: List[ReflectedHtmlAttrDef] = List(
    
    ReflectedHtmlAttrDef(
      scalaName = "accept",
      domAttrName = "accept",
      domPropName = "accept",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "If the value of the type attribute is file, this attribute indicates the",
        "types of files that the server accepts; otherwise it is ignored.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/accept",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "action",
      domAttrName = "action",
      domPropName = "action",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "The URI of a program that processes the information submitted via the form.",
        "This value can be overridden by a [[formAction]] attribute on a button or",
        "input element.",
        "",
        "",
        "Only applies to [[FormTags.form]]",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/action",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "accessKey",
      domAttrName = "accesskey",
      domPropName = "accessKey",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "Specifies a shortcut key to activate/focus an element",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/accesskey",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "alt",
      domAttrName = "alt",
      domPropName = "alt",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "This attribute defines the alternative text describing the image. Users",
        "will see this displayed if the image URL is wrong, the image is not in one",
        "of the supported formats, or until the image is downloaded.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/alt",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "autoCapitalize",
      domAttrName = "autocapitalize",
      domPropName = "autocapitalize",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "This is a nonstandard attribute used by Chrome and iOS Safari Mobile, which",
        "controls whether and how the text value should be automatically capitalized",
        "as it is entered/edited by the user.",
        "",
        "Possible values: \"none\" | \"sentences\" | \"words\" | \"characters\"",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/autocapitalize",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "autoComplete",
      domAttrName = "autocomplete",
      domPropName = "autocomplete",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "This attribute indicates whether the value of the control can be",
        "automatically completed by the browser. This attribute is ignored if the",
        "value of the type attribute is hidden, checkbox, radio, file, or a button",
        "type (button, submit, reset, image).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/autocomplete",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "autoFocus",
      domAttrName = "autofocus",
      domPropName = "autofocus",
      scalaValueType = "Boolean",
      domPropValueType = "Boolean",
      attrCodec = "BooleanAsAttrPresence",
      propCodec = "BooleanAsIs",
      commentLines = List(
        "This Boolean attribute lets you specify that a form control should have",
        "input focus when the page loads, unless the user overrides it, for example",
        "by typing in a different control. Only one form element in a document can",
        "have the autofocus attribute, which is a Boolean. It cannot be applied if",
        "the type attribute is set to hidden (that is, you cannot automatically set",
        "focus to a hidden control).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/autofocus",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "cols",
      domAttrName = "cols",
      domPropName = "cols",
      scalaValueType = "Int",
      domPropValueType = "Int",
      attrCodec = "IntAsString",
      propCodec = "IntAsIs",
      commentLines = List(
        "The visible width of text input or `<textArea>`, in average character widths.",
        "If it is specified, it must be a positive integer.",
        "If it is not specified, the default value is 20 (HTML5).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/textarea#attr-cols",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "colSpan",
      domAttrName = "colspan",
      domPropName = "colSpan",
      scalaValueType = "Int",
      domPropValueType = "Int",
      attrCodec = "IntAsString",
      propCodec = "IntAsIs",
      commentLines = List(
        "This attribute contains a non-negative integer value that indicates for",
        "how many columns the cell extends. Its default value is 1; if its value",
        "is set to 0, it extends until the end of the `<colgroup>`, even if implicitly",
        "defined, that the cell belongs to. Values higher than 1000 will be considered",
        "as incorrect and will be set to the default value (1).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/td#attr-colspan",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "contentAttr",
      domAttrName = "content",
      domPropName = "content",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "This attribute gives the value associated with the [[name]] or [[httpEquiv]] attribute,",
        "of a `<meta>` element, depending on which of those attributes is defined on that element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/meta#attr-content",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "defaultChecked",
      domAttrName = "checked",
      domPropName = "defaultChecked",
      scalaValueType = "Boolean",
      domPropValueType = "Boolean",
      attrCodec = "BooleanAsAttrPresence",
      propCodec = "BooleanAsIs",
      commentLines = List(
        "When the value of the type attribute is \"radio\" or \"checkbox\", the presence of",
        "this Boolean attribute indicates that the control is selected **by default**;",
        "otherwise it is ignored.",
        "",
        "See [[Props.checked]]",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#attr-checked",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "defaultSelected",
      domAttrName = "selected",
      domPropName = "defaultSelected",
      scalaValueType = "Boolean",
      domPropValueType = "Boolean",
      attrCodec = "BooleanAsAttrPresence",
      propCodec = "BooleanAsIs",
      commentLines = List(
        "Indicates whether this `<option>` is initially selected",
        "in an option list of a `<select>` element.",
        "",
        "See [[Props.selected]]",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/option#attr-selected",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "defaultValue",
      domAttrName = "value",
      domPropName = "defaultValue",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "The initial value of the control. This attribute is optional except when",
        "the value of the type attribute is radio or checkbox.",
        "",
        "See also [[Props.value]]",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#value",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "dir",
      domAttrName = "dir",
      domPropName = "dir",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "Specifies the text direction for the content in an element. The valid values are:",
        "",
        "- `ltr` Default. Left-to-right text direction",
        "",
        "- `rtl` Right-to-left text direction",
        "",
        "- `auto` Let the browser figure out the text direction, based on the content,",
        "         (only recommended if the text direction is unknown)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/dir",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "disabled",
      domAttrName = "disabled",
      domPropName = "disabled",
      scalaValueType = "Boolean",
      domPropValueType = "Boolean",
      attrCodec = "BooleanAsAttrPresence",
      propCodec = "BooleanAsIs",
      commentLines = List(
        "This Boolean attribute indicates that the form control is not available for",
        "interaction. In particular, the click event will not be dispatched on",
        "disabled controls. Also, a disabled control's value isn't submitted with",
        "the form.",
        "",
        "This attribute is ignored if the value of the type attribute is hidden.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/disabled",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "download",
      domAttrName = "download",
      domPropName = "download",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "Prompts the user to save the linked URL instead of navigating to it. Can be used with or without a value:",
        "",
        "- Without a value, the browser will suggest a filename/extension, generated from various sources:",
        "  - The Content-Disposition HTTP header",
        "  - The final segment in the URL path",
        "  - The media type (from the Content-Type header, the start of a data: URL, or Blob.type for a blob: URL)",
        "- Defining a value suggests it as the filename. / and \\ characters are converted to underscores (_). Filesystems may forbid other characters in filenames, so browsers will adjust the suggested name if necessary.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/a#attr-download",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "draggable",
      domAttrName = "draggable",
      domPropName = "draggable",
      scalaValueType = "Boolean",
      domPropValueType = "Boolean",
      attrCodec = "BooleanAsTrueFalseString",
      propCodec = "BooleanAsIs",
      commentLines = List(
        "Specifies whether an element is draggable or not",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/draggable",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "encType",
      domAttrName = "enctype",
      domPropName = "enctype",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "The `enctype` attribute provides the encoding type of the form when it is",
        "submitted (for forms with a method of \"POST\").",
        "",
        "Only applies to [[FormTags.form]]",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/form#attr-enctype",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "forId",
      domAttrName = "for",
      domPropName = "htmlFor",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "Describes an element which belongs to this one. Used on labels and output elements.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/for",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "formEncType",
      domAttrName = "formenctype",
      domPropName = "formEnctype",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "The `formenctype` attribute provides the encoding type of the form when it is",
        "submitted (for forms with a method of \"POST\") and overrides the default",
        "`enctype` attribute of the `form` element. This should be used only with the",
        "`input` elements of `type` \"submit\" or \"image\"",
        "",
        "Enumerated: \"multipart/form-data\" | \"text/plain\" | \"application/x-www-form-urlencoded\" (default)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#formenctype",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "formMethod",
      domAttrName = "formmethod",
      domPropName = "formMethod",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "The `formmethod` attribute specifies the HTTP Method the form should use when",
        "it is submitted and overrides the default `method` attribute of the `form`",
        "element. This should be used only with the `input` elements of `type` \"submit\"",
        "or \"image\".",
        "",
        "Enumerated: \"post\" | \"get\"",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#formmethod",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "formNoValidate",
      domAttrName = "formnovalidate",
      domPropName = "formNoValidate",
      scalaValueType = "Boolean",
      domPropValueType = "Boolean",
      attrCodec = "BooleanAsAttrPresence",
      propCodec = "BooleanAsIs",
      commentLines = List(
        "The `formnovalidate` Boolean attribute specifies that the input of the form",
        "should not be validated upon submit and overrides the default `novalidate`",
        "attribute of the `form`. This should only be used with `input` elements of",
        "of `type` \"submit\".",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#formnovalidate",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "formTarget",
      domAttrName = "formtarget",
      domPropName = "formTarget",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "The `formtarget` provides a name or keyword that indicates where to display",
        "the response that is received after submitting the form and overrides the",
        "`target` attribute of them `form` element. This should only be used with",
        "the `input` elements of `type` \"submit\" or \"image\"",
        "",
        "Enumerated: \"_blank\" | \"_parent\" | \"_top\" | \"_self\" (default)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#formtarget",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "hidden",
      domAttrName = "hidden",
      domPropName = "hidden",
      scalaValueType = "Boolean",
      domPropValueType = "Boolean",
      attrCodec = "BooleanAsAttrPresence",
      propCodec = "BooleanAsIs",
      commentLines = List(
        "Specifies that an element is not yet, or is no longer, relevant and",
        "consequently hidden from view of the user.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/hidden",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "high",
      domAttrName = "high",
      domPropName = "high",
      scalaValueType = "Double",
      domPropValueType = "Double",
      attrCodec = "DoubleAsString",
      propCodec = "DoubleAsIs",
      commentLines = List(
        "For use in &lt;meter&gt; tags.",
        "",
        "@see https://css-tricks.com/html5-meter-element/",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/meter#attr-high",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "httpEquiv",
      domAttrName = "http-equiv",
      domPropName = "httpEquiv",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "This enumerated attribute defines the pragma that can alter servers and",
        "user-agents behavior. The value of the pragma is defined using the content",
        "attribute and can be one of the following:",
        "",
        "  - content-language",
        "  - content-type",
        "  - default-style",
        "  - refresh",
        "  - set-cookie",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/meta#attr-http-equiv",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "idAttr",
      domAttrName = "id",
      domPropName = "id",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "This attribute defines a unique identifier (ID) which must be unique in",
        "the whole document. Its purpose is to identify the element when linking",
        "(using a fragment identifier), scripting, or styling (with CSS).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/id",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "inputMode",
      domAttrName = "inputmode",
      domPropName = "inputMode",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "The inputmode attribute hints at the type of data that might be entered by",
        "the user while editing the element or its contents. This allows a browser",
        "to display an appropriate virtual keyboard.",
        "",
        "Acceptable values:",
        "`none` | `text` (default value) | `decimal` | `numeric` | `tel` | `search` | `email` | `url`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/inputmode",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "labelAttr",
      domAttrName = "label",
      domPropName = "label",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "For `optgroup` elements, specifies the name of the group of options, which the browser can",
        "use when labeling the options in the user interface.",
      ),
      docUrls = Nil,
    ),

    ReflectedHtmlAttrDef(
      scalaName = "lang",
      domAttrName = "lang",
      domPropName = "lang",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "This attribute participates in defining the language of the element, the",
        "language that non-editable elements are written in or the language that",
        "editable elements should be written in. The tag contains one single entry",
        "value in the format defines in the Tags for Identifying Languages (BCP47)",
        "IETF document. If the tag content is the empty string the language is set",
        "to unknown; if the tag content is not valid, regarding to BCP47, it is set",
        "to invalid.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/lang",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "loadingAttr",
      domAttrName = "loading",
      domPropName = "loading",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "Indicates how the browser should load the image:",
        "",
        "\"eager\": Loads the image immediately, regardless of whether or not the image is currently",
        "within the visible viewport (this is the default value).",
        "",
        "\"lazy\": Defers loading the image until it reaches a calculated distance from the viewport,",
        "as defined by the browser. The intent is to avoid the network and storage bandwidth needed",
        "to handle the image until it's reasonably certain that it will be needed. This generally",
        "improves the performance of the content in most typical use cases.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img#attr-loading",
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/iframe#attr-loading",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "low",
      domAttrName = "low",
      domPropName = "low",
      scalaValueType = "Double",
      domPropValueType = "Double",
      attrCodec = "DoubleAsString",
      propCodec = "DoubleAsIs",
      commentLines = List(
        "For use in &lt;meter&gt; tags.",
        "",
        "@see https://css-tricks.com/html5-meter-element/",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/meter#attr-low",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "minLength",
      domAttrName = "minlength",
      domPropName = "minLength",
      scalaValueType = "Int",
      domPropValueType = "Int",
      attrCodec = "IntAsString",
      propCodec = "IntAsIs",
      commentLines = List(
        "If the type of the input element is text, email, search, password, tel, or",
        "url, this attribute specifies the minimum number of characters (in Unicode",
        "code points) that the user can enter. For other control types, it is ignored.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/minlength",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "maxLength",
      domAttrName = "maxlength",
      domPropName = "maxLength",
      scalaValueType = "Int",
      domPropValueType = "Int",
      attrCodec = "IntAsString",
      propCodec = "IntAsIs",
      commentLines = List(
        "The maximum allowed length for the input field. This attribute forces the input control",
        "to accept no more than the allowed number of characters. It does not produce any",
        "feedback to the user; you must write Javascript to make that happen.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/maxlength",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "media",
      domAttrName = "media",
      domPropName = "media",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "This attribute specifies the media which the linked resource applies to.",
        "Its value must be a media query. This attribute is mainly useful when",
        "linking to external stylesheets by allowing the user agent to pick",
        "the best adapted one for the device it runs on.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/link#attr-media",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "method",
      domAttrName = "method",
      domPropName = "method",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "The HTTP method that the browser uses to submit the form. Possible values are:",
        "",
        "- post: Corresponds to the HTTP POST method ; form data are included in the",
        "  body of the form and sent to the server.",
        "",
        "- get: Corresponds to the HTTP GET method; form data are appended to the",
        "  action attribute URI with a '?' as a separator, and the resulting URI is",
        "  sent to the server. Use this method when the form has no side-effects and",
        "  contains only ASCII characters.",
        "",
        "This value can be overridden by a formmethod attribute on a button or",
        "input element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/form#attr-method",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "multiple",
      domAttrName = "multiple",
      domPropName = "multiple",
      scalaValueType = "Boolean",
      domPropValueType = "Boolean",
      attrCodec = "BooleanAsAttrPresence",
      propCodec = "BooleanAsIs",
      commentLines = List(
        "This Boolean attribute specifies, when present/true, that the user is allowed",
        "to enter more than one value for the `<input>` element for types \"email\" or \"file\".",
        "It can also be provided to the `<select>` element to allow selecting more than one",
        "option.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#multiple",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "name",
      domAttrName = "name",
      domPropName = "name",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "On form elements (input etc.):",
        "  Name of the element. For example used by the server to identify the fields",
        "  in form submits.",
        "",
        "On the meta tag:",
        "  This attribute defines the name of a document-level metadata.",
        "  This document-level metadata name is associated with a value, contained by",
        "  the content attribute.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#name",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "noValidate",
      domAttrName = "novalidate",
      domPropName = "noValidate",
      scalaValueType = "Boolean",
      domPropValueType = "Boolean",
      attrCodec = "BooleanAsAttrPresence",
      propCodec = "BooleanAsIs",
      commentLines = List(
        "This Boolean attribute indicates that the form is not to be validated when",
        "submitted. If this attribute is not specified (and therefore the form is",
        "validated), this default setting can be overridden by a formnovalidate",
        "attribute on a `<button>` or `<input>` element belonging to the form.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/form#attr-novalidate",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "optimum",
      domAttrName = "optimum",
      domPropName = "optimum",
      scalaValueType = "Double",
      domPropValueType = "Double",
      attrCodec = "DoubleAsString",
      propCodec = "DoubleAsIs",
      commentLines = List(
        "For use in &lt;meter&gt; tags.",
        "",
        "@see https://css-tricks.com/html5-meter-element/",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/meter#attr-optimum",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "pattern",
      domAttrName = "pattern",
      domPropName = "pattern",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "Specifies a regular expression to validate the input. The pattern attribute",
        "works with the following input types: text, search, url, tel, email, and",
        "password. Use the `title` attribute to describe the pattern to the user.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/pattern",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "placeholder",
      domAttrName = "placeholder",
      domPropName = "placeholder",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "A hint to the user of what can be entered in the control. The placeholder",
        "text must not contain carriage returns or line-feeds. This attribute",
        "applies when the value of the type attribute is text, search, tel, url or",
        "email; otherwise it is ignored.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#placeholder",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "readOnly",
      domAttrName = "readonly",
      domPropName = "readOnly",
      scalaValueType = "Boolean",
      domPropValueType = "Boolean",
      attrCodec = "BooleanAsAttrPresence",
      propCodec = "BooleanAsIs",
      commentLines = List(
        "This Boolean attribute indicates that the user cannot modify the value of",
        "the control. This attribute is ignored if the value of the type attribute",
        "is hidden, range, color, checkbox, radio, file, or a button type.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/readonly",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "required",
      domAttrName = "required",
      domPropName = "required",
      scalaValueType = "Boolean",
      domPropValueType = "Boolean",
      attrCodec = "BooleanAsAttrPresence",
      propCodec = "BooleanAsIs",
      commentLines = List(
        "This attribute specifies that the user must fill in a value before",
        "submitting a form. It cannot be used when the type attribute is hidden,",
        "image, or a button type (submit, reset, or button). The :optional and",
        ":required CSS pseudo-classes will be applied to the field as appropriate.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/required",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "rows",
      domAttrName = "rows",
      domPropName = "rows",
      scalaValueType = "Int",
      domPropValueType = "Int",
      attrCodec = "IntAsString",
      propCodec = "IntAsIs",
      commentLines = List(
        "The number of visible text lines for a text control.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/textarea#attr-rows",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "rowSpan",
      domAttrName = "rowspan",
      domPropName = "rowSpan",
      scalaValueType = "Int",
      domPropValueType = "Int",
      attrCodec = "IntAsString",
      propCodec = "IntAsIs",
      commentLines = List(
        "This attribute contains a non-negative integer value that indicates for how many",
        "rows the cell extends. Its default value is 1; if its value is set to 0, it extends",
        "until the end of the table section (`<thead>`, `<tbody>`, `<tfoot>`, even if implicitly",
        "defined, that the cell belongs to. Values higher than 65534 are clipped down to 65534.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/td#attr-rowspan",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "scoped",
      domAttrName = "scoped",
      domPropName = "scoped",
      scalaValueType = "Boolean",
      domPropValueType = "Boolean",
      attrCodec = "BooleanAsAttrPresence",
      propCodec = "BooleanAsIs",
      commentLines = List(
        "For use in &lt;style&gt; tags.",
        "",
        "If this attribute is present, then the style applies only to its parent element.",
        "If absent, the style applies to the whole document.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLStyleElement/scoped",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "size",
      domAttrName = "size",
      domPropName = "size",
      scalaValueType = "Int",
      domPropValueType = "Int",
      attrCodec = "IntAsString",
      propCodec = "IntAsIs",
      commentLines = List(
        "The initial size of the control. This value is in pixels unless the value",
        "of the type attribute is text or password, in which case, it is an integer",
        "number of characters. Starting in HTML5, this attribute applies only when",
        "the type attribute is set to text, search, tel, url, email, or password;",
        "otherwise it is ignored. In addition, the size must be greater than zero.",
        "If you don't specify a size, a default value of 20 is used.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/size",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "slot",
      domAttrName = "slot",
      domPropName = "slot",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "The slot global attribute assigns a slot in a shadow DOM shadow tree to an element.",
        "",
        "MDN – https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "spellCheck",
      domAttrName = "spellcheck",
      domPropName = "spellcheck",
      scalaValueType = "Boolean",
      domPropValueType = "Boolean",
      attrCodec = "BooleanAsTrueFalseString",
      propCodec = "BooleanAsIs",
      commentLines = List(
        "Defines whether the element may be checked for spelling errors.",
        "",
        "MDN – https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/spellcheck",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/spellcheck",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "tabIndex",
      domAttrName = "tabindex",
      domPropName = "tabIndex",
      scalaValueType = "Int",
      domPropValueType = "Int",
      attrCodec = "IntAsString",
      propCodec = "IntAsIs",
      commentLines = List(
        "This integer attribute indicates if the element can take input focus (is",
        "focusable), if it should participate to sequential keyboard navigation, and",
        "if so, at what position. It can takes several values:",
        "",
        "- a negative value means that the element should be focusable, but should",
        "  not be reachable via sequential keyboard navigation;",
        "- 0 means that the element should be focusable and reachable via sequential",
        "  keyboard navigation, but its relative order is defined by the platform",
        "  convention;",
        "- a positive value which means should be focusable and reachable via",
        "  sequential keyboard navigation; its relative order is defined by the value",
        "  of the attribute: the sequential follow the increasing number of the",
        "  tabindex. If several elements share the same tabindex, their relative order",
        "  follows their relative position in the document).",
        "",
        "An element with a 0 value, an invalid value, or no tabindex value should be placed after elements with a positive tabindex in the sequential keyboard navigation order.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/tabindex",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "target",
      domAttrName = "target",
      domPropName = "target",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "A name or keyword indicating where to display the response that is received",
        "after submitting the form. In HTML 4, this is the name of, or a keyword",
        "for, a frame. In HTML5, it is a name of, or keyword for, a browsing context",
        "(for example, tab, window, or inline frame). The following keywords have",
        "special meanings:",
        "",
        "- _self: Load the response into the same HTML 4 frame (or HTML5 browsing",
        "  context) as the current one. This value is the default if the attribute",
        "  is not specified.",
        "- _blank: Load the response into a new unnamed HTML 4 window or HTML5",
        "  browsing context.",
        "- _parent: Load the response into the HTML 4 frameset parent of the current",
        "  frame or HTML5 parent browsing context of the current one. If there is no",
        "  parent, this option behaves the same way as _self.",
        "- _top: HTML 4: Load the response into the full, original window, canceling",
        "  all other frames. HTML5: Load the response into the top-level browsing",
        "  context (that is, the browsing context that is an ancestor of the current",
        "  one, and has no parent). If there is no parent, this option behaves the",
        "  same way as _self.",
        "- iframename: The response is displayed in a named iframe.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Element/a#attr-target",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "title",
      domAttrName = "title",
      domPropName = "title",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "This attribute contains a text representing advisory information related to",
        "the element it belongs too. Such information can typically, but not",
        "necessarily, be presented to the user as a tooltip.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/title",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "translate",
      domAttrName = "translate",
      domPropName = "translate",
      scalaValueType = "Boolean",
      domPropValueType = "Boolean",
      attrCodec = "BooleanAsYesNoString",
      propCodec = "BooleanAsIs",
      commentLines = List(
        "Specifies whether the content of an element should be translated or not",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/translate",
      ),
    ),

    ReflectedHtmlAttrDef(
      scalaName = "xmlns",
      domAttrName = "xmlns",
      domPropName = "xmlns",
      scalaValueType = "String",
      domPropValueType = "String",
      attrCodec = "StringAsIs",
      propCodec = "StringAsIs",
      commentLines = List(
        "Specifies XML namespace for the document",
      ),
      docUrls = Nil,
    ),

  )
  
}
