package com.raquo.dombuilder.nodes

import org.scalajs.dom

trait Text[N] extends Node[N, dom.Text] { self: N =>

  protected val initialText: String

  def setText(newText: String): Unit = {
    builder.domapi.setTextContent(ref, newText)
  }

  override def createRef(): dom.Text = {
    builder.domapi.createTextNode(initialText)
  }
}
