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

object SvgAttr {

  def namespaceUrl(namespace: String): String = {
    namespace match {
      case "svg" => "http://www.w3.org/2000/svg"
      case "xlink" => "http://www.w3.org/1999/xlink"
      case "xml" => "http://www.w3.org/XML/1998/namespace"
      case "xmlns" => "http://www.w3.org/2000/xmlns/"
    }
  }
}

class AriaAttr[V](
  override val domName: String,
  override val codec: Codec[V, String]
) extends Attr[V]
