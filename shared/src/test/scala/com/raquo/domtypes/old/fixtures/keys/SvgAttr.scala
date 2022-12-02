package com.raquo.domtypes.old.fixtures.keys

import com.raquo.domtypes.old.codecs.Codec

/**
  * This class represents an Svg Element Attribute. Meaning the key that can be set, not the whole a key-value pair.
  *
  * @tparam V type of values that this Attribute can be set to
  */
class SvgAttr[V] (override val name: String, val codec: Codec[V, String], val namespace: Option[String]) extends Key

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
