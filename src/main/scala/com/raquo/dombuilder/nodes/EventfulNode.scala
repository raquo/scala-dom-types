package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.domapi.EventApi
import com.raquo.dombuilder.modifiers.EventPropSetter

// @TODO[SERVER]
import scala.scalajs.js

/** Represents a [[Node]] that supports event listeners */
trait EventfulNode[N, +Ref <: DomNode, DomNode, DomEvent, Fun1[-_, +_]] { self: Node[N, Ref] =>

  val eventApi: EventApi[N, DomNode, DomEvent, Fun1]

  // @TODO[Naming] We reuse EventPropSetter to represent an active event listener. Makes for a bit confusing naming.
  protected[this] var _maybeEventListeners: js.UndefOr[js.Array[EventPropSetter[_, N, DomEvent, Fun1]]] = js.undefined

  @inline def maybeEventListeners: js.UndefOr[js.Array[EventPropSetter[_, N, DomEvent, Fun1]]] = _maybeEventListeners

  /** @return Whether listener was added (false if such a listener has already been present) */
  def addEventListener[Ev <: DomEvent](eventPropSetter: EventPropSetter[Ev, N, DomEvent, Fun1]): Boolean = {
    val shouldAddListener = indexOfEventListener(eventPropSetter) == -1
    if (shouldAddListener) {
      // 1. Update this node
      if (_maybeEventListeners.isEmpty) {
        _maybeEventListeners = js.defined(js.Array(eventPropSetter))
      } else {
        _maybeEventListeners.foreach { eventListeners =>
          eventListeners.push(eventPropSetter)
        }
      }
      // 2. Update the DOM
      eventApi.addEventListener(ref, eventPropSetter.key.domName, eventPropSetter.domValue)
    }
    shouldAddListener
  }

  def removeEventListener[Ev <: DomEvent](eventPropSetter: EventPropSetter[Ev, N, DomEvent, Fun1]): Boolean = {
    val index = indexOfEventListener(eventPropSetter)
    val shouldRemoveListener = index != -1
    if (shouldRemoveListener) {
      // 1. Update this node
      _maybeEventListeners.get.splice(index, deleteCount = 1)
      // 2. Update the DOM
      eventApi.removeEventListener(ref, eventPropSetter.key.domName, eventPropSetter.domValue)
    }
    shouldRemoveListener
  }

  def indexOfEventListener[Ev <: DomEvent](eventPropSetter: EventPropSetter[Ev, N, DomEvent, Fun1]): Int = {
    // Note: Ugly for performance.
    //  - We want to reduce usage of Scala's collections and anonymous functions
    //  - js.Array is unaware of Scala's `equals` method
    val notFoundIndex = -1
    if (_maybeEventListeners.isEmpty) {
      notFoundIndex
    } else {
      var found = false
      var index = 0
      _maybeEventListeners.foreach { listeners =>
        while (!found && index < listeners.length) {
          if (eventPropSetter equals listeners(index)) {
            found = true
          } else {
            index += 1
          }
        }
      }
      if (found) index else notFoundIndex
    }
  }
}
