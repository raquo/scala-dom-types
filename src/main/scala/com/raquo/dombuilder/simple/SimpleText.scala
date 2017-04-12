package com.raquo.dombuilder.simple

import com.raquo.dombuilder.nodes.{ChildNode, Text}

class SimpleText(override protected[this] val initialText: String)
  extends SimpleNode
  with Text[SimpleNode]
  with ChildNode[SimpleNode]
