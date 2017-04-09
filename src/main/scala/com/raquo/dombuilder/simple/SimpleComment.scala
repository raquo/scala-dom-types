package com.raquo.dombuilder.simple

import com.raquo.dombuilder.nodes.Comment
import org.scalajs.dom

class SimpleComment(
  val initialText: String
) extends SimpleNode with Comment[SimpleNode]
