package com.raquo.dombuilder.generic.builders

trait BoundedBuilder[K[_ <: BaseValue], BaseValue] {
  @inline def build[V <: BaseValue](key: String): K[V]
}
