package com.raquo.dombuilder.domapi

trait ElementApi[N, DomElement] {

  def createElement(tagName: String): DomElement

  @inline def setAttribute[V](element: DomElement, attrName: String, value: V): Unit

  @inline def removeAttribute(element: DomElement, attrName: String): Unit
}
