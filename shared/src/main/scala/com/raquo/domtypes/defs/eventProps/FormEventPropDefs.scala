package com.raquo.domtypes.defs.eventProps

import com.raquo.domtypes.common.EventPropDef

/** Events related to inputs and forms */
object FormEventPropDefs {
  
  val defs: List[EventPropDef] = List(
    
    EventPropDef(
      scalaName = "onChange",
      domName = "change",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "The change event is fired for input, select, and textarea elements",
        "when a change to the element's value is committed by the user.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/change_event",
      ),
    ),

    EventPropDef(
      scalaName = "onSelect",
      domName = "select",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "The select event only fires when text inside a text input or textarea is",
        "selected. The event is fired after the text has been selected.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/select_event",
      ),
    ),

    EventPropDef(
      scalaName = "onBeforeInput",
      domName = "beforeinput",
      scalaJsEventType = "dom.InputEvent",
      javascriptEventType = "InputEvent",
      commentLines = List(
        "The DOM beforeinput event fires when the value of an `<input>`, or `<textarea>`",
        "element is about to be modified. The event also applies to elements with",
        "contenteditable enabled, and to any element when designMode is turned on.",
        "",
        "",
        "@note IE does not support this event.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/beforeinput_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/InputEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onInput",
      domName = "input",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "The input event is fired for input, select, textarea, and",
        "contentEditable elements when it gets user input.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/input_event",
      ),
    ),

    EventPropDef(
      scalaName = "onBlur",
      domName = "blur",
      scalaJsEventType = "dom.FocusEvent",
      javascriptEventType = "FocusEvent",
      commentLines = List(
        "The blur event is raised when an element loses focus.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/blur_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/FocusEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onFocus",
      domName = "focus",
      scalaJsEventType = "dom.FocusEvent",
      javascriptEventType = "FocusEvent",
      commentLines = List(
        "The focus event is raised when the user sets focus on the given element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/focus_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/FocusEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onSubmit",
      domName = "submit",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "The submit event is fired when the user clicks a submit button in a form",
        "(`<input type=\"submit\"/>`).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/submit_event",
      ),
    ),

    EventPropDef(
      scalaName = "onReset",
      domName = "reset",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "The reset event is fired when a form is reset.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/reset_event",
      ),
    ),

    EventPropDef(
      scalaName = "onInvalid",
      domName = "invalid",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Script to be run when an element is invalid",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLInputElement/invalid_event",
      ),
    ),

    EventPropDef(
      scalaName = "onSearch",
      domName = "search",
      scalaJsEventType = "dom.Event",
      javascriptEventType = "Event",
      commentLines = List(
        "Fires when the user writes something in a search field (for `<input=\"search\">`)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLInputElement/search_event",
      ),
    ),

  )
  
}
