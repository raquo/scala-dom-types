package com.raquo.domtypes.generic.defs.styles.keywords

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/text-underline-position */
trait TextUnderlinePositionStyle[T] extends AutoStyle[T] {

  /**
    * This keyword allows the browser to use an algorithm to choose between
    * under and alphabetic.  --MDN
    */
  override lazy val auto: T = buildStringValue("auto")

  /**
    * This keyword forces the line to be set below the alphabetic baseline, at
    * a position where it won't cross any descender. This is useful to prevent
    * chemical or mathematical formulas, which make a large use of subscripts,
    * to be illegible.  --MDN
    */
  lazy val under: T = buildStringValue("under")

  /**
    * In vertical writing-modes, this keyword forces the line to be placed on
    * the left of the characters. In horizontal writing-modes, it is a synonym
    * of under.  --MDN
    */
  lazy val left: T = buildStringValue("left")

  /**
    * In vertical writing-modes, this keyword forces the line to be placed on
    * the right of the characters. In horizontal writing-modes, it is a synonym
    * of under.  --MDN
    */
  lazy val right: T = buildStringValue("right")

  lazy val underLeft: T = buildStringValue("under left")

  lazy val underRight: T = buildStringValue("under right")
}
