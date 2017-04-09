package com.raquo.dombuilder.domapi

import org.scalajs.dom
import org.scalajs.dom.document

import scala.scalajs.js

object JsDomApi extends DomApi[dom.Event, dom.html.Element, dom.Element, dom.Text, dom.Comment, dom.Node] {

  @inline override def parentNode(node: dom.Node): Option[dom.Node] = {
    Option(node.parentNode)
  }

  @inline override def createElement(tagName: String): dom.Element = {
    document.createElement(tagName)
  }

  @inline override def createTextNode(text: String): dom.Text = {
    document.createTextNode(text)
  }

  @inline override def createComment(text: String): dom.Comment = {
    document.createComment(text)
  }

  @inline override def insertBefore(parentNode: dom.Node, newNode: dom.Node, referenceNode: dom.Node): Unit = {
    parentNode.insertBefore(newNode, referenceNode)
  }

  @inline override def removeChild(node: dom.Node, child: dom.Node): Unit = {
    node.removeChild(child)
  }

  @inline override def appendChild(node: dom.Node, child: dom.Node): Unit = {
    node.appendChild(child)
  }

  @inline override def setTextContent(node: dom.Node, text: String): Unit = {
    node.textContent = text
  }

  @inline override def setAttribute[V](element: dom.Element, key: String, value: V): Unit = {
    value match {
      case true => element.setAttribute(key, "")
      case false => removeAttribute(element, key)
      case _ => element.setAttribute(key, value.toString)
    }
  }

  @inline override def removeAttribute(element: dom.Element, key: String): Unit = {
    element.removeAttribute(key)
  }

  @inline override def setEventProp[E <: dom.Event](element: dom.Node, key: String, eventHandler: E => Unit): Unit = {
    val jsEventHandler: js.Function1[E, Unit] = eventHandler
    element.asInstanceOf[js.Dynamic].updateDynamic(key.toLowerCase)(jsEventHandler)
  }

  @inline override def setProp[V](element: dom.Node, key: String, value: V): Unit = {
    element.asInstanceOf[js.Dynamic].updateDynamic(key)(value.asInstanceOf[js.Any])
  }

  @inline override def setStyle[V](element: dom.html.Element, key: String, value: V): Unit = {
    element.style.asInstanceOf[js.Dynamic].updateDynamic(key)(value.asInstanceOf[js.Any])
  }
}
