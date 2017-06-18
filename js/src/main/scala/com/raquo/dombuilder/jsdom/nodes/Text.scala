package com.raquo.dombuilder.jsdom.nodes

import com.raquo.dombuilder.generic
import com.raquo.dombuilder.generic.nodes.RefNode
import org.scalajs.dom

trait Text extends generic.nodes.Text with RefNode[dom.Text] {

  def setText(newText: String): Unit = {
    _text = newText
    ref.textContent = newText
  }

  override protected[this] def createRef(): dom.Text = {
    dom.document.createTextNode(text)
  }
}
