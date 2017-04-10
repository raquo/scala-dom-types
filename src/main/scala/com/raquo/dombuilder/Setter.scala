package com.raquo.dombuilder

import com.raquo.dombuilder.nodes.{Element, Node}
import org.scalajs.dom

/**
  * Represents a key-value modifier that can be applied to a [[Element]]
  * to set e.g. an attribute to a particular value
  *
  * This is in contrast to e.g. a [[Element]], which does not *set* anything,
  * but *appends* to Children. A Setter is an idempotent [[Modifier]].
  */
trait Setter[K <: Key[V, N, Self], V, N, Self <: Setter[K, V, N, Self]]
  extends Modifier[Element[N]]
{
  val key: K
  val value: V
}

class AttrSetter[V, N](
  val key: Attr[V, N],
  val value: V
) extends Setter[Attr[V, N], V, N, AttrSetter[V, N]] {

  override def applyTo(element: Element[N]): Unit = {
    key.builder.domapi.setAttribute(element.ref, key.name, value)
  }
}

class EventPropSetter[Ev <: dom.raw.Event, N](
  val key: EventProp[Ev, N],
  val value: Ev => Unit
) extends Setter[EventProp[Ev, N], Ev => Unit, N, EventPropSetter[Ev, N]] {

  override def applyTo(element: Element[N]): Unit = {
    key.builder.domapi.setEventProp(element.ref, key.jsName, value)
  }
}

class PropSetter[V, N](
  val key: Prop[V, N],
  val value: V
) extends Setter[Prop[V, N], V, N, PropSetter[V, N]] {

  override def applyTo(element: Element[N]): Unit = {
    key.builder.domapi.setProp(element.ref, key.name, value)
  }
}

class StyleSetter[V, N](
  val key: Style[V, N],
  val value: V
) extends Setter[Style[V, N], V, N, StyleSetter[V, N]] {

  override def applyTo(element: Element[N]): Unit = {
    // @TODO[API] Is there a better way to achieve this?
    element.ref match {
      case domElement: dom.html.Element =>
        key.builder.domapi.setStyle(domElement, key.name, value)
    }
  }
}
