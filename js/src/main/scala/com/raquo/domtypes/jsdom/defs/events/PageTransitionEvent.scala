package com.raquo.domtypes.jsdom.defs.events

import org.scalajs.dom

import scala.scalajs.js

//TODO: contribute to scala-js-dom with onpageshow/onpagehide methods
/** Page transition events fire when a webpage is being loaded or unloaded.
  *
  * See https://developer.mozilla.org/en-US/docs/Web/API/PageTransitionEvent
  */
@js.native
trait PageTransitionEvent extends dom.Event {
  /** Indicates if a webpage is loading from a cache. */
  def persisted: Boolean = js.native
}
