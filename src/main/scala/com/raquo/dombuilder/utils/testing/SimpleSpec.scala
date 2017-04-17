package com.raquo.dombuilder.utils.testing

import com.raquo.dombuilder.builders.{Builder, TextNodeBuilder}
import com.raquo.dombuilder.simple
import com.raquo.dombuilder.simple.{SimpleElement, SimpleNode, SimpleText}
import com.raquo.dombuilder.utils.testing.matching.RuleImplicits
import org.scalajs.dom
import org.scalatest.Suite


trait SimpleSpec
  extends MountSpec[SimpleElement, SimpleNode]
  with RuleImplicits[SimpleNode]
  with DomEventSimulatorSpec
{ this: Suite =>

  override val builder: Builder[SimpleNode] = simple.builder

  override val textNodeBuilder: TextNodeBuilder[SimpleText, SimpleNode, dom.Text] = simple.textNodeBuilder
}
