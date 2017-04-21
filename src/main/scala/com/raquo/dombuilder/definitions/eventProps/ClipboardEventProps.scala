package com.raquo.dombuilder.definitions.eventProps

import com.raquo.dombuilder.builders.EventPropBuilder
import com.raquo.dombuilder.keys.EventProp

/**
  * Clipboard Events
  */
trait ClipboardEventProps[N, DomEvent, Fun1[-_, +_]] { this: EventPropBuilder[N, DomEvent, Fun1] =>

  /**
    * Fires when the user copies the content of an element
    */
  lazy val onCopy: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("copy")

  /**
    * Fires when the user cuts the content of an element
    */
  lazy val onCut: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("cut")

  /**
    * Fires when the user pastes some content in an element
    */
  lazy val onPaste: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("paste")
}
