package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.EventPropBuilder

/**
  * Document Events
  *
  * For type param docs see [[EventPropBuilder]]
  */
trait DocumentOnlyEventProps[EP[_ <: DomEvent], DomEvent] { this: EventPropBuilder[EP, DomEvent] =>

  /**
    * The `DOMContentLoaded` event is fired when the initial HTML document has been completely loaded and parsed,
    * without waiting for stylesheets, images, and subframes to finish loading. A very different event `load`
    * should be used only to detect a fully-loaded page.
    *
    * It is an incredibly common mistake to use load where DOMContentLoaded would be much more appropriate,
    * so be cautious.
    *
    * MDN
    */
  lazy val onDomContentLoaded: EP[DomEvent] = eventProp("DOMContentLoaded")

  /**
   * The visibilitychange event is fired when the content of a tab has become visible or has been hidden.
   *
   * MDN
   */
  lazy val onVisibilityChange: EP[DomEvent] = eventProp("visibilitychange")
}
