package com.raquo.dombuilder.dombuilder.generic.builders

import com.raquo.dombuilder.dombuilder.generic.modifiers.Modifier

trait Tag[+N] extends Builder[N] {

  val tagName: String

  val void: Boolean

  def apply(modifiers: Modifier[N]*): N = {
    val element = build()
    modifiers.foreach(_.applyTo(element))
    element
  }
}
