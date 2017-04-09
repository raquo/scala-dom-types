package com.raquo.dombuilder.simple

import com.raquo.dombuilder.nodes.Element
import org.scalajs.dom

class SimpleElement (
  val tagName: String
) extends SimpleNode with Element[SimpleNode]
