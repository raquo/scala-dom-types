package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.modifiers.Modifier
import org.scalajs.dom

import scala.scalajs.js

// @TODO[API] should this extend Node instead?

trait ChildNode[N] extends Modifier[ParentNode[N]] { self: N with Node[N, dom.Node] =>

  private[this] var _maybeParent: js.UndefOr[ParentNode[N]] = js.undefined

  override def applyTo(node: ParentNode[N]): Unit = {
    node.appendChild(this)
  }

  def maybeParent: js.UndefOr[ParentNode[N]] = _maybeParent

  def setParent(newParent: ParentNode[N]): Unit = {
    _maybeParent = newParent
  }

  def clearParent(): Unit = {
    _maybeParent = js.undefined
  }
}
