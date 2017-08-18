package com.raquo.dombuilder.dombuilder.jsdom.nodes

import com.raquo.dombuilder.dombuilder.generic
import org.scalajs.dom

trait ChildNode[N, +Ref <: dom.Node] extends generic.nodes.ChildNode[N, Ref, dom.Node] { this: N => }
