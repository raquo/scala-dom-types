package com.raquo.domtypes.old.builders

import com.raquo.domtypes.old.codecs._

/** This trait builds attribute objects which are typically found on the left hand side
  * of the `htmlAttr := value` syntax.
  *
  * @tparam A HTML Attribute
  */
trait HtmlAttrBuilder[A[_]] {

  // #Safe – Done

  /** Create an HTML Attribute */
  protected def htmlAttr[V](key: String, codec: Codec[V, String]): A[V] // #Note - unused in trait

  @inline protected def boolTrueFalseHtmlAttr(key: String): A[Boolean] = htmlAttr(key, BooleanAsTrueFalseStringCodec)

  @inline protected def boolOnOffHtmlAttr(key: String): A[Boolean] = htmlAttr(key, BooleanAsOnOffStringCodec)

  @inline protected def intHtmlAttr(key: String): A[Int] = htmlAttr(key, IntAsStringCodec)

  @inline protected def doubleHtmlAttr(key: String): A[Double] = htmlAttr(key, DoubleAsStringCodec)

  @inline protected def stringHtmlAttr(key: String): A[String] = htmlAttr(key, StringAsIsCodec)
}
