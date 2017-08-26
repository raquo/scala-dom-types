package com.raquo.dom.types.generic.defs.eventProps

import com.raquo.dom.types.generic.builders.BoundedBuilder

/**
  * Clipboard Events
  */
trait ClipboardEventProps[P[_ <: DomEvent], DomEvent] { this: BoundedBuilder[P, DomEvent] =>

  /**
    * Fires when the user copies the content of an element
    */
  lazy val onCopy: P[DomEvent] = build("copy")

  /**
    * Fires when the user cuts the content of an element
    */
  lazy val onCut: P[DomEvent] = build("cut")

  /**
    * Fires when the user pastes some content in an element
    */
  lazy val onPaste: P[DomEvent] = build("paste")
}
