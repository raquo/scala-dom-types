package com.raquo.dombuilder.builders

import com.raquo.dombuilder.keys.Prop

trait PropBuilder[N] {

  @inline def prop[V](key: String): Prop[V, N] = {
    new Prop[V, N](key)
  }
}
