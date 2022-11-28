package com.raquo.domtypes.old.defs.reflectedAttrs

import com.raquo.domtypes.old.builders.ReflectedHtmlAttrBuilder
import com.raquo.domtypes.old.defs.props.Props
import com.raquo.domtypes.old.defs.tags.FormTags

/**
  * Reflected attributes are attributes that can be set using either a DOM property
  * or an HTML attribute. In practical terms, you don't need to load both props
  * and attrs for these properties, using just one would be enough as they are
  * interchangeable.
  *
  * Note that in JS browser engines, using props is faster than attributes.
  *
  * For more background on reflected attributes, see:
  * - Our own README file.
  * - https://stackoverflow.com/a/6004028/2601788
  * - https://html.spec.whatwg.org/multipage/common-dom-interfaces.html#reflecting-content-attributes-in-idl-attributes
  *   (NOTE: The specification calls DOM properties "IDL attributes" and HTML attributes "Content attributes")
  *
  * For type param docs, see [[ReflectedHtmlAttrBuilder]]
  *
  * @tparam RA ReflectedAttribute[ScalaValue, PropRawDomValue]
  */
trait ReflectedHtmlAttrs[RA[_, _]] { this: ReflectedHtmlAttrBuilder[RA] =>

  /**
    * If the value of the type attribute is file, this attribute indicates the
    * types of files that the server accepts; otherwise it is ignored.
    *
    * https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/accept
    */
  lazy val accept: RA[String, String] = stringReflectedAttr("accept", "accept")

  /**
    * The URI of a program that processes the information submitted via the form.
    * This value can be overridden by a [[formAction]] attribute on a button or
    * input element.
    *
    * MDN
    *
    * Only applies to [[FormTags.form]]
    */
  lazy val action: RA[String, String] = stringReflectedAttr("action", "action")

  /**
    * Specifies a shortcut key to activate/focus an element
    */
  lazy val accessKey: RA[String, String] = stringReflectedAttr("accesskey", "accessKey")

  /**
    * This attribute defines the alternative text describing the image. Users
    * will see this displayed if the image URL is wrong, the image is not in one
    * of the supported formats, or until the image is downloaded.
    *
    * MDN
    */
  lazy val alt: RA[String, String] = stringReflectedAttr("alt", "alt")

  /**
    * This is a nonstandard attribute used by Chrome and iOS Safari Mobile, which
    * controls whether and how the text value should be automatically capitalized
    * as it is entered/edited by the user.
    *
    * Possible values: "none" | "sentences" | "words" | "characters"
    *
    * MDN
    *
    * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Non-standard_%3Cinput%3E_attributes
    */
  lazy val autoCapitalize: RA[String, String] = stringReflectedAttr("autocapitalize", "autocapitalize")

  /**
    * This attribute indicates whether the value of the control can be
    * automatically completed by the browser. This attribute is ignored if the
    * value of the type attribute is hidden, checkbox, radio, file, or a button
    * type (button, submit, reset, image).
    *
    * MDN
    */
  lazy val autoComplete: RA[String, String] = stringReflectedAttr("autocomplete", "autocomplete")

  /**
    * This Boolean attribute lets you specify that a form control should have
    * input focus when the page loads, unless the user overrides it, for example
    * by typing in a different control. Only one form element in a document can
    * have the autofocus attribute, which is a Boolean. It cannot be applied if
    * the type attribute is set to hidden (that is, you cannot automatically set
    * focus to a hidden control).
    *
    * MDN
    */
  lazy val autoFocus: RA[Boolean, Boolean] = booleanAsPresenceReflectedAttr("autofocus", "autofocus")

  /**
    * The visible width of text input or <textArea>, in average character widths.
    * If it is specified, it must be a positive integer.
    * If it is not specified, the default value is 20 (HTML5).
    *
    * MDN
    */
  lazy val cols: RA[Int, Int] = intReflectedAttr("cols", "cols")

  /**
    * This attribute contains a non-negative integer value that indicates for
    * how many columns the cell extends. Its default value is 1; if its value
    * is set to 0, it extends until the end of the <colgroup>, even if implicitly
    * defined, that the cell belongs to. Values higher than 1000 will be considered
    * as incorrect and will be set to the default value (1).
    *
    * MDN
    */
  lazy val colSpan: RA[Int, Int] = intReflectedAttr("colspan", "colSpan")

  /**
    * This attribute gives the value associated with the [[name]] or [[httpEquiv]] attribute,
    * of a <meta> element, depending on which of those attributes is defined on that element.
    *
    * MDN
    */
  lazy val contentAttr: RA[String, String] = stringReflectedAttr("content", "content")

