package com.raquo.domtypes.defs.eventProps

import com.raquo.domtypes.common.EventPropDef

object ErrorEventPropDefs {
  
  val defs: List[EventPropDef] = List(
    
    EventPropDef(
      scalaName = "onError",
      domName = "error",
      scalaJsEventType = "dom.ErrorEvent",
      javascriptEventType = "ErrorEvent",
      commentLines = List(
        "Script to be run when an error occurs when the file is being loaded",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/error_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/ErrorEvent",
      ),
    ),

  )
  
}
