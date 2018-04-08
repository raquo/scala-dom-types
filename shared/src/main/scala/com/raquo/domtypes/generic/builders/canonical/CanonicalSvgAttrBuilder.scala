package com.raquo.domtypes.generic.builders.canonical

import com.raquo.domtypes.generic.builders.AttrBuilder
import com.raquo.domtypes.generic.codecs.Codec
import com.raquo.domtypes.generic.keys.SvgAttr

/** Canonical implementation of [[AttrBuilder]] for SVG attrs, using our own [[SvgAttr]] class.
  *
  * If you are using this implementation, create an implicit value class
  * around [[SvgAttr]] – there you can e.g. implement the `:=` method.
  *
  * Alternatively, implement your own [[AttrBuilder]] that uses either a
  * subclass of [[SvgAttr]] or a completely unrelated type of your own.
  */
trait CanonicalSvgAttrBuilder extends AttrBuilder[SvgAttr] {

  override protected def attr[V](key: String, codec: Codec[V, String]): SvgAttr[V] = new SvgAttr(key, codec)
}
