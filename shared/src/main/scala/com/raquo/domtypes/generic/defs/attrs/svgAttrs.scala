
package com.raquo.domtypes.generic.defs.attrs

import com.raquo.domtypes.generic.builders.AttrBuilder
import com.raquo.domtypes.generic.codecs.{BooleanAsOnOffStringCodec, BooleanAsTrueFalseStringCodec}

/** @tparam A svg Attribute, canonically [[com.raquo.domtypes.generic.keys.Attr]] */
trait SvgAttrs[A[_]] { this: AttrBuilder[A] =>
  /**
   * This attribute defines the distance from the origin to the top of accent characters,
   * measured by a distance within the font coordinate system.
   * If the attribute is not specified, the effect is as if the attribute
   * were set to the value of the ascent attribute.
   *
   * Value 	<number>
   *
   * MDN
   */
  lazy val accentHeight = stringAttr("accent-height")

  /**
   * This attribute controls whether or not the animation is cumulative.
   * It is frequently useful for repeated animations to build upon the previous results,
   * accumulating with each iteration. This attribute said to the animation if the value is added to
   * the previous animated attribute's value on each iteration.
   *
   * Value 	none | sum
   *
   * MDN
   */
  lazy val accumulate = stringAttr("accumulate")

  /**
   * This attribute controls whether or not the animation is additive.
   * It is frequently useful to define animation as an offset or delta
   * to an attribute's value, rather than as absolute values. This
   * attribute said to the animation if their values are added to the
   * original animated attribute's value.
   *
   * Value 	replace | sum
   *
   * MDN
   */
    //TODO 
}
