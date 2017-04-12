package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.modifiers.Modifier
import org.scalajs.dom

trait Element[N] extends Node[N, dom.Element] { self: N =>

  val tagName: String

  // @TODO think about memory leaks when detaching nodes

  override protected[this] def createRef(): dom.Element = {
    builder.domapi.createElement(tagName)
  }

  // @TODO[API] This apply method doesn't really belong here. It is only needed for initial construction of an Element.

  def apply(modifiers: Modifier[this.type]*): this.type = {
    // @TODO[Performance] Use while loop?
    modifiers.foreach(_.applyTo(this))
    this
  }
}
