package com.raquo.domtypes.old.builders

import com.raquo.domtypes.old.codecs._

/** This trait builds objects representing properties, which are typically
  * on the left hand side of the `prop := value` syntax.
  *
  * @tparam P DOM Property[ScalaValue, RawDomValue]
  */
trait PropBuilder[P[_, _]] {

  // #Safe – DONE manually

  /** Create a DOM Property */
  protected def prop[V, DomV](key: String, codec: Codec[V, DomV]): P[V, DomV]

  @inline protected def intProp(key: String): P[Int, Int] = prop(key, IntAsIsCodec)

  @inline protected def doubleProp(key: String): P[Double, Double] = prop(key, DoubleAsIsCodec)

  @inline protected def stringProp(key: String): P[String, String] = prop(key, StringAsIsCodec)
}
