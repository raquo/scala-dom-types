package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.builders.HasDomApi

trait Node[N, +R] extends HasDomApi[N] { self: N =>

  /** Reference to the DOM element representing this node in the DOM */
  val ref: R = createRef()

  protected[this] def createRef(): R
}
