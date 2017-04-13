package com.raquo.dombuilder.utils.testing

import com.raquo.dombuilder.builders.{Builder, NodeBuilder}
import com.raquo.dombuilder.simple
import com.raquo.dombuilder.simple.{SimpleComment, SimpleElement, SimpleNode, SimpleText}
import com.raquo.dombuilder.utils.testing.matching.RuleImplicits
import org.scalatest.Suite


trait SimpleSpec
  extends MountSpec[SimpleElement, SimpleNode]
  with RuleImplicits[SimpleNode]
  with DomEventSimulatorSpec
{ this: Suite =>

  override val builder: Builder[SimpleNode] = simple.builder

  override val nodeBuilder: NodeBuilder[SimpleElement, SimpleText, SimpleComment, SimpleNode] = simple.nodeBuilder
}
