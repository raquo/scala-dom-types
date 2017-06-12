package com.raquo.dombuilder.domapi

import com.raquo.dombuilder.DElement

trait ElementApi {

  def createElement(tagName: String): DElement

  @inline def setAttribute[V](element: DElement, attrName: String, value: V): Unit

  @inline def removeAttribute(element: DElement, attrName: String): Unit

  @inline def setProperty[V](element: DElement, propName: String, value: V): Unit

  @inline def setStyle[V](element: DElement, propName: String, value: V): Unit
}
