package com.raquo.dombuilder.example

import com.raquo.dombuilder.example.components.{Counter, Toggle}
import com.raquo.dombuilder.{Root, simple}
import com.raquo.dombuilder.simple.SimpleElement
import org.scalajs.dom
import org.scalajs.dom.document

import scala.scalajs.js

object App extends js.JSApp {

  def main(): Unit = {
    document.addEventListener("DOMContentLoaded", (e: dom.Event) => {
      dom.console.log("=== DOMContentLoaded ===")

      val container = document.getElementById("app-container")
      container.textContent = ""

      val root = Root.mount(container, renderCounter(), simple.builder)

      // root.unmount()
    })
  }

  def renderCounter(): SimpleElement = {
    val counter = new Counter()
    counter
  }

  def renderToggle(): SimpleElement = {
    val toggle = new Toggle(initialIsChecked = true)

//    dom.window.setInterval(() => {
//      toggle.setChecked(!toggle.isChecked)
//    }, timeout = 500)

    toggle
  }
}
