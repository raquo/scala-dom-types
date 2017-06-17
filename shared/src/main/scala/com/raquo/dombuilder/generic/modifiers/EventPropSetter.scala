package com.raquo.dombuilder.generic.modifiers

import com.raquo.dombuilder.generic.keys.EventProp
import com.raquo.dombuilder.generic.nodes.{EventfulNode, RefNode}

trait EventPropSetter[Ev, BaseRef] extends Modifier[EventfulNode[_, BaseRef, BaseRef]] {

  val key: EventProp[Ev]

  val value: Ev => Unit

  // @TODO[API] Provide a way to specify useCapture

  def domAddEventListener(
    toNode: EventfulNode[_, BaseRef, BaseRef] with RefNode[BaseRef],
    useCapture: Boolean = false
  ): Unit

  def domRemoveEventListener(
    fromNode: EventfulNode[_, BaseRef, BaseRef] with RefNode[BaseRef],
    useCapture: Boolean = false
  ): Unit

  override def applyTo(node: EventfulNode[_, BaseRef, BaseRef]): Unit = {
    node.addEventListener(this)
  }

  override def equals(that: Any): Boolean = {
    that match {
      case setter: EventPropSetter[_, _] if (key == setter.key) && (value == setter.value) => true
      case _ => false
    }
  }
}
