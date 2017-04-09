package com.raquo.dombuilder

import com.raquo.dombuilder.nodes.Element
import org.scalajs.dom

class Root[N](container: dom.Element, element: Element[N]) {

  // @TODO[API] If needed, we could add a link from the node to the root.
  // @TODO[API] This would allow nodes to register mount/unmount hooks efficiently

  // Mount element as a child of the container
  container.appendChild(element.ref)

  def unmount(): Unit = {
    val maybeParentNode = element.builder.domapi.parentNode(element.ref)
    maybeParentNode.foreach(parentNode =>
      element.builder.domapi.removeChild(node = parentNode, child = element.ref)
    )
  }
}
