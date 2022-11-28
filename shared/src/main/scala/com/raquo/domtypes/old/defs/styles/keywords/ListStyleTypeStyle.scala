package com.raquo.domtypes.old.defs.styles.keywords

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/list-style-type */
trait ListStyleTypeStyle[T] extends NoneStyle[T] {

  /** A filled circle (default value)  --MDN */
  lazy val disc: T = buildStringValue("disc")

  /** A hollow circle  --MDN */
  lazy val circle: T = buildStringValue("circle")

  /** A filled square  --MDN */
  lazy val square: T = buildStringValue("square")

  /** Decimal numbers begining with 1  --MDN */
  lazy val decimal: T = buildStringValue("decimal")

  /** Han decimal numbers --MDN */
  lazy val cjkDecimal: T = buildStringValue("cjk-decimal")

  /** Decimal numbers padded by initial zeros  --MDN */
  lazy val decimalLeadingZero: T = buildStringValue("decimal-leading-zero")

  /** Lowercase roman numerals  --MDN */
  lazy val lowerRoman: T = buildStringValue("lower-roman")

  /** Uppercase roman numerals  --MDN */
  lazy val upperRoman: T = buildStringValue("upper-roman")

  /** Lowercase classical greek  --MDN */
  lazy val lowerGreek: T = buildStringValue("lower-greek")

  /** Lowercase ASCII letters  --MDN */
  lazy val lowerAlpha: T = buildStringValue("lower-alpha")

  /** Lowercase ASCII letters  --MDN */
  lazy val lowerLatin: T = buildStringValue("lower-latin")

  /** Uppercase ASCII letters  --MDN */
  lazy val upperAlpha: T = buildStringValue("upper-alpha")

  /** Uppercase ASCII letters  --MDN */
  lazy val upperLatin: T = buildStringValue("upper-latin")

  /** Traditional Armenian numbering  --MDN */
  lazy val armenian: T = buildStringValue("armenian")

  /** Traditional Georgian numbering  --MDN */
  lazy val georgian: T = buildStringValue("georgian")

  /** Traditional Hebrew numbering  --MDN */
  lazy val hebrew: T = buildStringValue("hebrew")

  /** Japanese Hiragana  --MDN */
  lazy val hiragana: T = buildStringValue("hiragana")

  /** Japanese Hiragana. Iroha is the old japanese ordering of syllables  --MDN */
  lazy val hiraganaIroha: T = buildStringValue("hiragana-iroha")

  /** Japanese Katakana  --MDN */
  lazy val katakana: T = buildStringValue("katakana")

  /** Japanese Katakana. Iroha is the old japanese ordering of syllables  --MDN */
  lazy val katakanaIroha: T = buildStringValue("katakana-iroha")
}
