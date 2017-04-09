package com.raquo.dombuilder.simple

import com.raquo.dombuilder.nodes.Text
import org.scalajs.dom

class SimpleText(
  val initialText: String
) extends SimpleNode with Text[SimpleNode]
