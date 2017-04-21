package com.raquo.dombuilder.definitions.eventProps

import com.raquo.dombuilder.builders.EventPropBuilder
import com.raquo.dombuilder.keys.EventProp

/**
  * Mouse Events: triggered by a mouse, or similar user actions.
  */
trait MouseEventProps[N, DomMouseEvent <: DomEvent, DomEvent, Fun1[-_, +_]] {
  this: EventPropBuilder[N, DomEvent, Fun1] =>

  /**
    * The click event is raised when the user clicks on an element. The click
    * event will occur after the mousedown and mouseup events.
    *
    * MDN
    */
  lazy val onClick: EventProp[DomMouseEvent, N, DomEvent, Fun1] = eventProp("click")

  /**
    * The dblclick event is fired when a pointing device button (usually a
    * mouse button) is clicked twice on a single element.
    *
    * MDN
    */
  lazy val onDblClick: EventProp[DomMouseEvent, N, DomEvent, Fun1] = eventProp("dblclick")

  /**
    * Script to be run when an element is dragged
    */
  val onDrag: EventProp[DomMouseEvent, N, DomEvent, Fun1] = eventProp("drag")

  /**
    * Script to be run at the end of a drag operation
    */
  lazy val onDragEnd: EventProp[DomMouseEvent, N, DomEvent, Fun1] = eventProp("dragend")

  /**
    * Script to be run when an element has been dragged to a valid drop target
    */
  lazy val onDragEnter: EventProp[DomMouseEvent, N, DomEvent, Fun1] = eventProp("dragenter")

  /**
    * Script to be run when an element leaves a valid drop target
    */
  lazy val onDragLeave: EventProp[DomMouseEvent, N, DomEvent, Fun1] = eventProp("dragleave")

  /**
    * Script to be run when an element is being dragged over a valid drop target
    */
  lazy val onDragOver: EventProp[DomMouseEvent, N, DomEvent, Fun1] = eventProp("dragover")

  /**
    * Script to be run at the start of a drag operation
    */
  lazy val onDragStart: EventProp[DomMouseEvent, N, DomEvent, Fun1] = eventProp("dragstart")

  /**
    * Script to be run when dragged element is being dropped
    */
  lazy val onDrop: EventProp[DomMouseEvent, N, DomEvent, Fun1] = eventProp("drop")

  /**
    * The mousedown event is raised when the user presses the mouse button.
    *
    * MDN
    */
  lazy val onMouseDown: EventProp[DomMouseEvent, N, DomEvent, Fun1] = eventProp("mousedown")

  /**
    * The mousemove event is raised when the user moves the mouse.
    *
    * MDN
    */
  lazy val onMouseMove: EventProp[DomMouseEvent, N, DomEvent, Fun1] = eventProp("mousemove")

  /**
    * The mouseout event is raised when the mouse leaves an element (e.g, when
    * the mouse moves off of an image in the web page, the mouseout event is
    * raised for that image element).
    *
    * MDN
    */
  lazy val onMouseOut: EventProp[DomMouseEvent, N, DomEvent, Fun1] = eventProp("mouseout")

  /**
    * The mouseover event is raised when the user moves the mouse over a
    * particular element.
    *
    * MDN
    */
  lazy val onMouseOver: EventProp[DomMouseEvent, N, DomEvent, Fun1] = eventProp("mouseover")

  /**
    * The mouseup event is raised when the user releases the mouse button.
    *
    * MDN
    */
  lazy val onMouseUp: EventProp[DomMouseEvent, N, DomEvent, Fun1] = eventProp("mouseup")

  /**
    * Specifies the function to be called when the window is scrolled.
    *
    * MDN
    */
  lazy val onScroll: EventProp[DomMouseEvent, N, DomEvent, Fun1] = eventProp("scroll")

  /**
    * Fires when the mouse wheel rolls up or down over an element
    */
  lazy val onWheel: EventProp[DomMouseEvent, N, DomEvent, Fun1] = eventProp("wheel")
}
