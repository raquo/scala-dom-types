package com.thirdparty.defs.styles.units

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/time */
trait Time[T[_]] extends Calc[T] {

  /** Seconds */
  lazy val s: T[Double] = derivedStyle(n => s"${n}s")

  /** Milliseconds */
  lazy val ms: T[Double] = derivedStyle(n => s"${n}ms")
}
