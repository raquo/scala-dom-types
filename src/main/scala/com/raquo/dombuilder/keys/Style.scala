package com.raquo.dombuilder.keys

import com.raquo.dombuilder.modifiers.StyleSetter

class Style[V, N] (
  val name: String,
  val cssName: String // @TODO[API] Will anyone need cssName, ever? Maybe let's remove it
) {

  def := (value: V): StyleSetter[V, N] = {
    new StyleSetter[V, N](this, value)
  }
}
