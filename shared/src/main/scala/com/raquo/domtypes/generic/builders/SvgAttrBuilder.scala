package com.raquo.domtypes.generic.builders

import com.raquo.domtypes.generic.codecs.{Codec, DoubleAsStringCodec, IntAsStringCodec, StringAsIsCodec}

/** This trait builds attribute objects which are typically found on the left hand side
  * of the `svgAttr := value` syntax.
  *
  * See also: [[com.raquo.domtypes.fixtures.canonical.CanonicalSvgAttrBuilder]]
  *
  * @tparam A SVG Attribute, canonically [[com.raquo.domtypes.fixtures.keys.SvgAttr]]
  */
trait SvgAttrBuilder[A[_]] {

  /** Create an SVG Attribute */
  protected def svgAttr[V](key: String, codec: Codec[V, String], namespace: Option[String]): A[V]

  @inline protected def intSvgAttr(key: String, namespace: Option[String] = None): A[Int] = svgAttr(key, IntAsStringCodec, namespace)

  @inline protected def doubleSvgAttr(key: String, namespace: Option[String] = None): A[Double] = svgAttr(key, DoubleAsStringCodec, namespace)

  @inline protected def stringSvgAttr(key: String, namespace: Option[String] = None): A[String] = svgAttr(key, StringAsIsCodec, namespace)
}
