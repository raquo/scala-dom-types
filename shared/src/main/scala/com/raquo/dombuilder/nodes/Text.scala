package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.{DNode, DText}
import com.raquo.dombuilder.domapi.TextApi

trait Text[N] extends Node[N, DText, DNode] { this: N =>

  val textNodeApi: TextApi

  protected[this] var _text: String

  @inline def text: String = _text

  def setText(newText: String): Unit = {
    _text = newText
    textNodeApi.setTextContent(ref, newText)
  }

  override protected[this] def createRef(): DText = {
    textNodeApi.createText(text)
  }
}
