package com.raquo.domtypes.generic.builders

/**
  * @tparam A Attribute
  */
trait AttrBuilder[A[_]] {

  @inline def attr[V](key: String): A[V]
}
