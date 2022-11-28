package com.raquo.domtypes.old.builders

/** This trait enables creation of derived style props, such as marginTop.px
  * (accepting Int-s), from the original marginTop (accepting strings)
  */
trait DerivedStylePropBuilder[T[_]] {

  protected def derivedStyle[A](encode: (A => String)): T[A]

  /** Encode / sanitize value to put inside `url()` function */
  protected def encodeUrlValue(url: String): String

  /** Encode / sanitize value to put inside `calc()` function */
  protected def encodeCalcValue(exp: String): String
}
