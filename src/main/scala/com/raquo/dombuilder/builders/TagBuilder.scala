package com.raquo.dombuilder.builders

import com.raquo.dombuilder.nodes.Element

/** A [[Tag]] is an [[Element]] Builder. This is a builder of [[Tag]]s. */
trait TagBuilder[+El <: Element[N, DomElement, DomNode], N, DomElement <: DomNode, DomNode] {

  def tag(tagName: String): Tag[El, N, DomElement, DomNode]
}
