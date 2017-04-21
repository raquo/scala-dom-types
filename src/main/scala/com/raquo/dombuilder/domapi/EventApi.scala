package com.raquo.dombuilder.domapi

// @TODO[API] Hahah does coveriance on existential types even make sense? Think about it.
trait EventApi[N, DomNode, DomEvent, Fun1[-_, +_]] {

  @inline def addEventListener[E <: DomEvent](
    element: DomNode,
    eventName: String,
    eventHandler: Fun1[E, Unit],
    useCapture: Boolean = false
  ): Unit

  @inline def removeEventListener[E <: DomEvent](
    element: DomNode,
    eventName: String,
    eventHandler: Fun1[E, Unit],
    useCapture: Boolean = false
  ): Unit

  @inline def toDomFun[A, B](eventListener: A => B): Fun1[A, B]
}
