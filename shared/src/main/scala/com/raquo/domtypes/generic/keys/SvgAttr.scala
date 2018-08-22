package com.raquo.domtypes.generic.keys

import com.raquo.domtypes.generic.codecs.Codec

/**
  * This class represents an Svg Element Attribute. Meaning the key that can be set, not the whole a key-value pair.
  *
  * @tparam V type of values that this Attribute can be set to
  */
class SvgAttr[V] (override val name: String, val codec: Codec[V, String], val namespace: Option[String]) extends Key
