package com.raquo.dombuilder.dombuilder.jsdom.simple.nodes

import com.raquo.dombuilder.dombuilder.jsdom.nodes.{ChildNode, Comment}
import com.raquo.dombuilder.dombuilder.jsdom.simple.SimpleRefNode
import org.scalajs.dom

class SimpleComment(override protected[this] var _text: String)
  extends SimpleRefNode
  with Comment
  with ChildNode[SimpleRefNode, dom.Comment]
