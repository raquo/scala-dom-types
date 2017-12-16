package com.raquo.domtypes.jsdom.defs.events

import org.scalajs.dom

import scala.scalajs.js

@js.native
trait TypedTargetMouseEvent[+T <: dom.EventTarget]
  extends dom.MouseEvent
  with TypedTargetEvent[T]
