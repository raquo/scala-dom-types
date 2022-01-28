package com.raquo.domtypes.generic.defs.styles.units

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/time */
trait TimeUnits[T[_]] extends CalcUnits[T] {

  /** Seconds */
  lazy val s: T[Double] = derivedStyle(n => s"${n}s")

  /** Milliseconds */
  lazy val ms: T[Double] = derivedStyle(n => s"${n}ms")
}
