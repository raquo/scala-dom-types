package com.raquo.domtypes.generic.builders

/** HtmlTagBuilder is a builder of HTML Tags, which themselves are builders of HTML Elements. #factoryfactory */
trait HtmlTagBuilder[T[_ <: DomHtmlElement], -DomHtmlElement] {

  @inline protected def htmlToSvgTag[Ref <: DomHtmlElement](tagName: String): T[Ref] = {
    htmlTag(tagName)
  }

  @inline protected def htmlTag[Ref <: DomHtmlElement](tagName: String): T[Ref] = {
    htmlTag(tagName, void = false)
  }

  @inline protected def htmlTag[Ref <: DomHtmlElement](tagName: String, void: Boolean): T[Ref]
}
