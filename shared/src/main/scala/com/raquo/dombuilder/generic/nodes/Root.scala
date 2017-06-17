package com.raquo.dombuilder.generic.nodes

trait Root[N, +ParentRef <: BaseRef, +ChildRef <: BaseRef, BaseRef] extends ParentNode[N, ParentRef, BaseRef] { this: N =>

  val container: ParentRef

  val child: N with ChildNode[N, ChildRef, BaseRef]

  /**
    * When we create a Root, we don't want to create a new HTML Element, we want to
    * a reference to an existing element, the container.
    */
  override def createRef(): ParentRef = {
    container
  }

  /** @return Whether child was successfully unmounted */
  def unmount(): Boolean
}
