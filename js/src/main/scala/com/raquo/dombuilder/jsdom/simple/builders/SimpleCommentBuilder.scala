package com.raquo.dombuilder.jsdom.simple.builders

import com.raquo.dombuilder.generic
import com.raquo.dombuilder.jsdom.simple.nodes.SimpleComment

object SimpleCommentBuilder extends generic.builders.Builder[SimpleComment] {

  override def build(): SimpleComment = {
    new SimpleComment("")
  }
}
