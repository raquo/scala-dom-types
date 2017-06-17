package com.raquo.dombuilder.generic.nodes

trait Element {

  val tagName: String

  val void: Boolean

  def setAttribute[V](attrName: String, value: V): Unit

  def removeAttribute(attrName: String): Unit

  def setProperty[V](propName: String, value: V): Unit

  def setStyle[V](propName: String, value: V): Unit
}
