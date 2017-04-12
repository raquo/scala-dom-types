package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.HasBuilder

trait Node[N, +R] extends HasBuilder[N] { self: N =>

  /** Reference to the DOM element representing this node in the DOM */
  val ref: R = createRef()

  protected[this] def createRef(): R
}
