package com.raquo.dombuilder

import com.raquo.dombuilder.nodes.{Element, Node}
import com.raquo.dombuilder.simple.{SimpleElement, SimpleNode}
import org.scalajs.dom

class Root[N](container: dom.Element, element: Element[N]) {

  // @TODO[API] If needed, we could add a link from the node to the root.
  // @TODO[API] This would allow nodes to register mount/unmount hooks efficiently

  container.appendChild(element.ref)

  def unmount(): Unit = {
    element.ref.parentNode.removeChild(element.ref)
  }
}


object x {

  val el = new SimpleElement("yo")

  val y: Node[_, dom.Element] = el

  val z: Modifier[_] = el

//  val zz: Modifier[SimpleNode[dom.Element]] = el

  new Root[SimpleNode](???, el)

//  el.apply(
//    el
//  )


}
