package com.raquo.dombuilder.utils.testing.matching

import com.raquo.dombuilder.keys.Style
import com.raquo.dombuilder.utils.testing.UtilSpec.repr
import org.scalajs.dom

import scala.scalajs.js

class StyleRuleOps[V, N](val style: Style[V, N]) extends AnyVal {

  def is(expected: V): Rule[N] = new Rule[N] {
    def applyTo(testNode: ExpectedNode[N]): Unit = {
      testNode.addCheck(nodeStyleIs(style, expected))
    }
  }

  private def nodeStyleIs(style: Style[V, N], expectedValue: V)(node: dom.Node): MaybeError = {
    val maybeActualValue = node.asInstanceOf[js.Dynamic]
      .selectDynamic("style")
      .selectDynamic(style.name)
      .asInstanceOf[js.UndefOr[V]].toOption
    maybeActualValue match {
      case Some(actualValue) =>
        if (actualValue == expectedValue) {
          None
        } else {
          Some(s"Style `${style.name}` value is incorrect: actual value ${repr(actualValue)}, expected value ${repr(expectedValue)}")
        }
      case None =>
        Some(s"Style `${style.name}` is completely missing, expected ${repr(expectedValue)}")
    }
  }

  private def getStyle(element: dom.Element, style: Style[V, N]): Option[String] = {
    element.asInstanceOf[js.Dynamic]
      .selectDynamic("style")
      .selectDynamic(style.name)
      .asInstanceOf[js.UndefOr[String]].toOption
  }
}
