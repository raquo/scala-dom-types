package com.raquo.dombuilder.simple.nodes

import com.raquo.dombuilder.domapi.CommentApi
import com.raquo.dombuilder.nodes.{ChildNode, Comment}
import com.raquo.dombuilder.simple
import org.scalajs.dom

class SimpleComment(override protected[this] var _text: String)
  extends SimpleNode
  with Comment[SimpleNode]
  with ChildNode[SimpleNode, dom.Comment, dom.Node]
{

  override val commentApi: CommentApi = simple.commentApi
}
