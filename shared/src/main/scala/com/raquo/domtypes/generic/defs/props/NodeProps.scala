package com.raquo.domtypes.generic.defs.props

import com.raquo.domtypes.generic.builders.PropBuilder

trait NodeProps[P[_]] { this: PropBuilder[P] =>

  /** Is a DOMString representing the textual content of an element and all its
    * descendants. Setting this property replaces all of the node's children with
    * a text node containing the provided string.
    *
    * MDN
    */
  lazy val textContent: P[String] = prop("textContent")
}
