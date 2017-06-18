package com.raquo.dombuilder.jsdom.simple.nodes

import com.raquo.dombuilder.jsdom.nodes.{ChildNode, Element, EventfulNode, ParentNode}
import com.raquo.dombuilder.jsdom.simple.SimpleRefNode
import org.scalajs.dom

class SimpleElement[+Ref <: dom.Element](
  override val tagName: String,
  override val void: Boolean = false
)
  extends SimpleRefNode
  with Element[Ref]
  with ChildNode[SimpleRefNode, Ref]
  with ParentNode[SimpleRefNode, Ref]
  with EventfulNode[SimpleRefNode, Ref]

