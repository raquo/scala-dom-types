package com.raquo.domtypes.old.builders

/** HtmlTagBuilder is a builder of HTML Tags, which themselves are builders of HTML Elements. #factoryfactory */
trait HtmlTagBuilder[T[_ <: DomHtmlElement], -DomHtmlElement] {

  // #Safe – DONE

  @inline protected def htmlTag[Ref <: DomHtmlElement](tagName: String): T[Ref] = {
    htmlTag(tagName, void = false)
  }

  @inline protected def htmlTag[Ref <: DomHtmlElement](tagName: String, void: Boolean): T[Ref]
}
