package com.raquo.dombuilder.simple

import com.raquo.dombuilder.nodes.{ChildNode, Element, EventfulNode, ParentNode}
import org.scalajs.dom

class SimpleElement(val tagName: String)
  extends SimpleNode
  with Element[SimpleNode]
  with ParentNode[SimpleNode]
  with ChildNode[SimpleNode]
  with EventfulNode[SimpleNode, dom.Element]
