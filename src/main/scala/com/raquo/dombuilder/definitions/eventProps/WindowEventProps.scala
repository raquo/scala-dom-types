package com.raquo.dombuilder.definitions.eventProps

import com.raquo.dombuilder.builders.EventPropBuilder
import com.raquo.dombuilder.keys.EventProp

/**
  * Window Events
  */
trait WindowEventProps[N, DomEvent, Fun1[-_, +_]] {
  this: SharedEventProps[N, _, DomEvent, Fun1] with EventPropBuilder[N, DomEvent, Fun1] =>

  /**
    * The load event fires at the end of the document loading process. At this
    * point, all of the objects in the document are in the DOM, and all the
    * images and sub-frames have finished loading.
    *
    * MDN
    */
  lazy val onLoad: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("onload")

  /**
    * Script to be run after the document is printed
    */
  lazy val onAfterPrint: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("onafterprint")

  /**
    * Script to be run before the document is printed
    */
  lazy val onBeforePrint: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("onbeforeprint")

  /**
    * Script to be run when the document is about to be unloaded
    */
  lazy val onBeforeUnload: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("onbeforeunload")

  /**
    * Script to be run when there has been changes to the anchor part of the a URL
    */
  lazy val onHashChange: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("onhashchange")

  /**
    * Script to be run when the message is triggered
    */
  lazy val onMessage: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("onmessage")

  /**
    * Script to be run when the browser starts to work offline
    */
  lazy val onOffline: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("onoffline")

  /**
    * Script to be run when the browser starts to work online
    */
  lazy val onOnline: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("ononline")

  /**
    * Script to be run when a user navigates away from a page
    */
  lazy val onPageHide: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("onpagehide")

  /**
    * Script to be run when a user navigates to a page
    */
  lazy val onPageShow: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("onpageshow")

  /**
    * Script to be run when the window's history changes
    */
  lazy val onPopState: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("onpopstate")

  /**
    * Fires when the browser window is resized
    */
  lazy val onResize: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("onresize")

  /**
    * Script to be run when a Web Storage area is updated
    */
  lazy val onStorage: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("onstorage")

  /**
    * Fires once a page has unloaded (or the browser window has been closed)
    */
  lazy val onUnload: EventProp[DomEvent, N, DomEvent, Fun1] = eventProp("onunload")
}
