package com.raquo.dombuilder.jsdom.domapi

import com.raquo.dombuilder.domapi
import org.scalajs.dom

import scala.scalajs.js

trait JsEventApi[N] extends domapi.EventApi[N, dom.Node, dom.Event, js.Function1] {

  @inline override def addEventListener[E <: dom.Event](
    element: dom.Node,
    eventName: String,
    eventHandler: js.Function1[E, Unit],
    useCapture: Boolean = false
  ): Unit = {
    element.addEventListener(eventName, eventHandler, useCapture)
  }

  @inline override def removeEventListener[E <: dom.Event](
    element: dom.Node,
    eventName: String,
    eventHandler: js.Function1[E, Unit],
    useCapture: Boolean = false
  ): Unit = {
    element.removeEventListener(eventName, eventHandler, useCapture)
  }

  @inline override def toDomFun[A, B](eventListener: A => B): js.Function1[A, B] = {
    eventListener
  }
}
