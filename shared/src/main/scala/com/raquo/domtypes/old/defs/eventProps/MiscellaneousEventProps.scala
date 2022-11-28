package com.raquo.domtypes.old.defs.eventProps

import com.raquo.domtypes.old.builders.EventPropBuilder

/**
  * Miscellaneous Events
  *
  * For type param docs see [[EventPropBuilder]]
  */
trait MiscellaneousEventProps[
  EP[_ <: DomEvent],
  DomEvent,
  DomAnimationEvent <: DomEvent,
  DomTransitionEvent <: DomEvent,
  DomUIEvent <: DomEvent
] { this: EventPropBuilder[EP, DomEvent] =>

  /**
    * The animationend event is event fires when a CSS animation reaches the end of its active period.
    *
    * https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/animationend_event
    */
  lazy val onAnimationEnd: EP[DomAnimationEvent] = eventProp("animationend")

  /**
    * The animationiteration event is sent when a CSS animation reaches the end of an iteration. An iteration ends
    * when a single pass through the sequence of animation instructions is completed by executing the last
    * animation step.
    *
    * https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/animationiteration_event
    */
  lazy val onAnimationIteration: EP[DomAnimationEvent] = eventProp("animationiteration")

  /**
    * The animationstart event is sent when a CSS Animation starts to play.
    *
    * https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/animationstart_event
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

  /**
    * The `transitionend` event is sent to when a CSS transition completes.
    *
    * @note If the transition is removed from its target node before the transition completes execution, the
    *       `transitionend` event won't be generated. One way this can happen is by changing the value of the
    *       `transition-property` attribute which applies to the target. Another is if the `display` attribute is set to
    *       `none`.
    *
    * @see [[https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontransitionend MDN]]
    */
  lazy val onTransitionEnd: EP[DomEvent] = eventProp("transitionend")
}
