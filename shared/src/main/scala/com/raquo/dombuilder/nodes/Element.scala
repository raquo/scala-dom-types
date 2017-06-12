package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.{DElement, DNode}
import com.raquo.dombuilder.domapi.ElementApi

trait Element[N] extends Node[N, DElement, DNode] { this: N =>

  val elementApi: ElementApi

  val tagName: String

  // @TODO think about memory leaks when detaching nodes

  override protected[this] def createRef(): DElement = {
    elementApi.createElement(tagName)
  }
}
