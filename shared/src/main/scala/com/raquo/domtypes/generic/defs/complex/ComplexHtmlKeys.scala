package com.raquo.domtypes.generic.defs.complex

/** This trait gives you a very flexible way to define HTML keys that
  * consuming libraries often have strong opinions about.
  *
  * Use [[canonical.CanonicalComplexHtmlKeys]] if you lack such strong opinions.
  *
  * If your opinions are too strong to use this trait – don't! You can implement
  * any subset of these keys yourself with whatever names you like.
  */
trait ComplexHtmlKeys[ClassNameRA, ClsRA, RelRA, DataA, StyleA, TextContentP] {

  /**
    * This attribute is a space-separated list of the classes of the element.
    * Classes allows CSS and Javascript to select and access specific elements
    * via the class selectors or functions like the DOM method
    * document.getElementsByClassName.
    *
    * MDN
    */
  def className: ClassNameRA

  def cls: ClsRA

  /**
    * This attribute names a relationship of the linked document to the current
    * document. The attribute must be a space-separated list of the link types
    * values. The most common use of this attribute is to specify a link to an
    * external style sheet: the rel attribute is set to stylesheet, and the href
    * attribute is set to the URL of an external style sheet to format the page.
    *
    *
    * MDN
    */
  def rel: RelRA

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
  def dataAttr(suffix: String): DataA

  /**
    * This attribute contains CSS styling declarations to be applied to the
    * element. Note that it is recommended for styles to be defined in a separate
    * file or files. This attribute and the style element have mainly the
    * purpose of allowing for quick styling, for example for testing purposes.
    *
    * MDN
    */
  def styleAttr: StyleA

  /** Determines the textual content of an element and all its descendants.
    * Setting this property replaces all of the node's children with a text node containing
    * the provided string.
    *
    * MDN
    */
  def textContent: TextContentP
}
