package com.raquo.dombuilder.jsdom.modifiers

import com.raquo.dombuilder.generic
import com.raquo.dombuilder.jsdom.keys.EventProp
import org.scalajs.dom

import scala.scalajs.js

class EventPropSetter[Ev <: dom.Event](
  override val key: EventProp[Ev],
  override val value: Ev => Unit
) extends generic.modifiers.EventPropSetter[Ev, dom.Node] {

  type GenericEventfulNode = generic.nodes.EventfulNode[_, dom.Node, dom.Node] with generic.nodes.RefNode[dom.Node]

  /** To make sure that you remove the event listener successfully, you need to provide
    * a correct reference to the Javascript callback function. However, the translation
    * from a scala function to a JS function creates a new Javascript function every time,
    * so we need to perform that translation only once and save the result.
    */
  val domValue: js.Function1[Ev, Unit] = value

  override def domAddEventListener(
    toNode: GenericEventfulNode,
    useCapture: Boolean = false
  ): Unit = {
    toNode.ref.addEventListener(key.domName, listener = domValue, useCapture)
  }

  override def domRemoveEventListener(
    fromNode: GenericEventfulNode,
    useCapture: Boolean = false
  ): Unit = {
    fromNode.ref.removeEventListener(key.domName, listener = domValue, useCapture)
  }

  override def applyTo(node: generic.nodes.EventfulNode[_, dom.Node, dom.Node]): Unit = {
    node.addEventListener(this)
  }

  override def equals(that: Any): Boolean = {
    that match {
      case setter: EventPropSetter[_] if (key == setter.key) && (value == setter.value) => true
      case _ => false
    }
  }
}
