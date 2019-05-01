package com.raquo.domtypes.generic.defs.reflectedAttrs

import com.raquo.domtypes.generic.builders.ReflectedHtmlAttrBuilder
import com.raquo.domtypes.generic.codecs.{BooleanAsAttrPresenceCodec, BooleanAsTrueFalseStringCodec, BooleanAsYesNoStringCodec}

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
  * @tparam RA Reflected Attribute, canonically either [[com.raquo.domtypes.generic.keys.Prop]]
  *            or a type alias to [[com.raquo.domtypes.generic.keys.HtmlAttr]] (to remove the extra type param)
  */
trait ReflectedHtmlAttrs[RA[_, _]] { this: ReflectedHtmlAttrBuilder[RA] =>

  /**
    * If the value of the type attribute is file, this attribute indicates the
    * types of files that the server accepts; otherwise it is ignored.
    *
    * MDN
    */
  @inline final def accept: RA[String, String] = stringReflectedAttr("accept")

  /**
    * The URI of a program that processes the information submitted via the form.
    * This value can be overridden by a [[formAction]] attribute on a button or
    * input element.
    *
    * MDN
    *
    * Only applies to [[com.raquo.domtypes.generic.defs.tags.FormTags.form]]
    */
  @inline final def action: RA[String, String] = stringReflectedAttr("action")

  /**
    * Specifies a shortcut key to activate/focus an element
    */
  @inline final def accessKey: RA[String, String] = stringReflectedAttr(attrKey = "accesskey", propKey = "accessKey")

  /**
    * This attribute defines the alternative text describing the image. Users
    * will see this displayed if the image URL is wrong, the image is not in one
    * of the supported formats, or until the image is downloaded.
    *
    * MDN
    */
  @inline final def alt: RA[String, String] = stringReflectedAttr("alt")

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
  @inline final def autoCapitalize: RA[String, String] = stringReflectedAttr("autocapitalize")

  /**
    * This attribute indicates whether the value of the control can be
    * automatically completed by the browser. This attribute is ignored if the
    * value of the type attribute is hidden, checkbox, radio, file, or a button
    * type (button, submit, reset, image).
    *
    * MDN
    */
  @inline final def autoComplete: RA[String, String] = stringReflectedAttr("autocomplete")

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
  @inline final def autoFocus: RA[Boolean, Boolean] = booleanReflectedAttr("autofocus", attrCodec = BooleanAsAttrPresenceCodec)

  /**
    * The visible width of text input or <textArea>, in average character widths.
    * If it is specified, it must be a positive integer.
    * If it is not specified, the default value is 20 (HTML5).
    *
    * MDN
    */
  @inline final def cols: RA[Int, Int] = intReflectedAttr("cols")

  /**
    * This attribute contains a non-negative integer value that indicates for
    * how many columns the cell extends. Its default value is 1; if its value
    * is set to 0, it extends until the end of the <colgroup>, even if implicitly
    * defined, that the cell belongs to. Values higher than 1000 will be considered
    * as incorrect and will be set to the default value (1).
    *
    * MDN
    */
  @inline final def colSpan: RA[Int, Int] = intReflectedAttr(attrKey = "colspan", propKey = "colSpan")

  /**
    * This attribute gives the value associated with the [[name]] or [[httpEquiv]] attribute,
    * of a <meta> element, depending on which of those attributes is defined on that element.
    *
    * MDN
    */
  @inline final def contentAttr: RA[String, String] = stringReflectedAttr("content")

  /**
    * When the value of the type attribute is "radio" or "checkbox", the presence of
    * this Boolean attribute indicates that the control is selected **by default**;
    * otherwise it is ignored.
    *
    * See [[com.raquo.domtypes.generic.defs.props.Props.checked]]
    *
    * MDN
    */
  @inline final def defaultChecked: RA[Boolean, Boolean] = booleanReflectedAttr(
    attrKey = "checked",
    propKey = "defaultChecked",
    attrCodec = BooleanAsAttrPresenceCodec
  )

  /**
    * Indicates whether this <option> is initially selected
    * in an option list of a <select> element.
    *
    * See [[com.raquo.domtypes.generic.defs.props.Props.selected]]
    */
  @inline final def defaultSelected: RA[Boolean, Boolean] = booleanReflectedAttr(
    attrKey = "selected",
    propKey = "defaultSelected",
    attrCodec = BooleanAsAttrPresenceCodec
  )

  /**
    * The initial value of the control. This attribute is optional except when
    * the value of the type attribute is radio or checkbox.
    *
    * See also [[com.raquo.domtypes.generic.defs.props.Props.value]]
    *
    * MDN
    */
  @inline final def defaultValue: RA[String, String] = stringReflectedAttr(attrKey = "value", propKey = "defaultValue")

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
  @inline final def dir: RA[String, String] = stringReflectedAttr("dir")

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
  @inline final def disabled: RA[Boolean, Boolean] = booleanReflectedAttr("disabled", attrCodec = BooleanAsAttrPresenceCodec)

