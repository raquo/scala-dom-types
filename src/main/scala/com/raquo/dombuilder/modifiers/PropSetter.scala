package com.raquo.dombuilder.modifiers

import com.raquo.dombuilder.DNode
import com.raquo.dombuilder.keys.Prop
import com.raquo.dombuilder.nodes.Node

class PropSetter[V, N](
  val key: Prop[V, N],
  val value: V
) extends Modifier[Node[N, DNode, DNode]] {

  override def applyTo(node: Node[N, DNode, DNode]): Unit = {
    node.nodeApi.setProperty(node.ref, key.name, value)
  }
}
