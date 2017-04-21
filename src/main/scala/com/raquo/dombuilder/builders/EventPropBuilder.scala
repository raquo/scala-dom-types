package com.raquo.dombuilder.builders

import com.raquo.dombuilder.domapi.EventApi
import com.raquo.dombuilder.keys.EventProp

trait EventPropBuilder[N, DomEvent, Fun1[-_, +_]] {

  val eventApi: EventApi[N, _, DomEvent, Fun1]

  @inline def eventProp[Ev <: DomEvent](key: String): EventProp[Ev, N, DomEvent, Fun1] = {
    new EventProp[Ev, N, DomEvent, Fun1](key, eventApi)
  }
}
