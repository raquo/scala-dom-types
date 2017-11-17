package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.EventPropBuilder

/**
  * Mouse Events: triggered by a mouse, or similar user actions.
  * @tparam DomHtmlElementTargetEvent
  *            An event that has an HTMLElement as `target`.
  *            This event type has no corresponding type in JS DOM. See our own `TypedTargetEvent` trait.
  */
trait MouseEventProps[EP[_ <: DomEvent], DomEvent, DomMouseEvent <: DomEvent, DomDragEvent <: DomMouseEvent, DomHtmlElementTargetEvent <: DomEvent] { this: EventPropBuilder[EP, DomEvent] =>

  /**
    * The click event is raised when the user clicks on an element. The click
    * event will occur after the mousedown and mouseup events.
    *
    * MDN
    */
  lazy val onClick: EP[DomMouseEvent with DomHtmlElementTargetEvent] = eventProp("click")

  /**
    * The dblclick event is fired when a pointing device button (usually a
    * mouse button) is clicked twice on a single element.
    *
    * MDN
    */
  lazy val onDblClick: EP[DomMouseEvent with DomHtmlElementTargetEvent] = eventProp("dblclick")

  /**
    * The mousedown event is raised when the user presses the mouse button.
    *
    * MDN
    */
  lazy val onMouseDown: EP[DomMouseEvent with DomHtmlElementTargetEvent] = eventProp("mousedown")

  /**
    * The mousemove event is raised when the user moves the mouse.
    *
    * MDN
    */
  lazy val onMouseMove: EP[DomMouseEvent with DomHtmlElementTargetEvent] = eventProp("mousemove")

  /**
    * The mouseout event is raised when the mouse leaves an element (e.g, when
    * the mouse moves off of an image in the web page, the mouseout event is
    * raised for that image element).
    *
    * MDN
    */
  lazy val onMouseOut: EP[DomMouseEvent with DomHtmlElementTargetEvent] = eventProp("mouseout")

  /**
    * The mouseover event is raised when the user moves the mouse over a
    * particular element.
    *
    * MDN
    */
  lazy val onMouseOver: EP[DomMouseEvent with DomHtmlElementTargetEvent] = eventProp("mouseover")

  /**
    * The mouseup event is raised when the user releases the mouse button.
    *
    * MDN
    */
  lazy val onMouseUp: EP[DomMouseEvent with DomHtmlElementTargetEvent] = eventProp("mouseup")

  /**
    * Fires when the mouse wheel rolls up or down over an element
    */
  lazy val onWheel: EP[DomMouseEvent] = eventProp("wheel")

  /**
    * Script to be run when a context menu is triggered
    */
  lazy val onContextMenu: EP[DomMouseEvent] = eventProp("contextmenu")

  /**
    * Script to be run when an element is dragged
    */
  lazy val onDrag: EP[DomDragEvent] = eventProp("drag")

  /**
    * Script to be run at the end of a drag operation
    */
  lazy val onDragEnd: EP[DomDragEvent] = eventProp("dragend")

  /**
    * Script to be run when an element has been dragged to a valid drop target
    */
  lazy val onDragEnter: EP[DomDragEvent] = eventProp("dragenter")

  /**
    * Script to be run when an element leaves a valid drop target
    */
  lazy val onDragLeave: EP[DomDragEvent] = eventProp("dragleave")

  /**
    * Script to be run when an element is being dragged over a valid drop target
    */
  lazy val onDragOver: EP[DomDragEvent] = eventProp("dragover")

  /**
    * Script to be run at the start of a drag operation
    */
  lazy val onDragStart: EP[DomDragEvent] = eventProp("dragstart")

  /**
    * Script to be run when dragged element is being dropped
    */
  lazy val onDrop: EP[DomDragEvent] = eventProp("drop")
}
