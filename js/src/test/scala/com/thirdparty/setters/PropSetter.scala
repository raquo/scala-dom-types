package com.thirdparty.setters

import com.thirdparty.keys.Prop

case class PropSetter[Value](
  prop: Prop[Value],
  value: Value
) {

  def domValue: prop.DomV = prop.codec.encode(value)
}
