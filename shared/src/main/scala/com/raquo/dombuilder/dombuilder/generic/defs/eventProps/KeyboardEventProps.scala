package com.raquo.dombuilder.dombuilder.generic.defs.eventProps

import com.raquo.dombuilder.dombuilder.generic.builders.BoundedBuilder

/**
  * Keyboard Events - triggered by user action son the keyboard or similar user actions
  */
trait KeyboardEventProps[P[_ <: DomEvent], DomEvent, DomKeyboardEvent <: DomEvent] { this: BoundedBuilder[P, DomEvent] =>

  /**
    * The keydown event is raised when the user presses a keyboard key.
    *
    * MDN
    */
  lazy val onKeyDown: P[DomKeyboardEvent] = build("keydown")

  /**
    * The keyup event is raised when the user releases a key that's been pressed.
    *
    * MDN
    */
  lazy val onKeyUp: P[DomKeyboardEvent] = build("keyup")

  /**
    * The keypress event should be raised when the user presses a key on the keyboard.
    * However, not all browsers fire keypress events for certain keys.
    *
    * Webkit-based browsers (Google Chrome and Safari, for example) do not fire keypress events on the arrow keys.
    * Firefox does not fire keypress events on modifier keys like SHIFT.
    *
    * MDN
    */
  lazy val onKeyPress: P[DomKeyboardEvent] = build("keypress")
}
