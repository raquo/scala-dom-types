package com.raquo.dombuilder.modifiers

import com.raquo.dombuilder.keys.Attr
import com.raquo.dombuilder.nodes.Element

class AttrSetter[V, N](
  val key: Attr[V, N],
  val value: V
) extends Modifier[Element[N]] {

  override def applyTo(node: Element[N]): Unit = {
    node.elementApi.setAttribute(node.ref, key.name, value)
  }
}
