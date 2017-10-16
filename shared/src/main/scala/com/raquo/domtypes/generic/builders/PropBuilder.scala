package com.raquo.domtypes.generic.builders

/**
  * @tparam P Prop
  */
trait PropBuilder[P[_]] {

  @inline def prop[V](key: String): P[V]
}
