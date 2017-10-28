package com.raquo.domtypes.generic.builders

import com.raquo.domtypes.generic.codecs.{Codec, DoubleAsStringCodec, IntAsStringCodec, StringAsIsCodec}

/** This trait builds attribute objects which are typically found on the left hand side
  * of the `attr := value` syntax.
  *
  * See also: [[com.raquo.domtypes.generic.builders.canonical.CanonicalAttrBuilder]]
  *
  * @tparam A HTML Attribute, canonically [[com.raquo.domtypes.generic.keys.Attr]]
  */
trait AttrBuilder[A[_]] {

  /** Create an HTML Attribute */
  def attr[V](key: String, codec: Codec[V, _]): A[V]

  @inline def intAttr(key: String): A[Int] = attr(key, IntAsStringCodec)

  @inline def doubleAttr(key: String): A[Double] = attr(key, DoubleAsStringCodec)

  @inline def stringAttr(key: String): A[String] = attr(key, StringAsIsCodec)
}
