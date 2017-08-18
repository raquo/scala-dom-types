package com.raquo.dombuilder.dombuilder.generic.modifiers

/** Represents an action that mutates a Node.
  *
  * For example, this could be an [[AttrSetter]] that sets a specific attribute to a specific value.
  */
trait Modifier[-N] {

  /**
    * Applies this modifier to the specified Node, such that when
    * rendering is complete the effect of adding this modifier can be seen.
    */
  def applyTo(node: N): Unit
}
