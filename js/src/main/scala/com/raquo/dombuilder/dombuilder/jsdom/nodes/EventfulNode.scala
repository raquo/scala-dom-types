package com.raquo.dombuilder.dombuilder.jsdom.nodes

import com.raquo.dombuilder.dombuilder.generic
import org.scalajs.dom

trait EventfulNode[N, +Ref <: dom.Node]
  extends generic.nodes.EventfulNode[N, Ref, dom.Node]
{
  this: N =>
}
