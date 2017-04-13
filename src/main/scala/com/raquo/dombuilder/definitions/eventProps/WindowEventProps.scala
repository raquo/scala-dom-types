package com.raquo.dombuilder.definitions.eventProps

import com.raquo.dombuilder.builders.EventPropBuilder
import com.raquo.dombuilder.keys.EventProp
import org.scalajs.dom

/**
  * Window Events
  */
trait WindowEventProps[N] extends SharedEventProps[N] { self: EventPropBuilder[N] =>

  /**
    * The load event fires at the end of the document loading process. At this
    * point, all of the objects in the document are in the DOM, and all the
    * images and sub-frames have finished loading.
    *
    * MDN
    */
  lazy val onLoad: EventProp[dom.Event, N] = eventProp("onload")

  /**
    * Script to be run after the document is printed
    */
  lazy val onAfterPrint: EventProp[dom.Event, N] = eventProp("onafterprint")

  /**
    * Script to be run before the document is printed
    */
  lazy val onBeforePrint: EventProp[dom.Event, N] = eventProp("onbeforeprint")

  /**
    * Script to be run when the document is about to be unloaded
    */
  lazy val onBeforeUnload: EventProp[dom.Event, N] = eventProp("onbeforeunload")

  /**
    * Script to be run when there has been changes to the anchor part of the a URL
    */
  lazy val onHashChange: EventProp[dom.Event, N] = eventProp("onhashchange")

  /**
    * Script to be run when the message is triggered
    */
  lazy val onMessage: EventProp[dom.Event, N] = eventProp("onmessage")

  /**
    * Script to be run when the browser starts to work offline
    */
  lazy val onOffline: EventProp[dom.Event, N] = eventProp("onoffline")

  /**
    * Script to be run when the browser starts to work online
    */
  lazy val onOnline: EventProp[dom.Event, N] = eventProp("ononline")

  /**
    * Script to be run when a user navigates away from a page
    */
  lazy val onPageHide: EventProp[dom.Event, N] = eventProp("onpagehide")

  /**
    * Script to be run when a user navigates to a page
    */
  lazy val onPageShow: EventProp[dom.Event, N] = eventProp("onpageshow")

  /**
    * Script to be run when the window's history changes
    */
  lazy val onPopState: EventProp[dom.Event, N] = eventProp("onpopstate")

  /**
    * Fires when the browser window is resized
    */
  lazy val onResize: EventProp[dom.Event, N] = eventProp("onresize")

  /**
    * Script to be run when a Web Storage area is updated
    */
  lazy val onStorage: EventProp[dom.Event, N] = eventProp("onstorage")

  /**
    * Fires once a page has unloaded (or the browser window has been closed)
    */
  lazy val onUnload: EventProp[dom.Event, N] = eventProp("onunload")
}
