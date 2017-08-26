package com.raquo.domtypes.generic.builders

/** Tag is an Element Builder */
trait Tag[+N] extends Builder[N] {

  val tagName: String

  val void: Boolean
}
