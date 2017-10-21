package com.raquo.domtypes.generic.builders

/**
  * @tparam A Attribute, canonically [[com.raquo.domtypes.generic.keys.Attr]]
  * @tparam BA Boolean Attribute, canonically [[com.raquo.domtypes.generic.keys.BooleanAttr]]
  */
trait AttrBuilder[A[_], BA[_]] {

  /** Create an attribute
    *
    * Note: `A[Boolean]` returned by this method is not a boolean attribute,
    * it's an enumerated attribute which can be set to "true" or "false" in the DOM.
    *
    * For true boolean attributes, use the `booleanAttr` method.
    *
    * @return canonically, this returns an [[com.raquo.domtypes.generic.keys.Attr]]
    */
  @inline def attr[V](key: String): A[V]

  /** Create a boolean attribute
    *
    * Boolean attributes are to be encoded like this in the DOM:
    * - false means attribute is absent
    * - true means attribute is present (with no value)
    *
    * @return canonically, this returns a [[com.raquo.domtypes.generic.keys.BooleanAttr]]
    */
  @inline def booleanAttr(key: String): BA[Boolean]
}
