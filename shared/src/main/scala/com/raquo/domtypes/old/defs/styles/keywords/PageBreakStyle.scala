package com.raquo.domtypes.old.defs.styles.keywords

/**
  * @see https://developer.mozilla.org/en-US/docs/Web/CSS/page-break-after
  * @see https://developer.mozilla.org/en-US/docs/Web/CSS/page-break-before
  * @see https://developer.mozilla.org/en-US/docs/Web/CSS/page-break-inside
  */
trait PageBreakStyle[T] extends AutoStyle[T] {

  /** Always force page breaks.  --MDN */
  lazy val always: T = buildStringValue("always")

  /** Avoid page breaks.  --MDN */
  lazy val avoid: T = buildStringValue("avoid")

  /** Force page breaks so that the next page is formatted as a left page.  --MDN */
  lazy val left: T = buildStringValue("left")

  /** Force page breaks so that the next page is formatted as a right page.  --MDN */
  lazy val right: T = buildStringValue("right")
}
