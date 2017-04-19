package com.raquo.dombuilder.jsdom.domapi

import com.raquo.dombuilder.domapi
import org.scalajs.dom

trait JsElementApi[N] extends domapi.ElementApi[N, dom.Element] {

  @inline override def createElement(tagName: String): dom.Element = {
    dom.document.createElement(tagName)
  }

  @inline override def setAttribute[V](element: dom.Element, attrName: String, value: V): Unit = {
    value match {
      case true => element.setAttribute(attrName, "")
      case false => removeAttribute(element, attrName)
      case _ => element.setAttribute(attrName, value.toString)
    }
  }

  @inline override def removeAttribute(element: dom.Element, attrName: String): Unit = {
    element.removeAttribute(attrName)
  }
}
