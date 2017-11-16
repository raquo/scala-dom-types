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
  lazy val onAfterPrint: EP[DomEvent] = eventProp("onafterprint")

  /**
    * Script to be run before the document is printed
    */
  lazy val onBeforePrint: EP[DomEvent] = eventProp("onbeforeprint")

  /**
    * Script to be run when the document is about to be unloaded
    */
  lazy val onBeforeUnload: EP[DomBeforeUnloadEvent] = eventProp("onbeforeunload")

  /**
    * Script to be run when there has been changes to the anchor part of the a URL
    */
  lazy val onHashChange: EP[DomHashChangeEvent] = eventProp("onhashchange")

  /**
    * Script to be run when an object receives a message
    */
  lazy val onMessage: EP[DomMessageEvent] = eventProp("onmessage")

  /**
    * Script to be run when an object receives a message that cannot be
    * deserialized and therefore raises an error
    */
  lazy val onMessageError: EP[DomMessageEvent] = eventProp("onmessageerror")

  /**
    * Script to be run when the browser starts to work offline
    */
  lazy val onOffline: EP[DomEvent] = eventProp("onoffline")

  /**
    * Script to be run when the browser starts to work online
    */
  lazy val onOnline: EP[DomEvent] = eventProp("ononline")

  /**
    * Script to be run when a user navigates away from a page
    */
  lazy val onPageHide: EP[DomPageTransitionEvent] = eventProp("onpagehide")

  /**
    * Script to be run when a user navigates to a page
    */
  lazy val onPageShow: EP[DomPageTransitionEvent] = eventProp("onpageshow")

  /**
    * Script to be run when the window's history changes
    */
  lazy val onPopState: EP[DomPopStateEvent] = eventProp("onpopstate")

  /**
    * Script to be run when a Web Storage area is updated
    */
  lazy val onStorage: EP[DomStorageEvent] = eventProp("onstorage")

  /**
    * Fires once a page has unloaded (or the browser window has been closed)
    */
  lazy val onUnload: EP[DomUIEvent] = eventProp("onunload")
}
