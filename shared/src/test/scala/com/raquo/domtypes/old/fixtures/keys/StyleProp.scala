package com.raquo.domtypes.old.fixtures.keys

/**
  * This class represents a CSS Style property. Meaning the key that can be set, not a key-value pair.
  *
  * @param name  CSS property name, e.g. "background-color"
  * @param prefixes  List of vendor prefixes that should be set when this property is set
  *
  * @tparam V  type of values that this CSS property can be set to (in addition to String, which can always be set)
  */
class StyleProp[V] (
  override val name: String,
  val prefixes: List[String] = Nil
) extends Key
