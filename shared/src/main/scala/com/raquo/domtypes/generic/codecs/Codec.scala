package com.raquo.domtypes.generic.codecs

/** This trait represents a way to encode and decode HTML attribute or DOM property values.
  *
  * It is needed because attributes encode all values as strings regardless of their type,
  * and then there are also multiple ways to encode e.g. boolean values. Some attributes
  * encode those as "true" / "false" strings, others as presence or absence of the element,
  * and yet others use "yes" / "no" or "on" / "off" strings, and properties encode booleans
  * as actual booleans.
  *
  * Scala DOM Types hides all this mess from you using codecs. All those pseudo-boolean
  * attributes would be simply `Attr[Boolean](name, codec)` in your code.
  * */
trait Codec[ScalaType, DomType] {

  // @TODO[Integrity] how should we deal with exceptions?
  // @TODO[Integrity] how should we deal with nulls?

  /** Convert the result of a `dom.Node.getAttribute` call to appropriate Scala type.
    *
    * Note: HTML Attributes are generally optional, and `dom.Node.getAttribute` will return
    * `null` if an attribute is not defined on a given DOM node. However, this decoder is
    * only intended for cases when the attribute is defined.
    *
    * // @TODO Orly? What about boolean attrs? How do we distinguish that? What about props?
    */
  def decode(domValue: DomType): ScalaType

  /** Convert desired attribute value to appropriate DOM type. The resulting value should
    * be passed to `dom.Node.setAttribute` call, except when resulting value is a `null`.
    * In that case you should call `dom.Node.removeAttribute` instead.
    */
  def encode(scalaValue: ScalaType): DomType
}
