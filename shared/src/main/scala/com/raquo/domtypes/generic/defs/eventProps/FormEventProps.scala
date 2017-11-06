package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.EventPropBuilder

trait FormEventProps[EP[_ <: DomEvent], DomEvent] { this: EventPropBuilder[EP, DomEvent] =>

  /**
    * The blur event is raised when an element loses focus.
    *
    * MDN
    */
  lazy val onBlur: EP[DomEvent] = eventProp("blur")

  /**
    * The change event is fired for input, select, and textarea elements
    * when a change to the element's value is committed by the user.
    *
    * MDN
    */
  lazy val onChange: EP[DomEvent] = eventProp("change")

  /**
    * The focus event is raised when the user sets focus on the given element.
    *
    * MDN
    */
  lazy val onFocus: EP[DomEvent] = eventProp("focus")

  /**
    * The select event only fires when text inside a text input or textarea is
    * selected. The event is fired after the text has been selected.
    *
    * MDN
    */
  lazy val onSelect: EP[DomEvent] = eventProp("select")

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
    * Script to be run when a context menu is triggered
    */
  lazy val onContextMenu: EP[DomEvent] = eventProp("contextmenu")

  /**
    * Script to be run when an element gets user input
    */
  lazy val onInput: EP[DomEvent] = eventProp("input")

  /**
    * Script to be run when an element is invalid
    */
  lazy val onInvalid: EP[DomEvent] = eventProp("invalid")

  /**
    * Fires when the user writes something in a search field (for <input="search">)
    */
  lazy val onSearch: EP[DomEvent] = eventProp("search")
}
