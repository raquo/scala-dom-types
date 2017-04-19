package com.raquo.dombuilder.simple.nodes

import com.raquo.dombuilder.domapi.{ElementApi, TreeApi}
import com.raquo.dombuilder.nodes.{ChildNode, Element, EventfulNode, ParentNode}
import com.raquo.dombuilder.simple
import org.scalajs.dom

class SimpleElement(val tagName: String)
  extends SimpleNode
  with Element[SimpleNode, dom.Element]
  with ParentNode[SimpleNode, dom.Element, dom.Node]
  with ChildNode[SimpleNode, dom.Element, dom.Node]
  with EventfulNode[SimpleNode, dom.Element]
{

  override val elementApi: ElementApi[SimpleNode, dom.Element] = simple.elementApi

  override val treeApi: TreeApi[SimpleNode, dom.Node] = simple.treeApi
}
