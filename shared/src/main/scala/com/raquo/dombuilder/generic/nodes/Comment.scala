package com.raquo.dombuilder.generic.nodes

trait Comment {

  protected[this] var _text: String

  setText(_text)

  @inline def text: String = _text

  def setText(newText: String): Unit
}
