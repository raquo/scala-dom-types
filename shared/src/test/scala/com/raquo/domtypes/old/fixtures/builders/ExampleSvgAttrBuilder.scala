package com.raquo.domtypes.old.fixtures.builders

import com.raquo.domtypes.old.builders.SvgAttrBuilder
import com.raquo.domtypes.old.codecs.Codec
import com.raquo.domtypes.old.fixtures.keys.SvgAttr

/** Example implementation of [[SvgAttrBuilder]], using our own [[SvgAttr]] class.
  *
  * If you are using this implementation, create an implicit value class
  * around [[SvgAttr]] – there you can e.g. implement the `:=` method.
  *
  * Alternatively, implement your own [[SvgAttrBuilder]] that uses either a
  * subclass of [[SvgAttr]] or a completely unrelated type of your own.
  */
trait ExampleSvgAttrBuilder extends SvgAttrBuilder[SvgAttr] {

  override protected def svgAttr[V](key: String, codec: Codec[V, String], namespace: Option[String]): SvgAttr[V] = {
    new SvgAttr(key, codec, namespace)
  }
}
