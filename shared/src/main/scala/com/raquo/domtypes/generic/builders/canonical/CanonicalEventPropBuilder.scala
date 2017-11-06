package com.raquo.domtypes.generic.builders.canonical

import com.raquo.domtypes.generic.builders.EventPropBuilder
import com.raquo.domtypes.generic.keys.EventProp

/** Canonical implementation of [[EventPropBuilder]], using our own [[EventProp]] class.
  *
  * If you are using this implementation, create an implicit value class
  * around [[EventProp]] – there you can e.g. implement the `:=` method.
  *
  * Alternatively, implement your own [[EventPropBuilder]] that uses either a
  * subclass of [[EventProp]] or a completely unrelated type of your own.
  */
trait CanonicalEventPropBuilder[DomEvent] extends EventPropBuilder[EventProp, DomEvent] {

  override def eventProp[Ev <: DomEvent](key: String): EventProp[Ev] = new EventProp(key)
}
