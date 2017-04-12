package com.raquo.dombuilder.modifiers

import com.raquo.dombuilder.keys.Style
import com.raquo.dombuilder.nodes.Node
import org.scalajs.dom

class StyleSetter[V, N](
  val key: Style[V, N],
  val value: V
) extends Modifier[Node[N, dom.Element]] {

  override def applyTo(node: Node[N, dom.Element]): Unit = {
    node.builder.domapi.setStyle(node.ref, key.name, value)
  }
}
