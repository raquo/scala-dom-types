package com.raquo.domtypes.generic.defs.attrs

import com.raquo.domtypes.generic.builders.AttrBuilder

/**
  * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input
  *
  * @tparam A Attribute, canonically [[com.raquo.domtypes.generic.keys.Attr]]
  * @tparam BA Boolean Attribute, canonically [[com.raquo.domtypes.generic.keys.BooleanAttr]]
  */
trait InputAttrs[A[_], BA] { this: AttrBuilder[A, BA] =>

  /**
    * The URI of a program that processes the information submitted via the form.
    * This value can be overridden by a formaction attribute on a button or
    * input element.
    *
    * MDN
    */
  lazy val action: A[String] = attr("action")

  /**
    * This attribute indicates whether the value of the control can be
    * automatically completed by the browser. This attribute is ignored if the
    * value of the type attribute is hidden, checkbox, radio, file, or a button
    * type (button, submit, reset, image).
    *
    * Possible values are "off" and "on"
    *
    * MDN
    */
  lazy val autoComplete: A[String] = attr("autocomplete")

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
  lazy val autoFocus: BA = booleanAttr("autofocus")

  /**
    * When the value of the type attribute is radio or checkbox, the presence of
    * this Boolean attribute indicates that the control is selected by default;
    * otherwise it is ignored.
    *
    * MDN
    */
  lazy val checked: BA = booleanAttr("checked")

  /**
    * The `enctype` attribute provides the encoding type of the form when it is
    * submitted (for forms with a method of "POST").
    */
  lazy val encType: A[String] = attr("enctype")

  /**
    * The form attribute specifies one or more forms an `<input>` element belongs to.
    */
  lazy val formAttr: A[String] = attr("form") // TODO: Conflicts with "form" element

  /**
    * The `formaction` attribute provides the URL that will process the input control
    * when the form is submitted and overrides the default `action` attribute of the
    * `form` element. This should be used only with `input` elements of `type`
    * submit or image.
    */
  lazy val formAction: A[String] = attr("formaction")

  /**
    * The `formenctype` attribute provides the encoding type of the form when it is
    * submitted (for forms with a method of "POST") and overrides the default
    * `enctype` attribute of the `form` element. This should be used only with the
    * `input` elements of `type` "submit" or "image"
    */
  lazy val formEncType: A[String] = attr("formenctype")

  /**
    * The `formmethod` attribute specifies the HTTP Method the form should use when
    * it is submitted and overrides the default `method` attribute of the `form`
    * element. This should be used only with the `input` elements of `type` "submit"
    * or "image".
    */
  lazy val formMethod: A[String] = attr("formmethod")

  /**
    * The `formnovalidate` Boolean attribute specifies that the input of the form
    * should not be validated upon submit and overrides the default `novalidate`
    * attribute of the `form`. This should only be used with `input` elements of
    * of `type` "submit".
    */
  lazy val formNoValidate: BA = booleanAttr("formnovalidate")

  /**
    * The `formtarget` provides a name or keyword that indicates where to display
    * the response that is received after submitting the form and overrides the
    * `target` attribute of them `form` element. This should only be used with
    * the `input` elements of `type` "submit" or "image"
    */
  lazy val formTarget: A[String] = attr("formtarget")

  /**
    * The `height` attribute specifies the height of an `input` element of
    * `type` "image".
    */
  lazy val heightAttr: A[Int] = attr("height") // TODO: Conflicts with "height" in Styles -

  /**
    * The list attribute refers to a <datalist> element that contains the options
    * for an input element the presents a select list.
    */
  lazy val list: A[String] = attr("list")

  // @TODO[API][improve] - Can we improve usability of the max/min attributes?

  /**
    * The max attribute specifies the maximum value for an <input> element of type
    * number, range, date, datetime, datetime-local, month, time, or week.
    */
  lazy val max: A[String] = attr("max")

  /**
    * The min attribute specifies the minimum value for an <input> element of type
    * number, range, date, datetime, datetime-local, month, time, or week.
    */
  lazy val min: A[String] = attr("min")

