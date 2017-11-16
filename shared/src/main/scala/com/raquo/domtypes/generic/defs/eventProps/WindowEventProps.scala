package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.EventPropBuilder

/**
  * Window Events
  *
  * For type param docs see [[EventPropBuilder]]
  */
trait WindowEventProps[EP[_ <: DomEvent], DomEvent, DomUIEvent <: DomEvent, DomBeforeUnloadEvent <: DomEvent, DomHashChangeEvent <: DomEvent, DomMessageEvent <: DomEvent, DomPageTransitionEvent <: DomEvent, DomPopStateEvent <: DomEvent, DomStorageEvent <: DomEvent] { this: EventPropBuilder[EP, DomEvent] =>

  /**
    * Script to be run after the document is printed
    */
  lazy val onAfterPrint: EP[DomEvent] = eventProp("afterprint")

  /**
    * Script to be run before the document is printed
    */
  lazy val onBeforePrint: EP[DomEvent] = eventProp("beforeprint")

  /**
    * Script to be run when the document is about to be unloaded
    */
  lazy val onBeforeUnload: EP[DomBeforeUnloadEvent] = eventProp("beforeunload")

  /**
    * Script to be run when there has been changes to the anchor part of the a URL
    */
  lazy val onHashChange: EP[DomHashChangeEvent] = eventProp("hashchange")

  /**
    * Script to be run when an object receives a message
    */
  lazy val onMessage: EP[DomMessageEvent] = eventProp("message")

  /**
    * Script to be run when an object receives a message that cannot be
    * deserialized and therefore raises an error
    */
  lazy val onMessageError: EP[DomMessageEvent] = eventProp("messageerror")

  /**
    * Script to be run when the browser starts to work offline
    */
  lazy val onOffline: EP[DomEvent] = eventProp("offline")

  /**
    * Script to be run when the browser starts to work online
    */
  lazy val onOnline: EP[DomEvent] = eventProp("online")

  /**
    * Script to be run when a user navigates away from a page
    */
  lazy val onPageHide: EP[DomPageTransitionEvent] = eventProp("pagehide")

  /**
    * Script to be run when a user navigates to a page
    */
  lazy val onPageShow: EP[DomPageTransitionEvent] = eventProp("pageshow")

  /**
    * Script to be run when the window's history changes
    */
  lazy val onPopState: EP[DomPopStateEvent] = eventProp("popstate")

  /**
    * Script to be run when a Web Storage area is updated
    */
  lazy val onStorage: EP[DomStorageEvent] = eventProp("storage")

  /**
    * Fires once a page has unloaded (or the browser window has been closed)
    */
  lazy val onUnload: EP[DomUIEvent] = eventProp("unload")
}
