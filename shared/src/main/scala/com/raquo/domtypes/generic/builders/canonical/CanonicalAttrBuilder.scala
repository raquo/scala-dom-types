package com.raquo.domtypes.generic.builders.canonical

import com.raquo.domtypes.generic.builders.AttrBuilder
import com.raquo.domtypes.generic.codecs.Codec
import com.raquo.domtypes.generic.keys.Attr

/** Canonical implementation of [[AttrBuilder]], using our own [[Attr]] class.
  *
  * If you are using this implementation, create an implicit value class
  * around [[Attr]] – there you can e.g. implement the `:=` method.
  *
  * Alternatively, implement your own [[AttrBuilder]] that uses either a
  * subclass of [[Attr]] or a completely unrelated type of your own.
  */
trait CanonicalAttrBuilder extends AttrBuilder[Attr] {

  override def attr[V](key: String, codec: Codec[V, _]): Attr[V] = new Attr(key, codec)
}
