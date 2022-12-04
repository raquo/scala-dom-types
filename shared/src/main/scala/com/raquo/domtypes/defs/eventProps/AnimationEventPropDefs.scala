package com.raquo.domtypes.defs.eventProps

import com.raquo.domtypes.common.EventPropDef

object AnimationEventPropDefs {

  val defs: List[EventPropDef] = List(

    EventPropDef(
      scalaName = "onAnimationEnd",
      domName = "animationend",
      scalaJsEventType = "dom.AnimationEvent",
      javascriptEventType = "AnimationEvent",
      commentLines = List(
        "The animationend event is event fires when a CSS animation reaches the end of its active period.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/animationend_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/AnimationEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onAnimationIteration",
      domName = "animationiteration",
      scalaJsEventType = "dom.AnimationEvent",
      javascriptEventType = "AnimationEvent",
      commentLines = List(
        "The animationiteration event is sent when a CSS animation reaches the end of an iteration. An iteration ends",
        "when a single pass through the sequence of animation instructions is completed by executing the last",
        "animation step.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/animationiteration_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/AnimationEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onAnimationStart",
      domName = "animationstart",
      scalaJsEventType = "dom.AnimationEvent",
      javascriptEventType = "AnimationEvent",
      commentLines = List(
        "The animationstart event is sent when a CSS Animation starts to play.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/animationstart_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/AnimationEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onTransitionEnd",
      domName = "transitionend",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "The `transitionend` event is sent to when a CSS transition completes.",
        "",
        "Note: If the transition is removed from its target node before the transition completes execution, the",
        "`transitionend` event won't be generated. One way this can happen is by changing the value of the",
        "`transition-property` attribute which applies to the target. Another is if the `display` attribute is set to",
        "`none`.",
        "",
        "@see [[https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontransitionend MDN]]",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/transitionend_event",
      ),
    ),

  )

}
