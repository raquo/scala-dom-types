package com.raquo.dombuilder.dombuilder.jsdom.nodes

import org.scalajs.dom
import com.raquo.dombuilder.dombuilder.generic
import com.raquo.dombuilder.dombuilder.generic.nodes.RefNode

// Note: Due to Scala's Inheritance Linearization, order of supers is important here.
// Current order ensures that Comment's body with a setText(_text) call is run AFTER
// RefNode's body (which populates the ref). Doing it the other way causes an NPE.

trait Comment extends RefNode[dom.Comment] with generic.nodes.Comment {

  def setText(newText: String): Unit = {
    _text = newText
    ref.textContent = newText
  }

  override protected[this] def createRef(): dom.Comment = {
    dom.document.createComment(text)
  }
}
