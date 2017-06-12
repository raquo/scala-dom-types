package com.raquo.dombuilder.simple.builders

import com.raquo.dombuilder.builders.Tag
import com.raquo.dombuilder.simple.nodes.{SimpleElement, SimpleNode}

class SimpleTag(val tagName: String) extends Tag[SimpleElement, SimpleNode] {

  override def createNode(): SimpleElement = {
    new SimpleElement(tagName)
  }
}
