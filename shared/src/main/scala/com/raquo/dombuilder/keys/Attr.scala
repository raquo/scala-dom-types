package com.raquo.dombuilder.keys

import com.raquo.dombuilder.modifiers.AttrSetter

class Attr[V, N] (val name: String) {

  def := (value: V): AttrSetter[V, N] = {
    new AttrSetter[V, N](this, value)
  }
}
