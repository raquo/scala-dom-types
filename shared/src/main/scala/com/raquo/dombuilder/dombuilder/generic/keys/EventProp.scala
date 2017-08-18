package com.raquo.dombuilder.dombuilder.generic.keys

import com.raquo.dombuilder.dombuilder.generic.modifiers.EventPropSetter

trait EventProp[Ev] {

  val name: String

  def := (value: Ev => Unit): EventPropSetter[Ev, _]

  def := (value: () => Unit): EventPropSetter[Ev, _]

  def domName: String
}
