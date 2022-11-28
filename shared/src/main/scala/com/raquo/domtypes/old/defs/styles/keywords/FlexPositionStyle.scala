package com.raquo.domtypes.old.defs.styles.keywords

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/align-items
  * @see https://developer.mozilla.org/en-US/docs/Web/CSS/align-self
  * @see https://developer.mozilla.org/en-US/docs/Web/CSS/align-content
  */
trait FlexPositionStyle[T] extends NormalStyle[T] {

  lazy val flexStart: T = buildStringValue("flex-start")

  lazy val flexEnd: T = buildStringValue("flex-end")

  lazy val center: T = buildStringValue("center")

  lazy val start: T = buildStringValue("start")

  lazy val end: T = buildStringValue("end")

  lazy val selfStart: T = buildStringValue("self-start")

  lazy val selfEnd: T = buildStringValue("self-end")

  lazy val baseline: T = buildStringValue("baseline")

  lazy val firstBaseline: T = buildStringValue("first baseline")

  lazy val lastBaseline: T = buildStringValue("last baseline")

  lazy val stretch: T = buildStringValue("stretch")
}
