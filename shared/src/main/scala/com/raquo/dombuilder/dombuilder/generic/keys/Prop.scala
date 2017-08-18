package com.raquo.dombuilder.dombuilder.generic.keys

import com.raquo.dombuilder.dombuilder.generic.modifiers.PropSetter

class Prop[V] (val name: String) {

  def := (value: V): PropSetter[V] = {
    new PropSetter[V](this, value)
  }
}
