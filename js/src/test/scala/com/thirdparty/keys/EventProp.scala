package com.thirdparty.keys

import org.scalajs.dom

case class EventProp[Ev <: dom.Event](
  domName: String
)