  /**
    * Specifies whether an element is draggable or not
    */
  @inline final def draggable: RA[Boolean, Boolean] = booleanReflectedAttr("draggable", attrCodec = BooleanAsTrueFalseStringCodec)

  /**
    * The `enctype` attribute provides the encoding type of the form when it is
    * submitted (for forms with a method of "POST").
    *
    * Only applies to [[com.raquo.domtypes.generic.defs.tags.FormTags.form]]
    */
  @inline final def encType: RA[String, String] = stringReflectedAttr("enctype")

  /**
    * Describes an element which belongs to this one. Used on labels and output elements.
    *
    * MDN
    */
  @inline final def forId: RA[String, String] = stringReflectedAttr(attrKey = "for", propKey = "htmlFor")

  /**
    * The `formaction` attribute provides the URL that will process the input control
    * when the form is submitted and overrides the default `action` attribute of the
    * `form` element. This should be used only with `input` elements of `type`
    * submit or image.
    */
  @inline final def formAction: RA[String, String] = stringReflectedAttr(attrKey = "formaction", propKey = "formAction")

  /**
    * The `formenctype` attribute provides the encoding type of the form when it is
    * submitted (for forms with a method of "POST") and overrides the default
    * `enctype` attribute of the `form` element. This should be used only with the
    * `input` elements of `type` "submit" or "image"
    *
    * Enumerated: "multipart/form-data" | "text/plain" | "application/x-www-form-urlencoded" (default)
    */
  @inline final def formEncType: RA[String, String] = stringReflectedAttr(attrKey = "formenctype", propKey = "formEnctype")

  /**
    * The `formmethod` attribute specifies the HTTP Method the form should use when
    * it is submitted and overrides the default `method` attribute of the `form`
    * element. This should be used only with the `input` elements of `type` "submit"
    * or "image".
    *
    * Enumerated: "post" | "get"
    */
  @inline final def formMethod: RA[String, String] = stringReflectedAttr(attrKey = "formmethod", propKey = "formMethod")

  /**
    * The `formnovalidate` Boolean attribute specifies that the input of the form
    * should not be validated upon submit and overrides the default `novalidate`
    * attribute of the `form`. This should only be used with `input` elements of
    * of `type` "submit".
    */
  @inline final def formNoValidate: RA[Boolean, Boolean] = booleanReflectedAttr(
    attrKey = "formnovalidate",
    propKey = "formNoValidate",
    attrCodec = BooleanAsAttrPresenceCodec
  )

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
  @inline final def formTarget: RA[String, String] = stringReflectedAttr(attrKey = "formtarget", propKey = "formTarget")

  /**
    * Specifies that an element is not yet, or is no longer, relevant and
    * consequently hidden from view of the user.
    *
    * https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/hidden
    */
  @inline final def hidden: RA[Boolean, Boolean] = booleanReflectedAttr("hidden", attrCodec = BooleanAsAttrPresenceCodec)

  /**
    * For use in &lt;meter&gt; tags.
    *
    * @see https://css-tricks.com/html5-meter-element/
    */
  @inline final def high: RA[Double, Double] = doubleReflectedAttr("high")

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
  @inline final def href: RA[String, String] = stringReflectedAttr("href")

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
  @inline final def httpEquiv: RA[String, String] = stringReflectedAttr(attrKey = "http-equiv", propKey = "httpEquiv")

  /**
    * This attribute defines a unique identifier (ID) which must be unique in
    * the whole document. Its purpose is to identify the element when linking
    * (using a fragment identifier), scripting, or styling (with CSS).
    *
    * MDN
    */
  @inline final def id: RA[String, String] = stringReflectedAttr("id")

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
  @inline final def lang: RA[String, String] = stringReflectedAttr("lang")

  /**
    * For use in &lt;meter&gt; tags.
    *
    * @see https://css-tricks.com/html5-meter-element/
    */
  @inline final def low: RA[Double, Double] = doubleReflectedAttr("low")

  /**
    * If the type of the input element is text, email, search, password, tel, or
    * url, this attribute specifies the minimum number of characters (in Unicode
    * code points) that the user can enter. For other control types, it is ignored.
    *
    * MDN
    */
  @inline final def minLength: RA[Int, Int] = intReflectedAttr(attrKey = "minlength", propKey = "minLength")

  /**
    * The maximum allowed length for the input field. This attribute forces the input control
    * to accept no more than the allowed number of characters. It does not produce any
    * feedback to the user; you must write Javascript to make that happen.
    */
  @inline final def maxLength: RA[Int, Int] = intReflectedAttr(attrKey = "maxlength", propKey = "maxLength")

  /**
    * This attribute specifies the media which the linked resource applies to.
    * Its value must be a media query. This attribute is mainly useful when
    * linking to external stylesheets by allowing the user agent to pick
    * the best adapted one for the device it runs on.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/HTML/Element/link#attr-media
    */
  @inline final def media: RA[String, String] = stringReflectedAttr("media")

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
  @inline final def method: RA[String, String] = stringReflectedAttr("method")

