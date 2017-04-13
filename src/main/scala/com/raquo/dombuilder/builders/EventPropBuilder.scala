package com.raquo.dombuilder.builders

import com.raquo.dombuilder.keys.EventProp
import org.scalajs.dom

trait EventPropBuilder[N] {

  @inline def eventProp[Ev <: dom.Event](key: String): EventProp[Ev, N] = {
    new EventProp[Ev, N](key)
  }
}
