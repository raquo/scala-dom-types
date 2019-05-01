package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.EventPropBuilder

/**
  * Miscellaneous Events
  *
  * For type param docs see [[EventPropBuilder]]
  */
trait MiscellaneousEventProps[EP[_ <: DomEvent], DomEvent, DomUIEvent <: DomEvent] { this: EventPropBuilder[EP, DomEvent] =>

  /**
    * The onload property of the GlobalEventHandlers mixin is an event handler
    * for the load event of a Window, XMLHttpRequest, <img> element, etc.,
    * which fires when the resource has loaded.
    *
    * https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onload
    */
  @inline final def onLoad: EP[DomUIEvent] = eventProp("load")

  /**
    * The GlobalEventHandlers.onresize property contains an EventHandler
    * triggered when a resize event is received.
    *
    * https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onresize
    */
  @inline final def onResize: EP[DomUIEvent] = eventProp("resize")

  /**
    * An event handler for scroll events on element.
    *
    * https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onscroll
    */
  @inline final def onScroll: EP[DomUIEvent] = eventProp("scroll")

  /**
    * Fires when a <menu> element is shown as a context menu
    */
  @inline final def onShow: EP[DomEvent] = eventProp("show")

  /**
    * Fires when the user opens or closes the <details> element
    */
  @inline final def onToggle: EP[DomEvent] = eventProp("toggle")
}
