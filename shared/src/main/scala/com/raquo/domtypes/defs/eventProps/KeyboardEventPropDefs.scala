package com.raquo.domtypes.defs.eventProps

import com.raquo.domtypes.common.EventPropDef

/** Keyboard Events - triggered by user actions on the keyboard */
object KeyboardEventPropDefs {
  
  val defs: List[EventPropDef] = List(
    
    EventPropDef(
      scalaName = "onKeyDown",
      domName = "keydown",
      scalaJsEventType = "dom.KeyboardEvent",
      javascriptEventType = "KeyboardEvent",
      commentLines = List(
        "The keydown event is raised when the user presses a keyboard key.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/keydown_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onKeyUp",
      domName = "keyup",
      scalaJsEventType = "dom.KeyboardEvent",
      javascriptEventType = "KeyboardEvent",
      commentLines = List(
        "The keyup event is raised when the user releases a key that's been pressed.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/keyup_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onKeyPress",
      domName = "keypress",
      scalaJsEventType = "dom.KeyboardEvent",
      javascriptEventType = "KeyboardEvent",
      commentLines = List(
        "The keypress event should be raised when the user presses a key on the keyboard.",
        "However, not all browsers fire keypress events for certain keys.",
        "",
        "Webkit-based browsers (Google Chrome and Safari, for example) do not fire keypress events on the arrow keys.",
        "Firefox does not fire keypress events on modifier keys like SHIFT.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/keypress_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent",
      ),
    ),

  )
  
}
