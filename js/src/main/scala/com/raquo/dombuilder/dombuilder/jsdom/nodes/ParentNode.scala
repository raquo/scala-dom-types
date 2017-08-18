package com.raquo.dombuilder.dombuilder.jsdom.nodes

import com.raquo.dombuilder.dombuilder.generic
import org.scalajs.dom
import org.scalajs.dom.DOMException

import scala.scalajs.js.JavaScriptException

trait ParentNode[N, +Ref <: dom.Node] extends generic.nodes.ParentNode[N, dom.Node, dom.Node] { this: N =>

  override def domAppendChild(child: N with generic.nodes.ChildNode[N, dom.Node, dom.Node]): Boolean = {
    try {
      ref.appendChild(child.ref)
      true
    } catch {
      // @TODO[Integrity] Does this only catch DOM exceptions? (here and in other methods)
      case JavaScriptException(e: DOMException) => false
    }
  }

  override def domRemoveChild(child: N with generic.nodes.ChildNode[N, dom.Node, dom.Node]): Boolean = {
    try {
      ref.removeChild(child.ref)
      true
    } catch {
      case JavaScriptException(e: DOMException) => false
    }
  }

  override def domInsertBefore(
    newChild: N with generic.nodes.ChildNode[N, dom.Node, dom.Node],
    referenceChild: N with generic.nodes.ChildNode[N, dom.Node, dom.Node]
  ): Boolean = {
    try {
      ref.insertBefore(newChild.ref, referenceChild.ref)
      true
    } catch {
      case JavaScriptException(e: DOMException) => false
    }
  }

  override def domReplaceChild(
    newChild: N with generic.nodes.ChildNode[N, dom.Node, dom.Node],
    oldChild: N with generic.nodes.ChildNode[N, dom.Node, dom.Node]
  ): Boolean = {
    try {
      ref.replaceChild(newChild = newChild.ref, oldChild = oldChild.ref)
      true
    } catch {
      case JavaScriptException(e: DOMException) => false
    }
  }
}
