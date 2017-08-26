package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.BoundedBuilder

trait ErrorEventProps[EP[_ <: DomEvent], DomEvent, DomErrorEvent <: DomEvent] { this: BoundedBuilder[EP, DomEvent] =>

  /**
    * Script to be run when an error occurs when the file is being loaded
    */
  lazy val onError: EP[DomErrorEvent] = build("onerror")
}
