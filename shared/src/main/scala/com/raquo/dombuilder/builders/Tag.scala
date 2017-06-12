package com.raquo.dombuilder.builders

import com.raquo.dombuilder.{DElement, DNode}
import com.raquo.dombuilder.nodes.Element

/** A Tag is an [[Element]] builder */
trait Tag[+El <: Element[N], N] extends NodeBuilder[El, N, DElement, DNode] {

  val tagName: String

  override def createNode(): El with N
}
