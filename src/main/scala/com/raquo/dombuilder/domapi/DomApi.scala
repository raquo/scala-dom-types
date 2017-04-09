package com.raquo.dombuilder.domapi

/** Scala DOM Builder only interacts with the real DOM via this trait,
  * If you want to render to something other than a browser's DOM, implement this trait.
  *
  * This could potentially be used for an HTML renderer, React Native, virtual DOM, etc.
  *
  * Note: there are still a bunch of TODO-s to actually make this possible.
  */
trait DomApi[DomEvent, DomHtmlElement, DomElement, DomText, DomComment, DomNode] {

  @inline def parentNode(node: DomNode): Option[DomNode]

  @inline def createElement(tagName: String): DomElement

  @inline def createTextNode(text: String): DomText

  @inline def createComment(text: String): DomComment

  @inline def insertBefore(parentNode: DomNode, newNode: DomNode, referenceNode: DomNode): Unit

  // @TODO[Performance] Add removeAllChildren and implement it as .textContent = "" or something?

  @inline def removeChild(node: DomNode, child: DomNode): Unit

  @inline def appendChild(node: DomNode, child: DomNode): Unit

  @inline def setTextContent(node: DomNode, text: String)

  @inline def setAttribute[V](element: DomElement, key: String, value: V): Unit

  @inline def removeAttribute(element: DomElement, key: String): Unit

  @inline def setEventProp[E <: DomEvent](element: DomNode, key: String, eventHandler: E => Unit): Unit

  @inline def setProp[V](element: DomNode, key: String, value: V): Unit

  @inline def setStyle[V](element: DomHtmlElement, key: String, value: V): Unit
}
