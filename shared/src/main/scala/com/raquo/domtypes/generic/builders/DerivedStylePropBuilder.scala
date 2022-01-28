package com.raquo.domtypes.generic.builders

/** This trait enables creation of derived style props, such as marginTop.px
  * (accepting Int-s), from the original marginTop (accepting strings)
  */
trait DerivedStylePropBuilder[T[_]] {

  protected def derivedStyle[A](encode: (A => String)): T[A]
}
