package com.raquo.dombuilder

import com.raquo.dombuilder.nodes.Element
import org.scalajs.dom

/**
  * A [[Key]] Represents the left hand side of [[Setter]]s, e.g. an attribute (without a value)
  */
trait Key[V, N, S <: Setter[_, V, N, S]] {

  val name: String

  val builder: Builder[N]

  /** Create a [[Setter]] */
  def := (value: V): S
}

class Attr[V, N] (
  val name: String,
  val builder: Builder[N]
) extends Key[V, N, AttrSetter[V, N]] {

  override def := (value: V): AttrSetter[V, N] =
    new AttrSetter[V, N](this, value)
}

class EventProp[E <: dom.raw.Event, N] (
  val name: String,
  val builder: Builder[N]
) extends Key[E => Unit, N, EventPropSetter[E, N]] {

  override def := (value: E => Unit): EventPropSetter[E, N] = {
    new EventPropSetter[E, N](this, value)
  }

  // @TODO[Performance] Check how much function wrapping is happening here (there's also "value _" in user code)
  @inline def := (value: () => Unit): EventPropSetter[E, N] = {
    := (_ => value())
  }

  def jsName: String = name.toLowerCase
}

class Prop[V, N] (
  val name: String,
  val builder: Builder[N]
) extends Key[V, N, PropSetter[V, N]] {

  override def := (value: V): PropSetter[V, N] =
    new PropSetter[V, N](this, value)
}

class Style[V, N] (
  val name: String,
  val cssName: String, // @TODO[API] Will anyone need cssName, ever? Maybe let's remove it
  val builder: Builder[N]
) extends Key[V, N, StyleSetter[V, N]] {

  override def := (value: V): StyleSetter[V, N] =
    new StyleSetter[V, N](this, value)
}
