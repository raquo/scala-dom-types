package com.raquo.domtypes

package object generic {

  /** This type represents an operation that has a side effect on a node of type [[T]].
    *
    * For example: `attrs.href := "http://example.com"` is a Modifier created using Scala DOM Builder syntax.
    *
    * We're defining a specific trait for this because we expect to have implicit conversions into this type.
    */
  trait Modifier[-T] extends (T => Unit)
}
