package com.raquo.dombuilder.generic.builders

import com.raquo.dombuilder.generic.modifiers.Modifier

trait Tag[+N] extends Builder[N] {

  val tagName: String

  val void: Boolean

  def apply(modifiers: Modifier[N]*): N = {
    val element = build()
    modifiers.foreach(_.applyTo(element))
    element
  }
}
