package com.thirdparty.keys

import com.thirdparty.codecs.Codec
import com.thirdparty.setters.PropSetter

abstract class Prop[V](
  val domPropName: String,
  val domReflectedAttrName: Option[String]
) {
  type DomV

  val codec: Codec[V, DomV]

  def :=(value: V): PropSetter[V] = new PropSetter(this, value)
}

object Prop {
  def apply[V, _DomV](
    name: String,
    reflectedAttrName: Option[String],
    codec: Codec[V, _DomV]
  ): Prop[V] { type DomV = _DomV } = {
    val _codec = codec
    new Prop[V](name, reflectedAttrName) {
      type DomV = _DomV
      override val codec: Codec[V, DomV] = _codec
    }
  }
}
