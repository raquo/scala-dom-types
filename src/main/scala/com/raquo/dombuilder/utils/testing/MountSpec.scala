package com.raquo.dombuilder.utils.testing

import com.raquo.dombuilder.nodes.Element
import org.scalatest.{BeforeAndAfterEach, Suite}
import com.raquo.dombuilder.utils.testing.matching.MountOps

trait MountSpec[El <: Element[N], N]
  extends BeforeAndAfterEach
  with MountOps[El, N]
{ self: Suite =>

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
