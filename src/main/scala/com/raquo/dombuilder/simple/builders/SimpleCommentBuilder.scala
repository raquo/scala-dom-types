package com.raquo.dombuilder.simple.builders

import com.raquo.dombuilder.builders.NodeBuilder
import com.raquo.dombuilder.simple.nodes.{SimpleComment, SimpleNode}
import org.scalajs.dom

trait SimpleCommentBuilder extends NodeBuilder[SimpleComment, SimpleNode, dom.Comment] {

  override def createNode(): SimpleComment = {
    new SimpleComment("")
  }
}
