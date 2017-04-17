package com.raquo.dombuilder.simple

import com.raquo.dombuilder.builders.{Builder, NodeBuilder}

trait SimpleBuilder extends Builder[SimpleNode]

trait SimpleNodeBuilder extends NodeBuilder[SimpleElement, SimpleComment, SimpleNode] {

  override def element(tagName: String): SimpleElement = {
    new SimpleElement(tagName)
  }

  override def commentNode(text: String): SimpleComment = {
    new SimpleComment(text)
  }
}
