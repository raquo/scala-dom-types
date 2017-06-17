package com.raquo.dombuilder.generic.builders

import com.raquo.dombuilder.generic.modifiers.Modifier

trait Tag[+N, Ref] {

  val tagName: String

  val void: Boolean

  def build(): N

  def apply(modifiers: Modifier[N]*): N = {
    val element = build()
    modifiers.foreach(_.applyTo(element))
    element
  }
}
