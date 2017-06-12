package com.raquo.dombuilder.builders

import com.raquo.dombuilder.keys.Style

trait StyleBuilder[N] {

  // @TODO[Integrity] we still use `new Style` in some places to support additional traits e.g. `with MarginAuto`
  @inline def style[V](jsKey: String, cssKey: String): Style[V, N] = {
    new Style[V, N](jsKey, cssKey)
  }
}
