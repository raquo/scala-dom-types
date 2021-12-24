package com.raquo.domtypes.generic.defs.styles.keywords

trait BackgroundSizeStyle[T] extends AutoStyle[T] {

  /**
    * This keyword specifies that the background image should be scaled to be
    * as small as possible while ensuring both its dimensions are greater than
    * or equal to the corresponding dimensions of the background positioning
    * area.  --MDN
    */
  lazy val cover: T = buildStringValue("cover")

  /**
    * This keyword specifies that the background image should be scaled to be
    * as large as possible while ensuring both its dimensions are less than or
    * equal to the corresponding dimensions of the background positioning area.
    * --MDN
    */
  lazy val contain: T = buildStringValue("contain")
}
