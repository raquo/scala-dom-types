package com.raquo.dombuilder.simple

import com.raquo.dombuilder.nodes.Text

class SimpleText(
  override protected[this] val initialText: String
) extends SimpleNode with Text[SimpleNode]
