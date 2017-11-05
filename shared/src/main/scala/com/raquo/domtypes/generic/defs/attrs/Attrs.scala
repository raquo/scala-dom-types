package com.raquo.domtypes.generic.defs.attrs

import com.raquo.domtypes.generic.builders.AttrBuilder
import com.raquo.domtypes.generic.codecs.{BooleanAsOnOffStringCodec, BooleanAsTrueFalseStringCodec}

/** @tparam A HTML Attribute, canonically [[com.raquo.domtypes.generic.keys.Attr]] */
trait Attrs[A[_]] { this: AttrBuilder[A] =>

  /**
    * Declares the character encoding of the page or script. Used on meta and
    * script elements.
    *
    * MDN
    */
  lazy val charset: A[String] = stringAttr("charset")

  /**
    * Indicates whether the element should be editable by the user.
    * If so, the browser modifies its widget to allow editing.
    *
    * MDN
    *
    * https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/contenteditable
    */
  lazy val contentEditable: A[Boolean] = attr("contenteditable", BooleanAsTrueFalseStringCodec)

  /**
    * Specifies a context menu for an element by its element id.
    * The context menu appears when a user right-clicks on the element
    */
  lazy val contextMenuId: A[String] = stringAttr("contextmenu")

  /**
    * This class of attributes, called custom data attributes, allows proprietary
    * information to be exchanged between the HTML and its DOM representation that
    * may be used by scripts. All such custom data are available via the HTMLElement
    * interface of the element the attribute is set on. The HTMLElement.dataset
    * property gives access to them.
    *
    * The `suffix` is subject to the following restrictions:
    *
    * must not start with xml, whatever case is used for these letters;
    * must not contain any semicolon (U+003A);
    * must not contain capital A to Z letters.
    *
    * Note that the HTMLElement.dataset attribute is a StringMap and the name of the
    * custom data attribute data-test-value will be accessible via
    * HTMLElement.dataset.testValue as any dash (U+002D) is replaced by the capitalization
    * of the next letter (camelcase).
    *
    * MDN
    */
  def dataAttr(suffix: String): A[String] = stringAttr(s"data-$suffix")

  /**
    * Specifies whether the dragged data is copied, moved, or linked, when dropped
    * Acceptable values: `copy` | `move` | `link`
    */
  lazy val dropZone: A[String] = stringAttr("dropzone")

  /**
    * The form attribute specifies an ID of the form an `<input>` element belongs to.
    */
  lazy val formId: A[String] = stringAttr("form")

  /**
    * The `height` attribute specifies the pixel height of the following elements:
    * `<canvas>, <embed>, <iframe>, <img>, <input type="image">, <object>, <video>`
    */
  lazy val heightAttr: A[Int] = intAttr("height")

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
  lazy val listId: A[String] = stringAttr("list")

  // @TODO[API][improve] - Can we improve usability of the max/min attributes?

  /**
    * The max attribute specifies the maximum value for an <input> element of type
    * number, range, date, datetime, datetime-local, month, time, or week.
    */
  lazy val max: A[String] = stringAttr("max")

  /**
    * The min attribute specifies the minimum value for an <input> element of type
    * number, range, date, datetime, datetime-local, month, time, or week.
    */
  lazy val min: A[String] = stringAttr("min")

  /**
    * The step attribute specifies the numeric intervals for an <input> element
    * that should be considered legal for the input. For example, if step is 2
    * on a number typed <input> then the legal numbers could be -2, 0, 2, 4, 6
    * etc. The step attribute should be used in conjunction with the min and
    * max attributes to specify the full range and interval of the legal values.
    * The step attribute is applicable to <input> elements of the following
    * types: number, range, date, datetime, datetime-local, month, time and week.
    */
  lazy val step: A[String] = stringAttr("step")

  /**
    * This attribute contains CSS styling declarations to be applied to the
    * element. Note that it is recommended for styles to be defined in a separate
    * file or files. This attribute and the style element have mainly the
    * purpose of allowing for quick styling, for example for testing purposes.
    *
    * MDN
    */
  lazy val styleAttr: A[String] = stringAttr("style")

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
  lazy val `type`: A[String] = stringAttr("type")

  lazy val typ: A[String] = `type`

  /** IE-specific property to prevent user selection */
  lazy val unselectable: A[Boolean] = attr("unselectable", BooleanAsOnOffStringCodec)

  /**
    * The `width` attribute specifies the pixel width of the following elements:
    * `<canvas>, <embed>, <iframe>, <img>, <input type="image">, <object>, <video>`
    */
  lazy val widthAttr: A[Int] = intAttr("width")
}
