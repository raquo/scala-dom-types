package com.thirdparty.setters

import com.thirdparty.keys.Prop

case class PropSetter[Value, DomValue](
  prop: Prop[Value, DomValue],
  value: Value
) {

  def domValue: DomValue = prop.codec.encode(value)
}
