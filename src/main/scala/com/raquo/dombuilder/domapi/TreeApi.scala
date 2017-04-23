package com.raquo.dombuilder.domapi

trait TreeApi[N, DomNode] {

  @inline def parentNode(node: DomNode): Option[DomNode]

  @inline def appendChild(parentNode: DomNode, child: DomNode): Boolean

  @inline def insertBefore(parentNode: DomNode, newChild: DomNode, referenceChild: DomNode): Boolean

  @inline def removeChild(parentNode: DomNode, child: DomNode): Boolean

  @inline def replaceChild(parentNode: DomNode, newChild: DomNode, oldChild: DomNode): Boolean

  // @TODO[Performance] Add removeAllChildren and implement it as .textContent = "" or something?
}
