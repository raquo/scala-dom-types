package com.raquo.dombuilder.keys

import com.raquo.dombuilder.modifiers.AttrSetter

class Attr[V, N, DomElement] (val name: String) {

  def := (value: V): AttrSetter[V, N, DomElement] = {
    new AttrSetter[V, N, DomElement](this, value)
  }
}
