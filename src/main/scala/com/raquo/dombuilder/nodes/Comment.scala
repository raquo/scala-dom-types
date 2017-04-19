package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.domapi.CommentApi

trait Comment[N, R] extends Node[N, R] { self: N =>

  val commentApi: CommentApi[N, R]

  protected[this] var _text: String

  @inline def text: String = _text

  override protected[this] def createRef(): R = {
    commentApi.createComment(_text)
  }
}
