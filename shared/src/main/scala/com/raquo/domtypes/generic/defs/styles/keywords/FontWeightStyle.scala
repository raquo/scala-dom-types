package com.raquo.domtypes.generic.defs.styles.keywords

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight */
trait FontWeightStyle[T] extends NormalStyle[T] {

  /** Normal font weight. Same as 400.  --MDN */
  override lazy val normal: T = buildStringValue("normal")

  /** Bold font weight. Same as 700.  --MDN */
  lazy val bold: T = buildStringValue("bold")

  /**
    * One font weight lighter than the parent element (among the available
    * weights of the font).  --MDN
    */
  lazy val lighter: T = buildStringValue("lighter")

  /**
    * One font weight darker than the parent element (among the available
    * weights of the font)  --MDN
    */
  lazy val bolder: T = buildStringValue("bolder")

}
