package com.raquo.dombuilder.dombuilder.generic.nodes

import com.raquo.dombuilder.dombuilder.generic.modifiers.EventPropSetter

import scala.collection.mutable

// @TODO[Types] Doesn't seem like we need N type param here

/** Represents a [[RefNode]] that supports event listeners */
trait EventfulNode[N, +Ref <: BaseRef, BaseRef] extends RefNode[Ref] { this: N =>

  // @TODO[Naming] We reuse EventPropSetter to represent an active event listener. Makes for a bit confusing naming.
  // @TODO[API] That is also a problem because it does not allow us to differentiate between useCapture true and false
  protected[this] var _maybeEventListeners: Option[mutable.Buffer[EventPropSetter[_, BaseRef]]] = None

  @inline def maybeEventListeners: Option[mutable.Buffer[EventPropSetter[_, BaseRef]]] = _maybeEventListeners

  /** @return Whether listener was added (false if such a listener has already been present) */
  def addEventListener[Ev](eventPropSetter: EventPropSetter[Ev, BaseRef]): Boolean = {
    val shouldAddListener = indexOfEventListener(eventPropSetter) == -1
    if (shouldAddListener) {
      // 1. Update this node
      if (_maybeEventListeners.isEmpty) {
        _maybeEventListeners = Some(mutable.Buffer(eventPropSetter))
      } else {
        _maybeEventListeners.foreach { eventListeners =>
          eventListeners += eventPropSetter
        }
      }
      // 2. Update the DOM
      eventPropSetter.domAddEventListener(toNode = this)
    }
    shouldAddListener
  }

  def removeEventListener[Ev](eventPropSetter: EventPropSetter[Ev, BaseRef]): Boolean = {
    val index = indexOfEventListener(eventPropSetter)
    val shouldRemoveListener = index != -1
    if (shouldRemoveListener) {
      // 1. Update this node
      _maybeEventListeners.foreach(eventListeners => eventListeners.remove(index))
      // 2. Update the DOM
      eventPropSetter.domRemoveEventListener(fromNode = this)
    }
    shouldRemoveListener
  }

  def indexOfEventListener[Ev](eventPropSetter: EventPropSetter[Ev, BaseRef]): Int = {
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
