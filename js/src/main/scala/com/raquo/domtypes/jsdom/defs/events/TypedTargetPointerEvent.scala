package com.raquo.domtypes.jsdom.defs.events

import org.scalajs.dom

import scala.scalajs.js

@js.native
trait TypedTargetPointerEvent[+T <: dom.EventTarget]
  extends dom.PointerEvent
  with TypedTargetEvent[T]
