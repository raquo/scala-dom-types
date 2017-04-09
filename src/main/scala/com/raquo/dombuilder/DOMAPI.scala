package com.raquo.dombuilder

import org.scalajs.dom
import org.scalajs.dom.document

import scala.scalajs.js

// @TODO make this a trait / object or something

class DOMAPI {

  @inline def createElement(tagName: String): dom.Element = {
    document.createElement(tagName)
  }

  //  @inline def createElementNS(namespaceURI: String, qualifiedName: String): dom.Element = {
  //    document.createElementNS(namespaceURI, qualifiedName)
  //  }

  @inline def createTextNode(text: String): dom.Text = {
    document.createTextNode(text)
  }

  @inline def createComment(text: String): dom.Comment = {
    document.createComment(text)
  }

  @inline def insertBefore(parentNode: dom.Node, newNode: dom.Node, referenceNode: js.UndefOr[dom.Node]): Unit = {
    parentNode.insertBefore(newNode, referenceNode.orNull)
  }

  @inline def removeChild(node: dom.Node, child: dom.Node): Unit = {
    node.removeChild(child)
  }

  @inline def appendChild(node: dom.Node, child: dom.Node): Unit = {
    node.appendChild(child)
  }

  @inline def parentNode(node: dom.Node): js.UndefOr[dom.Node] = {
    if (node.parentNode == null) {
      js.undefined
    } else {
      node.parentNode
    }
  }

  @inline def nextSibling(node: dom.Node): js.UndefOr[dom.Node] = {
    if (node.nextSibling == null) {
      js.undefined
    } else {
      node.nextSibling
    }
  }

  //  @inline def tagName(element: dom.Element): String = {
  //    element.tagName
  //  }

  @inline def setTextContent(node: dom.Node, text: js.UndefOr[String]): Unit = {
    node.textContent = text.orNull
  }

  @inline def setAttribute[V](element: dom.Element, key: String, value: V): Unit = {
    value match {
      case true => element.setAttribute(key, "")
      case false => removeAttribute(element, key)
      case _ => element.setAttribute(key, value.toString)
    }
  }

  @inline def removeAttribute(element: dom.Element, key: String): Unit = {
    element.removeAttribute(key)
  }

  @inline def setEventProp[E <: dom.Event](element: dom.Node, key: String, eventHandler: E => Unit): Unit = {
    val jsEventHandler: js.Function1[E, Unit] = eventHandler
    element.asInstanceOf[js.Dynamic].updateDynamic(key.toLowerCase)(jsEventHandler)
  }

  @inline def setProp[V](element: dom.Node, key: String, value: V): Unit = {
    element.asInstanceOf[js.Dynamic].updateDynamic(key)(value.asInstanceOf[js.Any])
  }

  @inline def setStyle[V](element: dom.html.Element, key: String, value: V): Unit = {
    element.style.asInstanceOf[js.Dynamic].updateDynamic(key)(value.asInstanceOf[js.Any])
  }


  //  @inline def getTextContent(node: dom.Node): js.UndefOr[String] = {
  //    if (node.textContent == null) {
  //      js.undefined
  //    } else {
  //      node.textContent
  //    }
  //  }

  //  def isElement(node: dom.Node): Boolean = {
  //    return node.nodeType === 1;
  //  }
  //
  //  def isText(node: Node): node is Text = {
  //    return node.nodeType === 3;
  //  }
  //
  //  def isComment(node: Node): node is Comment = {
  //    return node.nodeType === 8;
  //  }

}
