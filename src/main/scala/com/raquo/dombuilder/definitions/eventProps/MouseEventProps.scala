package com.raquo.dombuilder.definitions.eventProps

import com.raquo.dombuilder.Builder
import com.raquo.dombuilder.keys.EventProp
import org.scalajs.dom

/**
  * Mouse Events: triggered by a mouse, or similar user actions.
  */
trait MouseEventProps[N] { self: Builder[N] =>

  /**
    * The click event is raised when the user clicks on an element. The click
    * event will occur after the mousedown and mouseup events.
    *
    * MDN
    */
  lazy val onClick: EventProp[dom.MouseEvent, N] = eventProp("click")

  /**
    * The dblclick event is fired when a pointing device button (usually a
    * mouse button) is clicked twice on a single element.
    *
    * MDN
    */
  lazy val onDblClick: EventProp[dom.MouseEvent, N] = eventProp("dblclick")

  /**
    * Script to be run when an element is dragged
    */
  val onDrag: EventProp[dom.MouseEvent, N] = eventProp("drag")

  /**
    * Script to be run at the end of a drag operation
    */
  lazy val onDragEnd: EventProp[dom.MouseEvent, N] = eventProp("dragend")

  /**
    * Script to be run when an element has been dragged to a valid drop target
    */
  lazy val onDragEnter: EventProp[dom.MouseEvent, N] = eventProp("dragenter")

  /**
    * Script to be run when an element leaves a valid drop target
    */
  lazy val onDragLeave: EventProp[dom.MouseEvent, N] = eventProp("dragleave")

  /**
    * Script to be run when an element is being dragged over a valid drop target
    */
  lazy val onDragOver: EventProp[dom.MouseEvent, N] = eventProp("dragover")

  /**
    * Script to be run at the start of a drag operation
    */
  lazy val onDragStart: EventProp[dom.MouseEvent, N] = eventProp("dragstart")

  /**
    * Script to be run when dragged element is being dropped
    */
  lazy val onDrop: EventProp[dom.MouseEvent, N] = eventProp("drop")

  /**
    * The mousedown event is raised when the user presses the mouse button.
    *
    * MDN
    */
  lazy val onMouseDown: EventProp[dom.MouseEvent, N] = eventProp("mousedown")

  /**
    * The mousemove event is raised when the user moves the mouse.
    *
    * MDN
    */
  lazy val onMouseMove: EventProp[dom.MouseEvent, N] = eventProp("mousemove")

  /**
    * The mouseout event is raised when the mouse leaves an element (e.g, when
    * the mouse moves off of an image in the web page, the mouseout event is
    * raised for that image element).
    *
    * MDN
    */
  lazy val onMouseOut: EventProp[dom.MouseEvent, N] = eventProp("mouseout")

  /**
    * The mouseover event is raised when the user moves the mouse over a
    * particular element.
    *
    * MDN
    */
  lazy val onMouseOver: EventProp[dom.MouseEvent, N] = eventProp("mouseover")

  /**
    * The mouseup event is raised when the user releases the mouse button.
    *
    * MDN
    */
  lazy val onMouseUp: EventProp[dom.MouseEvent, N] = eventProp("mouseup")

  /**
    * Specifies the function to be called when the window is scrolled.
    *
    * MDN
    */
  lazy val onScroll: EventProp[dom.MouseEvent, N] = eventProp("scroll")

  /**
    * Fires when the mouse wheel rolls up or down over an element
    */
  lazy val onWheel: EventProp[dom.MouseEvent, N] = eventProp("wheel")
}
