package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.SpecializedBuilder

/**
  * Window Events
  */
trait WindowEventProps[EP[_], Ev] { this: SpecializedBuilder[EP] =>

  /**
    * The load event fires at the end of the document loading process. At this
    * point, all of the objects in the document are in the DOM, and all the
    * images and sub-frames have finished loading.
    *
    * MDN
    */
  lazy val onLoad: EP[Ev] = build("onload")

  /**
    * Script to be run after the document is printed
    */
  lazy val onAfterPrint: EP[Ev] = build("onafterprint")

  /**
    * Script to be run before the document is printed
    */
  lazy val onBeforePrint: EP[Ev] = build("onbeforeprint")

  /**
    * Script to be run when the document is about to be unloaded
    */
  lazy val onBeforeUnload: EP[Ev] = build("onbeforeunload")

  /**
    * Script to be run when there has been changes to the anchor part of the a URL
    */
  lazy val onHashChange: EP[Ev] = build("onhashchange")

  /**
    * Script to be run when the message is triggered
    */
  lazy val onMessage: EP[Ev] = build("onmessage")

  /**
    * Script to be run when the browser starts to work offline
    */
  lazy val onOffline: EP[Ev] = build("onoffline")

  /**
    * Script to be run when the browser starts to work online
    */
  lazy val onOnline: EP[Ev] = build("ononline")

  /**
    * Script to be run when a user navigates away from a page
    */
  lazy val onPageHide: EP[Ev] = build("onpagehide")

  /**
    * Script to be run when a user navigates to a page
    */
  lazy val onPageShow: EP[Ev] = build("onpageshow")

  /**
    * Script to be run when the window's history changes
    */
  lazy val onPopState: EP[Ev] = build("onpopstate")

  /**
    * Fires when the browser window is resized
    */
  lazy val onResize: EP[Ev] = build("onresize")

  /**
    * Script to be run when a Web Storage area is updated
    */
  lazy val onStorage: EP[Ev] = build("onstorage")

  /**
    * Fires once a page has unloaded (or the browser window has been closed)
    */
  lazy val onUnload: EP[Ev] = build("onunload")
}
