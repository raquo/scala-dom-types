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
  DomTransitionEvent <: DomEvent,
  DomUIEvent <: DomEvent
] { this: EventPropBuilder[EP, DomEvent] =>

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

  /**
    * '''Check the Browser compatibility table carefully before using this in production.'''
    */
  object experimental {

    /**
      * An `animationcancel` event is sent when a CSS animation unexpectedly aborts, that is, any time it stops running
      * without sending an `animationend` event. This can happen, for example, when the `animation-name` is changed such
      * that the animation is removed, or when the animating node is hidden—either directly or because any of its
      * containing nodes are hidden—using CSS.
      *
      * @see [[https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationcancel#Browser_compatibility Browser compatibility]]
      */
    lazy val onAnimationCancel: EP[DomAnimationEvent] = eventProp("animationcancel")

    /**
      * The `transitioncancel` event is sent when a CSS transition is cancelled. The transition is cancelled when:
      *
      *  - The value of the `transition-property` property that applies to the `target` is changed
      *  - The `display` property is set to "none".
      *  - The transition is stopped before it has run to completion, e.g. by moving the mouse off a hover-transitioning
      *  element.
      *
      * @see [[https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontransitioncancel#Browser_compatibility Browser compatibility]]
      */
    lazy val onTransitionCancel: EP[DomEvent] = eventProp("transitioncancel")

    /**
      * The `transitionrun` event is fired when a CSS transition is first created, i.e. before any `transition-delay` has
      * begun.
      *
      * @see Browser compatibility:
      *       - [[https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/transitionrun_event#Browser_compatibility HTMLElement]]
      *       - [[https://developer.mozilla.org/en-US/docs/Web/API/Document/transitionrun_event#Browser_compatibility Document]]
      *       - [[https://developer.mozilla.org/en-US/docs/Web/API/Window/transitionrun_event#Browser_compatibility Window]]
      */
    lazy val onTransitionRun: EP[DomTransitionEvent] = eventProp("transitionrun")

    /**
      * The `transitionstart` event is fired when a CSS transition has actually started, i.e., after any
      * `transition-delay` has ended.
      *
      * @see Browser compatibility:
      *       - [[https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/transitionstart_event#Browser_compatibility HTMLElement]]
      *       - [[https://developer.mozilla.org/en-US/docs/Web/API/Document/transitionstart_event#Browser_compatibility Document]]
      *       - [[https://developer.mozilla.org/en-US/docs/Web/API/Window/transitionstart_event#Browser_compatibility Window]]
      */
    lazy val onTransitionStart: EP[DomTransitionEvent] = eventProp("transitionstart")
  }
}