  /**
    * This Boolean attribute specifies, when present/true, that the user is allowed
    * to enter more than one value for the <input> element for types "email" or "file".
    * It can also be provided to the <select> element to allow selecting more than one
    * option.
    */
  lazy val multiple: BA = booleanAttr("multiple")

  /**
    * The maximum allowed length for the input field. This attribute forces the input control
    * to accept no more than the allowed number of characters. It does not produce any
    * feedback to the user; you must write Javascript to make that happen.
    */
  lazy val maxLength: A[Int] = attr("maxlength")

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
  lazy val method: A[String] = attr("method")

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
  lazy val name: A[String] = attr("name")

  /**
    * Specifies a regular expression to validate the input. The pattern attribute
    * works with the following input types: text, search, url, tel, email, and
    * password. Use the `title` attribute to describe the pattern to the user.
    */
  lazy val pattern: A[String] = attr("pattern")

  /**
    * A hint to the user of what can be entered in the control. The placeholder
    * text must not contain carriage returns or line-feeds. This attribute
    * applies when the value of the type attribute is text, search, tel, url or
    * email; otherwise it is ignored.
    *
    * MDN
    */
  lazy val placeholder: A[String] = attr("placeholder")

  /**
    * This Boolean attribute indicates that the user cannot modify the value of
    * the control. This attribute is ignored if the value of the type attribute
    * is hidden, range, color, checkbox, radio, file, or a button type.
    *
    * MDN
    */
  lazy val readOnly: BA = booleanAttr("readonly")

  /**
    * This attribute specifies that the user must fill in a value before
    * submitting a form. It cannot be used when the type attribute is hidden,
    * image, or a button type (submit, reset, or button). The :optional and
    * :required CSS pseudo-classes will be applied to the field as appropriate.
    *
    * MDN
    */
  lazy val required: BA = booleanAttr("required")

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
  lazy val size: A[Int] = attr("size")

  /**
    * The step attribute specifies the numeric intervals for an <input> element
    * that should be considered legal for the input. For example, if step is 2
    * on a number typed <input> then the legal numbers could be -2, 0, 2, 4, 6
    * etc. The step attribute should be used in conjunction with the min and
    * max attributes to specify the full range and interval of the legal values.
    * The step attribute is applicable to <input> elements of the following
    * types: number, range, date, datetime, datetime-local, month, time and week.
    */
  lazy val step: A[String] = attr("step")

  /**
    * A name or keyword indicating where to display the response that is received
    * after submitting the form. In HTML 4, this is the name of, or a keyword
    * for, a frame. In HTML5, it is a name of, or keyword for, a browsing context
    * (for example, tab, window, or inline frame). The following keywords have
    * special meanings:
    *
    * - _this: Load the response into the same HTML 4 frame (or HTML5 browsing
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
  lazy val target: A[String] = attr("target")

  /**
    * This attribute is used to define the type of the content linked to. The
    * value of the attribute should be a MIME type such as text/html, text/css,
    * and so on. The common use of this attribute is to define the type of style
    * sheet linked and the most common current value is text/css, which indicates
    * a Cascading Style Sheet format. You can use tpe as an alias for this
    * attribute so you don't have to backtick-escape this attribute.
    *
    * MDN
    */
  lazy val `type`: A[String] = attr("type")

  /**
    * Shorthand for the `type` attribute
    */
  lazy val tpe: A[String] = `type`

  /**
    * Shorthand for the `type` attribute
    */
  lazy val typ: A[String] = `type`

  /**
    * The initial value of the control. This attribute is optional except when
    * the value of the type attribute is radio or checkbox.
    *
    * MDN
    */
  lazy val value: A[String] = attr("value")

  /**
    * The `width` attribute specifies the width of an `input` element of
    * `type` "image".
    */
  lazy val widthAttr: A[Int] = attr("width") // TODO: Conflicts with "width" in Styles
}
