package com.raquo.dombuilder.definitions.eventProps

import com.raquo.dombuilder.builders.EventPropBuilder
import com.raquo.dombuilder.keys.EventProp
import org.scalajs.dom

trait SharedEventProps[N] {
  this: EventPropBuilder[N] =>

  /**
    * Script to be run when an error occurs when the file is being loaded
    */
  lazy val onerror: EventProp[dom.ErrorEvent, N] = eventProp("onerror")
}
