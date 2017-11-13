package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.EventPropBuilder

trait FormEventProps[EP[_ <: DomEvent], DomEvent, DomFocusEvent <: DomEvent, DomValueElementEvent <: DomEvent] { this: EventPropBuilder[EP, DomEvent] =>

  /**
    * The change event is fired for input, select, and textarea elements
    * when a change to the element's value is committed by the user.
    *
    * MDN
    */
  lazy val onChange: EP[DomValueElementEvent] = eventProp("change")

  /**
    * The select event only fires when text inside a text input or textarea is
    * selected. The event is fired after the text has been selected.
    *
    * MDN
    */
  lazy val onSelect: EP[DomValueElementEvent] = eventProp("select")

  /**
    * The input event is fired for input, select, textarea, and
    * contenteditable elements when it gets user input.
    */
  lazy val onInput: EP[DomValueElementEvent] = eventProp("input")

  /**
    * The blur event is raised when an element loses focus.
    *
    * MDN
    */
  lazy val onBlur: EP[DomFocusEvent] = eventProp("blur")


  /**
    * The focus event is raised when the user sets focus on the given element.
    *
    * MDN
    */
  lazy val onFocus: EP[DomFocusEvent] = eventProp("focus")

  /**
    * The submit event is raised when the user clicks a submit button in a form
    * (<input type="submit"/>).
    *
    * MDN
    */
  lazy val onSubmit: EP[DomEvent] = eventProp("submit")

  /**
    * The reset event is fired when a form is reset.
    *
    * MDN
    */
  lazy val onReset: EP[DomEvent] = eventProp("reset")

  /**
    * Script to be run when an element is invalid
    */
  lazy val onInvalid: EP[DomEvent] = eventProp("invalid")

  /**
    * Fires when the user writes something in a search field (for <input="search">)
    */
  lazy val onSearch: EP[DomEvent] = eventProp("search")
}
