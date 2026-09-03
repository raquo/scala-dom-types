package com.thirdparty.keys

import com.thirdparty.defs.styles.traits.GlobalKeywords
import com.thirdparty.setters.StyleSetter

import scala.language.implicitConversions

class StyleProp[V](
  val domName: String
)
extends StyleBuilder[StyleSetter[V, String]]
with DerivedStyleBuilder[DerivedStyleProp]
with GlobalKeywords[V] {

  def :=[ThisV <: V](value: ThisV): StyleSetter[V, ThisV] = StyleSetter(this, value)

  // #Note This overload is needed for Scala 2 (but it's also active in Scala 3)
  def :=[ThisV](value: ThisV)(implicit ev: ThisV => V): StyleSetter[V, V] =
    this := ev(value)

  // #nc work around this https://github.com/scala/scala3/issues/24305
  override def styleSetter(value: String): StyleSetter[V, String] = {
    new StyleSetter(this, value)
  }

  override protected def derivedStyle[A](encode: A => String): DerivedStyleProp[A] = {
    new DerivedStyleProp[A](this, encode)
  }
}

object StyleProp {

  // In CSS, every style prop can be set to a string value, and this allows it.
  // You need to make sure that your StyleProp implementation is safe with such a casting implicit conversion. See Laminar v18+ for example.
  // #Note - I think this is only needed for Scala 2. Scala 3 seems to be able to resolve our `StyleProp[V] := String` use case when the abstract V is actually `Int | String` just fine.
  implicit def stylePropToStringStyleProp[V](p: StyleProp[V]): StyleProp[String] = {
    p.asInstanceOf[StyleProp[String]]
  }
}
