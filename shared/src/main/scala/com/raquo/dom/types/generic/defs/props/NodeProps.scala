package com.raquo.dom.types.generic.defs.props

import com.raquo.dom.types.generic.builders.SpecializedBuilder

trait NodeProps[P[_]] { this: SpecializedBuilder[P] =>

  /** Is a DOMString representing the textual content of an element and all its
    * descendants.
    *
    * MDN
    */
  lazy val textContent: P[String] = build("textContent")
}
