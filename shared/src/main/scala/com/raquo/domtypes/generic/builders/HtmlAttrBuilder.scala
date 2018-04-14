package com.raquo.domtypes.generic.builders

import com.raquo.domtypes.generic.codecs.{Codec, DoubleAsStringCodec, IntAsStringCodec, StringAsIsCodec}

/** This trait builds attribute objects which are typically found on the left hand side
  * of the `htmlAttr := value` syntax.
  *
  * See also: [[com.raquo.domtypes.generic.builders.canonical.CanonicalHtmlAttrBuilder]]
  *
  * @tparam A HTML Attribute, canonically [[com.raquo.domtypes.generic.keys.HtmlAttr]]
  */
trait HtmlAttrBuilder[A[_]] {

  /** Create an HTML Attribute */
  protected def htmlAttr[V](key: String, codec: Codec[V, String]): A[V]

  @inline protected def intHtmlAttr(key: String): A[Int] = htmlAttr(key, IntAsStringCodec)

  @inline protected def doubleHtmlAttr(key: String): A[Double] = htmlAttr(key, DoubleAsStringCodec)

  @inline protected def stringHtmlAttr(key: String): A[String] = htmlAttr(key, StringAsIsCodec)
}
