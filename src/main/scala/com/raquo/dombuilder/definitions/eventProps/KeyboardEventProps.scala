package com.raquo.dombuilder.definitions.eventProps

import com.raquo.dombuilder.builders.EventPropBuilder
import com.raquo.dombuilder.keys.EventProp

/**
  * Keyboard Events - triggered by user action son the keyboard or similar user actions
  */
trait KeyboardEventProps[N, DomKeyboardEvent <: DomEvent, DomEvent, Fun1[-_, +_]] {
  self: EventPropBuilder[N, DomEvent, Fun1] =>

  /**
    * The keydown event is raised when the user presses a keyboard key.
    *
    * MDN
    */
  lazy val onKeyDown: EventProp[DomKeyboardEvent, N, DomEvent, Fun1] = eventProp("keydown")

  /**
    * The keyup event is raised when the user releases a key that's been pressed.
    *
    * MDN
    */
  lazy val onKeyUp: EventProp[DomKeyboardEvent, N, DomEvent, Fun1] = eventProp("keyup")

  /**
    * The keypress event should be raised when the user presses a key on the keyboard.
    * However, not all browsers fire keypress events for certain keys.
    *
    * Webkit-based browsers (Google Chrome and Safari, for example) do not fire keypress events on the arrow keys.
    * Firefox does not fire keypress events on modifier keys like SHIFT.
    *
    * MDN
    */
  lazy val onKeyPress: EventProp[DomKeyboardEvent, N, DomEvent, Fun1] = eventProp("keypress")
}
