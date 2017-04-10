package com.raquo.dombuilder.nodes

import org.scalajs.dom

trait Comment[N] extends Node[N, dom.Comment] { self: N =>

  protected[this] val initialText: String

  override protected[this] def createRef(): dom.Comment = {
    builder.domapi.createComment(initialText)
  }
}
