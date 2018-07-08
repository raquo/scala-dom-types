package com.raquo.domtypes.generic.builders.canonical

import com.raquo.domtypes.generic.builders.ReflectedHtmlAttrBuilder
import com.raquo.domtypes.generic.builders.canonical.CanonicalReflectedHtmlAttrBuilder.ReflectedAttr
import com.raquo.domtypes.generic.codecs.Codec
import com.raquo.domtypes.generic.keys.HtmlAttr

/** Canonical implementation of [[ReflectedHtmlAttrBuilder]], using our own [[HtmlAttr]] class.
  *
  * If you are using this implementation, create an implicit value class
  * around [[HtmlAttr]] – there you can e.g. implement the `:=` method.
  *
  * Alternatively, you can use [[CanonicalReflectedPropBuilder]], or implement your own
  * [[ReflectedHtmlAttrBuilder]] that uses either a subclass of either [[HtmlAttr]] or
  * [[com.raquo.domtypes.generic.keys.Prop]], or a completely unrelated type of your own.
  */
trait CanonicalReflectedHtmlAttrBuilder extends ReflectedHtmlAttrBuilder[ReflectedAttr] {

  override protected def reflectedAttr[V, DomPropV](
    attrKey: String,
    propKey: String,
    attrCodec: Codec[V, String],
    propCodec: Codec[V, DomPropV]
  ): HtmlAttr[V] = {
    // Note that we use `attrKey` and `attrCodec` params to build Attr, because it
    // represents an HTML attribute, not a DOM property. If you wanted a representation
    // of a DOM property instead, you would use `propKey` and `propCodec`.
    new HtmlAttr(attrKey, attrCodec)
  }
}

object CanonicalReflectedHtmlAttrBuilder {

  // @TODO[Integrity] We can't enforce that DomV is String here, but we know it from the DOM spec.
  /** All this type alias does is discard the DomV type param that is not used in Attrs. */
  type ReflectedAttr[V, DomV] = HtmlAttr[V]
}
