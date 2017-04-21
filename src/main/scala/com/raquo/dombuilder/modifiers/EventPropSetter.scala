package com.raquo.dombuilder.modifiers

import com.raquo.dombuilder.domapi.EventApi
import com.raquo.dombuilder.keys.EventProp
import com.raquo.dombuilder.nodes.EventfulNode

class EventPropSetter[Ev <: DomEvent, N, DomEvent, Fun1[-_, +_]](
  val key: EventProp[Ev, N, DomEvent, Fun1],
  val value: Ev => Unit,
  val eventApi: EventApi[N, _, DomEvent, Fun1]
) extends Modifier[EventfulNode[N, _, _, DomEvent, Fun1]] {

  /** To make sure that you remove the event listener successfully, you need to provide
    * a correct reference to the Javascript callback function. However, the translation
    * from a scala function to a JS function creates a new Javascript function every time,
    * so we need to perform that translation only once and save the result.
    */
  val domValue: Fun1[Ev, Unit] = eventApi.toDomFun(value)

  // @TODO[API] Provide a way to specify useCapture

  override def applyTo(node: EventfulNode[N, _, _, DomEvent, Fun1]): Unit = {
    node.addEventListener(this)
  }

  override def equals(that: Any): Boolean = {
    that match {
      case setter: EventPropSetter[_, N, _, _] if (key == setter.key) && (value == setter.value) => true
      case _ => false
    }
  }
}
