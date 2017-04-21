package com.raquo.dombuilder.domapi

trait TreeApi[N, DomNode] {

  @inline def parentNode(node: DomNode): Option[DomNode]

  @inline def insertBefore(
    parentNode: DomNode,
    newNode: DomNode,
    referenceNode: DomNode
  ): Unit

  // @TODO[Performance] Add removeAllChildren and implement it as .textContent = "" or something?

  @inline def removeChild(parentNode: DomNode, child: DomNode): Unit

  @inline def appendChild(parentNode: DomNode, child: DomNode): Unit
}
