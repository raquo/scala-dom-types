package com.raquo.domtypes.generic.defs.styles.keywords

import com.raquo.domtypes.generic.builders.StyleStringValueBuilder
import com.raquo.domtypes.generic.defs.styles.units.LengthUnits

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align */
trait VerticalAlignStyle[T, DerivedProp[_]] extends LengthUnits[DerivedProp] with StyleStringValueBuilder[T] {

  /**
    * Aligns the baseline of the element with the baseline of its parent. The
    * baseline of some replaced elements, like textarea is not specified by
    * the HTML specification, meaning that their behavior with this keyword may
    * change from one browser to the other.  --MDN
    */
  lazy val baseline: T = buildStringValue("baseline")

  /**
    * Aligns the baseline of the element with the subscript-baseline of its
    * parent.  --MDN
    */
  lazy val sub: T = buildStringValue("sub")

  /**
    * Aligns the baseline of the element with the superscript-baseline of its
    * parent.  --MDN
    */
  lazy val `super`: T = buildStringValue("super")

  /**
    * Aligns the top of the element with the top of the parent element's font.
    * --MDN
    */
  lazy val textTop: T = buildStringValue("text-top")

  /**
    * Aligns the bottom of the element with the bottom of the parent element's
    * font.  --MDN
    */
  lazy val textBottom: T = buildStringValue("text-bottom")

  /**
    * Aligns the middle of the element with the middle of lowercase letters in
    * the parent.  --MDN
    */
  lazy val middle: T = buildStringValue("middle")

  /**
    * Aligns the top of the element and its descendants with the top of the
    * entire line.  --MDN
    */
  lazy val top: T = buildStringValue("top")

  /**
    * Aligns the bottom of the element and its descendants with the bottom of
    * the entire line.  --MDN
    */
  lazy val bottom: T = buildStringValue("bottom")
}
