package com.raquo.dombuilder.utils.testing.matching

import com.raquo.dombuilder.keys.Attr
import com.raquo.dombuilder.utils.testing.UtilSpec.repr
// @TODO[SERVER]
import org.scalajs.dom

class AttrRuleOps[V, N](val attr: Attr[V, N]) extends AnyVal {

  def is(expected: V): Rule[N] = new Rule[N] {
    def applyTo(testNode: ExpectedNode[N]): Unit = {
      testNode.addCheck(nodeAttrIs(attr, Some(expected)))
    }
  }

  def isEmpty: Rule[N] = new Rule[N] {
    def applyTo(testNode: ExpectedNode[N]): Unit = {
      testNode.addCheck(nodeAttrIs(attr, None))
    }
  }

  private def nodeAttrIs(attr: Attr[V, N], maybeExpectedValue: Option[V])(node: dom.Node): MaybeError = {
    (node, maybeExpectedValue) match {
      case (element: dom.Element, None) =>
        if (element.hasAttribute(attr.name)) {
          val actual = element.getAttribute(attr.name)
          Some(s"Attr `${attr.name}` should not be present: actual value ${repr(actual)}, expected to be missing")
        } else {
          None
        }
      case (element: dom.Element, Some(expectedValue: Boolean)) =>
        val hasAttribute = element.hasAttribute(attr.name)
        val attributeValue = element.getAttribute(attr.name)
        (hasAttribute, expectedValue) match {
          case (true, false) =>
            Some(s"Boolean attr `${attr.name}` mismatch: attribute is present, its value is ${repr(attributeValue)}, expected attribute to be missing")
          case (false, true) =>
            Some(s"Boolean attr `${attr.name}` mismatch: attribute is missing, expected to be present")
          case (true, true) if attributeValue != "" =>
            Some(s"Boolean attr `${attr.name}` value mismatch: attribute present as expected, but actual value ${repr(attributeValue)}, expected no value")
          case _ => None
        }
      case (element: dom.Element, Some(expectedValue)) =>
        if (!element.hasAttribute(attr.name)) {
          Some(s"Attr `${attr.name}` is missing, expected ${repr(expectedValue)}")
        } else {
          val actualValue = element.getAttribute(attr.name)
          if (actualValue != expectedValue.toString) {
            Some(s"Attr `${attr.name}` value is incorrect: actual value ${repr(actualValue)}, expected value ${repr(expectedValue)}")
          } else {
            None
          }
        }
      case _ =>
        Some(s"Unable to verify Attr `${attr.name}` because node $node is not a DOM Element (might be a text node?)")
    }
  }
}
