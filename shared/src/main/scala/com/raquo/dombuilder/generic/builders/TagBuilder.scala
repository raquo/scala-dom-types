package com.raquo.dombuilder.generic.builders

trait TagBuilder[T[_ <: DomElement], DomElement] {
  @inline def build[Ref <: DomElement](tagName: String, void: Boolean = false): T[Ref]
}
