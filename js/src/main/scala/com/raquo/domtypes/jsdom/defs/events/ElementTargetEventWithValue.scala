package com.raquo.domtypes.jsdom.defs.events

import org.scalajs.dom

/** One of the possible ways to access `target.value` on input events.
  * If you want to use this, define an implicit conversion that instantiates this class.
  */
class ElementTargetEventWithValue(val ev: ElementTargetEvent[dom.html.Element]) extends AnyVal {

  def targetValue: String = ev.target match {
    case input: dom.html.Input => input.value
    case textArea: dom.html.TextArea => textArea.value
    case select: dom.html.Select => select.value
    case elem => elem.textContent // for `contentEditable`
  }
}
