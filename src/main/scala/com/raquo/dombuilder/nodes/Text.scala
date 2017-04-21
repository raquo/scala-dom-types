package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.domapi.TextApi

trait Text[N, Ref <: DomNode, DomNode] extends Node[N, Ref, DomNode] { this: N =>

  val textNodeApi: TextApi[N, Ref]

  protected[this] var _text: String

  @inline def text: String = _text

  def setText(newText: String): Unit = {
    _text = newText
    textNodeApi.setTextContent(ref, newText)
  }

  override protected[this] def createRef(): Ref = {
    textNodeApi.createText(text)
  }
}
