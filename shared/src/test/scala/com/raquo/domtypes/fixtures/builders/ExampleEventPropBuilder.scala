package com.raquo.domtypes.fixtures.builders

import com.raquo.domtypes.fixtures.keys.EventProp
import com.raquo.domtypes.old.builders.EventPropBuilder

/** Example implementation of [[EventPropBuilder]], using our own [[EventProp]] class.
  *
  * If you are using this implementation, create an implicit value class
  * around [[EventProp]] – there you can e.g. implement the `:=` method.
  *
  * Alternatively, implement your own [[EventPropBuilder]] that uses either a
  * subclass of [[EventProp]] or a completely unrelated type of your own.
  */
trait ExampleEventPropBuilder[DomEvent] extends EventPropBuilder[EventProp, DomEvent] {

  override protected def eventProp[Ev <: DomEvent](key: String): EventProp[Ev] = new EventProp(key)
}
