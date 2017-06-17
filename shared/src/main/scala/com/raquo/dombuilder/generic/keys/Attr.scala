package com.raquo.dombuilder.generic.keys

import com.raquo.dombuilder.generic.modifiers.AttrSetter

class Attr[V] (val name: String) {

  def := (value: V): AttrSetter[V] = {
    new AttrSetter[V](this, value)
  }
}
