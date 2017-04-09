package com.raquo.dombuilder.simple

import com.raquo.dombuilder.Builder

trait SimpleBuilder extends Builder[SimpleElement, SimpleText, SimpleComment, SimpleNode] {

  def element(tagName: String): SimpleElement = {
    new SimpleElement(tagName)
  }

  def textNode(text: String): SimpleText = {
    new SimpleText(text)
  }

  def commentNode(text: String): SimpleComment = {
    new SimpleComment(text)
  }
}
