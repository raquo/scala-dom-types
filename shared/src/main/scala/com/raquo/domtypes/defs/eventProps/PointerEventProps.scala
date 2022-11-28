package com.raquo.domtypes.defs.eventProps

import com.raquo.domtypes.common.EventPropDef

object PointerEventProps {
  
  val defs: List[EventPropDef] = List(
    
    EventPropDef(
      scalaName = "onPointerOver",
      domName = "pointerover",
      scalaJsEventType = "dom.PointerEvent",
      javascriptEventType = "PointerEvent",
      commentLines = List(
        "fired when a pointing device is moved into an element's hit test boundaries.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/pointerover_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onPointerEnter",
      domName = "pointerenter",
      scalaJsEventType = "dom.PointerEvent",
      javascriptEventType = "PointerEvent",
      commentLines = List(
        "fired when a pointing device is moved into the hit test boundaries of an element",
        "or one of its descendants, including as a result of a pointerdown event",
        "from a device that does not support hover (see pointerdown).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/pointerenter_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onPointerDown",
      domName = "pointerdown",
      scalaJsEventType = "dom.PointerEvent",
      javascriptEventType = "PointerEvent",
      commentLines = List(
        "fired when a pointer becomes active.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/pointerdown_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onPointerMove",
      domName = "pointermove",
      scalaJsEventType = "dom.PointerEvent",
      javascriptEventType = "PointerEvent",
      commentLines = List(
        "fired when a pointer changes coordinates.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/pointermove_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onPointerUp",
      domName = "pointerup",
      scalaJsEventType = "dom.PointerEvent",
      javascriptEventType = "PointerEvent",
      commentLines = List(
        "fired when a pointer is no longer active.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/pointerup_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onPointerCancel",
      domName = "pointercancel",
      scalaJsEventType = "dom.PointerEvent",
      javascriptEventType = "PointerEvent",
      commentLines = List(
        "a browser fires this event if it concludes the pointer will no longer be able",
        "to generate events (for example the related device is deactived).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/pointercancel_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onPointerOut",
      domName = "pointerout",
      scalaJsEventType = "dom.PointerEvent",
      javascriptEventType = "PointerEvent",
      commentLines = List(
        "fired for several reasons including: pointing device is moved out of",
        "the hit test boundaries of an element;",
        "firing the pointerup event for a device that does not support hover (see pointerup);",
        "after firing the pointercancel event (see pointercancel);",
        "when a pen stylus leaves the hover range detectable by the digitizer.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/pointerout_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onPointerLeave",
      domName = "pointerleave",
      scalaJsEventType = "dom.PointerEvent",
      javascriptEventType = "PointerEvent",
      commentLines = List(
        "fired when a pointing device is moved out of the hit test boundaries of an element.",
        "For pen devices, this event is fired when the stylus leaves the hover range detectable by the digitizer.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/pointerleave_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent",
      ),
    ),

    EventPropDef(
      scalaName = "gotPointerCapture",
      domName = "gotpointercapture",
      scalaJsEventType = "dom.PointerEvent",
      javascriptEventType = "PointerEvent",
      commentLines = List(
        "fired when an element receives pointer capture.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/gotpointercapture_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent",
      ),
    ),

    EventPropDef(
      scalaName = "lostPointerCapture",
      domName = "lostpointercapture",
      scalaJsEventType = "dom.PointerEvent",
      javascriptEventType = "PointerEvent",
      commentLines = List(
        "Fired after pointer capture is released for a pointer.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/lostpointercapture_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent",
      ),
    ),

  )
  
}
