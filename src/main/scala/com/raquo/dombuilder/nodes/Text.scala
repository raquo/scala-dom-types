package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.domapi.TextNodeApi

trait Text[N, R] extends Node[N, R] { self: N =>

  val textNodeApi: TextNodeApi[N, R]

  protected[this] var _text: String

  @inline def text: String = _text

  def setText(newText: String): Unit = {
    _text = newText
    textNodeApi.setTextContent(ref, newText)
  }

  override protected[this] def createRef(): R = {
    textNodeApi.createTextNode(text)
  }
}
