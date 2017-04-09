package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.{Builder, Modifier}
import org.scalajs.dom

import scala.scalajs.js

// @TODO We should consider removing the R <: dom.Node limit to allow for more flexible usage

trait Node[N, +R <: dom.Node] extends Modifier[Element[N]] { self: N =>

  val builder: Builder[_, _, _, N]

  val ref: R = createRef()

  var maybeParent: js.UndefOr[N] = js.undefined

  override def applyTo(node: Element[N]): Unit = {
    node.appendChild(this)
//    node match {
//      case element: Element[N] =>
//        element.appendChild(this)
//      case _ =>
//        // @TODO[API] Throw? Or is there a better way?
//    }
  }

  protected def createRef(): R
}
