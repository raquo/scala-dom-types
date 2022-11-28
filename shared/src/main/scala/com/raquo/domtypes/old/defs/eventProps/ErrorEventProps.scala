package com.raquo.domtypes.old.defs.eventProps

import com.raquo.domtypes.old.builders.EventPropBuilder

/**
  * For type param docs see [[EventPropBuilder]]
  */
trait ErrorEventProps[EP[_ <: DomEvent], DomEvent, DomErrorEvent <: DomEvent] { this: EventPropBuilder[EP, DomEvent] =>

  /**
    * Script to be run when an error occurs when the file is being loaded
    */
  lazy val onError: EP[DomErrorEvent] = eventProp("error")
}
