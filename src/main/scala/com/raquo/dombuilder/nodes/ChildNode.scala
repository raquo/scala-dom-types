package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.modifiers.Modifier

import scala.scalajs.js

// @TODO[API] should this extend Node instead?

trait ChildNode[N, +Ref <: TreeNodeRef, TreeNodeRef]
  extends Modifier[ParentNode[N, TreeNodeRef, TreeNodeRef]]
{ self: N with Node[N, Ref] =>

  private[this] var _maybeParent: js.UndefOr[ParentNode[N, TreeNodeRef, TreeNodeRef]] = js.undefined

  override def applyTo(node: ParentNode[N, TreeNodeRef, TreeNodeRef]): Unit = {
    node.appendChild(this)
  }

  def maybeParent: js.UndefOr[ParentNode[N, TreeNodeRef, TreeNodeRef]] = _maybeParent

  def setParent(newParent: ParentNode[N, TreeNodeRef, TreeNodeRef]): Unit = {
    _maybeParent = newParent
  }

  def clearParent(): Unit = {
    _maybeParent = js.undefined
  }
}
