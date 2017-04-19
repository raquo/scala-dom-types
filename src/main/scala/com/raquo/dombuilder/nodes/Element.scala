package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.domapi.ElementApi

trait Element[N, BaseElementRef] extends Node[N, BaseElementRef] { self: N =>

  val elementApi: ElementApi[N, BaseElementRef]

  val tagName: String

  // @TODO think about memory leaks when detaching nodes

  override protected[this] def createRef(): BaseElementRef = {
    elementApi.createElement(tagName)
  }
}
