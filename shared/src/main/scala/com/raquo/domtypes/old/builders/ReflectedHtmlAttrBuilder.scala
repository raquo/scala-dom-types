package com.raquo.domtypes.old.builders

import com.raquo.domtypes.old.codecs._
import com.raquo.domtypes.old.defs.reflectedAttrs.ReflectedHtmlAttrs

/** This trait builds objects representing reflected attributes which are typically on the left hand side
  * of the `reflectedAttr := value` syntax.
  *
  * Reflected attributes are explained in the README file.
  *
  * Also see [[ReflectedHtmlAttrs]] for a summary of
  * reflected attributes. Basically it's a subset of HTML attributes that are fully mirrored
  * as DOM properties, so typically you don't want to load both an attribute and a property
  * of the same name.
  *
  * @tparam RA ReflectedAttribute[ScalaValue, PropRawDomValue], either a Prop or an HtmlAttr,
  *            depending on whether you want to build properties or attributes
  */
trait ReflectedHtmlAttrBuilder[RA[_, _]] {

  // #Safe – DONE

  /** Create a reflected attribute */
  @inline protected def reflectedAttr[V, DomPropV]( // #Note - unused in the trait!
    attrKey: String,
    propKey: String,
    attrCodec: Codec[V, String],
    propCodec: Codec[V, DomPropV]
  ): RA[V, DomPropV]

  @inline protected def intReflectedAttr(attrKey: String, propKey: String): RA[Int, Int] = {
    reflectedAttr(attrKey = attrKey, propKey = propKey, attrCodec = IntAsStringCodec, propCodec = IntAsIsCodec)
  }

  // @inline protected def intReflectedAttr(key: String): RA[Int, Int] = {
  //   intReflectedAttr(attrKey = key, propKey = key)
  // }

  @inline protected def doubleReflectedAttr(attrKey: String, propKey: String): RA[Double, Double] = {
    reflectedAttr(attrKey = attrKey, propKey = propKey, attrCodec = DoubleAsStringCodec, propCodec = DoubleAsIsCodec)
  }

  @inline protected def stringReflectedAttr(attrKey: String, propKey: String): RA[String, String] = {
    reflectedAttr(attrKey = attrKey, propKey = propKey, attrCodec = StringAsIsCodec, propCodec = StringAsIsCodec)
  }

  // @inline protected def stringReflectedAttr(key: String): RA[String, String] = {
  //   stringReflectedAttr(attrKey = key, propKey = key)
  // }

  @inline protected def booleanAsPresenceReflectedAttr(attrKey: String, propKey: String): RA[Boolean, Boolean] = {
    reflectedAttr(attrKey = attrKey, propKey = propKey, attrCodec = BooleanAsAttrPresenceCodec, propCodec = BooleanAsIsCodec)
  }

  @inline protected def booleanAsTrueFalseReflectedAttr(attrKey: String, propKey: String): RA[Boolean, Boolean] = {
    reflectedAttr(attrKey = attrKey, propKey = propKey, attrCodec = BooleanAsTrueFalseStringCodec, propCodec = BooleanAsIsCodec)
  }

  @inline protected def booleanAsYesNoReflectedAttr(attrKey: String, propKey: String): RA[Boolean, Boolean] = {
    reflectedAttr(attrKey = attrKey, propKey = propKey, attrCodec = BooleanAsYesNoStringCodec, propCodec = BooleanAsIsCodec)
  }

  // @inline protected def booleanReflectedAttr(attrKey: String, propKey: String, attrCodec: Codec[Boolean, String]): RA[Boolean, Boolean] = {
  //   reflectedAttr(attrKey = attrKey, propKey = propKey, attrCodec = attrCodec, propCodec = BooleanAsIsCodec)
  // }

  // @inline protected def booleanReflectedAttr(key: String, attrCodec: Codec[Boolean, String]): RA[Boolean, Boolean] = {
  //   reflectedAttr(attrKey = key, propKey = key, attrCodec = attrCodec, propCodec = BooleanAsIsCodec)
  // }
}

