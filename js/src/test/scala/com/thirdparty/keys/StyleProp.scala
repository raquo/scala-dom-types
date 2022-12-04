package com.thirdparty.keys

import com.thirdparty.defs.styles.traits.GlobalKeywords
import com.thirdparty.setters.StyleSetter

import scala.scalajs.js.|

case class StyleProp[V](
  val domName: String
) extends DerivedStyleBuilder[StyleSetter[_], DerivedStyleProp] with GlobalKeywords {

  def := (value: V | String): StyleSetter[V] = StyleSetter(this, value.toString)

  def := (value: String): StyleSetter[V] = StyleSetter(this, value)

  override protected def styleSetter(value: String): StyleSetter[_] = this := value

  override protected def derivedStyle[A](encode: A => String): DerivedStyleProp[A] = {
    new DerivedStyleProp[A](this, encode)
  }
}
