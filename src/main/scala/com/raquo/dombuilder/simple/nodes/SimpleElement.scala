package com.raquo.dombuilder.simple.nodes

import com.raquo.dombuilder.domapi.{ElementApi, EventApi, TreeApi}
import com.raquo.dombuilder.nodes.{ChildNode, Element, EventfulNode, ParentNode}
import com.raquo.dombuilder.simple
import org.scalajs.dom

class SimpleElement(val tagName: String)
  extends SimpleNode
  with Element[SimpleNode]
  with ParentNode[SimpleNode, dom.Element, dom.Node]
  with ChildNode[SimpleNode, dom.Element, dom.Node]
  with EventfulNode[SimpleNode, dom.Element]
{

  override val elementApi: ElementApi = simple.elementApi

  override val eventApi: EventApi = simple.eventApi

  override val treeApi: TreeApi[SimpleNode, dom.Node] = simple.treeApi
}
