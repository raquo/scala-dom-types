package com.raquo.dombuilder.modifiers

import com.raquo.dombuilder.keys.Prop
import com.raquo.dombuilder.nodes.Element

class PropSetter[V, N](
  val key: Prop[V, N],
  val value: V
) extends Modifier[Element[N]] {

  override def applyTo(node: Element[N]): Unit = {
    node.elementApi.setProperty(node.ref, key.name, value)
  }
}
