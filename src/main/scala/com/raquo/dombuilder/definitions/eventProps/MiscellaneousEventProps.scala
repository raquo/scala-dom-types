package com.raquo.dombuilder.definitions.eventProps

import com.raquo.dombuilder.builders.EventPropBuilder
import com.raquo.dombuilder.keys.EventProp
import org.scalajs.dom

/**
  * Miscellaneous Events
  */
trait MiscellaneousEventProps[N, DomEvent, Fun1[-_, +_]] {
  self: SharedEventProps[N, _, DomEvent, Fun1] with EventPropBuilder[N, DomEvent, Fun1] =>

  /**
    * Fires when a <menu> element is shown as a context menu
    */
  lazy val onShow: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("show")

  /**
    * Fires when the user opens or closes the <details> element
    */
  lazy val onToggle: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("toggle")
}
