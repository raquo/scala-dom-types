package com.raquo.dombuilder.utils.testing

import com.raquo.dombuilder.builders.nodes.NodeBuilder
import com.raquo.dombuilder.domapi.TreeApi
import com.raquo.dombuilder.simple
import com.raquo.dombuilder.simple.nodes.{SimpleElement, SimpleNode, SimpleText}
import com.raquo.dombuilder.utils.testing.matching.RuleImplicits
import org.scalajs.dom
import org.scalatest.Suite


trait SimpleSpec
  extends MountSpec[SimpleElement, SimpleNode]
  with RuleImplicits[SimpleNode]
  with DomEventSimulatorSpec
{ this: Suite =>

  override val treeApi: TreeApi[SimpleNode, dom.Node] = simple.treeApi

  override val textNodeBuilder: NodeBuilder[SimpleText, SimpleNode, dom.Text] = simple.textBuilder
}
