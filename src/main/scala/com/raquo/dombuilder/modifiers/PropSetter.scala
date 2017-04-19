package com.raquo.dombuilder.modifiers

import com.raquo.dombuilder.keys.Prop
import com.raquo.dombuilder.nodes.Node
import org.scalajs.dom

// @TODO[API] Thi shoould be generic in R

class PropSetter[V, N](
  val key: Prop[V, N],
  val value: V
) extends Modifier[Node[N, dom.Node]] {

  override def applyTo(node: Node[N, dom.Node]): Unit = {
    node.domapi.setProperty(node.ref, key.name, value)
  }
}
