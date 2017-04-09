package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.Modifier
import org.scalajs.dom

import scala.scalajs.js

//class Element[N <: Node[N]](val tagName: String, override val builder: Builder[N]) extends Node[N] { self: N =>
trait Element[N] extends Node[N, dom.Element] { self: N =>

  type ChildNode = Node[N, dom.Node]

  val tagName: String

  var maybeChildren: js.UndefOr[js.Array[ChildNode]] = js.undefined

  // @TODO[API] add privacy

  // @TODO need special handling of events (keep track of them)

  // @TODO think about memmory leaks when detaching nodes

  def apply(modifiers: Modifier[N]*): this.type = {
    // @TODO[Performance] Use while loop?
    modifiers.foreach(_.applyTo(this))
    this
  }

  def appendChild(child: ChildNode): Unit = {

    // 1. Update this node
    if (maybeChildren.isEmpty) {
      maybeChildren = js.Array(child)
    } else {
      maybeChildren.foreach(children => children.push(child))
    }

    // 2. Update child
    child.maybeParent = this

    // 3. Update DOM
    builder.domapi.appendChild(ref, child.ref)
  }

  def removeChild(child: ChildNode): Unit = {
    // @TODO throw if not found?
    maybeChildren.foreach { children =>
      val index = children.indexOf(child)

      // 1. Update this node
      if (index != -1) {
        children.splice(index, deleteCount = 1)
      }

      // 2. Update child
      child.maybeParent = js.undefined

      // 3. Update DOM
      builder.domapi.removeChild(node = ref, child = child.ref)
    }
  }

  def replaceChild(oldChild: ChildNode, newChild: ChildNode): Unit = {
    // @TODO throw if not found?
    maybeChildren.foreach { children =>
      val index = children.indexOf(oldChild)

      // 1. Update this node
      if (index != -1) {
        children.update(index, newChild)
      } else {
        // @TODO throw?
      }

      // 2. Update child
      newChild.maybeParent = this
      oldChild.maybeParent = js.undefined

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
    maybeChildren.foreach { children =>

      // 1. Update this node
      maybeChildren = children.splice(atIndex, 0, child)

      // 2. Update child
      child.maybeParent = this

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
  override protected def createRef(): dom.Element = {
    builder.domapi.createElement(tagName)
  }
}
