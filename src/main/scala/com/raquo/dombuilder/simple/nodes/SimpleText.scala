package com.raquo.dombuilder.simple.nodes

import com.raquo.dombuilder.domapi.TextApi
import com.raquo.dombuilder.nodes.{ChildNode, Text}
import com.raquo.dombuilder.simple
import org.scalajs.dom

class SimpleText(override protected[this] var _text: String)
  extends SimpleNode
  with Text[SimpleNode]
  with ChildNode[SimpleNode, dom.Text, dom.Node]
{
  override val textNodeApi: TextApi = simple.textNodeApi
}
