package com.raquo.dombuilder.domapi

/** Scala DOM Builder only interacts with the real DOM via this trait,
  * If you want to render to something other than a browser's DOM, implement this trait.
  *
  * This could potentially be used for an HTML renderer, React Native, virtual DOM, etc.
  *
  * Note: there are still a bunch of TODO-s to actually make this possible.
  */
trait DomApi[DomHtmlElement, DomNode] {

  @inline def setProperty[V](element: DomNode, propName: String, value: V): Unit

  @inline def setStyle[V](element: DomHtmlElement, propName: String, value: V): Unit
}
