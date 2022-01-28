package com.raquo.domtypes.generic.defs.styles.keywords

/**
  * @see https://developer.mozilla.org/en-US/docs/Web/CSS/align-content
  * @see https://developer.mozilla.org/en-US/docs/Web/CSS/justify-content
  */
trait AlignContentStyle[T] extends FlexPositionStyle[T] {

  lazy val spaceBetween: T = buildStringValue("space-between")

  lazy val spaceAround: T = buildStringValue("space-around")

  lazy val spaceEvenly: T = buildStringValue("space-evenly")
}
