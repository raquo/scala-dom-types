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
  class AutoStyle[V](name: String, cssName: String) extends Style[V](name, cssName) {
    @inline def auto: StyleSetter = buildStringStyleSetter(this, "auto")
  }

  /**
    * A Style that takes any value of type T as a parameter and has an none value
    */
  class NoneOpenStyle[V](name: String, cssName: String) extends Style[V](name, cssName) {
    @inline def none: StyleSetter = buildStringStyleSetter(this, "none")
  }

  /**
    * A Style that takes any value of type T as a parameter and has an normal value
    */
  class NormalOpenStyle[V](name: String, cssName: String) extends Style[V](name, cssName) {
    @inline def normal: StyleSetter = buildStringStyleSetter(this, "normal")
  }

  class MultiImageStyle(name: String, cssName: String) extends Style[String](name, cssName)

  class OutlineStyle(name: String, cssName: String) extends Style[String](name, cssName) {

    /**
      * Displays a series of rounded dots. The spacing of the dots are not
      * defined by the specification and are implementation-specific. The radius
      * of the dots is half the calculated border-right-width.
      *
      * MDN
      */
    @inline def dotted: StyleSetter = buildStringStyleSetter(this, "dotted")

    /**
      * Displays a series of short square-ended dashes or line segments. The exact
      * size and Length of the segments are not defined by the specification and
      * are implementation-specific.
      *
      * MDN
      */
    @inline def dashed: StyleSetter = buildStringStyleSetter(this, "dashed")

    /**
      * Displays a single, straight, solid line.
      *
      * MDN
      */
    @inline def solid: StyleSetter = buildStringStyleSetter(this, "solid")

    /**
      * Displays two straight lines that add up to the pixel amount defined as
      * border-width or border-right-width.
      *
      * MDN
      */
    @inline def double: StyleSetter = buildStringStyleSetter(this, "double")

    /**
      * Displays a border leading to a carved effect. It is the opposite of ridge.
      *
      * MDN
      */
    @inline def groove: StyleSetter = buildStringStyleSetter(this, "groove")

    /**
      * Displays a border with a 3D effect, like if it is coming out of the page.
      * It is the opposite of groove.
      *
      * MDN
      */
    @inline def ridge: StyleSetter = buildStringStyleSetter(this, "ridge")

    /**
      * Displays a border that makes the box appear embedded. It is the opposite
      * of outset. When applied to a table cell with border-collapse set to
      * collapsed, this value behaves like groove.
      *
      * MDN
      */
    @inline def inset: StyleSetter = buildStringStyleSetter(this, "inset")

    /**
      * Displays a border that makes the box appear in 3D, embossed. It is the
      * opposite of inset. When applied to a table cell with border-collapse set
      * to collapsed, this value behaves like ridge.
      *
      * MDN
      */
    @inline def outset: StyleSetter = buildStringStyleSetter(this, "outset")
  }

  class BorderStyle(name: String, cssName: String) extends OutlineStyle(name, cssName) {

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
    @inline def none: StyleSetter = buildStringStyleSetter(this, "none")

    /**
      * Like for the none keyword, displays no border. In that case, except if a
      * background image is set, the calculated values of border-right-width will
      * be 0, even if specified otherwise through the property. In case of table
      * cell and border collapsing, the hidden value has the highest priority: it
      * means that if any other conflicting border is set, it won't be displayed.
      *
      * MDN
      */
    @inline def hidden: StyleSetter = buildStringStyleSetter(this, "hidden")

  }

  class Overflow(name: String, cssName: String) extends Style[String](name, cssName) {

    /**
      * Default value. Content is not clipped, it may be rendered outside the
      * content box.
      *
      * MDN
      */
    @inline def visible: StyleSetter = buildStringStyleSetter(this, "visible")

    /**
      * The content is clipped and no scrollbars are provided.
      *
      * MDN
      */
    @inline def hidden: StyleSetter = buildStringStyleSetter(this, "hidden")

    /**
      * The content is clipped and desktop browsers use scrollbars, whether or
      * not any content is clipped. This avoids any problem with scrollbars
      * appearing and disappearing in a dynamic environment. Printers may print
      * overflowing content.
      *
      * MDN
      */
    @inline def scroll: StyleSetter = buildStringStyleSetter(this, "scroll")

    /**
      * Depends on the user agent. Desktop browsers like Firefox provide
      * scrollbars if content overflows.
      *
      * MDN
      */
    @inline def auto: StyleSetter = buildStringStyleSetter(this, "auto")
  }

  class PageBreak(name: String, cssName: String) extends Style[String](name, cssName) {

    /**
      * Initial value. Automatic page breaks (neither forced nor forbidden).
      *
      * MDN
      */
    @inline def auto: StyleSetter = buildStringStyleSetter(this, "auto")

    /**
      * Always force page breaks.
      *
      * MDN
      */
    @inline def always: StyleSetter = buildStringStyleSetter(this, "always")

    /**
      * Avoid page breaks.
      *
      * MDN
      */
    @inline def avoid: StyleSetter = buildStringStyleSetter(this, "avoid")

    /**
      * Force page breaks so that the next page is formatted
      * as a left page.
      *
      * MDN
      */
    @inline def left: StyleSetter = buildStringStyleSetter(this, "left")

    /**
      * Force page breaks so that the next page is formatted
      * as a right page.
      *
      * MDN
      */
    @inline def right: StyleSetter = buildStringStyleSetter(this, "right")
  }


  class BorderRadius(name: String, cssName: String) extends Style[String](name, cssName)

  trait MarginAuto extends Style[String] {
    /**
      * auto is replaced by some suitable value, e.g. it can be used for
      * centering of blocks.
      *
      * MDN
      */
    @inline def auto: StyleSetter = buildStringStyleSetter(this, "auto")
  }

  class BorderWidth(name: String, cssName: String) extends Style[String](name, cssName) {
    @inline def thin: StyleSetter = buildStringStyleSetter(this, "thin")
    @inline def medium: StyleSetter = buildStringStyleSetter(this, "medium")
    @inline def thick: StyleSetter = buildStringStyleSetter(this, "thick")
  }

  class MultiTimeStyle(name: String, cssName: String) extends Style[String](name, cssName)

  class MinLengthStyle(name: String, cssName: String) extends AutoStyle[String](name, cssName) {

    /**
      * The intrinsic preferred length.
      *
      * MDN
      */
    @inline def maxContent: StyleSetter = buildStringStyleSetter(this, "max-content")

    /**
      * The intrinsic minimum length.
      *
      * MDN
      */
    @inline def minContent: StyleSetter = buildStringStyleSetter(this, "min-content")

    /**
      * Defined as min(max-content, max(min-content, fill-available).
      *
      * MDN
      */
    @inline def fitContent: StyleSetter = buildStringStyleSetter(this, "fit-content")

    /**
      * The containing block width minus margin, border and padding.
      *
      * MDN
      */
    @inline def fillAvailable: StyleSetter = buildStringStyleSetter(this, "fill-available")
  }

  class MaxLengthStyle(name: String, cssName: String) extends Style[String](name, cssName) {

    /**
      * The length has no maximum value.
      *
      * MDN
      */
    @inline def none: StyleSetter = buildStringStyleSetter(this, "none")

    /**
      * The intrinsic preferred length.
      *
      * MDN
      */
    @inline def maxContent: StyleSetter = buildStringStyleSetter(this, "max-content")

    /**
      * The intrinsic minimum length.
      *
      * MDN
      */
    @inline def minContent: StyleSetter = buildStringStyleSetter(this, "min-content")

    /**
      * Defined as min(max-content, max(min-content, fill-available).
      *
      * MDN
      */
    @inline def fitContent: StyleSetter = buildStringStyleSetter(this, "fit-content")

    /**
      * The containing block width minus margin, border and padding.
      *
      * MDN
      */
    @inline def fillAvailable: StyleSetter = buildStringStyleSetter(this, "fill-available")
  }
}
