package com.raquo.dombuilder.dombuilder.generic.keys

import com.raquo.dombuilder.dombuilder.generic.modifiers.StyleSetter

class Style[V] (
  val name: String,
  val cssName: String // @TODO[API] Will anyone need cssName, ever? Maybe let's remove it
) {
  def := (value: V): StyleSetter[V] = {
    new StyleSetter[V](this, value)
  }
}
