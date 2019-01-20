package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.EventPropBuilder

/**
 * Most of today's web content assumes the user's pointing device will be a mouse.
 * However, since many devices support other types of pointing input devices,
 * such as pen/stylus and touch surfaces, extensions to the existing pointing device event models
 * are needed and pointer events address that need.
 *
 * Pointer events are DOM events that are fired for a pointing device.
 * They are designed to create a single DOM event model to handle pointing input devices such as a mouse,
 * pen/stylus or touch (such as one or more fingers).
 * The pointer is a hardware-agnostic device that can target a specific set of screen coordinates.
 * Having a single event model for pointers can simplify creating Web sites and applications
 * and provide a good user experience regardless of the user's hardware.
 * However, for scenarios when device-specific handling is desired,
 * pointer events defines a property to inspect the device type which produced the event.
 *
 * The events needed to handle generic pointer input are analogous to mouse events
 * (mousedown/pointerdown, mousemove/pointermove, etc.).
 * Consequently, pointer event types are intentionally similar to mouse event types.
 * Additionally, a pointer event contains the usual properties present in mouse events
 * (client coordinates, target element, button states, etc.)
 * in addition to new properties for other forms of input: pressure, contact geometry, tilt, etc.
 * In fact, the PointerEvent interface inherits all of the MouseEvent's properties thus facilitating
 * migrating content from mouse events to pointer events.
 *
 * MDN
 */
trait PointerEventProps[
  EP[_ <: DomEvent],
  DomEvent,
  DomPointerEvent <: DomEvent,
  DomElementPointerEvent <: DomPointerEvent
] { this: EventPropBuilder[EP, DomEvent] =>

  /**
   * fired when a pointing device is moved into an element's hit test boundaries.
   *
   * MDN
   */
  lazy val onPointerOver: EP[DomElementPointerEvent] = eventProp("pointerover")

  /**
   * fired when a pointing device is moved into the hit test boundaries of an element
   * or one of its descendants, including as a result of a pointerdown event
   * from a device that does not support hover (see pointerdown).
   *
   * MDN
   */
  lazy val onPointerEnter: EP[DomElementPointerEvent] = eventProp("pointerenter")

  /**
   * fired when a pointer becomes active.
   *
   * MDN
   */
  lazy val onPointerDown: EP[DomElementPointerEvent] = eventProp("pointerdown")

  /**
   * fired when a pointer changes coordinates.
   *
   * MDN
   */
  lazy val onPointerMove: EP[DomElementPointerEvent] = eventProp("pointermove")

  /**
   * fired when a pointer is no longer active.
   *
   * MDN
   */
  lazy val onPointerUp: EP[DomElementPointerEvent] = eventProp("pointerup")

  /**
   * a browser fires this event if it concludes the pointer will no longer be able
   * to generate events (for example the related device is deactived).
   *
   * MDN
   */
  lazy val onPointerCancel: EP[DomElementPointerEvent] = eventProp("pointercancel")

  /**
   * fired for several reasons including: pointing device is moved out of
   * the hit test boundaries of an element;
   * firing the pointerup event for a device that does not support hover (see pointerup);
   * after firing the pointercancel event (see pointercancel);
   * when a pen stylus leaves the hover range detectable by the digitizer.
   *
   * MDN
   */
  lazy val onPointerOut: EP[DomElementPointerEvent] = eventProp("pointerout")

  /**
   * fired when a pointing device is moved out of the hit test boundaries of an element.
   * For pen devices, this event is fired when the stylus leaves the hover range detectable by the digitizer.
   *
   * MDN
   */
  lazy val onPointerLeave: EP[DomElementPointerEvent] = eventProp("pointerleave")

  /**
   * fired when an element receives pointer capture.
   *
   * MDN
   */
  lazy val gotPointerCapture: EP[DomElementPointerEvent] = eventProp("gotpointercapture")

  /**
   * Fired after pointer capture is released for a pointer.
   *
   * MDN
   */
  lazy val lostPointerCapture: EP[DomElementPointerEvent] = eventProp("lostpointercapture")
}
