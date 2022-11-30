package com.thirdparty.keys

import com.thirdparty.setters.StyleSetter

import scala.scalajs.js.|

case class StyleProp[V](
  domName: String
) {

  def := (value: V | String): StyleSetter[V] = StyleSetter(this, value)

  def := (value: String): StyleSetter[V] = StyleSetter(this, value)
}
