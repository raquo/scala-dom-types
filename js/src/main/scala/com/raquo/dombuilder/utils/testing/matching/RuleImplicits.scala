package com.raquo.dombuilder.utils.testing.matching

import com.raquo.dombuilder.generic.builders.Tag
import com.raquo.dombuilder.generic.keys.{Attr, Prop, Style}
import com.raquo.dombuilder.generic.nodes.{RefNode, Text}

trait RuleImplicits[N]
  extends {

  protected val emptyTextNode: N with Text

  implicit def withNodeOps(emptyNode: N): NodeOps[N] = {
    new NodeOps[N](emptyNode)
  }

  implicit def withNodeOps[Ref](tag: Tag[N, Ref]): NodeOps[N] = {
    new NodeOps[N](tag.build())
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
          val expectedTextChild = new ExpectedNode[N](emptyTextNode)
          expectedTextChild.addCheck(ExpectedNode.checkText(childText))
          expectedNode.addExpectedChild(expectedTextChild)
        }
      }
    }
  }
}
