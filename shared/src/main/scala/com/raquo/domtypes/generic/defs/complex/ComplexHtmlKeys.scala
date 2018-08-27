package com.raquo.domtypes.generic.defs.complex

/** This trait gives you a very flexible way to define HTML keys that
  * consuming libraries often have strong opinions about.
  *
  * Use [[canonical.CanonicalComplexHtmlKeys]] if you lack such strong opinions.
  *
  * If your opinions are too strong to use this trait – don't! You can implement
  * any subset of these keys yourself with whatever names you like.
  */
trait ComplexHtmlKeys[ClassNameRA, RelRA, RoleRA, DataA, StyleA, TextContentP] {

  /**
    * This attribute is a space-separated list of the classes of the element.
    * Classes allows CSS and Javascript to select and access specific elements
    * via the class selectors or functions like the DOM method
    * document.getElementsByClassName.
    *
    * MDN
    */
  def className: ClassNameRA

  // @TODO[Performance] Wouldn't `@inline def` be better for aliasing in Scala.js? className will be overriden with a lazy val anyway.
  lazy val cls: ClassNameRA = className

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
    * The attribute describes the role(s) the current element plays in the
    * context of the document. This can be used, for example,
    * by applications and assistive technologies to determine the purpose of
    * an element. This could allow a user to make informed decisions on which
    * actions may be taken on an element and activate the selected action in a
    * device independent way. It could also be used as a mechanism for
    * annotating portions of a document in a domain specific way (e.g.,
    * a legal term taxonomy). Although the role attribute may be used to add
    * semantics to an element, authors should use elements with inherent
    * semantics, such as p, rather than layering semantics on semantically
    * neutral elements, such as div role="paragraph".
    *
    * See: [[http://www.w3.org/TR/role-attribute/#s_role_module_attributes]]
    */
  def role: RoleRA

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
}
