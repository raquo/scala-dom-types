package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.domapi.NodeApi

trait Node[N, +R <: DomNode, DomNode] { self: N =>

  val nodeApi: NodeApi[N, DomNode]

  /** Reference to the DOM element representing this node in the DOM */
  val ref: R = createRef()

  protected[this] def createRef(): R
}
