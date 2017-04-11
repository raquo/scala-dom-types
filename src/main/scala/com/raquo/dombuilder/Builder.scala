package com.raquo.dombuilder

import com.raquo.dombuilder.domapi.JsDomApi
import com.raquo.dombuilder.nodes.{Comment, Element, Text}
import org.scalajs.dom

// @TODO[API] These two classes need a better name. DOMBuilder or soemthing?

trait Builder[N] {

  // @TODO[API] Genericize later
  val domapi: JsDomApi.type = JsDomApi

  @inline def attr[V](key: String): Attr[V, N] = {
    new Attr[V, N](key, this)
  }

  @inline def eventProp[Ev <: dom.Event](key: String): EventProp[Ev, N] = {
    new EventProp[Ev, N](key, this)
  }

  @inline def prop[V](key: String): Prop[V, N] = {
    new Prop[V, N](key, this)
  }

  // @TODO[Integrity] we still use `new Style` in some places to support additional traits e.g. `with MarginAuto`
  @inline def style[V](jsKey: String, cssKey: String): Style[V, N] = {
    new Style[V, N](jsKey, cssKey, this)
  }

  def mount(container: dom.Element, element: Element[N]): Root[N] = {
    new Root[N](container, element)
  }

  def unmount(container: dom.Element, element: Element[N]): Unit = {
    container.removeChild(element.ref)
  }
}

trait NodeBuilder[+El <: Element[N], +T <: Text[N], +C <: Comment[N], N] {

  def element(tagName: String): El with N

  def textNode(text: String): T with N

  def commentNode(text: String): C with N
}

trait HasBuilder[N] {
  val builder: Builder[N]
}

trait HasNodeBuilder[+El <: Element[N], +T <: Text[N], +C <: Comment[N], N] {
  val nodeBuilder: NodeBuilder[El, T, C, N]
}
