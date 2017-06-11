package com.raquo.dombuilder.jsdom.domapi

import com.raquo.dombuilder.domapi
import org.scalajs.dom

trait JsTextApi extends domapi.TextApi {

  @inline override def createText(text: String): dom.Text = {
    dom.document.createTextNode(text)
  }

  @inline override def textContent(node: dom.Text): String = {
    node.textContent
  }

  @inline override def setTextContent(node: dom.Text, text: String): Unit = {
    node.textContent = text
  }
}
