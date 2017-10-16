package com.raquo.domtypes.generic.builders

/**
  * @tparam EP EventProp
  * @tparam DomEvent Base type for DOM events (dom.Event in Scala JS)
  */
trait EventPropBuilder[EP[Ev <: DomEvent], DomEvent] {

  @inline def build[Ev <: DomEvent](key: String): EP[Ev]
}
