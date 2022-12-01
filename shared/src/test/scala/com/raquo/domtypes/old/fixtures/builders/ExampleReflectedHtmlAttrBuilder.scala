package com.raquo.domtypes.old.fixtures.builders

import ExampleReflectedHtmlAttrBuilder.ReflectedAttr
import com.raquo.domtypes.old.builders.ReflectedHtmlAttrBuilder
import com.raquo.domtypes.old.codecs.Codec
import com.raquo.domtypes.old.fixtures.keys.{HtmlAttr, Prop}

/** Example implementation of [[ReflectedHtmlAttrBuilder]], using our own [[Prop]] class.
  *
  * If you are using this implementation, create an implicit value class
  * around [[Prop]] – there you can e.g. implement the `:=` method.
  *
  * Alternatively, you can use [[ReflectedPropBuilder]], or implement your own
  * [[ReflectedHtmlAttrBuilder]] that uses either a subclass of either [[Prop]] or
  * [[HtmlAttr]], or a completely unrelated type of your own.
  */
trait ExampleReflectedHtmlAttrBuilder extends ReflectedHtmlAttrBuilder[ReflectedAttr] {

  override protected def reflectedAttr[V, DomPropV](
    attrKey: String,
    propKey: String,
    attrCodec: Codec[V, String],
    propCodec: Codec[V, DomPropV]
  ): Prop[V, DomPropV] = {
    // Note that we use `propKey` and `propCodec` params to build Prop, because it
    // represents a DOM property, not an HTML attribute. If you wanted a representation
    // of an HTML attribute instead, you would use `attrKey` and `attrCodec`.
    new Prop(propKey, propCodec)
  }
}

object ExampleReflectedHtmlAttrBuilder {

  type ReflectedAttr[V, DomV] = Prop[V, DomV]
}
