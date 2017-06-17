package com.raquo.dombuilder.jsdom.simple.builders

import com.raquo.dombuilder.generic.builders.Tag
import com.raquo.dombuilder.jsdom.simple.nodes.SimpleElement
import org.scalajs.dom

class SimpleTag[Ref <: dom.Element] (
  override val tagName: String,
  override val void: Boolean = false
) extends Tag[SimpleElement[Ref], Ref] {

  override def build(): SimpleElement[Ref] = {
    new SimpleElement[Ref](tagName, void)
  }
}
