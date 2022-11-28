package com.raquo.domtypes.old.builders

import com.raquo.domtypes.old.codecs.{Codec, DoubleAsStringCodec, IntAsStringCodec, StringAsIsCodec}

/** This trait builds attribute objects which are typically found on the left hand side
  * of the `svgAttr := value` syntax.
  *
  * @tparam A SVG Attribute
  */
trait SvgAttrBuilder[A[_]] {

  // #Safe – DONE

  /** Create an SVG Attribute */
  protected def svgAttr[V](key: String, codec: Codec[V, String], namespace: Option[String]): A[V]  // #Note unused in trait

  @inline protected def intSvgAttr(key: String/*, namespace: Option[String] = None*/): A[Int] = svgAttr(key, IntAsStringCodec, /*namespace*/ None)

  @inline protected def doubleSvgAttr(key: String/*, namespace: Option[String] = None*/): A[Double] = svgAttr(key, DoubleAsStringCodec, /*namespace*/ None)

  @inline protected def stringSvgAttr(key: String): A[String] = {
    val parts = key.split(":")
    if (parts.length == 2) {
      svgAttr(parts(1), StringAsIsCodec, Some(parts(0)))
    } else if (parts.length == 1) {
      svgAttr(parts(0), StringAsIsCodec, None)
    } else {
      throw new Exception(s"bad svg key: ${key}")
    }
  }

  // @inline protected def stringSvgAttr(key: String): A[String] = svgAttr(key, StringAsIsCodec, None)
}
