package com.raquo.domtypes.generic.defs.styles

import com.raquo.domtypes.generic.Modifier
import com.raquo.domtypes.generic.builders.StyleBuilder
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
  * For StyleSetter type params docs, see [[StyleBuilder]]
  */
trait StylesMisc[StyleSetter <: Modifier[_]] { this: StyleBuilder[StyleSetter] =>

  /**
    * A Style that takes any value of type T as a parameter and has an auto value
    */
  class AutoStyle[V](name: String, cssName: String) extends Style[V](name, cssName) {
    lazy val auto: StyleSetter = buildSetter(this, "auto")
  }

  /**
    * A Style that takes any value of type T as a parameter and has an none value
    */
  class NoneOpenStyle[V](name: String, cssName: String) extends Style[V](name, cssName) {
    lazy val none: StyleSetter = buildSetter(this, "none")
  }

  /**
    * A Style that takes any value of type T as a parameter and has an normal value
    */
  class NormalOpenStyle[V](name: String, cssName: String) extends Style[V](name, cssName) {
    lazy val normal: StyleSetter = buildSetter(this, "normal")
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
    lazy val dotted: StyleSetter = buildSetter(this, "dotted")

    /**
      * Displays a series of short square-ended dashes or line segments. The exact
      * size and Length of the segments are not defined by the specification and
      * are implementation-specific.
      *
      * MDN
      */
    lazy val dashed: StyleSetter = buildSetter(this, "dashed")

    /**
      * Displays a single, straight, solid line.
      *
      * MDN
      */
    lazy val solid: StyleSetter = buildSetter(this, "solid")

    /**
      * Displays two straight lines that add up to the pixel amount defined as
      * border-width or border-right-width.
      *
      * MDN
      */
    lazy val double: StyleSetter = buildSetter(this, "double")

    /**
      * Displays a border leading to a carved effect. It is the opposite of ridge.
      *
      * MDN
      */
    lazy val groove: StyleSetter = buildSetter(this, "groove")

    /**
      * Displays a border with a 3D effect, like if it is coming out of the page.
      * It is the opposite of groove.
      *
      * MDN
      */
    lazy val ridge: StyleSetter = buildSetter(this, "ridge")

    /**
      * Displays a border that makes the box appear embedded. It is the opposite
      * of outset. When applied to a table cell with border-collapse set to
      * collapsed, this value behaves like groove.
      *
      * MDN
      */
    lazy val inset: StyleSetter = buildSetter(this, "inset")

    /**
      * Displays a border that makes the box appear in 3D, embossed. It is the
      * opposite of inset. When applied to a table cell with border-collapse set
      * to collapsed, this value behaves like ridge.
      *
      * MDN
      */
    lazy val outset: StyleSetter = buildSetter(this, "outset")
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
    lazy val none: StyleSetter = buildSetter(this, "none")

    /**
      * Like for the none keyword, displays no border. In that case, except if a
      * background image is set, the calculated values of border-right-width will
      * be 0, even if specified otherwise through the property. In case of table
      * cell and border collapsing, the hidden value has the highest priority: it
      * means that if any other conflicting border is set, it won't be displayed.
      *
      * MDN
      */
    lazy val hidden: StyleSetter = buildSetter(this, "hidden")

  }

  class Overflow(name: String, cssName: String) extends Style[String](name, cssName) {

    /**
      * Default value. Content is not clipped, it may be rendered outside the
      * content box.
      *
      * MDN
      */
    lazy val visible: StyleSetter = buildSetter(this, "visible")

    /**
      * The content is clipped and no scrollbars are provided.
      *
      * MDN
      */
    lazy val hidden: StyleSetter = buildSetter(this, "hidden")

    /**
      * The content is clipped and desktop browsers use scrollbars, whether or
      * not any content is clipped. This avoids any problem with scrollbars
      * appearing and disappearing in a dynamic environment. Printers may print
      * overflowing content.
      *
      * MDN
      */
    lazy val scroll: StyleSetter = buildSetter(this, "scroll")

    /**
      * Depends on the user agent. Desktop browsers like Firefox provide
      * scrollbars if content overflows.
      *
      * MDN
      */
    lazy val auto: StyleSetter = buildSetter(this, "auto")
  }

  class PageBreak(name: String, cssName: String) extends Style[String](name, cssName) {

    /**
      * Initial value. Automatic page breaks (neither forced nor forbidden).
      *
      * MDN
      */
    lazy val auto: StyleSetter = buildSetter(this, "auto")

    /**
      * Always force page breaks.
      *
      * MDN
      */
    lazy val always: StyleSetter = buildSetter(this, "always")

    /**
      * Avoid page breaks.
      *
      * MDN
      */
    lazy val avoid: StyleSetter = buildSetter(this, "avoid")

    /**
      * Force page breaks so that the next page is formatted
      * as a left page.
      *
      * MDN
      */
    lazy val left: StyleSetter = buildSetter(this, "left")

    /**
      * Force page breaks so that the next page is formatted
      * as a right page.
      *
      * MDN
      */
    lazy val right: StyleSetter = buildSetter(this, "right")
  }


  class BorderRadius(name: String, cssName: String) extends Style[String](name, cssName)

  trait MarginAuto extends Style[String] {
    /**
      * auto is replaced by some suitable value, e.g. it can be used for
      * centering of blocks.
      *
      * MDN
      */
    lazy val auto: StyleSetter = buildSetter(this, "auto")
  }

  class BorderWidth(name: String, cssName: String) extends Style[String](name, cssName) {
    lazy val thin: StyleSetter = buildSetter(this, "thin")
    lazy val medium: StyleSetter = buildSetter(this, "medium")
    lazy val thick: StyleSetter = buildSetter(this, "thick")
  }

  class MultiTimeStyle(name: String, cssName: String) extends Style[String](name, cssName)

  class MinLengthStyle(name: String, cssName: String) extends AutoStyle[String](name, cssName) {

    /**
      * The intrinsic preferred length.
      *
      * MDN
      */
    lazy val maxContent: StyleSetter = buildSetter(this, "max-content")

    /**
      * The intrinsic minimum length.
      *
      * MDN
      */
    lazy val minContent: StyleSetter = buildSetter(this, "min-content")

    /**
      * Defined as min(max-content, max(min-content, fill-available).
      *
      * MDN
      */
    lazy val fitContent: StyleSetter = buildSetter(this, "fit-content")

    /**
      * The containing block width minus margin, border and padding.
      *
      * MDN
      */
    lazy val fillAvailable: StyleSetter = buildSetter(this, "fill-available")
  }

  class MaxLengthStyle(name: String, cssName: String) extends Style[String](name, cssName) {

    /**
      * The length has no maximum value.
      *
      * MDN
      */
    lazy val none: StyleSetter = buildSetter(this, "none")

    /**
      * The intrinsic preferred length.
      *
      * MDN
      */
    lazy val maxContent: StyleSetter = buildSetter(this, "max-content")

    /**
      * The intrinsic minimum length.
      *
      * MDN
      */
    lazy val minContent: StyleSetter = buildSetter(this, "min-content")

    /**
      * Defined as min(max-content, max(min-content, fill-available).
      *
      * MDN
      */
    lazy val fitContent: StyleSetter = buildSetter(this, "fit-content")

    /**
      * The containing block width minus margin, border and padding.
      *
      * MDN
      */
    lazy val fillAvailable: StyleSetter = buildSetter(this, "fill-available")
  }
}
