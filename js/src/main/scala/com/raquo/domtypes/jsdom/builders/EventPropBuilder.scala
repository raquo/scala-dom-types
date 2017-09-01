package com.raquo.domtypes.jsdom.builders

import com.raquo.domtypes.generic.builders.BoundedBuilder
import com.raquo.domtypes.generic.keys.EventProp

import org.scalajs.dom

trait EventPropBuilder extends BoundedBuilder[EventProp, dom.Event] {

  @inline override def build[Ev <: dom.Event](key: String): EventProp[Ev] = {
    new EventProp[Ev](name = key)
  }
}
