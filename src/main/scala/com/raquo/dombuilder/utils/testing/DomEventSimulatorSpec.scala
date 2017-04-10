package com.raquo.dombuilder.utils.testing

import org.scalajs.dom

trait DomEventSimulatorSpec {

  def simulateClick(target: dom.Node): Unit = {
    // @TODO[API] Make a simple simulator package
    // @TODO This could be more compatible and more configurable
    // @TODO see if we can use https://github.com/Rich-Harris/simulant
    val evt = dom.document.createEvent("HTMLEvents")
    evt.initEvent("click", canBubbleArg = true, cancelableArg = true)
    target.dispatchEvent(evt)
  }
}
