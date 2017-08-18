package com.raquo.dombuilder.dombuilder.generic.nodes

// @TODO[API] Root can not be a generic class just because we don't have a generic implementation of `appendChild`. It was possible when we had TreeApi.

trait Root[N, +Ch <: N with ChildNode[N, BaseRef, BaseRef], +ParentRef <: BaseRef, BaseRef] extends ParentNode[N, ParentRef, BaseRef] { this: N =>

  val container: ParentRef

  val child: Ch

  appendChild(child)

  /**
    * When we create a Root, we don't want to create a new HTML Element, we want to
    * a reference to an existing element, the container.
    */
  override def createRef(): ParentRef = {
    container
  }

  /** @return Whether child was successfully unmounted */
  def unmount(): Boolean = {
    var removed = false
    val maybeParentNode = child.maybeParent
    maybeParentNode.foreach { parentNode =>
      removed = parentNode.removeChild(child)
      if (removed) {
        child.clearParent()
      }
    }
    removed
  }
}
