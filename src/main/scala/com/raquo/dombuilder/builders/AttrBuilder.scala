package com.raquo.dombuilder.builders

import com.raquo.dombuilder.keys.Attr

trait AttrBuilder[N] {

  @inline def attr[V](key: String): Attr[V, N] = {
    new Attr[V, N](key)
  }
}
