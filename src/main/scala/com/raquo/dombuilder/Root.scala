package com.raquo.dombuilder

import com.raquo.dombuilder.domapi.TreeApi
import com.raquo.dombuilder.nodes.Node

class Root[N, DomNode] private (
  val container: DomNode,
  val node: Node[N, DomNode, DomNode],
  val treeApi: TreeApi[N, DomNode]
) {

  // @TODO[API] If needed, we could add a link from the node to the root.
  // @TODO[API] This would allow nodes to register mount/unmount hooks efficiently

  // Mount element as a child of the container
  treeApi.appendChild(parentNode = container, child = node.ref)

  def unmount(): Unit = {
    val maybeParentNode = treeApi.parentNode(node.ref)
    maybeParentNode.foreach(parentNode =>
      treeApi.removeChild(parentNode = parentNode, child = node.ref)
    )
  }
}

object Root {

  def mount[N, DomNode](
    container: DomNode,
    node: Node[N, DomNode, DomNode],
    treeApi: TreeApi[N, DomNode]
  ): Root[N, DomNode] = {
    new Root[N, DomNode](container, node, treeApi)
  }
}
