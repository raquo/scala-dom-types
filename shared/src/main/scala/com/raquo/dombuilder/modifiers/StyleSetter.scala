package com.raquo.dombuilder.modifiers

import com.raquo.dombuilder.keys.Style
import com.raquo.dombuilder.nodes.Element

class StyleSetter[V, N](
  val key: Style[V, N],
  val value: V
) extends Modifier[Element[N]] {

  override def applyTo(element: Element[N]): Unit = {
    element.elementApi.setStyle(element.ref, key.name, value)
  }
}
