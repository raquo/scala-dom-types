package com.raquo.dom.types.generic.defs.eventProps

import com.raquo.dom.types.generic.builders.BoundedBuilder

trait ErrorEventProps[P[_ <: DomEvent], DomEvent, DomErrorEvent <: DomEvent] { this: BoundedBuilder[P, DomEvent] =>

  /**
    * Script to be run when an error occurs when the file is being loaded
    */
  lazy val onError: P[DomErrorEvent] = build("onerror")
}
