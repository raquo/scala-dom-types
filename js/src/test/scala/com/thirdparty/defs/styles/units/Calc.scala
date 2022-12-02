package com.thirdparty.defs.styles.units

import com.thirdparty.keys.DerivedStyleBuilder

trait Calc[DSP[_]] { this: DerivedStyleBuilder[_, DSP] =>

  /** Wrap the provided expression in CSS calc() function.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/calc()
    */
  lazy val calc: DSP[String] = derivedStyle(exp => s"calc(${encodeCalcValue(exp)})")
}
