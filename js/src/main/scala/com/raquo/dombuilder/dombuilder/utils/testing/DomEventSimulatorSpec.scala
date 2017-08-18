package com.raquo.dombuilder.dombuilder.utils.testing

// @TODO[SERVER]
import org.scalajs.dom

trait DomEventSimulatorSpec {

  // @TODO[API] Make a simple simulator package
  // @TODO This could be more compatible and more configurable
  // @TODO see if we can use https://github.com/Rich-Harris/simulant

  def simulateClick(target: dom.Node): Unit = {
    val evt = dom.document.createEvent("HTMLEvents")
    evt.initEvent("click", canBubbleArg = true, cancelableArg = true)
    target.dispatchEvent(evt)
  }

  def simulateScroll(target: dom.Node): Unit = {
    val evt = dom.document.createEvent("HTMLEvents")
    evt.initEvent("scroll", canBubbleArg = true, cancelableArg = true)
    target.dispatchEvent(evt)
  }
}
