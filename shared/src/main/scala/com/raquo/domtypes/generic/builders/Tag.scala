package com.raquo.domtypes.generic.builders

/** Tag is an Element Builder */
trait Tag[+Ref] extends Builder[Ref] {

  val tagName: String

  val void: Boolean
}
