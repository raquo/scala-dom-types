package com.thirdparty.setters

import com.thirdparty.keys.HtmlAttr

case class HtmlAttrSetter[Value](
  prop: HtmlAttr[Value],
  value: Value
) {

  def domValue: String = prop.codec.encode(value)
}
