package com.raquo.dombuilder.definitions.props

import com.raquo.dombuilder.builders.PropBuilder
import com.raquo.dombuilder.keys.Prop

trait NodeProps[N] { self: PropBuilder[N] =>

  /** Is a DOMString representing the textual content of an element and all its
    * descendants.
    *
    * MDN
    */
  lazy val textContent: Prop[String, N] = prop("textContent")
}
