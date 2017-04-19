package com.raquo.dombuilder.simple.builders

import com.raquo.dombuilder.builders.nodes.NodeBuilder
import com.raquo.dombuilder.simple.nodes.{SimpleNode, SimpleText}
import org.scalajs.dom

trait SimpleTextBuilder extends NodeBuilder[SimpleText, SimpleNode, dom.Text] {

  override def createNode(): SimpleText with SimpleNode = {
    new SimpleText("")
  }
}
