package com.raquo.domtypes.generic.builders

/** TagBuilder is a builder of Tags, which themselves are builders of Elements. #factoryfactory */
trait TagBuilder[T[_ <: DomElement], DomElement] {

  @inline protected def tag[Ref <: DomElement](tagName: String): T[Ref] = {
    tag(tagName, void = false)
  }

  @inline protected def tag[Ref <: DomElement](tagName: String, void: Boolean): T[Ref]
}
