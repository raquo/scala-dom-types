package com.raquo.dombuilder.simple.builders

import com.raquo.dombuilder.builders.TagBuilder
import com.raquo.dombuilder.simple.nodes.{SimpleElement, SimpleNode}

trait SimpleTagBuilder extends TagBuilder[SimpleElement, SimpleNode] {

  override def tag(tagName: String): SimpleTag = {
    new SimpleTag(tagName)
  }
}
