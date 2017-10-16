package com.raquo.domtypes.generic.defs.attrs

import com.raquo.domtypes.generic.builders.AttrBuilder

// @TODO[API][cleanup] Why is this separate from Attrs? How is it different? We're following ScalaTags on definitions

/**
  * A trait for global attributes that are applicable to any HTML5 element. All traits that define Attrs should
  * derive from this trait since all groupings of attributes should include these global ones.
  *
  * @tparam A Attribute
  */
trait GlobalAttrs[A[_]] { this: AttrBuilder[A] =>

  /**
    * Specifies a shortcut key to activate/focus an element
    */
  lazy val accessKey: A[String] = attr("accesskey")

  /**
    * This attribute is a space-separated list of the classes of the element.
    * Classes allows CSS and Javascript to select and access specific elements
    * via the class selectors or functions like the DOM method
    * document.getElementsByClassName. You can use cls as an alias for this
    * attribute so you don't have to backtick-escape this attribute.
    *
    * MDN
    */
  lazy val cls: A[String] = attr("class")

  /**
    * Alias for the `cls` attribute
    */
  lazy val `class`: A[String] = cls

  /**
    * Alias for the `cls` attribute for React.js people
    */
  lazy val className: A[String] = cls

  /**
    * Specifies whether the content of an element is editable or not
    */
  lazy val contentEditable: A[Boolean] = attr("contenteditable")

  /**
    * Specifies a context menu for an element by its element id.
    * The context menu appears when a user right-clicks on the element
    */
  lazy val contextMenu: A[String] = attr("contextmenu")

  /**
    * This class of attributes, called custom data attributes, allows proprietary
    * information to be exchanged between the HTML and its DOM representation that
    * may be used by scripts. All such custom data are available via the HTMLElement
    * interface of the element the attribute is set on. The HTMLElement.dataset
    * property gives access to them.
    *
    * The * may be replaced by any name following the production rule of xml names
    * with the following restrictions:
    *
    * the name must not start with xml, whatever case is used for these letters;
    * the name must not contain any semicolon (U+003A);
    * the name must not contain capital A to Z letters.
    *
    * Note that the HTMLElement.dataset attribute is a StringMap and the name of the
    * custom data attribute data-test-value will be accessible via
    * HTMLElement.dataset.testValue as any dash (U+002D) is replaced by the capitalization
    * of the next letter (camelcase).
    *
    * MDN
    */
  // @TODO Figure this out
  //  object data extends DataAttribute(List("data"))
  //  class DataAttribute(sections: List[String]) extends js.Dynamic{
  //    def selectDynamic(s: String) = new DataAttribute(s :: sections)
  //    def :=[T](v: T)(implicit ev: AttrValue[Builder, T]) =
  //      AttrPair(makeKey(sections.reverse.mkString("-")), v, ev)
  //  }
  def data(suffix: String): A[String] = attr(s"data-$suffix")

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
  lazy val dir: A[String] = attr("dir")

  /**
    * A Boolean attribute that specifies whether an element is draggable or not
    */
  lazy val draggable: A[Boolean] = attr("draggable")

  /**
    * Specifies whether the dragged data is copied, moved, or linked, when dropped
    * Acceptable values: `copy` | `move` | `link`
    */
  lazy val dropZone: A[String] = attr("dropzone")

  /**
    * Specifies that an element is not yet, or is no longer, relevant and
    * consequently hidden from view of the user.
    */
  lazy val hidden: A[Boolean] = attr("hidden")

  /**
    * This attribute defines a unique identifier (ID) which must be unique in
    * the whole document. Its purpose is to identify the element when linking
    * (using a fragment identifier), scripting, or styling (with CSS).
    *
    * MDN
    */
  lazy val id: A[String] = attr("id")

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
  lazy val lang: A[String] = attr("lang")

  /**
    * This enumerated attribute defines whether the element may be checked for
    * spelling errors.
    *
    * MDN
    */
  lazy val spellCheck: A[Boolean] = attr("spellcheck")

  /**
    * This attribute contains CSS styling declarations to be applied to the
    * element. Note that it is recommended for styles to be defined in a separate
    * file or files. This attribute and the style element have mainly the
    * purpose of allowing for quick styling, for example for testing purposes.
    *
    * MDN
    */
  lazy val style: A[String] = attr("style")

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
  lazy val tabIndex: A[Int] = attr("tabindex")

  /**
    * This attribute contains a text representing advisory information related to
    * the element it belongs too. Such information can typically, but not
    * necessarily, be presented to the user as a tooltip.
    *
    * MDN
    */
  lazy val title: A[String] = attr("title")

  /**
    * Specifies whether the content of an element should be translated or not
    */
  lazy val translate: A[Boolean] = attr("translate")
}
