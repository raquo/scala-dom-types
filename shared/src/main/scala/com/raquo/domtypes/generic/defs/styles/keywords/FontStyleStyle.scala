package com.raquo.domtypes.generic.defs.styles.keywords

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/font-style */
trait FontStyleStyle[T] extends NormalStyle[T] {

  /**
    * Selects a font that is labeled italic, if that is not available,
    * one labeled oblique  --MDN
    */
  lazy val italic: T = buildStringValue("italic")

  /** Selects a font that is labeled oblique  --MDN */
  lazy val oblique: T = buildStringValue("oblique")
}
