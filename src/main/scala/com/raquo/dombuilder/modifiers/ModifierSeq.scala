package com.raquo.dombuilder.modifiers

class ModifierSeq[N](
  val modifiers: Iterable[Modifier[N]]
) extends Modifier[N] {

  def applyTo(node: N): Unit = {
    // @TODO[Performance] Use while loop? Measure.
    modifiers.foreach(_.applyTo(node))
  }
}
