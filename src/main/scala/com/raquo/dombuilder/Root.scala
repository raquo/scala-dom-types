package com.raquo.dombuilder

import com.raquo.dombuilder.domapi.TreeApi
import com.raquo.dombuilder.nodes.Node

class Root[N, R] private (
  val container: R,
  val node: Node[N, R],
  val treeApi: TreeApi[N, R]
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

  def mount[N, R](
    container: R,
    node: Node[N, R],
    treeApi: TreeApi[N, R]
  ): Root[N, R] = {
    new Root[N, R](container, node, treeApi)
  }
}
