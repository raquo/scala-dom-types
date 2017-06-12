package com.raquo.dombuilder.keys

import com.raquo.dombuilder.modifiers.PropSetter

class Prop[V, N] (val name: String) {

  def := (value: V): PropSetter[V, N] = {
    new PropSetter[V, N](this, value)
  }
}
