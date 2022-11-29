package com.thirdparty.keys

import com.thirdparty.codecs.Codec

trait Attr[A] {
  val domName: String
  val codec: Codec[A, String]
}

case class HtmlAttr[A](
  override val domName: String,
  override val codec: Codec[A, String]
) extends Attr[A]

case class SvgAttr[A](
  override val domName: String,
  override val codec: Codec[A, String],
  namespace: Option[String]
) extends Attr[A]

case class AriaAttr[A](
  override val domName: String,
  override val codec: Codec[A, String]
) extends Attr[A]
