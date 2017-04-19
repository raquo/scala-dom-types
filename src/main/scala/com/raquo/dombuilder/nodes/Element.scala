package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.domapi.ElementApi

trait Element[N, +R] extends Node[N, R] { self: N =>

  val elementApi: ElementApi[N, R]

  val tagName: String

  // @TODO think about memory leaks when detaching nodes

  override protected[this] def createRef(): R = {
    elementApi.createElement(tagName)
  }
}
