package com.raquo.domtypes.generic.builders

import com.raquo.domtypes.generic.codecs.{Codec, DoubleAsIsCodec, IntAsIsCodec, StringAsIsCodec}

/** This trait builds objects representing properties, which are typically
  * on the left hand side of the `prop := value` syntax.
  *
  * See also: [[com.raquo.domtypes.fixtures.canonical.CanonicalPropBuilder]]
  *
  * @tparam P DOM Property, canonically [[com.raquo.domtypes.fixtures.keys.Prop]]
  */
trait PropBuilder[P[_, _]] {

  /** Create a DOM Property */
  protected def prop[V, DomV](key: String, codec: Codec[V, DomV]): P[V, DomV]

  @inline protected def intProp(key: String): P[Int, Int] = prop(key, IntAsIsCodec)

  @inline protected def doubleProp(key: String): P[Double, Double] = prop(key, DoubleAsIsCodec)

  @inline protected def stringProp(key: String): P[String, String] = prop(key, StringAsIsCodec)
}
