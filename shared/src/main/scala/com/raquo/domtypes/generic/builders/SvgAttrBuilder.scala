package com.raquo.domtypes.generic.builders

import com.raquo.domtypes.generic.codecs.{Codec, DoubleAsStringCodec, IntAsStringCodec, StringAsIsCodec}

/** This trait builds attribute objects which are typically found on the left hand side
  * of the `svgAttr := value` syntax.
  *
  * See also: [[com.raquo.domtypes.generic.builders.canonical.CanonicalSvgAttrBuilder]]
  *
  * @tparam A SVG Attribute, canonically [[com.raquo.domtypes.generic.keys.SvgAttr]]
  */
trait SvgAttrBuilder[A[_]] {

  /** Create an SVG Attribute */
  protected def svgAttr[V](key: String, codec: Codec[V, String]): A[V]

  @inline protected def intSvgAttr(key: String): A[Int] = svgAttr(key, IntAsStringCodec)

  @inline protected def doubleSvgAttr(key: String): A[Double] = svgAttr(key, DoubleAsStringCodec)

  @inline protected def stringSvgAttr(key: String): A[String] = svgAttr(key, StringAsIsCodec)
}
