package com.raquo.dombuilder.modifiers

import com.raquo.dombuilder.keys.Attr
import com.raquo.dombuilder.nodes.Element

class AttrSetter[V, N, DomElement <: DomNode, DomNode](
  val key: Attr[V, N, DomElement, DomNode],
  val value: V
) extends Modifier[Element[N, DomElement, DomNode]] {

  override def applyTo(node: Element[N, DomElement, DomNode]): Unit = {
    node.elementApi.setAttribute(node.ref, key.name, value)
  }
}
