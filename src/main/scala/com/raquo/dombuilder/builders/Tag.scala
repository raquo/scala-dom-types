package com.raquo.dombuilder.builders

import com.raquo.dombuilder.nodes.Element

/** A Tag is an [[Element]] builder */
trait Tag[+El <: Element[N, DomElement, DomNode], N, DomElement <: DomNode, DomNode] extends NodeBuilder[El, N, DomElement, DomNode] {

  val tagName: String

  override def createNode(): El with N
}
