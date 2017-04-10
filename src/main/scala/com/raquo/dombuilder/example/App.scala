package com.raquo.dombuilder.example

import com.raquo.dombuilder.example.components.Toggle
import com.raquo.dombuilder.simple
import org.scalajs.dom
import org.scalajs.dom.document
import org.scalajs.dom.raw.Event

import scala.scalajs.js

object App extends js.JSApp {

  def main(): Unit = {
    document.addEventListener("DOMContentLoaded", (e: Event) => {
      dom.console.log("=== DOMContentLoaded ===")

      val container = document.getElementById("app-container")
      container.textContent = ""

      val root = simple.builder.mount(container, renderToggle())

      // root.unmount()
    })
  }

  def renderToggle(): Toggle = {
    val toggle = new Toggle(initialIsChecked = true)

//    dom.window.setInterval(() => {
//      toggle.setChecked(!toggle.isChecked)
//    }, timeout = 500)

    toggle
  }
}
