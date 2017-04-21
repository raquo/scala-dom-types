package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.domapi.ElementApi

trait Element[N, DomElement <: DomNode, DomNode] extends Node[N, DomElement, DomNode] { self: N =>

  val elementApi: ElementApi[N, DomElement]

  val tagName: String

  // @TODO think about memory leaks when detaching nodes

  override protected[this] def createRef(): DomElement = {
    elementApi.createElement(tagName)
  }
}
