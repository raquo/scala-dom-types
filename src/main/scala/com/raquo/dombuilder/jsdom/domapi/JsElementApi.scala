package com.raquo.dombuilder.jsdom.domapi

import com.raquo.dombuilder.domapi
import org.scalajs.dom

import scala.scalajs.js

trait JsElementApi extends domapi.ElementApi {

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

  @inline override def setProperty[V](element: dom.Element, propName: String, value: V): Unit = {
    element.asInstanceOf[js.Dynamic].updateDynamic(propName)(value.asInstanceOf[js.Any])
  }

  @inline override def setStyle[V](element: dom.Element, stylePropName: String, value: V): Unit = {
    // @TODO[Integrity] Sort out the difference between Element and HTMLElement once and for all.
    element.asInstanceOf[dom.html.Element].style.asInstanceOf[js.Dynamic].updateDynamic(stylePropName)(value.asInstanceOf[js.Any])
  }
}
