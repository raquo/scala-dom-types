package com.raquo.dombuilder.example.components

import com.raquo.dombuilder.simple
import com.raquo.dombuilder.simple.{attrs, events}
import com.raquo.dombuilder.simple.nodeProps.textContent
import com.raquo.dombuilder.simple.nodes.{SimpleElement, SimpleText}
import com.raquo.dombuilder.simple.tags._

class Counter {

  private var count = 0

  private val captionNode: SimpleText = count.toString

  private val incButton: SimpleElement = button(
    events.onClick := increment _,
    "[ + ]"
  )

  // @TODO[Docs] update example in README

  val element: SimpleElement = div(
    attrs.cls := "Counter",
    incButton,
    captionNode,
    simple.commentBuilder(textContent := "YOLO")
  )

  def increment(): Unit = {
    count += 1
    captionNode.setText(count.toString)
  }
}
