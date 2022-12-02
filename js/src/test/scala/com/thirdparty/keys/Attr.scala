package com.thirdparty.keys

import com.thirdparty.codecs.Codec
import com.thirdparty.setters.HtmlAttrSetter

trait Attr[V] {
  val domName: String
  val codec: Codec[V, String]
}

case class HtmlAttr[V](
  override val domName: String,
  override val codec: Codec[V, String]
) extends Attr[V] {

  def := (value: V): HtmlAttrSetter[V] = HtmlAttrSetter(this, value)
}

case class SvgAttr[V](
  override val domName: String,
  override val codec: Codec[V, String],
  namespace: Option[String]
) extends Attr[V]

case class AriaAttr[V](
  override val domName: String,
  override val codec: Codec[V, String]
) extends Attr[V]
