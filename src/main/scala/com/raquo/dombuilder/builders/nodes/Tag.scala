package com.raquo.dombuilder.builders.nodes

import com.raquo.dombuilder.nodes.Element

/** A Tag is an [[Element]] builder */
trait Tag[+El <: Element[N, BaseElementRef], N, BaseElementRef] extends NodeBuilder[El, N, BaseElementRef] {

  val tagName: String

  override def createNode(): El with N
}
