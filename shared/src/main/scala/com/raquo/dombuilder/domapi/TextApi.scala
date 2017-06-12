package com.raquo.dombuilder.domapi

import com.raquo.dombuilder.DText

trait TextApi {

  def createText(text: String): DText

  def textContent(node: DText): String

  def setTextContent(node: DText, text: String): Unit
}
