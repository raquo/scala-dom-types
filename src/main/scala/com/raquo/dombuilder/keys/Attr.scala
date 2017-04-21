package com.raquo.dombuilder.keys

import com.raquo.dombuilder.modifiers.AttrSetter

class Attr[V, N, DomElement <: DomNode, DomNode] (val name: String) {

  def := (value: V): AttrSetter[V, N, DomElement, DomNode] = {
    new AttrSetter[V, N, DomElement, DomNode](this, value)
  }
}
