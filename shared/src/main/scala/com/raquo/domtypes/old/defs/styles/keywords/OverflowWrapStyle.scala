package com.raquo.domtypes.old.defs.styles.keywords

import com.raquo.domtypes.old.builders.StyleStringValueBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-wrap */
trait OverflowWrapStyle[T] extends StyleStringValueBuilder[T] with NormalStyle[T] {

  /** Indicates that lines may only break at normal word break points.  --MDN */
  override lazy val normal: T = buildStringValue("normal")

  /**
    * Indicates that normally unbreakable words may be broken at arbitrary
    * points if there are no otherwise acceptable break points in the line.
    * --MDN
    */
  lazy val breakWord: T = buildStringValue("break-word")
}
