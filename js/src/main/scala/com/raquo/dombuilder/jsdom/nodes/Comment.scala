package com.raquo.dombuilder.jsdom.nodes

import org.scalajs.dom
import com.raquo.dombuilder.generic
import com.raquo.dombuilder.generic.nodes.RefNode

trait Comment extends generic.nodes.Comment with RefNode[dom.Comment] {

  setText(text)

  def setText(newText: String): Unit = {
    _text = newText
    ref.textContent = newText
  }

  override protected[this] def createRef(): dom.Comment = {
    dom.document.createComment(text)
  }
}
