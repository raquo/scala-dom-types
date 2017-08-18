package com.raquo.dombuilder.dombuilder.generic.nodes

trait RefNode[+Ref] {

  /** Reference to the DOM element representing this node in the DOM */
  val ref: Ref = createRef()

  protected[this] def createRef(): Ref
}
