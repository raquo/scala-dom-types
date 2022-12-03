package com.thirdparty.keys

import com.thirdparty.codecs.Codec
import com.thirdparty.setters.PropSetter

class Prop[Value, DomValue](
  val domName: String,
  val codec: Codec[Value, DomValue]
) {

  def := (value: Value): PropSetter[Value, DomValue] = new PropSetter(this, value)
}
