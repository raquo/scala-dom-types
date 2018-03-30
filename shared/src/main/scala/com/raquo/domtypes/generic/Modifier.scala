package com.raquo.domtypes.generic

/** This type represents an operation that has a side effect on a node of type [[El]].
  *
  * For example: `attrs.href := "http://example.com"` is a Modifier created using Scala DOM Builder syntax.
  *
  * We're defining a specific trait for this because we expect to have implicit conversions into this type.
  */
trait Modifier[-El] ex{

  def apply[X](el: El): Unit
}
