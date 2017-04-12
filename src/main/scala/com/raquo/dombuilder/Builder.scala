package com.raquo.dombuilder

import com.raquo.dombuilder.domapi.JsDomApi
import com.raquo.dombuilder.keys.{Attr, EventProp, Prop, Style}
import com.raquo.dombuilder.nodes.{Comment, Element, Node, Text}
import org.scalajs.dom

// @TODO[API] These two classes need a better name. DOMBuilder or soemthing?

trait Builder[N] {

  // @TODO[API] Genericize later
  val domapi: JsDomApi.type = JsDomApi

  @inline def attr[V](key: String): Attr[V, N] = {
    new Attr[V, N](key)
  }

  @inline def eventProp[Ev <: dom.Event](key: String): EventProp[Ev, N] = {
    new EventProp[Ev, N](key)
  }

  @inline def prop[V](key: String): Prop[V, N] = {
    new Prop[V, N](key)
  }

  // @TODO[Integrity] we still use `new Style` in some places to support additional traits e.g. `with MarginAuto`
  @inline def style[V](jsKey: String, cssKey: String): Style[V, N] = {
    new Style[V, N](jsKey, cssKey)
  }

  def mount(container: dom.Element, node: Node[N, dom.Node]): Root[N, dom.Node] = {
    new Root[N, dom.Node](container, node, this)
  }

  def unmount(container: dom.Element, node: Node[N, dom.Node]): Unit = {
    container.removeChild(node.ref)
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
