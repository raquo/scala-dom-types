package com.thirdparty.keys

import com.thirdparty.codecs.Codec
import com.thirdparty.setters.PropSetter

case class Prop[Value, DomValue](
  domName: String,
  codec: Codec[Value, DomValue]
) {

  def := (value: Value): PropSetter[Value, DomValue] = new PropSetter(this, value)
}
