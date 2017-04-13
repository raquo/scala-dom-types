package com.raquo.dombuilder.utils.testing.matching

import com.raquo.dombuilder.builders.HasNodeBuilder
import com.raquo.dombuilder.keys.{Attr, Prop, Style}
import com.raquo.dombuilder.nodes.{Comment, Element, Text}

trait RuleImplicits[N] extends HasNodeBuilder[Element[N], Text[N], Comment[N], N] {

  implicit def withEmptyNodeOps(emptyNode: N): EmptyNodeOps[N] = {
    new EmptyNodeOps[N](emptyNode)
  }

  implicit def withAttrRuleOps[V](attr: Attr[V, N]): AttrRuleOps[V, N] = {
    new AttrRuleOps(attr)
  }

  implicit def withPropRuleOps[V](prop: Prop[V, N]): PropRuleOps[V, N] = {
    new PropRuleOps(prop)
  }

  implicit def withStyleRuleOps[V](style: Style[V, N]): StyleRuleOps[V, N] = {
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
          val expectedTextChild = new ExpectedNode[N](nodeBuilder.textNode(childText))
          expectedTextChild.addCheck(ExpectedNode.checkText(childText))
          expectedNode.addExpectedChild(expectedTextChild)
        }
      }
    }
  }
}
