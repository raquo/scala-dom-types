package com.raquo.dombuilder.dombuilder.generic.modifiers

import com.raquo.dombuilder.dombuilder.generic.keys.Prop
import com.raquo.dombuilder.dombuilder.generic.nodes.Element

class PropSetter[V](
  val key: Prop[V],
  val value: V
) extends Modifier[Element] {

  override def applyTo(element: Element): Unit = {
    element.setProperty(key.name, value)
  }
}
