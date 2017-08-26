package com.raquo.domtypes.generic.builders

trait SpecializedBuilder[K[_]] {
  @inline def build[V](key: String): K[V]
}
