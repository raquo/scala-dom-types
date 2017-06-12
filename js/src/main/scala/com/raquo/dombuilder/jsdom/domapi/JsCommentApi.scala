package com.raquo.dombuilder.jsdom.domapi

import com.raquo.dombuilder.domapi
import org.scalajs.dom
import org.scalajs.dom.document

trait JsCommentApi extends domapi.CommentApi {

  override def createComment(text: String): dom.Comment = {
    document.createComment(text)
  }
}
