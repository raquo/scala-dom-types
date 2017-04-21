package com.raquo.dombuilder.builders

import com.raquo.dombuilder.nodes.Element

/** A Tag is an [[Element]] builder */
trait Tag[+El <: Element[N, DomElement], N, DomElement] extends NodeBuilder[El, N, DomElement] {

  val tagName: String

  override def createNode(): El with N
}
