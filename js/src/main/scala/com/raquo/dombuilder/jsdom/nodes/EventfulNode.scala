package com.raquo.dombuilder.jsdom.nodes

import com.raquo.dombuilder.generic
import org.scalajs.dom

trait EventfulNode[N, +Ref <: dom.Node]
  extends generic.nodes.EventfulNode[N, Ref, dom.Node]
{
  this: N =>
}
