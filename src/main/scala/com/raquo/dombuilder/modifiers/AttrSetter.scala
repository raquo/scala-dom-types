package com.raquo.dombuilder.modifiers

import com.raquo.dombuilder.keys.Attr
import com.raquo.dombuilder.nodes.Node
import org.scalajs.dom

class AttrSetter[V, N](
  val key: Attr[V, N],
  val value: V
) extends Modifier[Node[N, dom.Element]] {

  override def applyTo(node: Node[N, dom.Element]): Unit = {
    node.builder.domapi.setAttribute(node.ref, key.name, value)
  }
}
