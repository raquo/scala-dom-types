package com.raquo.dombuilder.example.components

import com.raquo.dombuilder.simple
import com.raquo.dombuilder.simple.{SimpleElement, SimpleText, attrs, events}
import com.raquo.dombuilder.simple.elements._

// @TODO[API] The "div" here is making me cringe. Think how best to extract it later. Combine with DOM types maybe.

class Counter extends SimpleElement("div") {

  private var count = 0

  val incButton: SimpleElement = button(
    events.onClick := increment _,
    "[ + ]"
  )

  private val captionNode: SimpleText = count.toString

  this(
    attrs.cls := "Counter",
    incButton,
    captionNode,
    simple.nodeBuilder.commentNode("YOLO")
  )

  def increment(): Unit = {
    count += 1
    captionNode.setText(count.toString)
  }
}
