package com.raquo.dombuilder.dombuilder

import com.raquo.dombuilder.dombuilder.jsdom.simple.attrs.cls
import com.raquo.dombuilder.dombuilder.jsdom.simple.tags.{div, span}
import com.raquo.dombuilder.dombuilder.jsdom.simple.events.{onClick, onScroll}
import com.raquo.dombuilder.dombuilder.jsdom.simple.nodes.SimpleText

class EventPropSpec extends UnitSpec {

  it("adds and removes event listeners as instructed") {
    var clickCount1 = 0
    var clickCount2 = 0
    var scrollCount = 0

    def testClick1(): Unit = {
      clickCount1 += 1
    }

    def testClick2(): Unit = {
      clickCount2 += 1
    }

    def testScroll(): Unit = {
      scrollCount += 1
    }

    val clickSetter1 = onClick := testClick1 _
    val clickSetter2 = onClick := testClick2 _
    val scrollSetter2 = onScroll := testScroll _

    val clickableDiv = div(
      cls := "clickable",
      clickSetter1,
      "world"
    )

    mount(
      div(
        clickableDiv,
        div(cls := "unrelated", "Something else")
      )
    )

    // @TODO[Test] Verify exact values in Node.maybeEventListeners. Can not easily do that because of "isArray__Z" Scala.js bug
    // @TODO[Test] Split between testing Element methods and EventPropSetter methods?

    clickableDiv.maybeEventListeners.get.length shouldBe 1
    clickCount1 shouldBe 0

    // One event listener added
    simulateClick(clickableDiv.ref)
    clickCount1 shouldBe 1
    clickCount2 shouldBe 0

    // Add a new event listener on the same event type ("click")
    clickSetter2.applyTo(clickableDiv)
    clickableDiv.maybeEventListeners.get.length shouldBe 2
    clickCount1 shouldBe 1
    clickCount2 shouldBe 0

    simulateClick(clickableDiv.ref)
    clickCount1 shouldBe 2
    clickCount2 shouldBe 1

    // Remove that new event listener
    clickableDiv.removeEventListener(clickSetter2)
    clickableDiv.maybeEventListeners.get.length shouldBe 1

    simulateClick(clickableDiv.ref)
    clickCount1 shouldBe 3
    clickCount2 shouldBe 1

    // Add a duplicate of the original event listener (duplicate should be ignored)
    clickSetter1.applyTo(clickableDiv)
    clickableDiv.maybeEventListeners.get.length shouldBe 1
    simulateClick(clickableDiv.ref)
    clickCount1 shouldBe 4

    // Add a listener to an unrelated event
    scrollSetter2.applyTo(clickableDiv)
    clickableDiv.maybeEventListeners.get.length shouldBe 2

    simulateClick(clickableDiv.ref)
    clickCount1 shouldBe 5
    scrollCount shouldBe 0

    simulateScroll(clickableDiv.ref)
    clickCount1 shouldBe 5
    scrollCount shouldBe 1

    // Remove all event listeners
    clickableDiv.removeEventListener(clickSetter1)
    clickableDiv.maybeEventListeners.get.length shouldBe 1

    clickableDiv.removeEventListener(scrollSetter2)
    clickableDiv.maybeEventListeners.get.length shouldBe 0

    simulateClick(clickableDiv.ref)
    simulateScroll(clickableDiv.ref)
    clickCount1 shouldBe 5
    clickCount2 shouldBe 1
    scrollCount shouldBe 1
  }

  it("handles click events on nested elements") {
    var callbackCount = 0

    def testEvent(): Unit = {
      callbackCount += 1
    }

    val childSpan = span("Hello")
    val childTextNode: SimpleText = "world"

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
