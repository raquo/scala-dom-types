package com.raquo.dombuilder.builders

import com.raquo.dombuilder.keys.Attr

trait AttrBuilder[N, DomElement] {

  @inline def attr[V](key: String): Attr[V, N, DomElement] = {
    new Attr[V, N, DomElement](key)
  }
}
