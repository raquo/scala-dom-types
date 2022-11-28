package com.raquo.domtypes.old.defs.styles.keywords

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/text-transform */
trait TextTransformStyle[T] extends NoneStyle[T] {

  /**
    * Forces the first letter of each word to be converted to
    * uppercase. Other characters are unchanged.  --MDN
    */
  lazy val capitalize: T = buildStringValue("capitalize")

  /** Forces all characters to be converted to uppercase.  --MDN */
  lazy val uppercase: T = buildStringValue("uppercase")

  /** Forces all characters to be converted to lowercase.  --MDN */
  lazy val lowercase: T = buildStringValue("lowercase")
}
