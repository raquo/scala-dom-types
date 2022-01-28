package com.raquo.domtypes.generic.defs.styles.keywords

import com.raquo.domtypes.generic.builders.StyleStringValueBuilder

trait TextAlignStyle[T] extends StyleStringValueBuilder[T] {

  /** `left` if direction is left-to-right and `right` otherwise.  --MDN */
  lazy val start: T = buildStringValue("start")

  /** `right` if direction is left-to-right and `left` otherwise.  --MDN */
  lazy val end: T = buildStringValue("end")

  /** The inline contents are aligned to the left edge of the line box.  --MDN */
  lazy val left: T = buildStringValue("left")

  /** The inline contents are aligned to the right edge of the line box.  --MDN */
  lazy val right: T = buildStringValue("right")

  /** The inline contents are centered within the line box.  --MDN */
  lazy val center: T = buildStringValue("center")

  /**
    * The text is justified. Text should line up their left and right edges to
    * the left and right content edges of the paragraph.  --MDN
    */
  lazy val justify: T = buildStringValue("justify")
}
