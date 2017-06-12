package com.raquo.dombuilder.builders

import com.raquo.dombuilder.domapi.EventApi
import com.raquo.dombuilder.keys.EventProp
import org.scalajs.dom

trait EventPropBuilder[N] {

  val eventApi: EventApi

  @inline def eventProp[Ev <: dom.Event](key: String): EventProp[Ev, N] = {
    new EventProp[Ev, N](key, eventApi)
  }
}
