package com.raquo.dombuilder.dombuilder.jsdom.builders

import com.raquo.dombuilder.dombuilder.generic.keys.Style

trait StyleBuilder {

  // @TODO[Integrity] we still use `new Style` in some places to support additional traits e.g. `with MarginAuto`
  @inline def build[V](jsKey: String, cssKey: String): Style[V] = {
    new Style[V](jsKey, cssKey)
  }
}
