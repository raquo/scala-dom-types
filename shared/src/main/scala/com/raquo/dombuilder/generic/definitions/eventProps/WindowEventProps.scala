package com.raquo.dombuilder.generic.definitions.eventProps

import com.raquo.dombuilder.generic.builders.Builder

/**
  * Window Events
  */
trait WindowEventProps[P[_], Ev] { this: Builder[P] =>

  /**
    * The load event fires at the end of the document loading process. At this
    * point, all of the objects in the document are in the DOM, and all the
    * images and sub-frames have finished loading.
    *
    * MDN
    */
  lazy val onLoad: P[Ev] = build("onload")

  /**
    * Script to be run after the document is printed
    */
  lazy val onAfterPrint: P[Ev] = build("onafterprint")

  /**
    * Script to be run before the document is printed
    */
  lazy val onBeforePrint: P[Ev] = build("onbeforeprint")

  /**
    * Script to be run when the document is about to be unloaded
    */
  lazy val onBeforeUnload: P[Ev] = build("onbeforeunload")

  /**
    * Script to be run when there has been changes to the anchor part of the a URL
    */
  lazy val onHashChange: P[Ev] = build("onhashchange")

  /**
    * Script to be run when the message is triggered
    */
  lazy val onMessage: P[Ev] = build("onmessage")

  /**
    * Script to be run when the browser starts to work offline
    */
  lazy val onOffline: P[Ev] = build("onoffline")

  /**
    * Script to be run when the browser starts to work online
    */
  lazy val onOnline: P[Ev] = build("ononline")

  /**
    * Script to be run when a user navigates away from a page
    */
  lazy val onPageHide: P[Ev] = build("onpagehide")

  /**
    * Script to be run when a user navigates to a page
    */
  lazy val onPageShow: P[Ev] = build("onpageshow")

  /**
    * Script to be run when the window's history changes
    */
  lazy val onPopState: P[Ev] = build("onpopstate")

  /**
    * Fires when the browser window is resized
    */
  lazy val onResize: P[Ev] = build("onresize")

  /**
    * Script to be run when a Web Storage area is updated
    */
  lazy val onStorage: P[Ev] = build("onstorage")

  /**
    * Fires once a page has unloaded (or the browser window has been closed)
    */
  lazy val onUnload: P[Ev] = build("onunload")
}
