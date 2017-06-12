package com.raquo.dombuilder.jsdom.domapi

import com.raquo.dombuilder.domapi
import org.scalajs.dom
import org.scalajs.dom.raw.DOMException

import scala.scalajs.js.JavaScriptException

trait JsTreeApi[N] extends domapi.TreeApi[N, dom.Node] {

  @inline override def parentNode(node: dom.Node): Option[dom.Node] = {
    Option(node.parentNode)
  }

  /** @return Whether node was successfully appended */
  @inline override def appendChild(parentNode: dom.Node, child: dom.Node): Boolean = {
    try {
      parentNode.appendChild(child)
      true
    } catch {
      // @TODO[Integrity] Does this only catch DOM exceptions? (here and in other methods)
      case JavaScriptException(e: DOMException) => false
    }
  }

  /** @return Whether node was successfully inserted */
  @inline override def insertBefore(
    parentNode: dom.Node,
    newNode: dom.Node,
    referenceNode: dom.Node
  ): Boolean = {
    try {
      parentNode.insertBefore(newNode, referenceNode)
      true
    } catch {
      case JavaScriptException(e: DOMException) => false
    }
  }

  /** @return Whether node was successfully removed */
  @inline override def removeChild(parentNode: dom.Node, child: dom.Node): Boolean = {
    try {
      parentNode.removeChild(child)
      true
    } catch {
      case JavaScriptException(e: DOMException) => false
    }
  }

  /** @return Whether node was successfully appended */
  @inline override def replaceChild(
    parentNode: dom.Node,
    newChild: dom.Node,
    oldChild: dom.Node
  ): Boolean = {
    try {
      parentNode.replaceChild(newChild = newChild, oldChild = oldChild)
      true
    } catch {
      case JavaScriptException(e: DOMException) => false
    }
  }
}
