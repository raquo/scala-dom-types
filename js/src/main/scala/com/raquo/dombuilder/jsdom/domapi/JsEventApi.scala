package com.raquo.dombuilder.jsdom.domapi

import com.raquo.dombuilder.domapi
import org.scalajs.dom

import scala.scalajs.js

trait JsEventApi extends domapi.EventApi {

  @inline override def addEventListener[Ev <: dom.Event](
    element: dom.Node,
    eventName: String,
    eventHandler: js.Function1[Ev, Unit],
    useCapture: Boolean = false
  ): Unit = {
    element.addEventListener(eventName, eventHandler, useCapture)
  }

  @inline override def removeEventListener[Ev <: dom.Event](
    element: dom.Node,
    eventName: String,
    eventHandler: js.Function1[Ev, Unit],
    useCapture: Boolean = false
  ): Unit = {
    element.removeEventListener(eventName, eventHandler, useCapture)
  }
}
