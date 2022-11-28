package com.raquo.domtypes.old.defs.eventProps

import com.raquo.domtypes.old.builders.EventPropBuilder

/**
  * Clipboard Events
  *
  * For type param docs see [[EventPropBuilder]]
  */
trait ClipboardEventProps[EP[_ <: DomEvent], DomEvent, DomClipboardEvent <: DomEvent] { this: EventPropBuilder[EP, DomEvent] =>

  /**
    * Fires when the user copies the content of an element
    */
  lazy val onCopy: EP[DomClipboardEvent] = eventProp("copy")

  /**
    * Fires when the user cuts the content of an element
    */
  lazy val onCut: EP[DomClipboardEvent] = eventProp("cut")

  /**
    * Fires when the user pastes some content in an element
    */
  lazy val onPaste: EP[DomClipboardEvent] = eventProp("paste")
}
