package com.raquo.dombuilder.definitions.eventProps

import com.raquo.dombuilder.{Builder, EventProp}
import org.scalajs.dom

trait SharedEventProps[N] { self: Builder[_, _, _, N] =>

  /**
    * Script to be run when an error occurs when the file is being loaded
    */
  lazy val onerror: EventProp[dom.ErrorEvent, N] = eventProp("onerror")
}
