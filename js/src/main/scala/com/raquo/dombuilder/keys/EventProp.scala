package com.raquo.dombuilder.keys

import com.raquo.dombuilder.domapi.EventApi
import com.raquo.dombuilder.modifiers.EventPropSetter
import org.scalajs.dom

class EventProp[Ev <: dom.Event, N](
  val name: String,
  val eventApi: EventApi
) {

  def := (value: Ev => Unit): EventPropSetter[Ev, N] = {
    new EventPropSetter[Ev, N](this, value, eventApi)
  }

  // @TODO[Performance] Check how much function wrapping is happening here (there's also "value _" in user code)
  def := (value: () => Unit): EventPropSetter[Ev, N] = {
    new EventPropSetter[Ev, N](this, _ => value(), eventApi)
  }

  def domName: String = name.toLowerCase
}
