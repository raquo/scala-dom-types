package com.raquo.domtypes.defs.eventProps

import com.raquo.domtypes.common.EventPropDef

/** Touch events: triggered by a finger or stylus on a touch surface */
object TouchEventPropDefs {
  val defs: List[EventPropDef] = List(

    EventPropDef(
      scalaName = "onTouchStart",
      domName = "touchstart",
      scalaJsEventType = "dom.TouchEvent",
      javascriptEventType = "TouchEvent",
      commentLines = List(
        "The touchstart event is fired when one or more touch points are",
        "placed on the touch surface."
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/touchstart_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent",
        "https://developer.mozilla.org/en-US/docs/Web/API/Touch_events#browser_compatibility",
      ),
    ),

    EventPropDef(
      scalaName = "onTouchMove",
      domName = "touchmove",
      scalaJsEventType = "dom.TouchEvent",
      javascriptEventType = "TouchEvent",
      commentLines = List(
        "The touchmove event is fired when one or more touch points are moved",
        "along the touch surface.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/touchmove_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent",
        "https://developer.mozilla.org/en-US/docs/Web/API/Touch_events#browser_compatibility",
      ),
    ),

    EventPropDef(
      scalaName = "onTouchCancel",
      domName = "touchcancel",
      scalaJsEventType = "dom.TouchEvent",
      javascriptEventType = "TouchEvent",
      commentLines = List(
        "The touchcancel event is fired when one or more touch points have",
        "been disrupted in an implementation-specific manner.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/touchcancel_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent",
        "https://developer.mozilla.org/en-US/docs/Web/API/Touch_events#browser_compatibility",
      ),
    ),

    EventPropDef(
      scalaName = "onTouchEnd",
      domName = "touchend",
      scalaJsEventType = "dom.TouchEvent",
      javascriptEventType = "TouchEvent",
      commentLines = List(
        "The touchend event fires when one or more touch points are removed",
        "from the touch surface. Remember that it is possible to get a",
        "touchcancel event instead.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/touchend_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent",
        "https://developer.mozilla.org/en-US/docs/Web/API/Touch_events#browser_compatibility",
      ),
    ),
  )
}