  /**
    * When the value of the type attribute is "radio" or "checkbox", the presence of
    * this Boolean attribute indicates that the control is selected **by default**;
    * otherwise it is ignored.
    *
    * See [[Props.checked]]
    *
    * MDN
    */
  lazy val defaultChecked: RA[Boolean, Boolean] = booleanAsPresenceReflectedAttr("checked", "defaultChecked")

  /**
    * Indicates whether this <option> is initially selected
    * in an option list of a <select> element.
    *
    * See [[Props.selected]]
    */
  lazy val defaultSelected: RA[Boolean, Boolean] = booleanAsPresenceReflectedAttr("selected", "defaultSelected")

  /**
    * The initial value of the control. This attribute is optional except when
    * the value of the type attribute is radio or checkbox.
    *
    * See also [[Props.value]]
    *
    * MDN
    */
  lazy val defaultValue: RA[String, String] = stringReflectedAttr("value", "defaultValue")

  /**
    * Specifies the text direction for the content in an element. The valid values are:
    *
    * - `ltr` Default. Left-to-right text direction
    *
    * - `rtl` Right-to-left text direction
    *
    * - `auto` Let the browser figure out the text direction, based on the content,
    *          (only recommended if the text direction is unknown)
    */
  lazy val dir: RA[String, String] = stringReflectedAttr("dir", "dir")

  /**
    * This Boolean attribute indicates that the form control is not available for
    * interaction. In particular, the click event will not be dispatched on
    * disabled controls. Also, a disabled control's value isn't submitted with
    * the form.
    *
    * This attribute is ignored if the value of the type attribute is hidden.
    *
    * MDN
    */
  lazy val disabled: RA[Boolean, Boolean] = booleanAsPresenceReflectedAttr("disabled", "disabled")
 
  /**
    * Prompts the user to save the linked URL instead of navigating to it. Can be used with or without a value:
    *
    * - Without a value, the browser will suggest a filename/extension, generated from various sources:
    *   - The Content-Disposition HTTP header
    *   - The final segment in the URL path
    *   - The media type (from the Content-Type header, the start of a data: URL, or Blob.type for a blob: URL)
    * - Defining a value suggests it as the filename. / and \ characters are converted to underscores (_). Filesystems may forbid other characters in filenames, so browsers will adjust the suggested name if necessary.
    *
    * MDN
    */
  lazy val download: RA[String, String] = stringReflectedAttr("download", "download")

  /**
    * Specifies whether an element is draggable or not
    */
  lazy val draggable: RA[Boolean, Boolean] = booleanAsTrueFalseReflectedAttr("draggable", "draggable")

  /**
    * The `enctype` attribute provides the encoding type of the form when it is
    * submitted (for forms with a method of "POST").
    *
    * Only applies to [[FormTags.form]]
    */
  lazy val encType: RA[String, String] = stringReflectedAttr("enctype", "enctype")

  /**
    * Describes an element which belongs to this one. Used on labels and output elements.
    *
    * MDN
    */
  lazy val forId: RA[String, String] = stringReflectedAttr("for", "htmlFor")

  /**
    * The `formaction` attribute provides the URL that will process the input control
    * when the form is submitted and overrides the default `action` attribute of the
    * `form` element. This should be used only with `input` elements of `type`
    * submit or image.
    */
  lazy val formAction: RA[String, String] = stringReflectedAttr("formaction", "formAction")

  /**
    * The `formenctype` attribute provides the encoding type of the form when it is
    * submitted (for forms with a method of "POST") and overrides the default
    * `enctype` attribute of the `form` element. This should be used only with the
    * `input` elements of `type` "submit" or "image"
    *
    * Enumerated: "multipart/form-data" | "text/plain" | "application/x-www-form-urlencoded" (default)
    */
  lazy val formEncType: RA[String, String] = stringReflectedAttr("formenctype", "formEnctype")

  /**
    * The `formmethod` attribute specifies the HTTP Method the form should use when
    * it is submitted and overrides the default `method` attribute of the `form`
    * element. This should be used only with the `input` elements of `type` "submit"
    * or "image".
    *
    * Enumerated: "post" | "get"
    */
  lazy val formMethod: RA[String, String] = stringReflectedAttr("formmethod", "formMethod")

  /**
    * The `formnovalidate` Boolean attribute specifies that the input of the form
    * should not be validated upon submit and overrides the default `novalidate`
    * attribute of the `form`. This should only be used with `input` elements of
    * of `type` "submit".
    */
  lazy val formNoValidate: RA[Boolean, Boolean] = booleanAsPresenceReflectedAttr("formnovalidate", "formNoValidate")

