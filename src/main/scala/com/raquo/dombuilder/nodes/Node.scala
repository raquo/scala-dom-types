package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.{HasBuilder, Modifier}
import org.scalajs.dom

import scala.scalajs.js

// @TODO We should consider removing the R <: dom.Node limit to allow for more flexible usage

trait Node[N, +R <: dom.Node]
  extends Modifier[Element[N]]
  with HasBuilder[N]
{ self: N =>

  val ref: R = createRef()

  private[this] var _maybeParent: js.UndefOr[N] = js.undefined

  override def applyTo(node: Element[N]): Unit = {
    node.appendChild(this)
  }

  def maybeParent: js.UndefOr[N] = _maybeParent

  def setParent(newParent: N): Unit = {
    _maybeParent = newParent
  }

  def clearParent(): Unit = {
    _maybeParent = js.undefined
  }

  protected[this] def createRef(): R
}
