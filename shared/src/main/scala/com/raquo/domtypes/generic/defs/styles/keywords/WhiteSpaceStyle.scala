package com.raquo.domtypes.generic.defs.styles.keywords

trait WhiteSpaceStyle[T] extends NormalStyle[T] {

  /**
    * Sequences of whitespace are collapsed. Newline characters in the source
    * are handled as other whitespace. Breaks lines as necessary to fill line
    * boxes.  --MDN
    */
  override lazy val normal: T = buildStringValue("normal")

  /**
    * Collapses whitespace as for normal, but suppresses line breaks (text
    * wrapping) within text.  --MDN
    */
  lazy val nowrap: T = buildStringValue("nowrap")

  /**
    * Sequences of whitespace are preserved, lines are only broken at newline
    * characters in the source and at br elements.  --MDN
    */
  lazy val pre: T = buildStringValue("pre")

  /**
    * Sequences of whitespace are preserved. Lines are broken at newline
    * characters, at br, and as necessary to fill line boxes.  --MDN
    */
  lazy val preWrap: T = buildStringValue("pre-wrap")

  /**
    * Sequences of whitespace are collapsed. Lines are broken at newline
    * characters, at br, and as necessary to fill line boxes.  --MDN
    */
  lazy val preLine: T = buildStringValue("pre-line")
}
