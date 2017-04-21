package com.raquo.dombuilder.domapi

/** Scala DOM Builder only interacts with the real DOM via this trait,
  * If you want to render to something other than a browser's DOM, implement this trait.
  *
  * This could potentially be used for an HTML renderer, React Native, virtual DOM, etc.
  *
  * Note: there are still a bunch of TODO-s to actually make this possible.
  */
trait DomApi[DomHtmlElement, DomNode] {

  // @TODO: NEXT UP
  // Get rid of DomApi and HasDomApi for good:
  // - setProperty and setStyle - move into ElementApi (add a @TODO to deal with style's htmlElement later)
  // - event listeners into eventListenerApi
  // Move: all builder should be in one folder (no /nodes)
  // Remove references to dom:
  // - AttrSetter and friends
  // - EventProp and friends
  // - PropSetter and friends
  // - StyleSetter and friends
  // Move some stuff form simple into jsdom (e.g. the builders)
  // Update docs with usage

  @inline def setProperty[V](element: DomNode, propName: String, value: V): Unit
}
