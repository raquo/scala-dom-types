package com.raquo.dombuilder.dombuilder.utils.testing

import com.raquo.dombuilder.dombuilder.utils.testing.matching.MountOps
import org.scalatest.{BeforeAndAfterEach, Suite}

trait MountSpec[N]
  extends BeforeAndAfterEach
  with MountOps[N]
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
