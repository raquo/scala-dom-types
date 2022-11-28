package com.raquo.domtypes.fixtures.builders

import com.raquo.domtypes.fixtures.keys.HtmlAttr
import com.raquo.domtypes.old.builders.HtmlAttrBuilder
import com.raquo.domtypes.old.codecs.Codec

/** Example implementation of [[HtmlAttrBuilder]], using our own [[HtmlAttr]] class.
  *
  * If you are using this implementation, create an implicit value class
  * around [[HtmlAttr]] – there you can e.g. implement the `:=` method.
  *
  * Alternatively, implement your own [[HtmlAttrBuilder]] that uses either a
  * subclass of [[HtmlAttr]] or a completely unrelated type of your own.
  */
trait ExampleHtmlAttrBuilder extends HtmlAttrBuilder[HtmlAttr] {

  override protected def htmlAttr[V](key: String, codec: Codec[V, String]): HtmlAttr[V] = new HtmlAttr(key, codec)
}
