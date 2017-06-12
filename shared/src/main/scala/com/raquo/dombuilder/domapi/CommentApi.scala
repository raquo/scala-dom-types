package com.raquo.dombuilder.domapi

import com.raquo.dombuilder.DComment

trait CommentApi {

  def createComment(text: String): DComment
}
