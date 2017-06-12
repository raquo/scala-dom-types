package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.{DComment, DNode}
import com.raquo.dombuilder.domapi.CommentApi

trait Comment[N] extends Node[N, DComment, DNode] { this: N =>

  val commentApi: CommentApi

  protected[this] var _text: String

  @inline def text: String = _text

  override protected[this] def createRef(): DComment = {
    commentApi.createComment(_text)
  }
}
