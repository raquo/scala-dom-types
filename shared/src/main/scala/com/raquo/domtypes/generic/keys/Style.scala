package com.raquo.domtypes.generic.keys

/**
  * This class represents a CSS Style property. Meaning the key that can be set, not a key-value pair.
  *
  * @param name  CSS property name, e.g. "background-color"
  * @tparam V  type of values that this CSS property can be set to (in addition to String, which is a sort of an escape hatch)
  */
class Style[V] (override val name: String) extends Key
