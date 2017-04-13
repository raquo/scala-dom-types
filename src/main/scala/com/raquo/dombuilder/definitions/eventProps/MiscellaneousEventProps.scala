package com.raquo.dombuilder.definitions.eventProps

import com.raquo.dombuilder.builders.EventPropBuilder
import com.raquo.dombuilder.keys.EventProp
import org.scalajs.dom

/**
  * Miscellaneous Events
  */
trait MiscellaneousEventProps[N] extends SharedEventProps[N] { self: EventPropBuilder[N] =>

  /**
    * Fires when a <menu> element is shown as a context menu
    */
  lazy val onShow: EventProp[dom.Event, N] = eventProp("show")
  /**
    * Fires when the user opens or closes the <details> element
    */
  lazy val onToggle: EventProp[dom.Event, N] = eventProp("toggle")
}
