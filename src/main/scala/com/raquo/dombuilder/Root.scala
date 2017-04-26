package com.raquo.dombuilder

import com.raquo.dombuilder.domapi.TreeApi
import com.raquo.dombuilder.nodes.Element

class Root[N, El <: Element[N, DomElement, DomNode], DomElement <: DomNode, DomNode] private (
  val container: DomElement,
  val element: El,
  val treeApi: TreeApi[N, DomNode]
) {

  // @TODO[API] If needed, we could add a link from the node to the root.
  // @TODO[API] This would allow nodes to register mount/unmount hooks efficiently

  // Mount element as a child of the container
  treeApi.appendChild(parentNode = container, child = element.ref)

  def unmount(): Unit = {
    val maybeParentNode = treeApi.parentNode(element.ref)
    maybeParentNode.foreach(parentNode =>
      treeApi.removeChild(parentNode = parentNode, child = element.ref)
    )
  }
}

object Root {

  def mount[N, El <: Element[N, DomElement, DomNode], DomElement <: DomNode, DomNode](
    container: DomElement,
    element: El,
    treeApi: TreeApi[N, DomNode]
  ): Root[N, El, DomElement, DomNode] = {
    new Root[N, El, DomElement, DomNode](container, element, treeApi)
  }
}
