package com.thirdparty.setters

import com.thirdparty.keys.StyleProp

import scala.scalajs.js.|

case class StyleSetter[V](prop: StyleProp[V], value: V | String)
