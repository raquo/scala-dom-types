package com.raquo.dombuilder.domapi

import org.scalajs.dom

import scala.scalajs.js

trait EventApi {

  @inline def addEventListener[Ev <: dom.Event](
    element: dom.Node,
    eventName: String,
    eventHandler: js.Function1[Ev, Unit],
    useCapture: Boolean = false
  ): Unit

  @inline def removeEventListener[Ev <: dom.Event](
    element: dom.Node,
    eventName: String,
    eventHandler: js.Function1[Ev, Unit],
    useCapture: Boolean = false
  ): Unit
}
