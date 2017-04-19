package com.raquo.dombuilder.domapi

trait TreeApi[N, TreeNodeRef] {

  @inline def parentNode(node: TreeNodeRef): Option[TreeNodeRef]

  @inline def insertBefore(
    parentNode: TreeNodeRef,
    newNode: TreeNodeRef,
    referenceNode: TreeNodeRef
  ): Unit

  // @TODO[Performance] Add removeAllChildren and implement it as .textContent = "" or something?

  @inline def removeChild(parentNode: TreeNodeRef, child: TreeNodeRef): Unit

  @inline def appendChild(parentNode: TreeNodeRef, child: TreeNodeRef): Unit
}
