package com.raquo.dombuilder.simple.builders

import com.raquo.dombuilder.builders.TagBuilder
import com.raquo.dombuilder.simple.nodes.{SimpleElement, SimpleNode}
import org.scalajs.dom

trait SimpleTagBuilder extends TagBuilder[SimpleElement, SimpleNode, dom.Element, dom.Node] {

  override def tag(tagName: String): SimpleTag = {
    new SimpleTag(tagName)
  }
}
