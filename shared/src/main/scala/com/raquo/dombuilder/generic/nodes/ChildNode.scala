package com.raquo.dombuilder.generic.nodes

import com.raquo.dombuilder.generic.modifiers.Modifier

trait ChildNode[N, +Ref <: BaseRef, BaseRef] extends RefNode[Ref] with Modifier[ParentNode[N, BaseRef, BaseRef]] { this: N =>

  private[this] var _maybeParent: Option[ParentNode[N, BaseRef, BaseRef]] = None

  override def applyTo(node: ParentNode[N, BaseRef, BaseRef]): Unit = {
    node.appendChild(this)
  }

  def maybeParent: Option[ParentNode[N, BaseRef, BaseRef]] = _maybeParent

  def setParent(newParent: ParentNode[N, BaseRef, BaseRef]): Unit = {
    _maybeParent = Some(newParent)
  }

  def clearParent(): Unit = {
    _maybeParent = None
  }
}
