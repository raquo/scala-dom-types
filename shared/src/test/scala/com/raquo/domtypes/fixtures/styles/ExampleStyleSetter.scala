package com.raquo.domtypes.fixtures.styles

import com.raquo.domtypes.fixtures.Modifier

class ExampleStyleSetter[V](
  val key: ExampleStyleProp[V],
  val value: String
) extends Modifier[Any]
