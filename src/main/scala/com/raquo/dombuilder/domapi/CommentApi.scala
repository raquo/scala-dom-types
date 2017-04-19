package com.raquo.dombuilder.domapi

trait CommentApi[N, R] {

  def createComment(text: String): R
}
