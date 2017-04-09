package com.raquo.dombuilder.definitions.nodes

import com.raquo.dombuilder.Builder
import com.raquo.dombuilder.nodes.Comment

trait Comments[C <: Comment[N], N] { self: Builder[_, _, C, N] =>

  /**
    * The Comment interface represents textual notations within markup; although
    * it is generally not visually shown, such comments are available to be read
    * in the source view.
    *
    * <!-- HTML comment -->
    *
    * MDN
    */
  def comment(text: String = ""): C = commentNode(text)
}
