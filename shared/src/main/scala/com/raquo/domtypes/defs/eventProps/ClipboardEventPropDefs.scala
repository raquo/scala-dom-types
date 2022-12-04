package com.raquo.domtypes.defs.eventProps

import com.raquo.domtypes.common.EventPropDef

/** Clipboard Events */
object ClipboardEventPropDefs {
  
  val defs: List[EventPropDef] = List(
    
    EventPropDef(
      scalaName = "onCopy",
      domName = "copy",
      scalaJsEventType = "dom.ClipboardEvent",
      javascriptEventType = "ClipboardEvent",
      commentLines = List(
        "Fires when the user copies the content of an element",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/copy_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/ClipboardEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onCut",
      domName = "cut",
      scalaJsEventType = "dom.ClipboardEvent",
      javascriptEventType = "ClipboardEvent",
      commentLines = List(
        "Fires when the user cuts the content of an element",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/cut_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/ClipboardEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onPaste",
      domName = "paste",
      scalaJsEventType = "dom.ClipboardEvent",
      javascriptEventType = "ClipboardEvent",
      commentLines = List(
        "Fires when the user pastes some content in an element",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/paste_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/ClipboardEvent",
      ),
    ),

  )
  
}
