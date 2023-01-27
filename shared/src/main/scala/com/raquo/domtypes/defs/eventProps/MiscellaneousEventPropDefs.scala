package com.raquo.domtypes.defs.eventProps

import com.raquo.domtypes.common.EventPropDef

/** Miscellaneous Events */
object MiscellaneousEventPropDefs {
  
  val defs: List[EventPropDef] = List(
    
    EventPropDef(
      scalaName = "onLoad",
      domName = "load",
      scalaJsEventType = "dom.UIEvent",
      javascriptEventType = "UIEvent",
      commentLines = List(
        "The onload property of the GlobalEventHandlers mixin is an event handler",
        "for the load event of a Window, XMLHttpRequest, `<img>` element, etc.,",
        "which fires when the resource has loaded.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Window/load_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/UIEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onResize",
      domName = "resize",
      scalaJsEventType = "dom.UIEvent",
      javascriptEventType = "UIEvent",
      commentLines = List(
        "The GlobalEventHandlers.onresize property contains an EventHandler",
        "triggered when a resize event is received.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Window/resize_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/UIEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onScroll",
      domName = "scroll",
      scalaJsEventType = "dom.UIEvent",
      javascriptEventType = "UIEvent",
      commentLines = List(
        "An event handler for scroll events on element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Window/scroll_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/UIEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onShow",
      domName = "show",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Fires when a `<menu>` element is shown as a context menu",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/show_event",
      ),
    ),

    EventPropDef(
      scalaName = "onToggle",
      domName = "toggle",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Fires when the user opens or closes the `<details>` element",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/toggle_event",
      ),
    ),

  )
  
}
