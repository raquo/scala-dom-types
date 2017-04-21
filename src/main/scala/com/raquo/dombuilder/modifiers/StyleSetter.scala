package com.raquo.dombuilder.modifiers

import com.raquo.dombuilder.keys.Style
import com.raquo.dombuilder.nodes.Element
import org.scalajs.dom

class StyleSetter[V, N](
  val key: Style[V, N],
  val value: V
) extends Modifier[Element[N, dom.Element]] {

  override def applyTo(element: Element[N, dom.Element]): Unit = {
    element.elementApi.setStyle(element.ref, key.name, value)
  }
}
