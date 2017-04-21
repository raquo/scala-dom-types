package com.raquo.dombuilder.jsdom.domapi

import com.raquo.dombuilder.domapi.NodeApi
import org.scalajs.dom

import scala.scalajs.js

trait JsNodeApi[N] extends NodeApi[N, dom.Node] {

  @inline override def setProperty[V](element: dom.Node, propName: String, value: V): Unit = {
    element.asInstanceOf[js.Dynamic].updateDynamic(propName)(value.asInstanceOf[js.Any])
  }
}
