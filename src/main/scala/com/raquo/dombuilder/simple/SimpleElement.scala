package com.raquo.dombuilder.simple

import com.raquo.dombuilder.nodes.Element

class SimpleElement (
  val tagName: String
) extends SimpleNode with Element[SimpleNode]
