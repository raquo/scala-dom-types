package com.raquo.domtypes.jsdom.defs.events

import org.scalajs.dom

import scala.scalajs.js

/** Represents an event for which we know the exact type of `target`. */
@js.native
trait TypedTargetEvent[+E <: dom.EventTarget] extends dom.Event {
  override def target: E = js.native
}
