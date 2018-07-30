package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.EventPropBuilder

/**
  * Document Events
  *
  * For type param docs see [[EventPropBuilder]]
  */
trait DocumentOnlyEventProps[EP[_ <: DomEvent], DomEvent] { this: EventPropBuilder[EP, DomEvent] =>

  /**
   * The visibilitychange event is fired when the content of a tab has become visible or has been hidden.
   *
   * MDN
   */
  lazy val onVisibilityChange: EP[DomEvent] = eventProp("visibilitychange")
}
