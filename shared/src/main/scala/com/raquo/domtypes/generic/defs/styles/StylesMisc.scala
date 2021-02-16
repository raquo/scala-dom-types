package com.raquo.domtypes.generic.defs.styles

import com.raquo.domtypes.generic.builders.StyleBuilders
import com.raquo.domtypes.generic.keys.Style

/**
  * Documentation marked "MDN" is thanks to Mozilla Contributors
  * at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License
  * http://opensource.org/licenses/MIT
  *
  * For StyleSetter type params docs, see [[StyleBuilders]]
  */
trait StylesMisc[StyleSetter] { this: StyleBuilders[StyleSetter] =>

  /**
    * A Style that takes any value of type T as a parameter and has an auto value
    */
  class AutoStyle[V](name: String) extends Style[V](name) {
    lazy val auto: StyleSetter = buildStringStyleSetter(this, "auto")
  }

  /**
    * A Style that takes any value of type T as a parameter and has an none value
    */
  class NoneOpenStyle[V](name: String) extends Style[V](name) {
    lazy val none: StyleSetter = buildStringStyleSetter(this, "none")
  }

  /**
    * A Style that takes any value of type T as a parameter and has an normal value
    */
  class NormalOpenStyle[V](name: String) extends Style[V](name) {
    lazy val normal: StyleSetter = buildStringStyleSetter(this, "normal")
  }

  class MultiImageStyle(name: String) extends Style[String](name)

  class OutlineStyle(name: String) extends Style[String](name) {

    /**
      * Displays a series of rounded dots. The spacing of the dots are not
      * defined by the specification and are implementation-specific. The radius
      * of the dots is half the calculated border-right-width.
      *
      * MDN
      */
    lazy val dotted: StyleSetter = buildStringStyleSetter(this, "dotted")

    /**
      * Displays a series of short square-ended dashes or line segments. The exact
      * size and Length of the segments are not defined by the specification and
      * are implementation-specific.
      *
      * MDN
      */
    lazy val dashed: StyleSetter = buildStringStyleSetter(this, "dashed")

    /**
      * Displays a single, straight, solid line.
      *
      * MDN
      */
    lazy val solid: StyleSetter = buildStringStyleSetter(this, "solid")

    /**
      * Displays two straight lines that add up to the pixel amount defined as
      * border-width or border-right-width.
      *
      * MDN
      */
    lazy val double: StyleSetter = buildStringStyleSetter(this, "double")

    /**
      * Displays a border leading to a carved effect. It is the opposite of ridge.
      *
      * MDN
      */
    lazy val groove: StyleSetter = buildStringStyleSetter(this, "groove")

    /**
      * Displays a border with a 3D effect, like if it is coming out of the page.
      * It is the opposite of groove.
      *
      * MDN
      */
    lazy val ridge: StyleSetter = buildStringStyleSetter(this, "ridge")

    /**
      * Displays a border that makes the box appear embedded. It is the opposite
      * of outset. When applied to a table cell with border-collapse set to
      * collapsed, this value behaves like groove.
      *
      * MDN
      */
    lazy val inset: StyleSetter = buildStringStyleSetter(this, "inset")

    /**
      * Displays a border that makes the box appear in 3D, embossed. It is the
      * opposite of inset. When applied to a table cell with border-collapse set
      * to collapsed, this value behaves like ridge.
      *
      * MDN
      */
    lazy val outset: StyleSetter = buildStringStyleSetter(this, "outset")
  }

  class BorderStyle(name: String) extends OutlineStyle(name) {

    /**
      * Like for the hidden keyword, displays no border. In that case, except if
      * a background image is set, the calculated values of border-right-width
      * will be 0, even if specified otherwise through the property. In case of
      * table cell and border collapsing, the none value has the lowest priority:
      * it means that if any other conflicting border is set, it will be
      * displayed.
      *
      * MDN
      */
    lazy val none: StyleSetter = buildStringStyleSetter(this, "none")

    /**
      * Like for the none keyword, displays no border. In that case, except if a
      * background image is set, the calculated values of border-right-width will
      * be 0, even if specified otherwise through the property. In case of table
      * cell and border collapsing, the hidden value has the highest priority: it
      * means that if any other conflicting border is set, it won't be displayed.
      *
      * MDN
      */
    lazy val hidden: StyleSetter = buildStringStyleSetter(this, "hidden")

  }

