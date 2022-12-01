package com.raquo.domtypes.old.fixtures.builders

import com.raquo.domtypes.old.builders.PropBuilder
import com.raquo.domtypes.old.codecs.Codec
import com.raquo.domtypes.old.fixtures.keys.Prop

/** Example implementation of [[PropBuilder]], using our own [[Prop]] class.
  *
  * If you are using this implementation, create an implicit value class
  * around [[Prop]] – there you can e.g. implement the `:=` method.
  *
  * Alternatively, implement your own [[PropBuilder]] that uses either a
  * subclass of [[Prop]] or a completely unrelated type of your own.
  */
trait ExamplePropBuilder extends PropBuilder[Prop] {

  override protected def prop[V, DomV](key: String, codec: Codec[V, DomV]): Prop[V, DomV] = new Prop(key, codec)
}
