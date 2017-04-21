package com.raquo.dombuilder.simple.nodes

import com.raquo.dombuilder.domapi.{CommentApi, NodeApi}
import com.raquo.dombuilder.nodes.{ChildNode, Comment}
import com.raquo.dombuilder.simple
import org.scalajs.dom

class SimpleComment(override protected[this] var _text: String)
  extends SimpleNode
  with Comment[SimpleNode, dom.Comment, dom.Node]
  with ChildNode[SimpleNode, dom.Comment, dom.Node]
{

  override val commentApi: CommentApi[SimpleNode, dom.Comment] = simple.commentApi

  override val nodeApi: NodeApi[SimpleNode, dom.Node] = simple.nodeApi
}
