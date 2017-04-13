package com.raquo.dombuilder

import com.raquo.dombuilder.builders.Builder
import com.raquo.dombuilder.nodes.Node
import org.scalajs.dom

class Root[N, +R <: dom.Node] private (
  val container: dom.Element,
  val node: Node[N, R],
  val builder: Builder[N]
) {

  // @TODO[API] If needed, we could add a link from the node to the root.
  // @TODO[API] This would allow nodes to register mount/unmount hooks efficiently

  // Mount element as a child of the container
  builder.domapi.appendChild(parentNode = container, child = node.ref)

  def unmount(): Unit = {
    val maybeParentNode = builder.domapi.parentNode(node.ref)
    maybeParentNode.foreach(parentNode =>
      builder.domapi.removeChild(parentNode = parentNode, child = node.ref)
    )
  }
}

object Root {

  def mount[N, R <: dom.Node](
    container: dom.Element,
    node: Node[N, R],
    builder: Builder[N]
  ): Root[N, R] = {
    new Root[N, R](container, node, builder)
  }
}
