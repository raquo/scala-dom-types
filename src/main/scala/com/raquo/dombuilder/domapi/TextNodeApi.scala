package com.raquo.dombuilder.domapi

trait TextNodeApi[N, DomTextNode] {

  def createTextNode(text: String): DomTextNode

  def textContent(node: DomTextNode): String

  def setTextContent(node: DomTextNode, text: String): Unit
}
