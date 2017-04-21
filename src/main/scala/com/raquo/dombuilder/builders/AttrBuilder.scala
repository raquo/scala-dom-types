package com.raquo.dombuilder.builders

import com.raquo.dombuilder.keys.Attr

trait AttrBuilder[N, DomElement <: DomNode, DomNode] {

  @inline def attr[V](key: String): Attr[V, N, DomElement, DomNode] = {
    new Attr[V, N, DomElement, DomNode](key)
  }
}
