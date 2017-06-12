package com.raquo.dombuilder.builders

import com.raquo.dombuilder.modifiers.Modifier
import com.raquo.dombuilder.nodes.Node

trait NodeBuilder[+SpecificNode <: Node[N, Ref, DomNode], N, +Ref <: DomNode, DomNode] {

  def createNode(): SpecificNode with N

  def apply(modifiers: Modifier[SpecificNode]*): SpecificNode with N = {
    val element = createNode()
    modifiers.foreach(_.applyTo(element))
    element
  }
}
