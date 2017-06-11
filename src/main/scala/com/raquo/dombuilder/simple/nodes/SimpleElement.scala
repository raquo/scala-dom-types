package com.raquo.dombuilder.simple.nodes

import com.raquo.dombuilder.domapi.{ElementApi, EventApi, NodeApi, TreeApi}
import com.raquo.dombuilder.nodes.{ChildNode, Element, EventfulNode, ParentNode}
import com.raquo.dombuilder.simple
import org.scalajs.dom

import scala.scalajs.js

class SimpleElement(val tagName: String)
  extends SimpleNode
  with Element[SimpleNode]
  with ParentNode[SimpleNode, dom.Element, dom.Node]
  with ChildNode[SimpleNode, dom.Element, dom.Node]
  with EventfulNode[SimpleNode, dom.Element, dom.Node, dom.Event, js.Function1]
{

  override val elementApi: ElementApi = simple.elementApi

  override val eventApi: EventApi[SimpleNode, dom.Node, dom.Event, js.Function1] = simple.eventApi

  override val nodeApi: NodeApi[SimpleNode, dom.Node] = simple.nodeApi

  override val treeApi: TreeApi[SimpleNode, dom.Node] = simple.treeApi
}
