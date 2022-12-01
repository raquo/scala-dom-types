package com.thirdparty.keys

import com.thirdparty.setters.StyleSetter

import scala.scalajs.js.|

case class StyleProp[V](
  domName: String
) extends DerivedStylePropBuilder[DerivedStyleProp] {

  def := (value: V | String): StyleSetter[V] = StyleSetter(this, value.toString)

  def := (value: String): StyleSetter[V] = StyleSetter(this, value)

  override protected def derivedStyle[A](encode: A => String): DerivedStyleProp[A] = {
    new DerivedStyleProp[A](this, encode)
  }
}