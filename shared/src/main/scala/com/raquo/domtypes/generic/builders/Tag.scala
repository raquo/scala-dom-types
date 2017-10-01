package com.raquo.domtypes.generic.builders

/** Tag is an Element builder
  *
  * Note: we use `build` instead of `apply` because otherwise Scala compiler gets confused when using TagSyntax.apply in Scala DOM Builder
  * */
trait Tag[+Element] {

  val tagName: String

  val void: Boolean

  def build(): Element
}
