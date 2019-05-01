package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.EventPropBuilder

/**
  * Mouse Events: triggered by a mouse, or similar user actions.
  * @tparam DomElementMouseEvent
  *            A DomMouseEvent that has an Element as `target`.
  *            This event type has no corresponding type in JS DOM. See our own `TypedTargetEvent` trait.
  */
trait MouseEventProps[
  EP[_ <: DomEvent],
  DomEvent,
  DomMouseEvent <: DomEvent,
  DomElementMouseEvent <: DomMouseEvent,
  DomDragEvent <: DomMouseEvent
] { this: EventPropBuilder[EP, DomEvent] =>

  /**
    * The click event is raised when the user clicks on an element. The click
    * event will occur after the mousedown and mouseup events.
    *
    * MDN
    */
  @inline final def onClick: EP[DomElementMouseEvent] = eventProp("click")

  /**
    * The dblclick event is fired when a pointing device button (usually a
    * mouse button) is clicked twice on a single element.
    *
    * MDN
    */
  @inline final def onDblClick: EP[DomElementMouseEvent] = eventProp("dblclick")

  /**
    * The mousedown event is raised when the user presses the mouse button.
    *
    * MDN
    */
  @inline final def onMouseDown: EP[DomElementMouseEvent] = eventProp("mousedown")

  /**
    * The mousemove event is raised when the user moves the mouse.
    *
    * MDN
    */
  @inline final def onMouseMove: EP[DomElementMouseEvent] = eventProp("mousemove")

  /**
    * The mouseout event is raised when the mouse leaves an element (e.g, when
    * the mouse moves off of an image in the web page, the mouseout event is
    * raised for that image element).
    *
    * MDN
    */
  @inline final def onMouseOut: EP[DomElementMouseEvent] = eventProp("mouseout")

  /**
    * The mouseover event is raised when the user moves the mouse over a
    * particular element.
    *
    * MDN
    */
  @inline final def onMouseOver: EP[DomElementMouseEvent] = eventProp("mouseover")


  /**
    * The mouseleave event is fired when the pointer of a pointing device (usually a mouse) is
    * moved out of an element.
    *
    * mouseleave and mouseout are similar but differ in that mouseleave does not bubble and mouseout does.
    *
    * This means that mouseleave is fired when the pointer has exited the element and all of its descendants,
    * whereas mouseout is fired when the pointer leaves the element or leaves one of the element's
    * descendants (even if the pointer is still within the element).
    *
    * MDN
    */
  @inline final def onMouseLeave: EP[DomElementMouseEvent] = eventProp("mouseleave")


  /**
    * The mouseenter event is fired when a pointing device (usually a mouse) is moved over
    * the element that has the listener attached.
    *
    * Similar to mouseover, it differs in that it doesn't bubble and that it isn't sent
    * when the pointer is moved from one of its descendants' physical space to its own physical space.
    *
    * With deep hierarchies, the amount of mouseenter events sent can be quite huge and cause
    * significant performance problems. In such cases, it is better to listen for mouseover events.
    *
    * MDN
    */
  @inline final def onMouseEnter: EP[DomElementMouseEvent] = eventProp("mouseenter")

  /**
    * The mouseup event is raised when the user releases the mouse button.
    *
    * MDN
    */
  @inline final def onMouseUp: EP[DomElementMouseEvent] = eventProp("mouseup")

  /**
    * Fires when the mouse wheel rolls up or down over an element
    */
  @inline final def onWheel: EP[DomMouseEvent] = eventProp("wheel")

  /**
    * Script to be run when a context menu is triggered
    */
  @inline final def onContextMenu: EP[DomMouseEvent] = eventProp("contextmenu")

  /**
    * Script to be run when an element is dragged
    */
  @inline final def onDrag: EP[DomDragEvent] = eventProp("drag")

  /**
    * Script to be run at the end of a drag operation
    */
  @inline final def onDragEnd: EP[DomDragEvent] = eventProp("dragend")

  /**
    * Script to be run when an element has been dragged to a valid drop target
    */
  @inline final def onDragEnter: EP[DomDragEvent] = eventProp("dragenter")

  /**
    * Script to be run when an element leaves a valid drop target
    */
  @inline final def onDragLeave: EP[DomDragEvent] = eventProp("dragleave")

  /**
    * Script to be run when an element is being dragged over a valid drop target
    */
  @inline final def onDragOver: EP[DomDragEvent] = eventProp("dragover")

  /**
    * Script to be run at the start of a drag operation
    */
  @inline final def onDragStart: EP[DomDragEvent] = eventProp("dragstart")

  /**
    * Script to be run when dragged element is being dropped
    */
  @inline final def onDrop: EP[DomDragEvent] = eventProp("drop")
}
