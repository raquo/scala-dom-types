package com.raquo.dombuilder

import com.raquo.dombuilder.simple.attrs.cls
import com.raquo.dombuilder.simple.elements.{div, span}
import com.raquo.dombuilder.simple.events.onClick

class EventPropSpec extends UnitSpec {

  it("handles click events") {
    var callbackCount = 0

    def testEvent(): Unit = {
      callbackCount += 1
    }

    val childSpan = span("Hello")
    val childTextNode = nodeBuilder.textNode("world")

    val clickableDiv = div(
      cls := "clickable",
      onClick := testEvent _,
      childSpan,
      childTextNode
    )

    val unrelatedDiv = div(cls := "unrelated", "Something else")

    mount(
      div(
        clickableDiv,
        unrelatedDiv
      )
    )

    callbackCount shouldBe 0

    // Direct hit
    simulateClick(clickableDiv.ref)
    callbackCount shouldBe 1

    // Click event should bubble up
    simulateClick(childSpan.ref)
    callbackCount shouldBe 2

    // Click event should bubble up even from a text node
    simulateClick(childTextNode.ref)
    callbackCount shouldBe 3

    // Click should not be counted on unrelated div
    simulateClick(unrelatedDiv.ref)
    callbackCount shouldBe 3
  }
}
