package com.raquo.dombuilder.generic.builders

trait Builder[K[_]] {
  @inline def build[V](key: String): K[V]
}
