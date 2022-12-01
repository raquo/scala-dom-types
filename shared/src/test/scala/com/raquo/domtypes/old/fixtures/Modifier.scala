package com.raquo.domtypes.old.fixtures

/** This type represents an operation that has a side effect on a node of type [[El]].
  *
  * For example: `attrs.href := "http://example.com"` is a Modifier created using Scala DOM Builder syntax.
  *
  * We're defining a specific trait for this because we expect to have implicit conversions into this type.
  */
trait Modifier[-El] {

  /** You can count on this method being a no-op in your libraries and end user code.
    *
    * The reason this method is not abstract is to avoid broken SAM sugar in case of meta modifiers.
    * See https://github.com/raquo/scala-dom-types/issues/27
    */
  def apply(element: El): Unit = ()
}
