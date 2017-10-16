package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.EventPropBuilder

/**
  * Window Events
  *
  * For type param docs see [[EventPropBuilder]]
  */
trait WindowEventProps[EP[_], DomEvent] { this: EventPropBuilder[EP, DomEvent] =>

  /**
    * The load event fires at the end of the document loading process. At this
    * point, all of the objects in the document are in the DOM, and all the
    * images and sub-frames have finished loading.
    *
    * MDN
    */
  lazy val onLoad: EP[DomEvent] = build("onload")

  /**
    * Script to be run after the document is printed
    */
  lazy val onAfterPrint: EP[DomEvent] = build("onafterprint")

  /**
    * Script to be run before the document is printed
    */
  lazy val onBeforePrint: EP[DomEvent] = build("onbeforeprint")

  /**
    * Script to be run when the document is about to be unloaded
    */
  lazy val onBeforeUnload: EP[DomEvent] = build("onbeforeunload")

  /**
    * Script to be run when there has been changes to the anchor part of the a URL
    */
  lazy val onHashChange: EP[DomEvent] = build("onhashchange")

  /**
    * Script to be run when the message is triggered
    */
  lazy val onMessage: EP[DomEvent] = build("onmessage")

  /**
    * Script to be run when the browser starts to work offline
    */
  lazy val onOffline: EP[DomEvent] = build("onoffline")

  /**
    * Script to be run when the browser starts to work online
    */
  lazy val onOnline: EP[DomEvent] = build("ononline")

  /**
    * Script to be run when a user navigates away from a page
    */
  lazy val onPageHide: EP[DomEvent] = build("onpagehide")

  /**
    * Script to be run when a user navigates to a page
    */
  lazy val onPageShow: EP[DomEvent] = build("onpageshow")

  /**
    * Script to be run when the window's history changes
    */
  lazy val onPopState: EP[DomEvent] = build("onpopstate")

  /**
    * Fires when the browser window is resized
    */
  lazy val onResize: EP[DomEvent] = build("onresize")

  /**
    * Script to be run when a Web Storage area is updated
    */
  lazy val onStorage: EP[DomEvent] = build("onstorage")

  /**
    * Fires once a page has unloaded (or the browser window has been closed)
    */
  lazy val onUnload: EP[DomEvent] = build("onunload")
}
