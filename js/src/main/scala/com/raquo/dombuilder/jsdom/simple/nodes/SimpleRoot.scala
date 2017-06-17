package com.raquo.dombuilder.jsdom.simple.nodes

import com.raquo.dombuilder.generic
import com.raquo.dombuilder.generic.nodes.ChildNode
import com.raquo.dombuilder.jsdom.nodes.ParentNode
import com.raquo.dombuilder.jsdom.simple.SimpleRefNode
import org.scalajs.dom

class SimpleRoot private (
  override val container: dom.Element,
  override val child: SimpleRefNode with ChildNode[SimpleRefNode, dom.Element, dom.Node]
)
  extends generic.nodes.Root[SimpleRefNode, dom.Element, dom.Element, dom.Node]
  with ParentNode[SimpleRefNode, dom.Element]
  with SimpleRefNode
{
  override def unmount(): Boolean = {
    var removed = false
    val maybeParentNode = child.maybeParent
    maybeParentNode.foreach { parentNode =>
      removed = parentNode.removeChild(child)
      if (removed) {
        child.clearParent()
      }
    }
    removed
  }
}

object SimpleRoot {
  def mount(
    container: dom.Element,
    child: SimpleRefNode with ChildNode[SimpleRefNode, dom.Element, dom.Node]
  ): SimpleRoot = {
    val root = new SimpleRoot(container, child)
    root.appendChild(child)
    root
  }
}
