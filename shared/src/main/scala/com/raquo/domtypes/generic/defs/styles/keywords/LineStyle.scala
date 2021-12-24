package com.raquo.domtypes.generic.defs.styles.keywords

import com.raquo.domtypes.generic.builders.StyleStringValueBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/border-style */
trait LineStyle[T] extends StyleStringValueBuilder[T] {

  /**
    * Displays a series of rounded dots. The spacing of the dots are not
    * defined by the specification and are implementation-specific. The radius
    * of the dots is half the calculated border-right-width.  --MDN
    */
  lazy val dotted: T = buildStringValue("dotted")

  /**
    * Displays a series of short square-ended dashes or line segments. The exact
    * size and Length of the segments are not defined by the specification and
    * are implementation-specific.  --MDN
    */
  lazy val dashed: T = buildStringValue("dashed")

  /** Displays a single, straight, solid line.  --MDN */
  lazy val solid: T = buildStringValue("solid")




  /**
    * Displays two straight lines that add up to the pixel amount defined as
    * border-width or border-right-width.  --MDN
    */
  lazy val double: T = buildStringValue("double")




  /**
    * Displays a border leading to a carved effect. It is the opposite of ridge.
    * --MDN
    */
  lazy val groove: T = buildStringValue("groove")

  /**
    * Displays a border with a 3D effect, like if it is coming out of the page.
    * It is the opposite of groove.  --MDN
    */
  lazy val ridge: T = buildStringValue("ridge")




  /**
    * Displays a border that makes the box appear embedded. It is the opposite
    * of outset. When applied to a table cell with border-collapse set to
    * collapsed, this value behaves like groove.  --MDN
    */
  lazy val inset: T = buildStringValue("inset")

  /**
    * Displays a border that makes the box appear in 3D, embossed. It is the
    * opposite of inset. When applied to a table cell with border-collapse set
    * to collapsed, this value behaves like ridge.  --MDN
    */
  lazy val outset: T = buildStringValue("outset")

}
