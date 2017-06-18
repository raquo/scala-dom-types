package com.raquo.dombuilder.jsdom.simple.nodes

import com.raquo.dombuilder.jsdom.nodes.{ChildNode, Text}
import com.raquo.dombuilder.jsdom.simple.SimpleRefNode
import org.scalajs.dom

class SimpleText(override protected[this] var _text: String)
  extends SimpleRefNode
  with Text
  with ChildNode[SimpleRefNode, dom.Text]
{
  setText(_text) // @TODO[API] Seems like this should be in Text trait, but how?
}
