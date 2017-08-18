package com.raquo.dombuilder.dombuilder.generic.modifiers

import com.raquo.dombuilder.dombuilder.generic.nodes.Element
import com.raquo.dombuilder.dombuilder.generic.keys.Style

class StyleSetter[V](
  val key: Style[V],
  val value: V
) extends Modifier[Element] {

  override def applyTo(element: Element): Unit = {
    element.setStyle(key.name, value)
  }
}
