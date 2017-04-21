package com.raquo.dombuilder.builders.nodes

import com.raquo.dombuilder.modifiers.Modifier
import com.raquo.dombuilder.nodes.Node

trait NodeBuilder[+SpecificNode <: Node[N, R], N, +R] {

  def createNode(): SpecificNode with N

  def apply(modifiers: Modifier[SpecificNode]*): SpecificNode with N = {
    val element = createNode()
    // @TODO[Performance] Use while loop? Check optimized code.
    modifiers.foreach(_.applyTo(element))
    element
  }
}
