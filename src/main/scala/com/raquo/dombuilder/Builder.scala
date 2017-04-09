package com.raquo.dombuilder

import com.raquo.dombuilder.domapi.JsDomApi
import com.raquo.dombuilder.nodes.{Comment, Element, Text}
import org.scalajs.dom

trait Builder[El <: Element[N], T <: Text[N], C <: Comment[N], N] {

  // @TODO[API] Genericize later
  val domapi: JsDomApi.type = JsDomApi

  @inline def attr[V](key: String): Attr[V, N] = {
    new Attr[V, N](key, this)
  }

  @inline def eventProp[Ev <: dom.raw.Event](key: String): EventProp[Ev, N] = {
    new EventProp[Ev, N](key, this)
  }

  @inline def prop[V](key: String): Prop[V, N] = {
    new Prop[V, N](key, this)
  }

  // @TODO[Integrity] we still use `new Style` in some places to support additional traits e.g. `with MarginAuto`
  @inline def style[V](jsKey: String, cssKey: String): Style[V, N] = {
    new Style[V, N](jsKey, cssKey, this)
  }

  def mount(container: dom.Element, element: El): Root[N] = {
    new Root[N](container, element)
  }

  def unmount(container: dom.Element, element: El): Unit = {
    container.removeChild(element.ref)
  }

  def element(tagName: String): El

  def textNode(text: String): T

  def commentNode(text: String): C
}
