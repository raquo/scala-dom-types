package com.raquo.dombuilder.jsdom.keys

import com.raquo.dombuilder.generic
import com.raquo.dombuilder.jsdom.modifiers.EventPropSetter
import org.scalajs.dom

class EventProp[Ev <: dom.Event](
  val name: String
) extends generic.keys.EventProp[Ev] {

  override def := (value: Ev => Unit): EventPropSetter[Ev] = {
    new EventPropSetter[Ev](this, value)
  }

  // @TODO[Performance] Check how much function wrapping is happening here (there's also "value _" in user code)
  override def := (value: () => Unit): EventPropSetter[Ev] = {
    new EventPropSetter[Ev](this, _ => value())
  }

  override def domName: String = name.toLowerCase
}
