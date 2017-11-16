package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.EventPropBuilder

/**
  * Miscellaneous Events
  *
  * For type param docs see [[EventPropBuilder]]
  */
trait MiscellaneousEventProps[EP[_ <: DomEvent], DomEvent, DomUIEvent <: DomEvent] { this: EventPropBuilder[EP, DomEvent] =>

  /**
    * The load event fires at the end of the document loading process. At this
    * point, all of the objects in the document are in the DOM, and all the
    * images and sub-frames have finished loading.
    *
    * MDN
    */
  lazy val onLoad: EP[DomUIEvent] = eventProp("onload")

  /**
    * Fires when the browser window is resized
    */
  lazy val onResize: EP[DomUIEvent] = eventProp("onresize")

  /**
    * Specifies the function to be called when the window is scrolled.
    *
    * MDN
    */
  lazy val onScroll: EP[DomUIEvent] = eventProp("scroll")

  /**
    * Fires when a <menu> element is shown as a context menu
    */
  lazy val onShow: EP[DomEvent] = eventProp("show")

  /**
    * Fires when the user opens or closes the <details> element
    */
  lazy val onToggle: EP[DomEvent] = eventProp("toggle")
}
