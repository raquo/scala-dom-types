package com.raquo.domtypes.jsdom.defs.events

import org.scalajs.dom

import scala.scalajs.js

@js.native
trait TypedTargetFocusEvent[+T <: dom.EventTarget]
  extends dom.FocusEvent
  with TypedTargetEvent[T]
