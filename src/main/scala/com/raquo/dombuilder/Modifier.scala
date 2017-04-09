package com.raquo.dombuilder

import com.raquo.dombuilder.nodes.Node

/**
  * Represents a value that can be nested within a [[Node]]. This can be
  * another [[Modifier]], but can also be a CSS style or HTML attribute binding,
  * which will add itself to the node's attributes but not appear in the final
  * `children` list.
  */
trait Modifier[-N] {
  /**
    * Applies this modifier to the specified [[Node]], such that when
    * rendering is complete the effect of adding this modifier can be seen.
    */
  def applyTo(node: N): Unit
}

class ModifierSeq[N](
  val modifiers: Iterable[Modifier[N]]
) extends Modifier[N] {

  def applyTo(node: N): Unit = {
    // @TODO[Performance] Use while loop?
    modifiers.foreach(_.applyTo(node))
  }
}
