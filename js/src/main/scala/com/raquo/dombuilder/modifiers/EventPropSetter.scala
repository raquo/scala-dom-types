package com.raquo.dombuilder.modifiers

import com.raquo.dombuilder.domapi.EventApi
import com.raquo.dombuilder.keys.EventProp
import com.raquo.dombuilder.nodes.EventfulNode
import org.scalajs.dom

import scala.scalajs.js

class EventPropSetter[Ev <: dom.Event, N](
  val key: EventProp[Ev, N],
  val value: Ev => Unit,
  val eventApi: EventApi
) extends Modifier[EventfulNode[N, dom.Node]] {

  /** To make sure that you remove the event listener successfully, you need to provide
    * a correct reference to the Javascript callback function. However, the translation
    * from a scala function to a JS function creates a new Javascript function every time,
    * so we need to perform that translation only once and save the result.
    */
  val domValue: js.Function1[Ev, Unit] = value

  // @TODO[API] Provide a way to specify useCapture

  override def applyTo(node: EventfulNode[N, dom.Node]): Unit = {
    node.addEventListener(this)
  }

  override def equals(that: Any): Boolean = {
    that match {
      case setter: EventPropSetter[_, N] if (key == setter.key) && (value == setter.value) => true
      case _ => false
    }
  }
}
