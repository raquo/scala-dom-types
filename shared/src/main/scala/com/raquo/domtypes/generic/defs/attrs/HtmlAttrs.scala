package com.raquo.domtypes.generic.defs.attrs

import com.raquo.domtypes.generic.builders.HtmlAttrBuilder
import com.raquo.domtypes.generic.codecs.{BooleanAsOnOffStringCodec, BooleanAsTrueFalseStringCodec}

/** @tparam A HtmlAttribute[Value] */
trait HtmlAttrs[A[_]] { this: HtmlAttrBuilder[A] =>

  /**
    * Declares the character encoding of the page or script. Used on meta and
    * script elements.
    *
    * MDN
    */
  lazy val charset: A[String] = stringHtmlAttr("charset")

  /**
    * Indicates whether the element should be editable by the user.
    * If so, the browser modifies its widget to allow editing.
    *
    * MDN
    *
    * https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/contenteditable
    */
  lazy val contentEditable: A[Boolean] = htmlAttr("contenteditable", BooleanAsTrueFalseStringCodec)

  /**
    * Specifies a context menu for an element by its element id.
    * The context menu appears when a user right-clicks on the element
    */
  lazy val contextMenuId: A[String] = stringHtmlAttr("contextmenu")

  /**
    * Specifies whether the dragged data is copied, moved, or linked, when dropped
    * Acceptable values: `copy` | `move` | `link`
    */
  lazy val dropZone: A[String] = stringHtmlAttr("dropzone")

  /**
    * The form attribute specifies an ID of the form an `<input>` element belongs to.
    */
  lazy val formId: A[String] = stringHtmlAttr("form")

  /**
    * The `height` attribute specifies the pixel height of the following elements:
    * `<canvas>, <embed>, <iframe>, <img>, <input type="image">, <object>, <video>`
    */
  lazy val heightAttr: A[Int] = intHtmlAttr("height")

  /**
    * Identifies a list of pre-defined options to suggest to the user. The value must be
    * the id of a [[com.raquo.domtypes.generic.defs.tags.FormTags.dataList]] element in
    * the same document. The browser displays only options that are valid values for this
    * input element. This attribute is ignored when the type attribute's value is hidden,
    * checkbox, radio, file, or a button type.
    *
    * MDN
    *
    * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/datalist
    */
  lazy val listId: A[String] = stringHtmlAttr("list")

  // @TODO[API][improve] - Can we improve usability of the max/min attributes?

  /**
    * The max attribute specifies the maximum value for an <input> element of type
    * number, range, date, datetime, datetime-local, month, time, or week.
    */
  lazy val maxAttr: A[String] = stringHtmlAttr("max")

  /**
    * The min attribute specifies the minimum value for an <input> element of type
    * number, range, date, datetime, datetime-local, month, time, or week.
    */
  lazy val minAttr: A[String] = stringHtmlAttr("min")

  /**
    * The step attribute specifies the numeric intervals for an <input> element
    * that should be considered legal for the input. For example, if step is 2
    * on a number typed <input> then the legal numbers could be -2, 0, 2, 4, 6
    * etc. The step attribute should be used in conjunction with the min and
    * max attributes to specify the full range and interval of the legal values.
    * The step attribute is applicable to <input> elements of the following
    * types: number, range, date, datetime, datetime-local, month, time and week.
    */
  lazy val stepAttr: A[String] = stringHtmlAttr("step")

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
  lazy val `type`: A[String] = stringHtmlAttr("type")

  lazy val typ: A[String] = `type`

  lazy val tpe: A[String] = `type`

  /** IE-specific property to prevent user selection */
  lazy val unselectable: A[Boolean] = htmlAttr("unselectable", BooleanAsOnOffStringCodec)

  /**
    * The `width` attribute specifies the pixel width of the following elements:
    * `<canvas>, <embed>, <iframe>, <img>, <input type="image">, <object>, <video>`
    */
  lazy val widthAttr: A[Int] = intHtmlAttr("width")
}