  /**
    * This Boolean attribute specifies, when present/true, that the user is allowed
    * to enter more than one value for the <input> element for types "email" or "file".
    * It can also be provided to the <select> element to allow selecting more than one
    * option.
    */
  @inline final def multiple: RA[Boolean, Boolean] = booleanReflectedAttr("multiple", attrCodec = BooleanAsAttrPresenceCodec)

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
  @inline final def name: RA[String, String] = stringReflectedAttr("name")

  /**
    * This Boolean attribute indicates that the form is not to be validated when
    * submitted. If this attribute is not specified (and therefore the form is
    * validated), this default setting can be overridden by a formnovalidate
    * attribute on a <button> or <input> element belonging to the form.
    */
  @inline final def noValidate: RA[Boolean, Boolean] = booleanReflectedAttr(
    attrKey = "novalidate",
    propKey = "noValidate",
    attrCodec = BooleanAsAttrPresenceCodec
  )

  /**
    * For use in &lt;meter&gt; tags.
    *
    * @see https://css-tricks.com/html5-meter-element/
    */
  @inline final def optimum: RA[Double, Double] = doubleReflectedAttr("optimum")

  /**
    * Specifies a regular expression to validate the input. The pattern attribute
    * works with the following input types: text, search, url, tel, email, and
    * password. Use the `title` attribute to describe the pattern to the user.
    */
  @inline final def pattern: RA[String, String] = stringReflectedAttr("pattern")

  /**
    * A hint to the user of what can be entered in the control. The placeholder
    * text must not contain carriage returns or line-feeds. This attribute
    * applies when the value of the type attribute is text, search, tel, url or
    * email; otherwise it is ignored.
    *
    * MDN
    */
  @inline final def placeholder: RA[String, String] = stringReflectedAttr("placeholder")

  /**
    * This Boolean attribute indicates that the user cannot modify the value of
    * the control. This attribute is ignored if the value of the type attribute
    * is hidden, range, color, checkbox, radio, file, or a button type.
    *
    * MDN
    */
  @inline final def readOnly: RA[Boolean, Boolean] = booleanReflectedAttr(
    attrKey = "readonly",
    propKey = "readOnly",
    attrCodec = BooleanAsAttrPresenceCodec
  )

  /**
    * This attribute specifies that the user must fill in a value before
    * submitting a form. It cannot be used when the type attribute is hidden,
    * image, or a button type (submit, reset, or button). The :optional and
    * :required CSS pseudo-classes will be applied to the field as appropriate.
    *
    * MDN
    */
  @inline final def required: RA[Boolean, Boolean] = booleanReflectedAttr("required", attrCodec = BooleanAsAttrPresenceCodec)

  /**
    * The number of visible text lines for a text control.
    *
    * MDN
    */
  @inline final def rows: RA[Int, Int] = intReflectedAttr("rows")

  /**
    * This attribute contains a non-negative integer value that indicates for how many
    * rows the cell extends. Its default value is 1; if its value is set to 0, it extends
    * until the end of the table section (<thead>, <tbody>, <tfoot>, even if implicitly
    * defined, that the cell belongs to. Values higher than 65534 are clipped down to 65534.
    *
    * MDN
    */
  @inline final def rowSpan: RA[Int, Int] = intReflectedAttr(attrKey = "rowspan", propKey = "rowSpan")

  /**
    * For use in &lt;style&gt; tags.
    *
    * If this attribute is present, then the style applies only to its parent element.
    * If absent, the style applies to the whole document.
    */
  @inline final def scoped: RA[Boolean, Boolean] = booleanReflectedAttr("scoped", attrCodec = BooleanAsAttrPresenceCodec)

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
  @inline final def size: RA[Int, Int] = intReflectedAttr("size")

  /**
    * Defines whether the element may be checked for spelling errors.
    *
    * MDN – https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/spellcheck
    */
  @inline final def spellCheck: RA[Boolean, Boolean] = booleanReflectedAttr("spellcheck", attrCodec = BooleanAsTrueFalseStringCodec)

  /**
    * If the value of the type attribute is image, this attribute specifies a URI
    * for the location of an image to display on the graphical submit button;
    * otherwise it is ignored.
    *
    * MDN
    */
  @inline final def src: RA[String, String] = stringReflectedAttr("src")

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
  @inline final def tabIndex: RA[Int, Int] = intReflectedAttr(attrKey = "tabindex", propKey = "tabIndex")

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
  @inline final def target: RA[String, String] = stringReflectedAttr("target")

  /**
    * This attribute contains a text representing advisory information related to
    * the element it belongs too. Such information can typically, but not
    * necessarily, be presented to the user as a tooltip.
    *
    * MDN
    */
  @inline final def title: RA[String, String] = stringReflectedAttr("title")

  /**
    * Specifies whether the content of an element should be translated or not
    */
  @inline final def translate: RA[Boolean, Boolean] = booleanReflectedAttr("translate", attrCodec = BooleanAsYesNoStringCodec)

  /**
    * Specifies XML namespace for the document
    */
  @inline final def xmlns: RA[String, String] = stringReflectedAttr("xmlns")
}
