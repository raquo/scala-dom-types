package com.raquo.dombuilder.modifiers

import com.raquo.dombuilder.keys.EventProp
import com.raquo.dombuilder.nodes.EventfulNode
import org.scalajs.dom

import scala.scalajs.js

class EventPropSetter[Ev <: dom.Event, N](
  val key: EventProp[Ev, N],
  val value: Ev => Unit
) extends Modifier[EventfulNode[N, dom.Element]] {

  /** To make sure that you remove the event listener successfully, you need to provide
    * a correct reference to the Javascript callback function. However, the translation
    * from a scala function to a JS function creates a new Javascript function every time,
    * so we need to perform that translation only once.
    */
  val jsValue: js.Function1[Ev, Unit] = value

  // @TODO[API] Provide a way to specify useCapture
  // @TODO[API] Remove the Elemnt[N] type from here

  override def applyTo(element: EventfulNode[N, dom.Element]): Unit = {
    element.addEventListener(this)
  }

  override def equals(that: Any): Boolean = {
    that match {
      case eps: EventPropSetter[_, _] if (key == eps.key) && (value == eps.value) => true
      case _ => false
    }
  }
}
