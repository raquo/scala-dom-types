package com.raquo.dombuilder.nodes

trait Node[N, +R <: DomNode, DomNode] { this: N =>

  /** Reference to the DOM element representing this node in the DOM */
  val ref: R = createRef()

  protected[this] def createRef(): R
}
