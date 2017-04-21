package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.modifiers.Modifier

import scala.scalajs.js

// @TODO[API] should this extend Node instead?

trait ChildNode[N, +Ref <: DomNode, DomNode]
  extends Modifier[ParentNode[N, DomNode, DomNode]]
{ self: N with Node[N, Ref] =>

  private[this] var _maybeParent: js.UndefOr[ParentNode[N, DomNode, DomNode]] = js.undefined

  override def applyTo(node: ParentNode[N, DomNode, DomNode]): Unit = {
    node.appendChild(this)
  }

  def maybeParent: js.UndefOr[ParentNode[N, DomNode, DomNode]] = _maybeParent

  def setParent(newParent: ParentNode[N, DomNode, DomNode]): Unit = {
    _maybeParent = newParent
  }

  def clearParent(): Unit = {
    _maybeParent = js.undefined
  }
}
