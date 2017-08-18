package com.raquo.dombuilder.dombuilder.jsdom.nodes

import com.raquo.dombuilder.dombuilder.generic
import com.raquo.dombuilder.dombuilder.generic.nodes.RefNode
import org.scalajs.dom

// Note: Due to Scala's Inheritance Linearization, order of supers is important here.
// Current order ensures that Text's body with a setText(_text) call is run AFTER
// RefNode's body (which populates the ref). Doing it the other way causes an NPE.

trait Text extends RefNode[dom.Text] with generic.nodes.Text {

  def setText(newText: String): Unit = {
    _text = newText
    ref.textContent = newText
  }

  override protected[this] def createRef(): dom.Text = {
    dom.document.createTextNode(text)
  }
}
