package com.raquo.dombuilder.jsdom.domapi

import com.raquo.dombuilder.domapi
import org.scalajs.dom

trait TextNodeApi[N] extends domapi.TextNodeApi[N, dom.Text] {

  @inline override def createTextNode(text: String): dom.Text = {
    dom.document.createTextNode(text)
  }

  @inline override def textContent(node: dom.Text): String = {
    node.textContent
  }

  @inline override def setTextContent(node: dom.Text, text: String): Unit = {
    node.textContent = text
  }
}
