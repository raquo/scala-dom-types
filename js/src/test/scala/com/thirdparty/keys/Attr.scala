package com.thirdparty.keys

import com.thirdparty.codecs.Codec
import com.thirdparty.setters.HtmlAttrSetter

trait Attr[V] {
  val domName: String
  val codec: Codec[V, String]
}

class HtmlAttr[V](
  override val domName: String,
  override val codec: Codec[V, String]
) extends Attr[V] {

  def := (value: V): HtmlAttrSetter[V] = HtmlAttrSetter(this, value)
}

class SvgAttr[V](
  override val domName: String,
  override val codec: Codec[V, String],
  val namespace: Option[String]
) extends Attr[V] {

  def qualifiedName: String = namespace.map(_ + ":" + domName).getOrElse(domName)
}

class AriaAttr[V](
  override val domName: String,
  override val codec: Codec[V, String]
) extends Attr[V]

class MathMlAttr[V](
  override val domName: String,
  override val codec: Codec[V, String]
) extends Attr[V]
