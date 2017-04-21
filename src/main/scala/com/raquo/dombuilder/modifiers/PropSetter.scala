package com.raquo.dombuilder.modifiers

import com.raquo.dombuilder.keys.Prop
import com.raquo.dombuilder.nodes.Node
// @TODO[SERVER]
import org.scalajs.dom

class PropSetter[V, N](
  val key: Prop[V, N],
  val value: V
) extends Modifier[Node[N, dom.Node]] {

  override def applyTo(node: Node[N, dom.Node]): Unit = {
    node.domapi.setProperty(node.ref, key.name, value)
  }
}
