package com.raquo.dombuilder.generic.definitions.props

import com.raquo.dombuilder.generic.builders.Builder

trait NodeProps[P[_]] { this: Builder[P] =>

  /** Is a DOMString representing the textual content of an element and all its
    * descendants.
    *
    * MDN
    */
  lazy val textContent: P[String] = build("textContent")
}
