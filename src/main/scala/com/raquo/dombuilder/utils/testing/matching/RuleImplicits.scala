package com.raquo.dombuilder.utils.testing.matching

import com.raquo.dombuilder.builders.TextNodeBuilder
import com.raquo.dombuilder.keys.{Attr, Prop, Style}

trait RuleImplicits[N] extends {

  protected val textNodeBuilder: TextNodeBuilder[_, N, _]

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
          val expectedTextChild = new ExpectedNode[N](textNodeBuilder.textNode(childText))
          expectedTextChild.addCheck(ExpectedNode.checkText(childText))
          expectedNode.addExpectedChild(expectedTextChild)
        }
      }
    }
  }
}
