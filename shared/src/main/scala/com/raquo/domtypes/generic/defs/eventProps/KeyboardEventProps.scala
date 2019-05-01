package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.EventPropBuilder

/**
  * Keyboard Events - triggered by user actions on the keyboard
  *
  * For type param docs see [[EventPropBuilder]]
  */
trait KeyboardEventProps[EP[_ <: DomEvent], DomEvent, DomKeyboardEvent <: DomEvent] { this: EventPropBuilder[EP, DomEvent] =>

  /**
    * The keydown event is raised when the user presses a keyboard key.
    *
    * MDN
    */
  @inline final def onKeyDown: EP[DomKeyboardEvent] = eventProp("keydown")

  /**
    * The keyup event is raised when the user releases a key that's been pressed.
    *
    * MDN
    */
  @inline final def onKeyUp: EP[DomKeyboardEvent] = eventProp("keyup")

  /**
    * The keypress event should be raised when the user presses a key on the keyboard.
    * However, not all browsers fire keypress events for certain keys.
    *
    * Webkit-based browsers (Google Chrome and Safari, for example) do not fire keypress events on the arrow keys.
    * Firefox does not fire keypress events on modifier keys like SHIFT.
    *
    * MDN
    */
  @inline final def onKeyPress: EP[DomKeyboardEvent] = eventProp("keypress")
}