  /**
    * The `formtarget` provides a name or keyword that indicates where to display
    * the response that is received after submitting the form and overrides the
    * `target` attribute of them `form` element. This should only be used with
    * the `input` elements of `type` "submit" or "image"
    *
    * Enumerated: "_blank" | "_parent" | "_top" | "_self" (default)
    *
    * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input
    */
  lazy val formTarget: RA[String, String] = stringReflectedAttr("formtarget", "formTarget")

  /**
    * Specifies that an element is not yet, or is no longer, relevant and
    * consequently hidden from view of the user.
    *
    * https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/hidden
    */
  lazy val hidden: RA[Boolean, Boolean] = booleanAsPresenceReflectedAttr("hidden", "hidden")

  /**
    * For use in &lt;meter&gt; tags.
    *
    * @see https://css-tricks.com/html5-meter-element/
    */
  lazy val high: RA[Double, Double] = doubleReflectedAttr("high", "high")

  /**
    * This is the single required attribute for anchors defining a hypertext
    * source link. It indicates the link target, either a URL or a URL fragment.
    * A URL fragment is a name preceded by a hash mark (#), which specifies an
    * internal target location (an ID) within the current document. URLs are not
    * restricted to Web (HTTP)-based documents. URLs might use any protocol
    * supported by the browser. For example, file, ftp, and mailto work in most
    * user agents.
    *
    * MDN
    */
  lazy val href: RA[String, String] = stringReflectedAttr("href", "href")

  /**
    * This enumerated attribute defines the pragma that can alter servers and
    * user-agents behavior. The value of the pragma is defined using the content
    * attribute and can be one of the following:
    *
    *   - content-language
    *   - content-type
    *   - default-style
    *   - refresh
    *   - set-cookie
    *
    * MDN
    */
  lazy val httpEquiv: RA[String, String] = stringReflectedAttr("http-equiv", "httpEquiv")

  /**
    * This attribute defines a unique identifier (ID) which must be unique in
    * the whole document. Its purpose is to identify the element when linking
    * (using a fragment identifier), scripting, or styling (with CSS).
    *
    * MDN
    */
  lazy val idAttr: RA[String, String] = stringReflectedAttr("id", "id")

  /**
    * The inputmode attribute hints at the type of data that might be entered by
    * the user while editing the element or its contents. This allows a browser
    * to display an appropriate virtual keyboard.
    * 
    * Acceptable values:
    * `none` | `text` (default value) | `decimal` | `numeric` | `tel` | `search` | `email` | `url`
    * 
    * MDN
    * 
    * https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/inputmode
    */
  lazy val inputMode: RA[String, String] = stringReflectedAttr("inputmode", "inputMode")

  /**
    * For `optgroup` elements, specifies the name of the group of options, which the browser can
    * use when labeling the options in the user interface.
    *
    * MDN
    *
    * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/optgroup
    */
  lazy val labelAttr: RA[String, String] = stringReflectedAttr("label", "label")

  /**
    * This attribute participates in defining the language of the element, the
    * language that non-editable elements are written in or the language that
    * editable elements should be written in. The tag contains one single entry
    * value in the format defines in the Tags for Identifying Languages (BCP47)
    * IETF document. If the tag content is the empty string the language is set
    * to unknown; if the tag content is not valid, regarding to BCP47, it is set
    * to invalid.
    *
    * MDN
    */
  lazy val lang: RA[String, String] = stringReflectedAttr("lang", "lang")

  /**
    * Indicates how the browser should load the image:
    *
    * "eager": Loads the image immediately, regardless of whether or not the image is currently
    * within the visible viewport (this is the default value).
    *
    * "lazy": Defers loading the image until it reaches a calculated distance from the viewport,
    * as defined by the browser. The intent is to avoid the network and storage bandwidth needed
    * to handle the image until it's reasonably certain that it will be needed. This generally
    * improves the performance of the content in most typical use cases.
    */
  lazy val loadingAttr: RA[String, String] = stringReflectedAttr("loading", "loading")

  /**
    * For use in &lt;meter&gt; tags.
    *
    * @see https://css-tricks.com/html5-meter-element/
    */
  lazy val low: RA[Double, Double] = doubleReflectedAttr("low", "low")

