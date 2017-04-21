package com.raquo.dombuilder.definitions.eventProps

import com.raquo.dombuilder.builders.EventPropBuilder
import com.raquo.dombuilder.keys.EventProp

trait SharedEventProps[N, DomErrorEvent <: DomEvent, DomEvent, Fun1[-_, +_]] {
  this: EventPropBuilder[N, DomEvent, Fun1] =>

  /**
    * Script to be run when an error occurs when the file is being loaded
    */
  lazy val onerror: EventProp[DomErrorEvent, N, DomEvent, Fun1] = eventProp("onerror")
}
