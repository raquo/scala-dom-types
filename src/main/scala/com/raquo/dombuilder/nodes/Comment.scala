package com.raquo.dombuilder.nodes

import org.scalajs.dom

trait Comment[N] extends Node[N, dom.Comment] { self: N =>

  protected val initialText: String

  override def createRef(): dom.Comment = {
    builder.domapi.createComment(initialText)
  }
}
