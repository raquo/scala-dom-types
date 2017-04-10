package com.raquo.dombuilder.simple

import com.raquo.dombuilder.{Builder, NodeBuilder}

trait SimpleBuilder extends Builder[SimpleNode]

trait SimpleNodeBuilder extends NodeBuilder[SimpleElement, SimpleText, SimpleComment, SimpleNode] {

  override def element(tagName: String): SimpleElement = {
    new SimpleElement(tagName)
  }

  override def textNode(text: String): SimpleText = {
    new SimpleText(text)
  }

  override def commentNode(text: String): SimpleComment = {
    new SimpleComment(text)
  }
}
