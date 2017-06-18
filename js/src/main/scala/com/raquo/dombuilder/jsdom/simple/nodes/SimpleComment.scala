package com.raquo.dombuilder.jsdom.simple.nodes

import com.raquo.dombuilder.jsdom.nodes.{ChildNode, Comment}
import com.raquo.dombuilder.jsdom.simple.SimpleRefNode
import org.scalajs.dom

class SimpleComment(override protected[this] var _text: String)
  extends SimpleRefNode
  with Comment
  with ChildNode[SimpleRefNode, dom.Comment]
{
  setText(_text) // @TODO[API] Seems like this should be in Comment trait, but how?
}