  class Overflow(name: String) extends Style[String](name) {

    /**
      * Default value. Content is not clipped, it may be rendered outside the
      * content box.
      *
      * MDN
      */
    lazy val visible: StyleSetter = buildStringStyleSetter(this, "visible")

    /**
      * The content is clipped and no scrollbars are provided.
      *
      * MDN
      */
    lazy val hidden: StyleSetter = buildStringStyleSetter(this, "hidden")

    /**
      * The content is clipped and desktop browsers use scrollbars, whether or
      * not any content is clipped. This avoids any problem with scrollbars
      * appearing and disappearing in a dynamic environment. Printers may print
      * overflowing content.
      *
      * MDN
      */
    lazy val scroll: StyleSetter = buildStringStyleSetter(this, "scroll")

    /**
      * Depends on the user agent. Desktop browsers like Firefox provide
      * scrollbars if content overflows.
      *
      * MDN
      */
    lazy val auto: StyleSetter = buildStringStyleSetter(this, "auto")
  }

  class PageBreak(name: String) extends Style[String](name) {

    /**
      * Initial value. Automatic page breaks (neither forced nor forbidden).
      *
      * MDN
      */
    lazy val auto: StyleSetter = buildStringStyleSetter(this, "auto")

    /**
      * Always force page breaks.
      *
      * MDN
      */
    lazy val always: StyleSetter = buildStringStyleSetter(this, "always")

    /**
      * Avoid page breaks.
      *
      * MDN
      */
    lazy val avoid: StyleSetter = buildStringStyleSetter(this, "avoid")

    /**
      * Force page breaks so that the next page is formatted
      * as a left page.
      *
      * MDN
      */
    lazy val left: StyleSetter = buildStringStyleSetter(this, "left")

    /**
      * Force page breaks so that the next page is formatted
      * as a right page.
      *
      * MDN
      */
    lazy val right: StyleSetter = buildStringStyleSetter(this, "right")
  }


  class BorderRadius(name: String) extends Style[String](name)

  trait MarginAuto extends Style[String] {
    /**
      * auto is replaced by some suitable value, e.g. it can be used for
      * centering of blocks.
      *
      * MDN
      */
    lazy val auto: StyleSetter = buildStringStyleSetter(this, "auto")
  }

  class BorderWidth(name: String) extends Style[String](name) {
    lazy val thin: StyleSetter = buildStringStyleSetter(this, "thin")
    lazy val medium: StyleSetter = buildStringStyleSetter(this, "medium")
    lazy val thick: StyleSetter = buildStringStyleSetter(this, "thick")
  }

  class MultiTimeStyle(name: String) extends Style[String](name)

  class MinLengthStyle(name: String) extends AutoStyle[String](name) {

    /**
      * The intrinsic preferred length.
      *
      * MDN
      */
    lazy val maxContent: StyleSetter = buildStringStyleSetter(this, "max-content")

    /**
      * The intrinsic minimum length.
      *
      * MDN
      */
    lazy val minContent: StyleSetter = buildStringStyleSetter(this, "min-content")

    /**
      * Defined as min(max-content, max(min-content, fill-available).
      *
      * MDN
      */
    lazy val fitContent: StyleSetter = buildStringStyleSetter(this, "fit-content")

    /**
      * The containing block width minus margin, border and padding.
      *
      * MDN
      */
    lazy val fillAvailable: StyleSetter = buildStringStyleSetter(this, "fill-available")
  }

  class MaxLengthStyle(name: String) extends Style[String](name) {

    /**
      * The length has no maximum value.
      *
      * MDN
      */
    lazy val none: StyleSetter = buildStringStyleSetter(this, "none")

    /**
      * The intrinsic preferred length.
      *
      * MDN
      */
    lazy val maxContent: StyleSetter = buildStringStyleSetter(this, "max-content")

    /**
      * The intrinsic minimum length.
      *
      * MDN
      */
    lazy val minContent: StyleSetter = buildStringStyleSetter(this, "min-content")

    /**
      * Defined as min(max-content, max(min-content, fill-available).
      *
      * MDN
      */
    lazy val fitContent: StyleSetter = buildStringStyleSetter(this, "fit-content")

    /**
      * The containing block width minus margin, border and padding.
      *
      * MDN
      */
    lazy val fillAvailable: StyleSetter = buildStringStyleSetter(this, "fill-available")
  }
}
