package com.raquo.dombuilder.dombuilder.jsdom.simple.builders

import com.raquo.dombuilder.dombuilder.generic
import com.raquo.dombuilder.dombuilder.jsdom.simple.nodes.SimpleText

object SimpleTextBuilder extends generic.builders.Builder[SimpleText] {

  override def build(): SimpleText = {
    new SimpleText("")
  }
}
