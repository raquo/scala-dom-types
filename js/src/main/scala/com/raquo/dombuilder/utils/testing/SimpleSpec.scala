package com.raquo.dombuilder.utils.testing

import com.raquo.dombuilder.generic.nodes.{Root, Text}
import com.raquo.dombuilder.jsdom.nodes.ChildNode
import com.raquo.dombuilder.jsdom.simple
import com.raquo.dombuilder.jsdom.simple.SimpleRefNode
import com.raquo.dombuilder.utils.testing.matching.RuleImplicits
import org.scalajs.dom
import org.scalatest.Suite

trait SimpleSpec
  extends MountSpec[SimpleRefNode]
  with RuleImplicits[SimpleRefNode]
  with DomEventSimulatorSpec {
  this: Suite =>

  override val emptyTextNode: SimpleRefNode with Text = simple.textNode("")

  override def rawMount(
    container: dom.Element,
    child: SimpleRefNode with ChildNode[SimpleRefNode, dom.Element]
  ): Root[SimpleRefNode, dom.Element, dom.Element, dom.Node] = {
    simple.root.mount(container, child)
  }
}
