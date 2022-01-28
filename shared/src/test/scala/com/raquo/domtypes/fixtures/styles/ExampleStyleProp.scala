package com.raquo.domtypes.fixtures.styles

import com.raquo.domtypes.fixtures.keys.Key
import com.raquo.domtypes.generic.builders.{DerivedStylePropBuilder, StyleStringValueBuilder}

class ExampleStyleProp[V](
  override val name: String,
  val prefixes: Seq[String] = Nil
) extends Key with StyleStringValueBuilder[ExampleStyleSetter[V]] with DerivedStylePropBuilder[ExampleDerivedStyleProp.Base] {

  type StyleV = V

  override protected def buildStringValue(value: String): ExampleStyleSetter[V] = {
    new ExampleStyleSetter[V](this, value)
  }

  override protected def valueAsString(value: ExampleStyleSetter[V]): String = {
    value.value
  }

  override protected def derivedStyle[InputV](encode: InputV => String): ExampleDerivedStyleProp[InputV, V] = {
    new ExampleDerivedStyleProp[InputV, V](this, encode)
  }

  def withPrefixes(ps: String*): ExampleStyleProp[V] = {
    new ExampleStyleProp[V](name, ps)
  }

  def := (value: V): ExampleStyleSetter[V] = {
    new ExampleStyleSetter(this, value.toString)
  }
}
