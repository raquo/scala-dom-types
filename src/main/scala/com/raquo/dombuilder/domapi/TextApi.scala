package com.raquo.dombuilder.domapi

trait TextApi[N, DomText] {

  def createText(text: String): DomText

  def textContent(node: DomText): String

  def setTextContent(node: DomText, text: String): Unit
}
