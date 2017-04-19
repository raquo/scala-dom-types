package com.raquo.dombuilder.simple.builders

import com.raquo.dombuilder.builders.nodes.TagBuilder
import com.raquo.dombuilder.simple.nodes.{SimpleElement, SimpleNode}
import org.scalajs.dom

trait SimpleTagBuilder extends TagBuilder[SimpleElement, SimpleNode, dom.Element] {

  override def tag(tagName: String): SimpleTag = {
    new SimpleTag(tagName)
  }
}
