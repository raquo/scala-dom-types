package com.raquo.dombuilder.definitions.eventProps

import com.raquo.dombuilder.Builder
import com.raquo.dombuilder.keys.EventProp
import org.scalajs.dom

/**
  * Clipboard Events
  */
trait ClipboardEventProps[N] { self: Builder[N] =>

  /**
    * Fires when the user copies the content of an element
    */
  lazy val onCopy: EventProp[dom.Event, N] = eventProp("copy")

  /**
    * Fires when the user cuts the content of an element
    */
  lazy val onCut: EventProp[dom.Event, N] = eventProp("cut")

  /**
    * Fires when the user pastes some content in an element
    */
  lazy val onPaste: EventProp[dom.Event, N] = eventProp("paste")
}
