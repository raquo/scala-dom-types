package com.raquo.dombuilder.dombuilder.utils.testing

import com.raquo.dombuilder.dombuilder.generic.nodes.Root
import com.raquo.dombuilder.dombuilder.jsdom.nodes.ChildNode
import com.raquo.dombuilder.dombuilder.jsdom.simple.SimpleRefNode
import com.raquo.dombuilder.dombuilder.jsdom.simple.builders.{SimpleCommentBuilder, SimpleTextBuilder}
import com.raquo.dombuilder.dombuilder.jsdom.simple
import com.raquo.dombuilder.dombuilder.utils.testing.matching.{ExpectedNode, RuleImplicits}
import org.scalajs.dom
import org.scalatest.Suite

trait SimpleSpec
  extends MountSpec[SimpleRefNode]
  with RuleImplicits[SimpleRefNode]
  with DomEventSimulatorSpec {
  this: Suite =>

  override def comment: ExpectedNode[SimpleRefNode] = {
    new ExpectedNode(SimpleCommentBuilder)
  }

  override def textNode: ExpectedNode[SimpleRefNode] = {
    new ExpectedNode(SimpleTextBuilder)
  }

  override def makeRoot(
    container: dom.Element,
    child: SimpleRefNode with ChildNode[SimpleRefNode, dom.Element]
  ): Root[SimpleRefNode, SimpleRefNode with ChildNode[SimpleRefNode, dom.Element], dom.Element, dom.Node] = {
    simple.mount(container, child)
  }
}
