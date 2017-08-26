package com.raquo.dom.types.generic.builders

/** TagBuilder is a builder of Tags, which themselves are builders of Elements. #factoryfactory */
trait TagBuilder[T[_ <: DomElement], DomElement] extends BoundedBuilder[T, DomElement] {

  @inline override def build[Ref <: DomElement](tagName: String): T[Ref] = {
    build(tagName, void = false)
  }

  @inline def build[Ref <: DomElement](tagName: String, void: Boolean): T[Ref]
}
