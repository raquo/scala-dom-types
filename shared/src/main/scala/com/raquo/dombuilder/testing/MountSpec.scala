package com.raquo.dombuilder.utils.testing

import com.raquo.dombuilder.nodes.ChildNode
import org.scalatest.{BeforeAndAfterEach, Suite}
import com.raquo.dombuilder.utils.testing.matching.MountOps
// @TODO[SERVER]
import org.scalajs.dom

trait MountSpec[Ch <: ChildNode[N, dom.Node, dom.Node], N]
  extends BeforeAndAfterEach
  with MountOps[Ch, N]
{ this: Suite =>

  override def doAssert(condition: Boolean, message: String): Unit = assert(condition, message)

  override def doFail(message: String): Nothing = fail(message)

  override def beforeEach(): Unit = {
    super.beforeEach()
    resetDocument()
  }

  override def afterEach(): Unit = {
    super.afterEach()
    clearDocument()
  }
}
