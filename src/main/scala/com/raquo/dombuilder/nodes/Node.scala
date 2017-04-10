package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.{Builder, Modifier}
import org.scalajs.dom

import scala.scalajs.js

// @TODO We should consider removing the R <: dom.Node limit to allow for more flexible usage

trait Node[N, +R <: dom.Node] extends Modifier[Element[N]] { self: N =>

  val builder: Builder[_, _, _, N]

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
