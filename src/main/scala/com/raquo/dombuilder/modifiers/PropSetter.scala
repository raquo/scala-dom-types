package com.raquo.dombuilder.modifiers

import com.raquo.dombuilder.keys.Prop
import com.raquo.dombuilder.nodes.Node
import org.scalajs.dom

class PropSetter[V, N](
  val key: Prop[V, N],
  val value: V
) extends Modifier[Node[N, dom.Element]] {

  override def applyTo(node: Node[N, dom.Element]): Unit = {
    node.builder.domapi.setProperty(node.ref, key.name, value)
  }
}
