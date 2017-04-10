package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.Modifier
import org.scalajs.dom

import scala.scalajs.js

trait Element[N] extends Node[N, dom.Element] { self: N =>

  type ChildNode = Node[N, dom.Node]

  val tagName: String

  protected[this] var _maybeChildren: js.UndefOr[js.Array[ChildNode]] = js.undefined

  // @TODO need special handling of events (keep track of them)

  // @TODO think about memory leaks when detaching nodes

  override protected[this] def createRef(): dom.Element = {
    builder.domapi.createElement(tagName)
  }

  def apply(modifiers: Modifier[N]*): this.type = {
    // @TODO[Performance] Use while loop?
    modifiers.foreach(_.applyTo(this))
    this
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

  def insertChild(child: ChildNode, atIndex: Int): Unit = {
    // @TODO should we check that maybeChildren is initialized?
    // @TODO should we check that index is not out of bounds?
    _maybeChildren.foreach { children =>

      // 1. Update this node
      _maybeChildren = children.splice(atIndex, 0, child)

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

//  @inline protected def numberOfChildren(): Int = {
//    maybeChildren.map(children => children.length).getOrElse(0)
//  }
//
//  @inline protected def indexOfChild(child: N): Int = {
//    maybeChildren.map(children => children.indexOf(child)).getOrElse(-1)
//  }
//
}
