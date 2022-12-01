package com.raquo.domtypes.old.fixtures.styles

import com.raquo.domtypes.old.fixtures.Modifier

class ExampleStyleSetter[V](
  val key: ExampleStyleProp[V],
  val value: String
) extends Modifier[Any]
