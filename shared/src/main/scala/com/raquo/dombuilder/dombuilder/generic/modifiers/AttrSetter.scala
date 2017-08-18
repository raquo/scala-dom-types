package com.raquo.dombuilder.dombuilder.generic.modifiers

import com.raquo.dombuilder.dombuilder.generic.keys.Attr
import com.raquo.dombuilder.dombuilder.generic.nodes.Element

class AttrSetter[V](
  val key: Attr[V],
  val value: V
) extends Modifier[Element] {

  override def applyTo(element: Element): Unit = {
    element.setAttribute(key.name, value)
  }
}
