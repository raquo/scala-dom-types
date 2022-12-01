package com.thirdparty.keys

import com.thirdparty.setters.StyleSetter

/**
  * This class represents derived style props like `height.px` or `backgroundImage.url`.
  * It lets you write values of a different type into a CSS property, by encoding them
  * into the appropriate format (e.g. `padding.px := 12` instead of padding := "12px")
  */
class DerivedStyleProp[InputV](
  val key: StyleProp[_],
  val encode: InputV => String
) {

  def :=(value: InputV): StyleSetter[_] = {
    new StyleSetter(key, encode(value))
  }
}
