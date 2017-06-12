package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.domapi.EventApi
import com.raquo.dombuilder.modifiers.EventPropSetter
import org.scalajs.dom

import scala.scalajs.js

/** Represents a [[Node]] that supports event listeners */
trait EventfulNode[N, +Ref <: dom.Node] { this: Node[N, Ref, dom.Node] =>

  val eventApi: EventApi

  // @TODO[Naming] We reuse EventPropSetter to represent an active event listener. Makes for a bit confusing naming.
  protected[this] var _maybeEventListeners: js.UndefOr[js.Array[EventPropSetter[_, N]]] = js.undefined

  @inline def maybeEventListeners: js.UndefOr[js.Array[EventPropSetter[_, N]]] = _maybeEventListeners

  /** @return Whether listener was added (false if such a listener has already been present) */
  def addEventListener[Ev <: dom.Event](eventPropSetter: EventPropSetter[Ev, N]): Boolean = {
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

  def removeEventListener[Ev <: dom.Event](eventPropSetter: EventPropSetter[Ev, N]): Boolean = {
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

  def indexOfEventListener[Ev <: dom.Event](eventPropSetter: EventPropSetter[Ev, N]): Int = {
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
