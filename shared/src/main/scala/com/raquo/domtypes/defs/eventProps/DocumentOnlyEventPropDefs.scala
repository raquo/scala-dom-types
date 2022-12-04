package com.raquo.domtypes.defs.eventProps

import com.raquo.domtypes.common.EventPropDef

/** Events that work only on dom.document */
object DocumentOnlyEventPropDefs {
  
  val defs: List[EventPropDef] = List(
    
    EventPropDef(
      scalaName = "onDomContentLoaded",
      domName = "DOMContentLoaded",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "The `DOMContentLoaded` event is fired when the initial HTML document has been completely loaded and parsed,",
        "without waiting for stylesheets, images, and subframes to finish loading. A very different event `load`",
        "should be used only to detect a fully-loaded page.",
        "",
        "It is an incredibly common mistake to use load where DOMContentLoaded would be much more appropriate,",
        "so be cautious.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Document/DOMContentLoaded_event",
      ),
    ),

    EventPropDef(
      scalaName = "onFullScreenChange",
      domName = "fullscreenchange",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "The fullscreenchange event is fired immediately after the browser switches into or out of full-screen mode.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Document/fullscreenchange_event",
      ),
    ),

    EventPropDef(
      scalaName = "onFullScreenError",
      domName = "fullscreenerror",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "The fullscreenerror event is fired when the browser cannot switch to full-screen mode.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Document/fullscreenerror_event",
      ),
    ),

    EventPropDef(
      scalaName = "onVisibilityChange",
      domName = "visibilitychange",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "The visibilitychange event is fired when the content of a tab has become visible or has been hidden.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Document/visibilitychange_event",
      ),
    ),

  )
  
}
