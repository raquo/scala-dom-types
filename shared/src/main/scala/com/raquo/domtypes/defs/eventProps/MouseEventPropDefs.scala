package com.raquo.domtypes.defs.eventProps

import com.raquo.domtypes.common.EventPropDef

/**
  * Mouse Events: triggered by a mouse, or similar user actions.
  * @tparam DomElementMouseEvent
  *            A DomMouseEvent that has an Element as `target`.
  *            This event type has no corresponding type in JS DOM. See our own `TypedTargetEvent` trait.
  * 
  */
object MouseEventPropDefs {
  
  val defs: List[EventPropDef] = List(
    
    EventPropDef(
      scalaName = "onClick",
      domName = "click",
      scalaJsEventType = "dom.MouseEvent",
      javascriptEventType = "MouseEvent",
      commentLines = List(
        "The click event is raised when the user clicks on an element. The click",
        "event will occur after the mousedown and mouseup events.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/click_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onDblClick",
      domName = "dblclick",
      scalaJsEventType = "dom.MouseEvent",
      javascriptEventType = "MouseEvent",
      commentLines = List(
        "The dblclick event is fired when a pointing device button (usually a",
        "mouse button) is clicked twice on a single element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/dblclick_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onMouseDown",
      domName = "mousedown",
      scalaJsEventType = "dom.MouseEvent",
      javascriptEventType = "MouseEvent",
      commentLines = List(
        "The mousedown event is raised when the user presses the mouse button.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/mousedown_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onMouseMove",
      domName = "mousemove",
      scalaJsEventType = "dom.MouseEvent",
      javascriptEventType = "MouseEvent",
      commentLines = List(
        "The mousemove event is raised when the user moves the mouse.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/mousemove_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onMouseOut",
      domName = "mouseout",
      scalaJsEventType = "dom.MouseEvent",
      javascriptEventType = "MouseEvent",
      commentLines = List(
        "The mouseout event is raised when the mouse leaves an element (e.g, when",
        "the mouse moves off of an image in the web page, the mouseout event is",
        "raised for that image element).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/mouseout_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onMouseOver",
      domName = "mouseover",
      scalaJsEventType = "dom.MouseEvent",
      javascriptEventType = "MouseEvent",
      commentLines = List(
        "The mouseover event is raised when the user moves the mouse over a",
        "particular element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/mouseover_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onMouseLeave",
      domName = "mouseleave",
      scalaJsEventType = "dom.MouseEvent",
      javascriptEventType = "MouseEvent",
      commentLines = List(
        "The mouseleave event is fired when the pointer of a pointing device (usually a mouse) is",
        "moved out of an element.",
        "",
        "mouseleave and mouseout are similar but differ in that mouseleave does not bubble and mouseout does.",
        "",
        "This means that mouseleave is fired when the pointer has exited the element and all of its descendants,",
        "whereas mouseout is fired when the pointer leaves the element or leaves one of the element's",
        "descendants (even if the pointer is still within the element).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/mouseleave_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onMouseEnter",
      domName = "mouseenter",
      scalaJsEventType = "dom.MouseEvent",
      javascriptEventType = "MouseEvent",
      commentLines = List(
        "The mouseenter event is fired when a pointing device (usually a mouse) is moved over",
        "the element that has the listener attached.",
        "",
        "Similar to mouseover, it differs in that it doesn't bubble and that it isn't sent",
        "when the pointer is moved from one of its descendants' physical space to its own physical space.",
        "",
        "With deep hierarchies, the amount of mouseenter events sent can be quite huge and cause",
        "significant performance problems. In such cases, it is better to listen for mouseover events.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/mouseenter_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onMouseUp",
      domName = "mouseup",
      scalaJsEventType = "dom.MouseEvent",
      javascriptEventType = "MouseEvent",
      commentLines = List(
        "The mouseup event is raised when the user releases the mouse button.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/mouseup_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onWheel",
      domName = "wheel",
      scalaJsEventType = "dom.WheelEvent",
      javascriptEventType = "WheelEvent",
      commentLines = List(
        "Fires when the mouse wheel rolls up or down over an element",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/wheel_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/WheelEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onContextMenu",
      domName = "contextmenu",
      scalaJsEventType = "dom.MouseEvent",
      javascriptEventType = "MouseEvent",
      commentLines = List(
        "Script to be run when a context menu is triggered",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/Element/contextmenu_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onDrag",
      domName = "drag",
      scalaJsEventType = "dom.DragEvent",
      javascriptEventType = "DragEvent",
      commentLines = List(
        "Script to be run when an element is dragged",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/drag_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/DragEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onDragEnd",
      domName = "dragend",
      scalaJsEventType = "dom.DragEvent",
      javascriptEventType = "DragEvent",
      commentLines = List(
        "Script to be run at the end of a drag operation",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/dragend_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/DragEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onDragEnter",
      domName = "dragenter",
      scalaJsEventType = "dom.DragEvent",
      javascriptEventType = "DragEvent",
      commentLines = List(
        "Script to be run when an element has been dragged to a valid drop target",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/dragenter_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/DragEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onDragLeave",
      domName = "dragleave",
      scalaJsEventType = "dom.DragEvent",
      javascriptEventType = "DragEvent",
      commentLines = List(
        "Script to be run when an element leaves a valid drop target",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/dragleave_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/DragEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onDragOver",
      domName = "dragover",
      scalaJsEventType = "dom.DragEvent",
      javascriptEventType = "DragEvent",
      commentLines = List(
        "Script to be run when an element is being dragged over a valid drop target",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/dragover_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/DragEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onDragStart",
      domName = "dragstart",
      scalaJsEventType = "dom.DragEvent",
      javascriptEventType = "DragEvent",
      commentLines = List(
        "Script to be run at the start of a drag operation",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/dragstart_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/DragEvent",
      ),
    ),

    EventPropDef(
      scalaName = "onDrop",
      domName = "drop",
      scalaJsEventType = "dom.DragEvent",
      javascriptEventType = "DragEvent",
      commentLines = List(
        "Script to be run when dragged element is being dropped",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/drop_event",
        "https://developer.mozilla.org/en-US/docs/Web/API/DragEvent",
      ),
    ),

  )
  
}
