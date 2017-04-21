package com.raquo.dombuilder.domapi

import org.scalajs.dom

import scala.scalajs.js

object JsDomApi extends DomApi[dom.Element, dom.Node] {

  @inline override def setProperty[V](element: dom.Node, propName: String, value: V): Unit = {
    element.asInstanceOf[js.Dynamic].updateDynamic(propName)(value.asInstanceOf[js.Any])
  }
}
