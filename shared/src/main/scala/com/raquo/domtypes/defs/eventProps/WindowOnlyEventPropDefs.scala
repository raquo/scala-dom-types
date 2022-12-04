package com.raquo.domtypes.defs.eventProps

import com.raquo.domtypes.common.EventPropDef

/** Events that work only on dom.window */
object WindowOnlyEventPropDefs {
  
  val defs: List[EventPropDef] = List(
    
    EventPropDef(
      scalaName = "onAfterPrint",
      domName = "afterprint",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run after the document is printed",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Window/afterprint_event",
      ),
    ),

    EventPropDef(
      scalaName = "onBeforePrint",
      domName = "beforeprint",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run before the document is printed",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Window/beforeprint_event",
      ),
    ),

    EventPropDef(
      scalaName = "onBeforeUnload",
      domName = "beforeunload",
      scalaJsEventType = "dom.BeforeUnloadEvent",
      javascriptEventType = "BeforeUnloadEvent",
      commentLines = List(
        "Script to be run when the document is about to be unloaded",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Window/beforeunload_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/BeforeUnloadEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onHashChange",
      domName = "hashchange",
      scalaJsEventType = "dom.HashChangeEvent",
      javascriptEventType = "HashChangeEvent",
      commentLines = List(
        "Script to be run when there has been changes to the anchor part of the a URL",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Window/hashchange_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/HashChangeEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onMessage",
      domName = "message",
      scalaJsEventType = "dom.MessageEvent",
      javascriptEventType = "MessageEvent",
      commentLines = List(
        "Script to be run when an object receives a message",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Window/message_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/MessageEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onMessageError",
      domName = "messageerror",
      scalaJsEventType = "dom.MessageEvent",
      javascriptEventType = "MessageEvent",
      commentLines = List(
        "Script to be run when an object receives a message that cannot be",
        "deserialized and therefore raises an error",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Window/messageerror_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/MessageEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onOffline",
      domName = "offline",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when the browser starts to work offline",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Window/offline_event",
      ),
    ),

    EventPropDef(
      scalaName = "onOnline",
      domName = "online",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when the browser starts to work online",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Window/online_event",
      ),
    ),

    EventPropDef(
      scalaName = "onPageHide",
      domName = "pagehide",
      scalaJsEventType = "dom.PageTransitionEvent",
      javascriptEventType = "PageTransitionEvent",
      commentLines = List(
        "Script to be run when a user navigates away from a page",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Window/pagehide_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/PageTransitionEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onPageShow",
      domName = "pageshow",
      scalaJsEventType = "dom.PageTransitionEvent",
      javascriptEventType = "PageTransitionEvent",
      commentLines = List(
        "Script to be run when a user navigates to a page",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Window/pageshow_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/PageTransitionEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onPopState",
      domName = "popstate",
      scalaJsEventType = "dom.PopStateEvent",
      javascriptEventType = "PopStateEvent",
      commentLines = List(
        "Script to be run when the window's history changes",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Window/popstate_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/PopStateEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onStorage",
      domName = "storage",
      scalaJsEventType = "dom.StorageEvent",
      javascriptEventType = "StorageEvent",
      commentLines = List(
        "Script to be run when a Web Storage area is updated",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Window/storage_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/StorageEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onUnload",
      domName = "unload",
      scalaJsEventType = "dom.UIEvent",
      javascriptEventType = "UIEvent",
      commentLines = List(
        "Fires once a page has unloaded (or the browser window has been closed)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Window/unload_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/UIEvent",
      ),
    ),

  )
  
}
