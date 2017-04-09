package com.raquo.dombuilder

import com.raquo.dombuilder.events.onClick
import com.raquo.dombuilder.tags.{div, span}
import org.scalajs.dom.raw.MouseEvent

class EventPropSpec extends UnitSpec {

  it("handles click events") {
    var callbackCount = 0
    def testEvent(ev: MouseEvent): Unit = {
      callbackCount += 1
    }

    mount(
      div(
        div(
          cls := "clickable",
          onClick := testEvent _,
          span("Hello"),
          "world"
        ),
        div(cls := "unrelated", "Something else")
      )
    )

    val clickableDiv = mountedElement.querySelector(".clickable")
    val spanInClickableDiv = clickableDiv.querySelector("span")
    val unrelatedDiv = mountedElement.querySelector(".unrelated")

    callbackCount shouldBe 0

    // Direct hit
    simulateClick(spanInClickableDiv)
    callbackCount shouldBe 1

    // Click event should bubble up
    simulateClick(spanInClickableDiv)
    callbackCount shouldBe 2

    // Click should not be counted on unrelated div
    simulateClick(unrelatedDiv)
    callbackCount shouldBe 2
  }
}
