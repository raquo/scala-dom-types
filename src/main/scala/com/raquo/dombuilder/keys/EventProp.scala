package com.raquo.dombuilder.keys

import com.raquo.dombuilder.domapi.EventApi
import com.raquo.dombuilder.modifiers.EventPropSetter

class EventProp[E <: DomEvent, N, DomEvent, Fun1[-_, +_]](
  val name: String,
  val eventApi: EventApi[N, _, DomEvent, Fun1]
) {

  def := (value: E => Unit): EventPropSetter[E, N, DomEvent, Fun1] = {
    new EventPropSetter[E, N, DomEvent, Fun1](this, value, eventApi)
  }

  // @TODO[Performance] Check how much function wrapping is happening here (there's also "value _" in user code)
  def := (value: () => Unit): EventPropSetter[E, N, DomEvent, Fun1] = {
    new EventPropSetter[E, N, DomEvent, Fun1](this, _ => value(), eventApi)
  }

  def domName: String = name.toLowerCase
}
