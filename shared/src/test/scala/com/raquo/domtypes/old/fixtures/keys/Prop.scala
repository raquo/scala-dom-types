package com.raquo.domtypes.old.fixtures.keys

import com.raquo.domtypes.old.codecs.Codec

/**
  * This class represents a DOM Element Property. Meaning the key that can be set, not a key-value pair.
  *
  * Note: following the Javascript DOM Spec, Properties are distinct from Attributes even when they share a name.
  *
  * @tparam V type of values that this Property can be set to
  * @tparam DomV type of values that this Property holds in the native Javascript DOM
  */
class Prop[V, DomV] (override val name: String, val codec: Codec[V, DomV]) extends Key
