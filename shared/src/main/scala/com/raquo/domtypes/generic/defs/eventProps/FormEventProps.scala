package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.EventPropBuilder

/**
  * @tparam DomElementTargetEvent
  *            An event that has an Element as `target`.
  *            This event type has no corresponding type in JS DOM. See our own `TypedTargetEvent` trait.
  * @tparam DomHtmlElementTargetEvent
  *            An event that has an HTMLElement as `target`.
  *            This event type has no corresponding type in JS DOM. See our own `TypedTargetEvent` trait.
  * @tparam DomFormElementTargetEvent
  *            An event that has an HTMLFormElement as `target`.
  *            This event type has no corresponding type in JS DOM. See our own `TypedTargetEvent` trait.
  * @tparam DomInputElementTargetEvent
  *            An event that has an HTMLInputElement as `target`.
  *            This event type has no corresponding type in JS DOM. See our own `TypedTargetEvent` trait.
  *            - Strictly speaking, this type is not applicable to `onInput` because the latter
  *              can be fired on any HTMLElement that has `contentEditable` mode enabled.
  *            - Similarly for `onChange` and `onSelect` – these could also fire on an `HTMLTextAreaElement`.
  * @tparam DomInputEvent
  *            DOM InputEvent https://developer.mozilla.org/en-US/docs/Web/API/InputEvent
  *            Note: This type is not implemented in scala-js-dom
  */
trait FormEventProps[
  EP[_ <: DomEvent],
  DomEvent,
  DomElementFocusEvent <: DomElementTargetEvent,
  DomInputEvent <: DomEvent,
  DomElementTargetEvent <: DomEvent,
  DomHtmlElementTargetEvent <: DomEvent,
  DomFormElementTargetEvent <: DomEvent,
  DomInputElementTargetEvent <: DomEvent
] { this: EventPropBuilder[EP, DomEvent] =>

  /**
    * The change event is fired for input, select, and textarea elements
    * when a change to the element's value is committed by the user.
    *
    * MDN
    */
  lazy val onChange: EP[DomHtmlElementTargetEvent] = eventProp("change")

  /**
    * The select event only fires when text inside a text input or textarea is
    * selected. The event is fired after the text has been selected.
    *
    * MDN
    */
  lazy val onSelect: EP[DomHtmlElementTargetEvent] = eventProp("select")

  /**
    * The input event is fired for input, select, textarea, and
    * contentEditable elements when it gets user input.
    */
  lazy val onInput: EP[DomHtmlElementTargetEvent] = eventProp("input")

  /**
    * The blur event is raised when an element loses focus.
    *
    * MDN
    */
  lazy val onBlur: EP[DomElementFocusEvent] = eventProp("blur")

  /**
    * The focus event is raised when the user sets focus on the given element.
    *
    * MDN
    */
  lazy val onFocus: EP[DomElementFocusEvent] = eventProp("focus")

  /**
    * The submit event is fired when the user clicks a submit button in a form
    * (<input type="submit"/>).
    *
    * MDN
    */
  lazy val onSubmit: EP[DomFormElementTargetEvent] = eventProp("submit")

  /**
    * The reset event is fired when a form is reset.
    *
    * MDN
    */
  lazy val onReset: EP[DomFormElementTargetEvent] = eventProp("reset")

  /**
    * Script to be run when an element is invalid
    */
  lazy val onInvalid: EP[DomElementTargetEvent] = eventProp("invalid")

  /**
    * Fires when the user writes something in a search field (for <input="search">)
    */
  lazy val onSearch: EP[DomInputElementTargetEvent] = eventProp("search")
}
