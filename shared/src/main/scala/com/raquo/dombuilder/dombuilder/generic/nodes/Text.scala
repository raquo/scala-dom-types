package com.raquo.dombuilder.dombuilder.generic.nodes

trait Text {

  protected[this] var _text: String

  setText(_text)

  @inline def text: String = _text

  def setText(newText: String): Unit
}
