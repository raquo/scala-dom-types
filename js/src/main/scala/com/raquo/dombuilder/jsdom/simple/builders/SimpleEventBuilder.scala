package com.raquo.dombuilder.jsdom.simple.builders

import com.raquo.dombuilder.generic.builders.BoundedBuilder
import com.raquo.dombuilder.jsdom.keys.EventProp
import org.scalajs.dom

trait SimpleEventBuilder extends BoundedBuilder[EventProp, dom.Event] {

  override def build[Ev <: dom.Event](key: String): EventProp[Ev] = {
    new EventProp[Ev](name = key)
  }
}
