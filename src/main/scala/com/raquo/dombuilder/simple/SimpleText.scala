package com.raquo.dombuilder.simple

import com.raquo.dombuilder.domapi.TextNodeApi
import com.raquo.dombuilder.nodes.{ChildNode, Text}
import com.raquo.dombuilder.simple
import org.scalajs.dom

class SimpleText(override protected[this] var _text: String)
  extends SimpleNode
  with Text[SimpleNode, dom.Text]
  with ChildNode[SimpleNode]
{
  override val textNodeApi: TextNodeApi[SimpleNode, dom.Text] = simple.textNodeApi
}
