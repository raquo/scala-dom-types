package com.raquo.dom.types.generic.builders

trait BoundedBuilder[K[_ <: BaseValue], BaseValue] {
  @inline def build[V <: BaseValue](key: String): K[V]
}