  /**
    * If the type of the input element is text, email, search, password, tel, or
    * url, this attribute specifies the minimum number of characters (in Unicode
    * code points) that the user can enter. For other control types, it is ignored.
    *
    * MDN
    */
  lazy val minLength: RA[Int, Int] = intReflectedAttr("minlength", "minLength")

  /**
    * The maximum allowed length for the input field. This attribute forces the input control
    * to accept no more than the allowed number of characters. It does not produce any
    * feedback to the user; you must write Javascript to make that happen.
    */
  lazy val maxLength: RA[Int, Int] = intReflectedAttr("maxlength", "maxLength")

  /**
    * This attribute specifies the media which the linked resource applies to.
    * Its value must be a media query. This attribute is mainly useful when
    * linking to external stylesheets by allowing the user agent to pick
    * the best adapted one for the device it runs on.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/HTML/Element/link#attr-media
    */
  lazy val media: RA[String, String] = stringReflectedAttr("media", "media")

  /**
    * The HTTP method that the browser uses to submit the form. Possible values are:
    *
    * - post: Corresponds to the HTTP POST method ; form data are included in the
    *   body of the form and sent to the server.
    *
    * - get: Corresponds to the HTTP GET method; form data are appended to the
    *   action attribute URI with a '?' as a separator, and the resulting URI is
    *   sent to the server. Use this method when the form has no side-effects and
    *   contains only ASCII characters.
    *
    * This value can be overridden by a formmethod attribute on a button or
    * input element.
    *
    * MDN
    */
  lazy val method: RA[String, String] = stringReflectedAttr("method", "method")

  /**
    * This Boolean attribute specifies, when present/true, that the user is allowed
    * to enter more than one value for the <input> element for types "email" or "file".
    * It can also be provided to the <select> element to allow selecting more than one
    * option.
    */
  lazy val multiple: RA[Boolean, Boolean] = booleanAsPresenceReflectedAttr("multiple", "multiple")

  /**
    * On form elements (input etc.):
    *   Name of the element. For example used by the server to identify the fields
    *   in form submits.
    *
    * On the meta tag:
    *   This attribute defines the name of a document-level metadata.
    *   This document-level metadata name is associated with a value, contained by
    *   the content attribute.
    *
    * MDN
    */
  lazy val name: RA[String, String] = stringReflectedAttr("name", "name")

  /**
    * This Boolean attribute indicates that the form is not to be validated when
    * submitted. If this attribute is not specified (and therefore the form is
    * validated), this default setting can be overridden by a formnovalidate
    * attribute on a <button> or <input> element belonging to the form.
    */
  lazy val noValidate: RA[Boolean, Boolean] = booleanAsPresenceReflectedAttr("novalidate", "noValidate")

  /**
    * For use in &lt;meter&gt; tags.
    *
    * @see https://css-tricks.com/html5-meter-element/
    */
  lazy val optimum: RA[Double, Double] = doubleReflectedAttr("optimum", "optimum")

  /**
    * Specifies a regular expression to validate the input. The pattern attribute
    * works with the following input types: text, search, url, tel, email, and
    * password. Use the `title` attribute to describe the pattern to the user.
    */
  lazy val pattern: RA[String, String] = stringReflectedAttr("pattern", "pattern")

  /**
    * A hint to the user of what can be entered in the control. The placeholder
    * text must not contain carriage returns or line-feeds. This attribute
    * applies when the value of the type attribute is text, search, tel, url or
    * email; otherwise it is ignored.
    *
    * MDN
    */
  lazy val placeholder: RA[String, String] = stringReflectedAttr("placeholder", "placeholder")

  /**
    * This Boolean attribute indicates that the user cannot modify the value of
    * the control. This attribute is ignored if the value of the type attribute
    * is hidden, range, color, checkbox, radio, file, or a button type.
    *
    * MDN
    */
  lazy val readOnly: RA[Boolean, Boolean] = booleanAsPresenceReflectedAttr("readonly", "readOnly")

  /**
    * This attribute specifies that the user must fill in a value before
    * submitting a form. It cannot be used when the type attribute is hidden,
    * image, or a button type (submit, reset, or button). The :optional and
    * :required CSS pseudo-classes will be applied to the field as appropriate.
    *
    * MDN
    */
  lazy val required: RA[Boolean, Boolean] = booleanAsPresenceReflectedAttr("required", "required")

  /**
    * The number of visible text lines for a text control.
    *
    * MDN
    */
  lazy val rows: RA[Int, Int] = intReflectedAttr("rows", "rows")

