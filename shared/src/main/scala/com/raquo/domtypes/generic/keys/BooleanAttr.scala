package com.raquo.domtypes.generic.keys

/**
  * [[BooleanAttr]] represents a boolean attribute, whereas a mere
  * `Attr[Boolean]` can also represent an enumerated attribute that
  * is limited to boolean values.
  *
  * For the explanation of boolean vs enumerated attributes,
  * see [[com.raquo.domtypes.generic.builders.AttrBuilder]]
  */
class BooleanAttr(override val name: String) extends Attr[Boolean](name)
