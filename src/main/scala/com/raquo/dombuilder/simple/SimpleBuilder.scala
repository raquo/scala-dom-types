package com.raquo.dombuilder.simple

import com.raquo.dombuilder.{Builder, DOMAPI}

trait SimpleBuilder extends Builder[SimpleElement, SimpleText, SimpleComment, SimpleNode] {

  val domapi: DOMAPI = new DOMAPI

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
