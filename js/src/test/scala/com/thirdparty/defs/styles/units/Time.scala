package com.thirdparty.defs.styles.units

import com.thirdparty.keys.DerivedStyleBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/time */
trait Time[DSP[_]] extends Calc[DSP] { this: DerivedStyleBuilder[_, DSP] =>

  /** Seconds */
  lazy val s: DSP[Double] = derivedStyle(n => s"${n}s")

  /** Milliseconds */
  lazy val ms: DSP[Double] = derivedStyle(n => s"${n}ms")
}
