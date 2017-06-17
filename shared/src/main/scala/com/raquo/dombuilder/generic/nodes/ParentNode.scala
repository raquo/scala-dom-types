package com.raquo.dombuilder.generic.nodes

import scala.collection.mutable

trait ParentNode[N, +Ref <: BaseRef, BaseRef] extends RefNode[Ref] { this: N =>

  protected[this] var _maybeChildren: Option[mutable.Buffer[N with ChildNode[N, BaseRef, BaseRef]]] = None

  @inline def maybeChildren: Option[mutable.Buffer[N with ChildNode[N, BaseRef, BaseRef]]] = _maybeChildren

  def domAppendChild(child: N with ChildNode[N, BaseRef, BaseRef]): Boolean

  def domRemoveChild(child: N with ChildNode[N, BaseRef, BaseRef]): Boolean

  def domInsertBefore(
    newChild: N with ChildNode[N, BaseRef, BaseRef],
    referenceChild: N with ChildNode[N, BaseRef, BaseRef]
  ): Boolean

  def domReplaceChild(
    newChild: N with ChildNode[N, BaseRef, BaseRef],
    oldChild: N with ChildNode[N, BaseRef, BaseRef]
  ): Boolean

  /** @return Whether child was successfully appended */
  def appendChild(child: N with ChildNode[N, BaseRef, BaseRef]): Boolean = {
    // 1. Update DOM
    val appended = domAppendChild(child)
    if (appended) {

      // 2. Update this node
      if (_maybeChildren.isEmpty) {
        _maybeChildren = Some(mutable.Buffer(child))
      } else {
        _maybeChildren.foreach(children => children += child)
      }

      // 3. Update child
      child.setParent(this)
    }
    appended
  }

  /** @return Whether child was successfully removed */
  def removeChild(child: N with ChildNode[N, BaseRef, BaseRef]): Boolean = {
    var removed = false
    _maybeChildren.foreach { children =>

      // 0. Check precondition required for consistency of our own Tree vs real DOM
      val indexOfChild = children.indexOf(child)
      if (indexOfChild != -1) {

        // 1. Update DOM
        removed = domRemoveChild(child)
        if (removed) {

          // 2. Update this node
          children.remove(indexOfChild, count = 1)

          // 3. Update child
          child.clearParent()
        }
      }
    }
    removed
  }

  /** @return Whether child was successfully inserted */
  def insertChild(child: N with ChildNode[N, BaseRef, BaseRef], atIndex: Int): Boolean = {
    var inserted = false

    // 0. Prep this node
    if (_maybeChildren.isEmpty) {
      _maybeChildren = Some(mutable.Buffer())
    }

    _maybeChildren.foreach { children =>
      // 1. Update DOM
      if (atIndex < children.length) {
        val nextChild = children.apply(atIndex)
        inserted = domInsertBefore(
          newChild = child,
          referenceChild = nextChild
        )
      } else if (atIndex == children.length) {
        inserted = domAppendChild(child)
      }

      if (inserted) {
        // 2. Update this node
        children.insert(atIndex, child)

        // 3. Update child
        child.setParent(this)
      }
    }
    inserted
  }

  /** Note: Does nothing if `oldChild` was not found in parent's children, or if `oldChild==newChild`
    *
    * @return Whether child was replaced
    */
  def replaceChild(
    oldChild: N with ChildNode[N, BaseRef, BaseRef],
    newChild: N with ChildNode[N, BaseRef, BaseRef]
  ): Boolean = {
    var replaced = false
    _maybeChildren.foreach { children =>

      // 0. Check precondition required for consistency of our own Tree vs real DOM
      val indexOfChild = children.indexOf(oldChild)
      if (indexOfChild != -1) {

        // 1. Update DOM
        replaced = domReplaceChild(
          newChild = newChild,
          oldChild = oldChild
        )

        // 2. Update this node
        children.update(indexOfChild, newChild)

        // 3. Update children
        // @TODO[Test] This order is important when oldChild==newChild. Add a test for it
        oldChild.clearParent()
        newChild.setParent(this)
      }
    }
    replaced
  }

  /** Note: Does nothing if `fromIndex` or `toIndex` are out of bounds or if `fromIndex>toIndex`
    *
    * @return Whether children were replaced
    */
  def replaceChildren(
    fromIndex: Int,
    toIndex: Int,
    newChildren: Iterable[N with ChildNode[N, BaseRef, BaseRef]]
  ): Boolean = {
    // A note on efficiency of this method:
    //
    // Scala DOM Builder is not a virtual DOM, it has no concept of "child reconciliation" because
    // there are no virtual children to compare. If you're building a virtual DOM library on top
    // of Scala DOM builder, it's up to you to design a reconciliation algorithm that would call
    // more specific methods like insertChild / replaceChild / removeChild.
    //
    // Note that this method does not create any new DOM nodes. All the nodes that should
    // exist are already provided to it. All it does it detach from the DOM the old children
    // (within the given index bounds), and attach new children where the old children used to be.
    //
    // It is likely that a more refined algorithm could reduce the amount of DOM operations needed
    // for certain popular use cases, e.g. for reordering of the same items. And we should look
    // into that eventually, but not before it is proven with benchmarks that
    //
    // That said, we can probably improve this method's performance. Even though it doesn't create
    // any HTML elements unnecessarily (or at all) because they are provided to it

    // @TODO[Performance] introduce a reorderChildren() method to support efficient sorting?
    // @TODO[Integrity] This does not properly report failures like other methods do

    // 0. Prep this node
    if (_maybeChildren.isEmpty) {
      _maybeChildren = Some(mutable.Buffer())
    }

    var replaced = false
    _maybeChildren.foreach { children =>
      if (
        newChildren != children
          && fromIndex >= 0 && fromIndex < children.length
          && toIndex >= 0 && toIndex < children.length
          && fromIndex <= toIndex
      ) {
        replaced = true

        // A. Remove existing children
        var numRemovedNodes = 0
        val numNodesToRemove = toIndex - fromIndex + 1
        while (numRemovedNodes < numNodesToRemove) {
          removeChild(children(fromIndex))
          numRemovedNodes += 1
        }

        // B. Insert new children
        var insertedCount = 0
        newChildren.foreach { newChild =>
          insertChild(
            newChild,
            atIndex = fromIndex + insertedCount
          )
          insertedCount += 1
        }
      }
    }
    replaced
  }

  def replaceAllChildren(newChildren: Iterable[N with ChildNode[N, BaseRef, BaseRef]]): Unit = {
    // @TODO[Performance] This could be optimized
    // @TODO[Integrity] This does not properly report failures like other methods do

    // A. Remove existing children
    _maybeChildren.foreach { children =>
      children.foreach(removeChild)
    }

    // B. Add new children
    newChildren.foreach(appendChild)
  }

  def indexOfChild(child: N with ChildNode[N, BaseRef, BaseRef]): Int = {
    _maybeChildren.map(children => children.indexOf(child)).getOrElse(-1)
  }
}
