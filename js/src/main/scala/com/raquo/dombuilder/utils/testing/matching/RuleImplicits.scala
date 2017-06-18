package com.raquo.dombuilder.utils.testing.matching

import com.raquo.dombuilder.generic.builders.Builder
import com.raquo.dombuilder.generic.keys.{Attr, Prop, Style}

trait RuleImplicits[N] {

  def comment: ExpectedNode[N]

  def textNode: ExpectedNode[N]

  implicit def asEmptyExpectedNode(builder: Builder[N]): ExpectedNode[N] = {
    new ExpectedNode[N](builder)
  }

  implicit def withAttrRuleOps[V](attr: Attr[V]): AttrRuleOps[V, N] = {
    new AttrRuleOps(attr)
  }

  implicit def withPropRuleOps[V](prop: Prop[V]): PropRuleOps[V, N] = {
    new PropRuleOps(prop)
  }

  implicit def withStyleRuleOps[V](style: Style[V]): StyleRuleOps[V, N] = {
    new StyleRuleOps(style)
  }

  implicit def childElementToRule(child: ExpectedNode[N]): Rule[N] = {
    new Rule[N] {
      def applyTo(expectedNode: ExpectedNode[N]): Unit = {
        child.addCheck(child.checkNodeType)
        expectedNode.addExpectedChild(child)
      }
    }
  }

  implicit def childTextToRule(childText: String): Rule[N] = {
    new Rule[N] {
      def applyTo(expectedNode: ExpectedNode[N]): Unit = {
        if (expectedNode.nodeType == "Comment") {
          expectedNode.addCheck(ExpectedNode.checkCommentText(childText))
        } else {
          val expectedTextChild = textNode
          expectedTextChild.addCheck(ExpectedNode.checkText(childText))
          expectedNode.addExpectedChild(expectedTextChild)
        }
      }
    }
  }
}
