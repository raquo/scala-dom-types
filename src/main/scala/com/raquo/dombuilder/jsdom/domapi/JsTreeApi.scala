package com.raquo.dombuilder.jsdom.domapi

import com.raquo.dombuilder.domapi
import org.scalajs.dom

trait JsTreeApi[N] extends domapi.TreeApi[N, dom.Node] {

  @inline override def parentNode(node: dom.Node): Option[dom.Node] = {
    Option(node.parentNode)
  }

  @inline override def insertBefore(
    parentNode: dom.Node,
    newNode: dom.Node,
    referenceNode: dom.Node
  ): Unit = {
    parentNode.insertBefore(newNode, referenceNode)
  }

  @inline override def removeChild(parentNode: dom.Node, child: dom.Node): Unit = {
    parentNode.removeChild(child)
  }

  @inline override def appendChild(parentNode: dom.Node, child: dom.Node): Unit = {
    parentNode.appendChild(child)
  }
}
