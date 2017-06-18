package com.raquo.dombuilder.generic.builders

trait TagBuilder[T[_ <: DomElement], DomElement] extends BoundedBuilder[T, DomElement] {

  @inline override def build[Ref <: DomElement](tagName: String): T[Ref] = {
    build(tagName, void = false)
  }

  @inline def build[Ref <: DomElement](tagName: String, void: Boolean): T[Ref]
}
