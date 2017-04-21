package com.raquo.dombuilder.modifiers

import com.raquo.dombuilder.keys.Attr
import com.raquo.dombuilder.nodes.{Element, Node}

// @TODO remove usages of Scala.js

class AttrSetter[V, N, DomElement](
  val key: Attr[V, N, DomElement],
  val value: V
) extends Modifier[Element[N, DomElement] with Node[N, DomElement]] {

  override def applyTo(node: Element[N, DomElement] with Node[N, DomElement]): Unit = {
    node.elementApi.setAttribute(node.ref, key.name, value)
  }
}
