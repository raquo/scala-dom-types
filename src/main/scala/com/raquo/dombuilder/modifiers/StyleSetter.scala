package com.raquo.dombuilder.modifiers

import com.raquo.dombuilder.keys.Style
import com.raquo.dombuilder.nodes.Element
// @TODO[SERVER]
import org.scalajs.dom

class StyleSetter[V, N](
  val key: Style[V, N],
  val value: V
) extends Modifier[Element[N, dom.Element, dom.Node]] {

  override def applyTo(element: Element[N, dom.Element, dom.Node]): Unit = {
    element.elementApi.setStyle(element.ref, key.name, value)
  }
}
