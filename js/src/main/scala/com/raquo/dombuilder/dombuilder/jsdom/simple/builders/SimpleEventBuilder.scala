package com.raquo.dombuilder.dombuilder.jsdom.simple.builders

import com.raquo.dombuilder.dombuilder.generic
import com.raquo.dombuilder.dombuilder.jsdom.keys.EventProp
import org.scalajs.dom

trait SimpleEventBuilder extends generic.builders.BoundedBuilder[EventProp, dom.Event] {

  override def build[Ev <: dom.Event](key: String): EventProp[Ev] = {
    new EventProp[Ev](name = key)
  }
}
