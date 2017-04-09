package com.raquo.dombuilder.simple

import com.raquo.dombuilder.Builder

trait SimpleNode {
  val builder: Builder[SimpleElement, SimpleText, SimpleComment, SimpleNode] = simpleBuilder
}
