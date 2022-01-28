package com.raquo.domtypes.fixtures.styles

class ExampleDerivedStyleProp[InputV, StyleV](
  val key: ExampleStyleProp[StyleV],
  val encode: InputV => String
) {

  def := (value: InputV): ExampleStyleSetter[StyleV] = {
    new ExampleStyleSetter[StyleV](key, encode(value))
  }
}

object ExampleDerivedStyleProp {

  type Base[V] = ExampleDerivedStyleProp[V, _]
}
