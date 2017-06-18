package com.raquo.dombuilder.jsdom.defs.styles

import com.raquo.dombuilder.generic.keys.Style
import com.raquo.dombuilder.jsdom.builders.StyleBuilder

// @TODO[API] How to get rid of this? Use Either? Some kind of MultiStyle trait?
import scala.scalajs.js.|

/**
  * Documentation marked "MDN" is thanks to Mozilla Contributors
  * at https://developer.mozilla.org/en-US/docs/Web/API and available
  * under the Creative Commons Attribution-ShareAlike v2.5 or later.
  * http://creativecommons.org/licenses/by-sa/2.5/
  *
  * Everything else is under the MIT License
  * http://opensource.org/licenses/MIT
  */
trait StyleMisc { this: StyleBuilder =>

  /**
    * A Style that takes any value of type T as a parameter and has an auto value
    */
  class AutoStyle[TValue](jsName: String, cssName: String) extends Style[TValue | String](jsName, cssName) {
    lazy val auto = this := "auto"
  }

  /**
    * A Style that takes any value of type T as a parameter and has an none value
    */
  class NoneOpenStyle[TValue](jsName: String, cssName: String) extends Style[TValue | String](jsName, cssName) {
    lazy val none = this := "none"
  }

  /**
    * A Style that takes any value of type T as a parameter and has an normal value
    */
  class NormalOpenStyle[TValue](jsName: String, cssName: String) extends Style[TValue | String](jsName, cssName) {
    lazy val normal = this := "normal"
  }

  class MultiImageStyle(jsName: String, cssName: String) extends Style[String](jsName, cssName)

  class CurrentColor(jsName: String, cssName: String) extends Style[String](jsName, cssName) {
    lazy val currentColor = this -> "currentColor"
  }

  class OutlineStyle(jsName: String, cssName: String) extends Style[String](jsName, cssName) {

    /**
      * Displays a series of rounded dots. The spacing of the dots are not
      * defined by the specification and are implementation-specific. The radius
      * of the dots is half the calculated border-right-width.
      *
      * MDN
      */
    lazy val dotted = this := "dotted"

    /**
      * Displays a series of short square-ended dashes or line segments. The exact
      * size and Length of the segments are not defined by the specification and
      * are implementation-specific.
      *
      * MDN
      */
    lazy val dashed = this := "dashed"

    /**
      * Displays a single, straight, solid line.
      *
      * MDN
      */
    lazy val solid = this := "solid"

    /**
      * Displays two straight lines that add up to the pixel amount defined as
      * border-width or border-right-width.
      *
      * MDN
      */
    lazy val double = this := "double"

    /**
      * Displays a border leading to a carved effect. It is the opposite of ridge.
      *
      * MDN
      */
    lazy val groove = this := "groove"

    /**
      * Displays a border with a 3D effect, like if it is coming out of the page.
      * It is the opposite of groove.
      *
      * MDN
      */
    lazy val ridge = this := "ridge"

    /**
      * Displays a border that makes the box appear embedded. It is the opposite
      * of outset. When applied to a table cell with border-collapse set to
      * collapsed, this value behaves like groove.
      *
      * MDN
      */
    lazy val inset = this := "inset"

    /**
      * Displays a border that makes the box appear in 3D, embossed. It is the
      * opposite of inset. When applied to a table cell with border-collapse set
      * to collapsed, this value behaves like ridge.
      *
      * MDN
      */
    lazy val outset = this := "outset"
  }

  class BorderStyle(jsName: String, cssName: String) extends OutlineStyle(jsName, cssName) {

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
    lazy val none = this := "none"

    /**
      * Like for the none keyword, displays no border. In that case, except if a
      * background image is set, the calculated values of border-right-width will
      * be 0, even if specified otherwise through the property. In case of table
      * cell and border collapsing, the hidden value has the highest priority: it
      * means that if any other conflicting border is set, it won't be displayed.
      *
      * MDN
      */
    lazy val hidden = this := "hidden"

  }

  class Overflow(jsName: String, cssName: String) extends Style[String](jsName, cssName) {

    /**
      * Default value. Content is not clipped, it may be rendered outside the
      * content box.
      *
      * MDN
      */
    lazy val visible = this := "visible"

    /**
      * The content is clipped and no scrollbars are provided.
      *
      * MDN
      */
    lazy val hidden = this := "hidden"

    /**
      * The content is clipped and desktop browsers use scrollbars, whether or
      * not any content is clipped. This avoids any problem with scrollbars
      * appearing and disappearing in a dynamic environment. Printers may print
      * overflowing content.
      *
      * MDN
      */
    lazy val scroll = this := "scroll"

    /**
      * Depends on the user agent. Desktop browsers like Firefox provide
      * scrollbars if content overflows.
      *
      * MDN
      */
    lazy val auto = this := "auto"
  }

  class PageBreak(jsName: String, cssName: String) extends Style[String](jsName, cssName) {

    /**
      * Initial value. Automatic page breaks (neither forced nor forbidden).
      *
      * MDN
      */
    lazy val auto = this := "auto"

    /**
      * Always force page breaks.
      *
      * MDN
      */
    lazy val always = this := "always"

    /**
      * Avoid page breaks.
      *
      * MDN
      */
    lazy val avoid = this := "avoid"

    /**
      * Force page breaks so that the next page is formatted
      * as a left page.
      *
      * MDN
      */
    lazy val left = this := "left"

    /**
      * Force page breaks so that the next page is formatted
      * as a right page.
      *
      * MDN
      */
    lazy val right = this := "right"
  }


  class BorderRadius(jsName: String, cssName: String) extends Style[String](jsName, cssName)

  trait MarginAuto extends Style[String] {
    /**
      * auto is replaced by some suitable value, e.g. it can be used for
      * centering of blocks.
      *
      * MDN
      */
    lazy val auto = this := "auto"
  }

  class BorderWidth(jsName: String, cssName: String) extends Style[String](jsName, cssName) {
    lazy val thin = this := "thin"
    lazy val medium = this := "medium"
    lazy val thick = this := "thick"
  }

  class MultiTimeStyle(jsName: String, cssName: String) extends Style[String](jsName, cssName)

  class MinLengthStyle(jsName: String, cssName: String) extends AutoStyle[String](jsName, cssName) {

    /**
      * The intrinsic preferred length.
      *
      * MDN
      */
    lazy val maxContent = this := "max-content"

    /**
      * The intrinsic minimum length.
      *
      * MDN
      */
    lazy val minContent = this := "min-content"

    /**
      * Defined as min(max-content, max(min-content, fill-available).
      *
      * MDN
      */
    lazy val fitContent = this := "fit-content"

    /**
      * The containing block width minus margin, border and padding.
      *
      * MDN
      */
    lazy val fillAvailable = this := "fill-available"
  }

  class MaxLengthStyle(jsName: String, cssName: String) extends Style[String](jsName, cssName) {

    /**
      * The length has no maximum value.
      *
      * MDN
      */
    lazy val none = this := "none"

    /**
      * The intrinsic preferred length.
      *
      * MDN
      */
    lazy val maxContent = this := "max-content"

    /**
      * The intrinsic minimum length.
      *
      * MDN
      */
    lazy val minContent = this := "min-content"

    /**
      * Defined as min(max-content, max(min-content, fill-available).
      *
      * MDN
      */
    lazy val fitContent = this := "fit-content"

    /**
      * The containing block width minus margin, border and padding.
      *
      * MDN
      */
    lazy val fillAvailable = this := "fill-available"
  }
}
