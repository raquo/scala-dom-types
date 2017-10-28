package com.raquo.domtypes.generic.builders

import com.raquo.domtypes.generic.codecs.{Codec, DoubleAsIsCodec, IntAsIsCodec, StringAsIsCodec}

/** This trait builds objects representing properties, which are typically
  * on the left hand side of the `prop := value` syntax.
  *
  * See also: [[com.raquo.domtypes.generic.builders.canonical.CanonicalPropBuilder]]
  *
  * @tparam P DOM Property, canonically [[com.raquo.domtypes.generic.keys.Prop]]
  */
trait PropBuilder[P[_]] {

  /** Create a DOM Property */
  def prop[V](key: String, codec: Codec[V, _]): P[V]

  @inline def intProp(key: String): P[Int] = prop(key, IntAsIsCodec)

  @inline def doubleProp(key: String): P[Double] = prop(key, DoubleAsIsCodec)

  @inline def stringProp(key: String): P[String] = prop(key, StringAsIsCodec)
}
