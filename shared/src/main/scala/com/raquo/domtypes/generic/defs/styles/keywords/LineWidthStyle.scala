package com.raquo.domtypes.generic.defs.styles.keywords

import com.raquo.domtypes.generic.builders.StyleStringValueBuilder
import com.raquo.domtypes.generic.defs.styles.units.LengthUnits

// #Note: these types are provided for reference, but they are not used in the Styles trait
//  because I don't think they are useful enough to force their overhead on every consumer.
//  Line width is usually set in length units, not with keywords.

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/border-width
  * @see https://developer.mozilla.org/en-US/docs/Web/CSS/outline-width
  */
trait LineWidthStyle[T, DerivedProp[_], Num] extends LengthUnits[DerivedProp, Num] with StyleStringValueBuilder[T] {

  /** Typically 1px in desktop browsers like Firefox.  --MDN */
  lazy val thin: T = buildStringValue("thin")

  /** Typically 3px in desktop browsers like Firefox.  --MDN */
  lazy val medium: T = buildStringValue("medium")

  /** Typically 5px in desktop browsers like Firefox.  --MDN */
  lazy val thick: T = buildStringValue("thick")
}
