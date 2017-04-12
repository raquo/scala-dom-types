package com.raquo.dombuilder.definitions.eventProps

import com.raquo.dombuilder.Builder
import com.raquo.dombuilder.keys.EventProp
import org.scalajs.dom

trait FormEventProps[N] { self: Builder[N] =>

  /**
    * The blur event is raised when an element loses focus.
    *
    * MDN
    */
  lazy val onBlur: EventProp[dom.Event, N] = eventProp("blur")

  /**
    * The change event is fired for input, select, and textarea elements
    * when a change to the element's value is committed by the user.
    *
    * MDN
    */
  lazy val onChange: EventProp[dom.Event, N] = eventProp("change")

  /**
    * The focus event is raised when the user sets focus on the given element.
    *
    * MDN
    */
  lazy val onFocus: EventProp[dom.Event, N] = eventProp("focus")

  /**
    * The select event only fires when text inside a text input or textarea is
    * selected. The event is fired after the text has been selected.
    *
    * MDN
    */
  lazy val onSelect: EventProp[dom.Event, N] = eventProp("select")

  /**
    * The submit event is raised when the user clicks a submit button in a form
    * (<input type="submit"/>).
    *
    * MDN
    */
  lazy val onSubmit: EventProp[dom.Event, N] = eventProp("submit")

  /**
    * The reset event is fired when a form is reset.
    *
    * MDN
    */
  lazy val onReset: EventProp[dom.Event, N] = eventProp("reset")

  /**
    * Script to be run when a context menu is triggered
    */
  lazy val onContextMenu: EventProp[dom.Event, N] = eventProp("contextmenu")

  /**
    * Script to be run when an element gets user input
    */
  lazy val onInput: EventProp[dom.Event, N] = eventProp("input")

  /**
    * Script to be run when an element is invalid
    */
  lazy val onInvalid: EventProp[dom.Event, N] = eventProp("invalid")

  /**
    * Fires when the user writes something in a search field (for <input="search">)
    */
  lazy val onSearch: EventProp[dom.Event, N] = eventProp("search")
}
