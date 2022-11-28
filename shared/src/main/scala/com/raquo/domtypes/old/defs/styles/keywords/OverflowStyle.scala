package com.raquo.domtypes.old.defs.styles.keywords

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/overflow */
trait OverflowStyle[T] extends AutoStyle[T] {

  /**
    * Default value. Content is not clipped, it may be rendered outside the
    * content box.  --MDN
    */
  lazy val visible: T = buildStringValue("visible")

  /** The content is clipped and no scrollbars are provided.  --MDN */
  lazy val hidden: T = buildStringValue("hidden")

  /**
    * The content is clipped and desktop browsers use scrollbars, whether or
    * not any content is clipped. This avoids any problem with scrollbars
    * appearing and disappearing in a dynamic environment. Printers may print
    * overflowing content.  --MDN
    */
  lazy val scroll: T = buildStringValue("scroll")
}
