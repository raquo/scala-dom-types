package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.EventPropBuilder

/**
  * Clipboard Events
  *
  * For type param docs see [[EventPropBuilder]]
  */
trait ClipboardEventProps[EP[_ <: DomEvent], DomEvent, DomClipboardEvent <: DomEvent] { this: EventPropBuilder[EP, DomEvent] =>

  /**
    * Fires when the user copies the content of an element
    */
  @inline final def onCopy: EP[DomClipboardEvent] = eventProp("copy")

  /**
    * Fires when the user cuts the content of an element
    */
  @inline final def onCut: EP[DomClipboardEvent] = eventProp("cut")

  /**
    * Fires when the user pastes some content in an element
    */
  @inline final def onPaste: EP[DomClipboardEvent] = eventProp("paste")
}
