package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.domapi.TreeApi

// @TODO[SERVER]
import scala.scalajs.js

// @TODO[API] should this extend Node instead?

/** Represents a node that has or might have children.
  *
  * This needs to be a RefNode for our sanity.
  * We're building a tree *mostly* matching the DOM, not an arbitrary structure.
  */
trait ParentNode[N, +Ref <: DomNode, DomNode] { this: N with Node[N, Ref, DomNode] =>

  val treeApi: TreeApi[N, DomNode]

  protected[this] var _maybeChildren: js.UndefOr[js.Array[ChildNode[N, DomNode, DomNode] with Node[N, DomNode, DomNode]]] = js.undefined

  @inline def maybeChildren: js.UndefOr[js.Array[ChildNode[N, DomNode, DomNode] with Node[N, DomNode, DomNode]]] = _maybeChildren

  def appendChild(child: ChildNode[N, DomNode, DomNode] with Node[N, DomNode, DomNode]): Unit = {

    // 1. Update this node
    if (_maybeChildren.isEmpty) {
      _maybeChildren = js.Array(child)
    } else {
      _maybeChildren.foreach(children => children.push(child))
    }

    // 2. Update child
    child.setParent(this)

    // 3. Update DOM
    treeApi.appendChild(ref, child.ref)
  }

  def removeChild(child: ChildNode[N, DomNode, DomNode] with Node[N, DomNode, DomNode]): Unit = {
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
      treeApi.removeChild(parentNode = ref, child = child.ref)
    }
  }

  def insertChild(child: ChildNode[N, DomNode, DomNode] with Node[N, DomNode, DomNode], atIndex: Int): Unit = {
    // @TODO should we check that maybeChildren is initialized?
    // @TODO should we check that index is not out of bounds?
    _maybeChildren.foreach { children =>

      // 1. Update this node
      children.splice(atIndex, 0, child)

      // 2. Update child
      child.setParent(this)

      // 3. Update DOM
      if (atIndex == children.length) {
        treeApi.appendChild(parentNode = ref, child = child.ref)
      } else {
        val nextChild = children.apply(atIndex)
        treeApi.insertBefore(
          parentNode = ref,
          newNode = child.ref,
          referenceNode = nextChild.ref
        )
      }
    }
  }

  def replaceChild(
    oldChild: ChildNode[N, DomNode, DomNode] with Node[N, DomNode, DomNode],
    newChild: ChildNode[N, DomNode, DomNode] with Node[N, DomNode, DomNode]
  ): Unit = {
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
      treeApi.insertBefore(
        parentNode = ref,
        newNode = newChild.ref,
        referenceNode = oldChild.ref
      )
      treeApi.removeChild(parentNode = ref, child = oldChild.ref)
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
