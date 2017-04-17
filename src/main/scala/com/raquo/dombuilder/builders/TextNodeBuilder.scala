package com.raquo.dombuilder.builders

import com.raquo.dombuilder.nodes.Text

trait TextNodeBuilder[+T <: Text[N, TextRef], N, TextRef] {

  def textNode(text: String): T with N
}
