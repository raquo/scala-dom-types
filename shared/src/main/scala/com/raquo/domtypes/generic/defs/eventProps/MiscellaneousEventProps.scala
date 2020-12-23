package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.EventPropBuilder

/**
  * Miscellaneous Events
  *
  * For type param docs see [[EventPropBuilder]]
  */
trait MiscellaneousEventProps[
  EP[_ <: DomEvent],
  DomEvent,
  DomAnimationEvent <: DomEvent,
  DomUIEvent <: DomEvent
] { this: EventPropBuilder[EP, DomEvent] =>
  /**
    * An animationcancel event is sent when a CSS animation unexpectedly aborts, that is, any time it stops running
    * without sending an animationend event. This can happen, for example, when the animation-name is changed such
    * that the animation is removed, or when the animating node is hidden—either directly or because any of its
    * containing nodes are hidden—using CSS.
    *
    * MDN
    */
  lazy val onAnimationCancel: EP[DomAnimationEvent] = eventProp("animationcancel")

  /**
    * The animationend event is event fires when a CSS animation reaches the end of its active period.
    *
    * MDN
    */
  lazy val onAnimationEnd: EP[DomAnimationEvent] = eventProp("animationend")

  /**
    * The animationiteration event is sent when a CSS animation reaches the end of an iteration. An iteration ends
    * when a single pass through the sequence of animation instructions is completed by executing the last
    * animation step.
    *
    * MDN
    */
  lazy val onAnimationIteration: EP[DomAnimationEvent] = eventProp("animationiteration")

  /**
    * The animationstart event is sent when a CSS Animation starts to play.
    *
    * MDN
    */
  lazy val onAnimationStart: EP[DomAnimationEvent] = eventProp("animationstart")

  /**
    * The onload property of the GlobalEventHandlers mixin is an event handler
    * for the load event of a Window, XMLHttpRequest, <img> element, etc.,
    * which fires when the resource has loaded.
    *
    * https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onload
    */
  lazy val onLoad: EP[DomUIEvent] = eventProp("load")

  /**
    * The GlobalEventHandlers.onresize property contains an EventHandler
    * triggered when a resize event is received.
    *
    * https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onresize
    */
  lazy val onResize: EP[DomUIEvent] = eventProp("resize")

  /**
    * An event handler for scroll events on element.
    *
    * https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onscroll
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
