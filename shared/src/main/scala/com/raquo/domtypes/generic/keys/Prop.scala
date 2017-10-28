package com.raquo.domtypes.generic.keys

import com.raquo.domtypes.generic.codecs.Codec

/**
  * This class represents a DOM Element Property. Meaning the key that can be set, not a key-value pair.
  *
  * Note: following the Javascript DOM Spec, Properties are distinct from Attributes even when they share a name.
  *
  * @tparam V type of values that this Property can be set to
  */
class Prop[V] (override val name: String, val codec: Codec[V, _]) extends Key
