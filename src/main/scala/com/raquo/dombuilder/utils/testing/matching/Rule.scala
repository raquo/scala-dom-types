package com.raquo.dombuilder.utils.testing.matching

trait Rule[N] {
  def applyTo(testNode: ExpectedNode[N]): Unit
}
