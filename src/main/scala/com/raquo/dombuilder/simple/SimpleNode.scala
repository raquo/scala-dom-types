package com.raquo.dombuilder.simple

import com.raquo.dombuilder.{Builder, simple}

trait SimpleNode {
  val builder: Builder[SimpleElement, SimpleText, SimpleComment, SimpleNode] = simple.builder
}
