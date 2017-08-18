package com.raquo.dombuilder.dombuilder.utils.testing.matching

trait Rule[N] {
  def applyTo(testNode: ExpectedNode[N]): Unit
}
