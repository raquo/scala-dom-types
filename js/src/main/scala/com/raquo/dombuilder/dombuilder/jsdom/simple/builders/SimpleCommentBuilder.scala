package com.raquo.dombuilder.dombuilder.jsdom.simple.builders

import com.raquo.dombuilder.dombuilder.generic
import com.raquo.dombuilder.dombuilder.jsdom.simple.nodes.SimpleComment

object SimpleCommentBuilder extends generic.builders.Builder[SimpleComment] {

  override def build(): SimpleComment = {
    new SimpleComment("")
  }
}
