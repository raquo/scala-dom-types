package com.raquo.domtypes.generic.defs.styles.keywords

import com.raquo.domtypes.generic.builders.StyleStringValueBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/list-style-position */
trait ListStylePositionStyle[T] extends StyleStringValueBuilder[T] {

  /** The marker box is outside the principal block box.  --MDN */
  lazy val outside: T = buildStringValue("outside")

  /**
    * The marker box is the first inline box in the principal block box, after
    * which the element's content flows.  --MDN
    */
  lazy val inside: T = buildStringValue("inside")
}
