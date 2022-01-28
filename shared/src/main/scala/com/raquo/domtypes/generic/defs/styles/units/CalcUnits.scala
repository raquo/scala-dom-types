package com.raquo.domtypes.generic.defs.styles.units

import com.raquo.domtypes.generic.builders.DerivedStylePropBuilder

trait CalcUnits[T[_]] extends DerivedStylePropBuilder[T] {

  /** Wrap the provided expression in CSS calc() function.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/calc()
    */
  lazy val calc: T[String] = derivedStyle(exp => s"calc($exp)")
}
