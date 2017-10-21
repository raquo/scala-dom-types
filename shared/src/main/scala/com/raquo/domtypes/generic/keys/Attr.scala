package com.raquo.domtypes.generic.keys

/**
  * This class represents an HTML Element Attribute. Meaning the key that can be set, not a key-value pair.
  *
  * Note: following the Javascript DOM Spec, Attributes are distinct from Properties even when they share a name.
  *
  * Note: Use [[BooleanAttr]] subclass to represent boolean attributes
  *
  * @tparam V type of values that this Attribute can be set to
  */
class Attr[V] (override val name: String) extends Key
