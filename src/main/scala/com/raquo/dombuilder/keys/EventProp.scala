package com.raquo.dombuilder.keys

import com.raquo.dombuilder.modifiers.EventPropSetter
import org.scalajs.dom

class EventProp[E <: dom.Event, N](val name: String) {

  def := (value: E => Unit): EventPropSetter[E, N] = {
    new EventPropSetter[E, N](this, value)
  }

  // @TODO[Performance] Check how much function wrapping is happening here (there's also "value _" in user code)
  def := (value: () => Unit): EventPropSetter[E, N] = {
    new EventPropSetter[E, N](this, _ => value())
  }

  def jsName: String = name.toLowerCase
}
