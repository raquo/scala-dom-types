package com.raquo.domtypes.fixtures.styles

import com.raquo.domtypes.fixtures.keys.Key
import com.raquo.domtypes.old.builders.{DerivedStylePropBuilder, StyleStringValueBuilder}

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

  // #TODO[Performance] We could use JavaScript native string replace, don't need to bring in java.lang machinery for that
  //  Although it's kinda inevitable in any real user code anyway, so not much of a problem in practice.

  override protected def encodeUrlValue(url: String): String = {
    // #Note: I haven't tested this, Laminar has a different, JS-specific implementation
    val escaped = url.replace("\\", "%5C").replace("\"", "%22").replace("\n", " ").replace("\r", " ").replace("\f", " ")
    s""""${escaped}""""
  }

  override protected def encodeCalcValue(exp: String): String = {
    // #Note: I haven't tested this, Laminar has a different, JS-specific implementation
    exp.replace("\\", " ").replace("\"", " ").replace(";", " ").replace("\n", " ").replace("\r", " ").replace("\f", " ")
  }

  def withPrefixes(ps: String*): ExampleStyleProp[V] = {
    new ExampleStyleProp[V](name, ps)
  }

  def := (value: V): ExampleStyleSetter[V] = {
    new ExampleStyleSetter(this, value.toString)
  }
}
