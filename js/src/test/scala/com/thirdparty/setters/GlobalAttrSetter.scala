package com.thirdparty.setters

import com.thirdparty.keys.GlobalAttr

case class GlobalAttrSetter[Value](
  prop: GlobalAttr[Value],
  value: Value
) {

  def domValue: String = prop.codec.encode(value)
}
