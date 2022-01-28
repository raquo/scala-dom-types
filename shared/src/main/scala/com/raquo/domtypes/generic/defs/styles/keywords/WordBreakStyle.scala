package com.raquo.domtypes.generic.defs.styles.keywords

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/word-break */
trait WordBreakStyle[T] extends NormalStyle[T] {

  /**
    * To prevent overflow, word breaks should be inserted between any two
    * characters (excluding Chinese/Japanese/Korean text).  --MDN
    */
  lazy val breakAll: T = buildStringValue("break-all")

  /**
    * Word breaks should not be used for Chinese/Japanese/Korean (CJK) text.
    * Non-CJK text behavior is the same as for normal.  --MDN
    */
  lazy val keepAll: T = buildStringValue("keep-all")

  /**
    * To prevent overflow, normally unbreakable words may be broken at
    * arbitrary points if there are no otherwise acceptable break points
    * in the line.  --MDN
    *
    * Note: IE does not support this value
    */
  lazy val breakWord: T = buildStringValue("break-word")

}
