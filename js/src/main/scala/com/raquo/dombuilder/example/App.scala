package com.raquo.dombuilder.example

import com.raquo.dombuilder.example.components.{Counter, Toggle}
import com.raquo.dombuilder.jsdom.simple.SimpleHtmlElement
import com.raquo.dombuilder.jsdom.simple
import org.scalajs.dom
import org.scalajs.dom.document

import scala.scalajs.js

object App extends js.JSApp {

  def main(): Unit = {
    document.addEventListener("DOMContentLoaded", (e: dom.Event) => {
      dom.console.log("=== DOMContentLoaded ===")

      val container = document.getElementById("app-container")
      container.textContent = ""

      val root = simple.root.mount(container, renderCounter())

      // root.unmount()
    })
  }

  def renderCounter(): SimpleHtmlElement = {
    val counter = new Counter()
    counter.element
  }

  def renderToggle(): SimpleHtmlElement = {
    val toggle = new Toggle(initialIsChecked = true)

//    dom.window.setInterval(() => {
//      toggle.setChecked(!toggle.isChecked)
//    }, timeout = 500)

    toggle.element
  }
}
