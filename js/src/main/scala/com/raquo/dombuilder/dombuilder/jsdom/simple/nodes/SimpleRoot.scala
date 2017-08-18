package com.raquo.dombuilder.dombuilder.jsdom.simple.nodes

import com.raquo.dombuilder.dombuilder.generic
import com.raquo.dombuilder.dombuilder.jsdom.nodes.{ChildNode, ParentNode}
import com.raquo.dombuilder.dombuilder.jsdom.simple.SimpleRefNode
import org.scalajs.dom

class SimpleRoot (
  override val container: dom.Element,
  override val child: SimpleRefNode with ChildNode[SimpleRefNode, dom.Element]
)
  extends SimpleRefNode
  with generic.nodes.Root[SimpleRefNode, SimpleRefNode with ChildNode[SimpleRefNode, dom.Element], dom.Element, dom.Node]
  with ParentNode[SimpleRefNode, dom.Element]
