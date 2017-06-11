package com.raquo.dombuilder

import com.raquo.dombuilder.domapi.TreeApi
import com.raquo.dombuilder.nodes.ChildNode

class Root[N, Ch <: ChildNode[N, DomNode, DomNode], DomElement <: DomNode, DomNode] private (
  val container: DomElement,
  val child: Ch,
  val treeApi: TreeApi[N, DomNode]
) {

  // @TODO[API] If needed, we could add a link from the node to the root.
  // @TODO[API] This would allow nodes to register mount/unmount hooks efficiently
  // @TODO[API] appendChild below can fail, but we don't reflect this in our API yet.

  // Mount element as a child of the container
  treeApi.appendChild(parentNode = container, child = child.ref)

  /** @return Whether child was successfully unmounted */
  def unmount(): Boolean = {
    var removed = false
    val maybeParentNode = treeApi.parentNode(child.ref)
    maybeParentNode.foreach { parentNode =>
      removed = treeApi.removeChild(parentNode = parentNode, child = child.ref)
      if (removed) {
        child.clearParent()
      }
    }
    removed
  }
}

object Root {

  def mount[N, Ch <: ChildNode[N, DomNode, DomNode], DomElement <: DomNode, DomNode](
    container: DomElement,
    child: Ch,
    treeApi: TreeApi[N, DomNode]
  ): Root[N, Ch, DomElement, DomNode] = {
    new Root[N, Ch, DomElement, DomNode](container, child, treeApi)
  }
}
