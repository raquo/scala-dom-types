package com.raquo.domtypes

import com.raquo.domtypes.generic.keys.Key

package object generic {

  /** This type represents an operation that has a side effect on a node of type [[N]].
    *
    * For example: `attrs.href := "http://example.com"` is a Modifier created using Scala DOM Builder syntax.
    */
  type Modifier[-N] = N => Unit

  /** This type represents a factory of a Setter. A Setter is a [[Modifier]] that sets the node's [[Key]] to a particular value.
    *
    * For examples, [[com.raquo.domtypes.generic.defs.styles.Styles.display.none]] is a setter that sets the "display" CSS property to "none".
    * A typical implementation of such a modifier can be found in the Scala DOM Builder project.
    */
  type SetterBuilder[-K <: Key, -V, +M <: Modifier[_]] = (K, V) => M
}
