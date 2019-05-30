package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.EventPropBuilder

/**
  * Window Events
  *
  * For type param docs see [[EventPropBuilder]]
  */
trait WindowOnlyEventProps[EP[_ <: DomEvent], DomEvent, DomUIEvent <: DomEvent, DomBeforeUnloadEvent <: DomEvent, DomHashChangeEvent <: DomEvent, DomMessageEvent <: DomEvent, DomPageTransitionEvent <: DomEvent, DomPopStateEvent <: DomEvent, DomStorageEvent <: DomEvent] { this: EventPropBuilder[EP, DomEvent] =>

  /**
    * Script to be run after the document is printed
    */
  @inline def onAfterPrint: EP[DomEvent] = eventProp("afterprint")

  /**
    * Script to be run before the document is printed
    */
  @inline def onBeforePrint: EP[DomEvent] = eventProp("beforeprint")

  /**
    * Script to be run when the document is about to be unloaded
    */
  @inline def onBeforeUnload: EP[DomBeforeUnloadEvent] = eventProp("beforeunload")

  /**
    * Script to be run when there has been changes to the anchor part of the a URL
    */
  @inline def onHashChange: EP[DomHashChangeEvent] = eventProp("hashchange")

  /**
    * Script to be run when an object receives a message
    */
  @inline def onMessage: EP[DomMessageEvent] = eventProp("message")

  /**
    * Script to be run when an object receives a message that cannot be
    * deserialized and therefore raises an error
    */
  @inline def onMessageError: EP[DomMessageEvent] = eventProp("messageerror")

  /**
    * Script to be run when the browser starts to work offline
    */
  @inline def onOffline: EP[DomEvent] = eventProp("offline")

  /**
    * Script to be run when the browser starts to work online
    */
  @inline def onOnline: EP[DomEvent] = eventProp("online")

  /**
    * Script to be run when a user navigates away from a page
    */
  @inline def onPageHide: EP[DomPageTransitionEvent] = eventProp("pagehide")

  /**
    * Script to be run when a user navigates to a page
    */
  @inline def onPageShow: EP[DomPageTransitionEvent] = eventProp("pageshow")

  /**
    * Script to be run when the window's history changes
    */
  @inline def onPopState: EP[DomPopStateEvent] = eventProp("popstate")

  /**
    * Script to be run when a Web Storage area is updated
    */
  @inline def onStorage: EP[DomStorageEvent] = eventProp("storage")

  /**
    * Fires once a page has unloaded (or the browser window has been closed)
    */
  @inline def onUnload: EP[DomUIEvent] = eventProp("unload")
}
