package com.raquo.dombuilder.modifiers

import com.raquo.dombuilder.keys.Attr
import com.raquo.dombuilder.nodes.{Element, Node}
import org.scalajs.dom

// @TODO remove usages of Scala.js

class AttrSetter[V, N](
  val key: Attr[V, N],
  val value: V
) extends Modifier[Element[N, dom.Element] with Node[N, dom.Element]] {

  override def applyTo(node: Element[N, dom.Element] with Node[N, dom.Element]): Unit = {
    node.elementApi.setAttribute(node.ref, key.name, value)
  }
}
