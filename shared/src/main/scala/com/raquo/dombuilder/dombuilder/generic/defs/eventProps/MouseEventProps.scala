package com.raquo.dombuilder.dombuilder.generic.defs.eventProps

import com.raquo.dombuilder.dombuilder.generic.builders.BoundedBuilder

/**
  * Mouse Events: triggered by a mouse, or similar user actions.
  */
trait MouseEventProps[P[_ <: DomEvent], DomEvent, DomMouseEvent <: DomEvent] { this: BoundedBuilder[P, DomEvent] =>

  /**
    * The click event is raised when the user clicks on an element. The click
    * event will occur after the mousedown and mouseup events.
    *
    * MDN
    */
  lazy val onClick: P[DomMouseEvent] = build("click")

  /**
    * The dblclick event is fired when a pointing device button (usually a
    * mouse button) is clicked twice on a single element.
    *
    * MDN
    */
  lazy val onDblClick: P[DomMouseEvent] = build("dblclick")

  /**
    * Script to be run when an element is dragged
    */
  val onDrag: P[DomMouseEvent] = build("drag")

  /**
    * Script to be run at the end of a drag operation
    */
  lazy val onDragEnd: P[DomMouseEvent] = build("dragend")

  /**
    * Script to be run when an element has been dragged to a valid drop target
    */
  lazy val onDragEnter: P[DomMouseEvent] = build("dragenter")

  /**
    * Script to be run when an element leaves a valid drop target
    */
  lazy val onDragLeave: P[DomMouseEvent] = build("dragleave")

  /**
    * Script to be run when an element is being dragged over a valid drop target
    */
  lazy val onDragOver: P[DomMouseEvent] = build("dragover")

  /**
    * Script to be run at the start of a drag operation
    */
  lazy val onDragStart: P[DomMouseEvent] = build("dragstart")

  /**
    * Script to be run when dragged element is being dropped
    */
  lazy val onDrop: P[DomMouseEvent] = build("drop")

  /**
    * The mousedown event is raised when the user presses the mouse button.
    *
    * MDN
    */
  lazy val onMouseDown: P[DomMouseEvent] = build("mousedown")

  /**
    * The mousemove event is raised when the user moves the mouse.
    *
    * MDN
    */
  lazy val onMouseMove: P[DomMouseEvent] = build("mousemove")

  /**
    * The mouseout event is raised when the mouse leaves an element (e.g, when
    * the mouse moves off of an image in the web page, the mouseout event is
    * raised for that image element).
    *
    * MDN
    */
  lazy val onMouseOut: P[DomMouseEvent] = build("mouseout")

  /**
    * The mouseover event is raised when the user moves the mouse over a
    * particular element.
    *
    * MDN
    */
  lazy val onMouseOver: P[DomMouseEvent] = build("mouseover")

  /**
    * The mouseup event is raised when the user releases the mouse button.
    *
    * MDN
    */
  lazy val onMouseUp: P[DomMouseEvent] = build("mouseup")

  /**
    * Specifies the function to be called when the window is scrolled.
    *
    * MDN
    */
  lazy val onScroll: P[DomMouseEvent] = build("scroll")

  /**
    * Fires when the mouse wheel rolls up or down over an element
    */
  lazy val onWheel: P[DomMouseEvent] = build("wheel")
}
