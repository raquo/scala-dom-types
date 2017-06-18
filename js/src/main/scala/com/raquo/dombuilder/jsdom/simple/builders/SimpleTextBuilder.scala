package com.raquo.dombuilder.jsdom.simple.builders

import com.raquo.dombuilder.generic
import com.raquo.dombuilder.jsdom.simple.nodes.SimpleText

object SimpleTextBuilder extends generic.builders.Builder[SimpleText] {

  override def build(): SimpleText = {
    new SimpleText("")
  }
}
