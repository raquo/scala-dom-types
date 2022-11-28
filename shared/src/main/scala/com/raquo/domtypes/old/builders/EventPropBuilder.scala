package com.raquo.domtypes.old.builders

/** This trait builds event prop objects which are typically found on the left hand side
  * of the `onEvent := callback` syntax.
  *
  * @tparam EP EventProp
  * @tparam DomEvent Base type for DOM events (dom.Event in Scala JS)
  */
trait EventPropBuilder[EP[Ev <: DomEvent], DomEvent] {

  // #Safe – DONE. TypedTarget thrown out.

  @inline protected def eventProp[Ev <: DomEvent](key: String): EP[Ev]
}
