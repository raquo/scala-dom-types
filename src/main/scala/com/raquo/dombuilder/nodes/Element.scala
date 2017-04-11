package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.{EventPropSetter, Modifier}
import org.scalajs.dom

import scala.scalajs.js

trait Element[N] extends Node[N, dom.Element] { self: N =>

  type ChildNode = Node[N, dom.Node]

  val tagName: String

  // @TODO[Naming] We reuse EventPropSetter to represent an active event listener. Makes for a bit confusing naming.
  protected[this] var _maybeEventListeners: js.UndefOr[js.Array[EventPropSetter[_, N]]] = js.undefined

  protected[this] var _maybeChildren: js.UndefOr[js.Array[ChildNode]] = js.undefined

  // @TODO need special handling of events (keep track of them)

  // @TODO think about memory leaks when detaching nodes

  override protected[this] def createRef(): dom.Element = {
    builder.domapi.createElement(tagName)
  }

  def apply(modifiers: Modifier[this.type]*): this.type = {
    // @TODO[Performance] Use while loop?
    modifiers.foreach(_.applyTo(this))
    this
  }

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
      builder.domapi.addEventListener(ref, eventPropSetter.key.jsName, eventPropSetter.jsValue)
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
      builder.domapi.removeEventListener(ref, eventPropSetter.key.jsName, eventPropSetter.jsValue)
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

  @inline def maybeChildren: js.UndefOr[js.Array[ChildNode]] = _maybeChildren

  def appendChild(child: ChildNode): Unit = {

    // 1. Update this node
    if (_maybeChildren.isEmpty) {
      _maybeChildren = js.Array(child)
    } else {
      _maybeChildren.foreach(children => children.push(child))
    }

    // 2. Update child
    child.setParent(this)

    // 3. Update DOM
    builder.domapi.appendChild(ref, child.ref)
  }

  def removeChild(child: ChildNode): Unit = {
    // @TODO throw if not found?
    _maybeChildren.foreach { children =>
      val index = children.indexOf(child)

      // 1. Update this node
      if (index != -1) {
        children.splice(index, deleteCount = 1)
      }

      // 2. Update child
      child.clearParent()

      // 3. Update DOM
      builder.domapi.removeChild(node = ref, child = child.ref)
    }
  }

  def insertChild(child: ChildNode, atIndex: Int): Unit = {
    // @TODO should we check that maybeChildren is initialized?
    // @TODO should we check that index is not out of bounds?
    _maybeChildren.foreach { children =>

      // 1. Update this node
      children.splice(atIndex, 0, child)

      // 2. Update child
      child.setParent(this)

      // 3. Update DOM
      if (atIndex == children.length) {
        builder.domapi.appendChild(node = this.ref, child = child.ref)
      } else {
        val nextChild = children.apply(atIndex)
        builder.domapi.insertBefore(
          parentNode = this.ref,
          newNode = child.ref,
          referenceNode = nextChild.ref
        )
      }
    }
  }

  def replaceChild(oldChild: ChildNode, newChild: ChildNode): Unit = {
    // @TODO throw if not found?
    _maybeChildren.foreach { children =>
      val index = children.indexOf(oldChild)

      // 1. Update this node
      if (index != -1) {
        children.update(index, newChild)
      } else {
        // @TODO throw?
      }

      // 2. Update child
      newChild.setParent(this)
      oldChild.clearParent()

      // 3. Update DOM
      builder.domapi.insertBefore(
        parentNode = this.ref,
        newNode = newChild.ref,
        referenceNode = oldChild.ref
      )
      builder.domapi.removeChild(node = ref, child = oldChild.ref)
    }
  }

  def replaceAllChildren(newChildren: js.Array[ChildNode]): Unit = {
    ???
  }

//  @inline protected def numberOfChildren(): Int = {
//    maybeChildren.map(children => children.length).getOrElse(0)
//  }
//
//  @inline protected def indexOfChild(child: N): Int = {
//    maybeChildren.map(children => children.indexOf(child)).getOrElse(-1)
//  }
//
}