  /**
    * This attribute contains a non-negative integer value that indicates for how many
    * rows the cell extends. Its default value is 1; if its value is set to 0, it extends
    * until the end of the table section (<thead>, <tbody>, <tfoot>, even if implicitly
    * defined, that the cell belongs to. Values higher than 65534 are clipped down to 65534.
    *
    * MDN
    */
  lazy val rowSpan: RA[Int, Int] = intReflectedAttr("rowspan", "rowSpan")

  /**
    * For use in &lt;style&gt; tags.
    *
    * If this attribute is present, then the style applies only to its parent element.
    * If absent, the style applies to the whole document.
    */
  lazy val scoped: RA[Boolean, Boolean] = booleanAsPresenceReflectedAttr("scoped", "scoped")

  /**
    * The initial size of the control. This value is in pixels unless the value
    * of the type attribute is text or password, in which case, it is an integer
    * number of characters. Starting in HTML5, this attribute applies only when
    * the type attribute is set to text, search, tel, url, email, or password;
    * otherwise it is ignored. In addition, the size must be greater than zero.
    * If you don't specify a size, a default value of 20 is used.
    *
    * MDN
    */
  lazy val size: RA[Int, Int] = intReflectedAttr("size", "size")

  /**
    * The slot global attribute assigns a slot in a shadow DOM shadow tree to an element.
    *
    * MDN – https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot
    */
  lazy val slot: RA[String, String] = stringReflectedAttr("slot", "slot")

  /**
    * Defines whether the element may be checked for spelling errors.
    *
    * MDN – https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/spellcheck
    */
  lazy val spellCheck: RA[Boolean, Boolean] = booleanAsTrueFalseReflectedAttr("spellcheck", "spellcheck")

  /**
    * If the value of the type attribute is image, this attribute specifies a URI
    * for the location of an image to display on the graphical submit button;
    * otherwise it is ignored.
    *
    * MDN
    */
  lazy val src: RA[String, String] = stringReflectedAttr("src", "src")

  /**
    * This integer attribute indicates if the element can take input focus (is
    * focusable), if it should participate to sequential keyboard navigation, and
    * if so, at what position. It can takes several values:
    *
    * - a negative value means that the element should be focusable, but should
    *   not be reachable via sequential keyboard navigation;
    * - 0 means that the element should be focusable and reachable via sequential
    *   keyboard navigation, but its relative order is defined by the platform
    *   convention;
    * - a positive value which means should be focusable and reachable via
    *   sequential keyboard navigation; its relative order is defined by the value
    *   of the attribute: the sequential follow the increasing number of the
    *   tabindex. If several elements share the same tabindex, their relative order
    *   follows their relative position in the document).
    *
    * An element with a 0 value, an invalid value, or no tabindex value should be placed after elements with a positive tabindex in the sequential keyboard navigation order.
    */
  lazy val tabIndex: RA[Int, Int] = intReflectedAttr("tabindex", "tabIndex")

  /**
    * A name or keyword indicating where to display the response that is received
    * after submitting the form. In HTML 4, this is the name of, or a keyword
    * for, a frame. In HTML5, it is a name of, or keyword for, a browsing context
    * (for example, tab, window, or inline frame). The following keywords have
    * special meanings:
    *
    * - _self: Load the response into the same HTML 4 frame (or HTML5 browsing
    *   context) as the current one. This value is the default if the attribute
    *   is not specified.
    * - _blank: Load the response into a new unnamed HTML 4 window or HTML5
    *   browsing context.
    * - _parent: Load the response into the HTML 4 frameset parent of the current
    *   frame or HTML5 parent browsing context of the current one. If there is no
    *   parent, this option behaves the same way as _self.
    * - _top: HTML 4: Load the response into the full, original window, canceling
    *   all other frames. HTML5: Load the response into the top-level browsing
    *   context (that is, the browsing context that is an ancestor of the current
    *   one, and has no parent). If there is no parent, this option behaves the
    *   same way as _self.
    * - iframename: The response is displayed in a named iframe.
    */
  lazy val target: RA[String, String] = stringReflectedAttr("target", "target")

  /**
    * This attribute contains a text representing advisory information related to
    * the element it belongs too. Such information can typically, but not
    * necessarily, be presented to the user as a tooltip.
    *
    * MDN
    */
  lazy val title: RA[String, String] = stringReflectedAttr("title", "title")

  /**
    * Specifies whether the content of an element should be translated or not
    */
  lazy val translate: RA[Boolean, Boolean] = booleanAsYesNoReflectedAttr("translate", "translate")

  /**
    * Specifies XML namespace for the document
    */
  lazy val xmlns: RA[String, String] = stringReflectedAttr("xmlns", "xmlns")
}
