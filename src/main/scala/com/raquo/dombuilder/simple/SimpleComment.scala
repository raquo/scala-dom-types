package com.raquo.dombuilder.simple

import com.raquo.dombuilder.nodes.Comment

class SimpleComment(
  override protected[this] val initialText: String
) extends SimpleNode with Comment[SimpleNode]
