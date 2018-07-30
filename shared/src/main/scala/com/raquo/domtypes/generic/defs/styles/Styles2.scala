package com.raquo.domtypes.generic.defs.styles

import com.raquo.domtypes.generic.builders.StyleBuilders
import com.raquo.domtypes.generic.keys.Style

/**
  * Contains CSS styles which are used less frequently. These are not imported by
  * default to avoid namespace pollution.
  *
  * For type params docs, see [[StyleBuilders]]
  */
trait Styles2[StyleSetter] extends StylesMisc[StyleSetter] { this: StyleBuilders[StyleSetter] =>

  /**
    * The animation-direction CSS property indicates whether the animation should
    * play in reverse on alternate cycles.
    *
    * MDN
    */
  lazy val animationDirection: Style[String] = style("animationDirection", "animation-direction")

  /**
    * The animation-duration CSS property specifies the Length of time that an
    * animation should take to complete one cycle.
    *
    * A value of 0s, which is the default value, indicates that no animation should
    * occur.
    *
    * MDN
    */
  lazy val animationDuration: Style[String] = style("animationDuration", "animation-duration")

  /**
    * The animation-name CSS property specifies a list of animations that should
    * be applied to the selected element. Each name indicates a @keyframes at-rule
    * that defines the property values for the animation sequence.
    *
    * MDN
    */
  lazy val animationName: Style[String] = style("animationName", "animation-name")

  /**
    * The animation-fill-mode CSS property specifies how a CSS animation should
    * apply styles to its target before and after it is executing.
    *
    * MDN
    */
  lazy val animationFillMode: Style[String] = style("animationFillMode", "animation-fill-mode")

  /**
    * The animation-iteration-count CSS property defines the number of times an
    * animation cycle should be played before stopping.
    *
    * MDN
    */
  lazy val animationIterationCount: Style[Int] = style("animationIterationCount", "animation-iteration-count")


  /**
    * The animation-delay CSS property specifies when the animation should start.
    * This lets the animation sequence begin some time after it's applied to an
    * element.
    *
    * A value of 0s, which is the default value of the property, indicates that
    * the animation should begin as soon as it's applied. Otherwise, the value
    * specifies an offset from the moment the animation is applied to the element;
    * animation will begin that amount of time after being applied.
    *
    * Specifying a negative value for the animation delay causes the animation to
    * begin executing immediately. However, it will appear to have begun executing
    * partway through its cycle. For example, if you specify -1s as the animation
    * delay time, the animation will begin immediately but will start 1 second
    * into the animation sequence.
    *
    * If you specify a negative value for the animation delay, but the starting
    * value is implicit, the starting value is taken from the moment the animation
    * is applied to the element.
    *
    * MDN
    */
  lazy val animationDelay = new MultiTimeStyle("animationDelay", "animation-delay")

  /**
    * The CSS animation-timing-function property specifies how a CSS animation
    * should progress over the duration of each cycle. The possible values are
    * one or several <timing-function>.
    *
    * For keyframed animations, the timing function applies between keyframes
    * rather than over the entire animation. In other words, the timing function
    * is applied at the start of the keyframe and at the end of the keyframe.
    *
    * An animation timing function defined within a keyframe block applies to that
    * keyframe; otherwise. If no timing function is specified for the keyframe,
    * the timing function specified for the overall animation is used.
    *
    * MDN
    */
  lazy val animationTimingFunction: Style[String] = style("animationTimingFunction", "animation-timing-function")


  /**
    * The animation-play-state CSS property determines whether an animation is
    * running or paused. You can query this property's value to determine whether
    * or not the animation is currently running; in addition, you can set its
    * value to pause and resume playback of an animation.
    *
    * Resuming a paused animation will start the animation from where it left off
    * at the time it was paused, rather than starting over from the beginning of
    * the animation sequence.
    *
    * MDN
    */
  lazy val animationPlayState: Style[String] = style("animationPlayState", "animation-play-state")
  /**
    * The animation CSS property is a shorthand property for animation-name,
    * animation-duration, animation-timing-function, animation-delay,
    * animation-iteration-count and animation-direction.
    *
    * MDN
    */
  lazy val animation: Style[String] = style("animation", "animation")


  /**
    * The CSS backface-visibility property determines whether or not the back
    * face of the element is visible when facing the user. The back face of an
    * element always is a transparent background, letting, when visible, a mirror
    * image of the front face be displayed.
    *
    * MDN
    */
  object backfaceVisibility extends Style[String]("backfaceVisibility", "backface-visibility") {
    /**
      * The back face is visible.
      *
      * MDN
      */
    lazy val visible: StyleSetter = buildStringStyleSetter(this, "visible")
    /**
      * The back face is not visible.
      *
      * MDN
      */
    lazy val hidden: StyleSetter = buildStringStyleSetter(this, "hidden")
  }


  /**
    * The columns CSS property is a shorthand property allowing to set both the
    * column-width and the column-count properties at the same time.
    *
    * MDN
    */
  object columns extends Style[String]("columns", "columns") {
    def apply(number: Int, width: String): StyleSetter = buildStringStyleSetter(this, s"$number $width")
  }

  /**
    * The column-count CSS property describes the number of columns of the element.
    *
    * MDN
    */
  lazy val columnCount: AutoStyle[Int] = new AutoStyle("columnCount", "column-count")

  /**
    * The column-fill CSS property controls how contents are partitioned into
    * columns. Contents are either balanced, which means that contents in all
    * columns will have the same height or, when using auto, just take up the
    * room the content needs.
    *
    * MDN
    */
  object columnFill extends Style[String]("columnFill", "column-fill") {
    /**
      * Is a keyword indicating that columns are filled sequentially.
      *
      * MDN
      */
    lazy val auto: StyleSetter = buildStringStyleSetter(this, "auto")

    /**
      * Is a keyword indicating that content is equally divided between columns.
      *
      * MDN
      */
    lazy val balance: StyleSetter = buildStringStyleSetter(this, "balance")
  }

  /**
    * The column-gap CSS property sets the size of the gap between columns for
    * elements which are specified to display as a multi-column element.
    *
    * MDN
    */
  lazy val columnGap = new NormalOpenStyle[String]("columnGap", "column-gap")

  /**
    * In multi-column layouts, the column-rule CSS property specifies a straight
    * line, or "rule", to be drawn between each column. It is a convenient
    * shorthand to avoid setting each of the individual column-rule-* properties
    * separately : column-rule-width, column-rule-style and column-rule-color.
    *
    * MDN
    */
  lazy val columnRule: Style[String] = style("columnRule", "column-rule")

  /**
    * The column-span CSS property makes it possible for an element to span across
    * all columns when its value is set to all. An element that spans more than
    * one column is called a spanning element.
    *
    * MDN
    */
  object columnSpan extends Style[Int]("columnSpan", "column-span") {
    /**
      * The element does not span multiple columns.
      *
      * MDN
      */
    lazy val none: StyleSetter = buildStringStyleSetter(this, "none")
    /**
      * The element spans across all columns. Content in the normal flow that
      * appears before the element is automatically balanced across all columns
      * before the element appears. The element establishes a new block formatting
      * context.
      *
      * MDN
      */
    lazy val all: StyleSetter = buildStringStyleSetter(this, "all")
  }


  /**
    * The column-width CSS property suggests an optimal column width. This is not
    * a absolute value but a mere hint. Browser will adjust the width of the
    * column around that suggested value, allowing to achieve scalable designs
    * that fit different screen size. Especially in presence of the column-count
    * CSS property which has precedence, to set an exact column width, all Length
    * values must be specified. In horizontal text these are width, column-width,
    * column-gap, and column-rule-width
    *
    * MDN
    */
  lazy val columnWidth = new AutoStyle[Int]("columnWidth", "column-width")

  /**
    * The column-rule-color CSS property lets you set the color of the rule drawn
    * between columns in multi-column layouts.
    *
    * MDN
    */
  lazy val columnRuleColor: Style[String] = style("columnRuleColor", "column-rule-color")

  /**
    * The column-rule-width CSS property lets you set the width of the rule drawn
    * between columns in multi-column layouts.
    *
    * MDN
    */
  object columnRuleWidth extends Style[String]("columnRuleWidth", "column-rule-width") {
    lazy val thin: StyleSetter = buildStringStyleSetter(this, "thin")
    lazy val medium: StyleSetter = buildStringStyleSetter(this, "medium")
    lazy val thick: StyleSetter = buildStringStyleSetter(this, "thick")
  }

  /**
    * The column-rule-style CSS property lets you set the style of the rule drawn
    * between columns in multi-column layouts.
    *
    * MDN
    */
  object columnRuleStyle
    extends OutlineStyle("columnRuleStyle", "column-rule-style") {
    lazy val hidden: StyleSetter = buildStringStyleSetter(this, "hidden")
  }


  /**
    * The content CSS property is used with the ::before and ::after pseudo-elements
    * to generate content in an element. Objects inserted using the content
    * property are anonymous replaced elements.
    *
    * MDN
    */
  lazy val content: Style[String] = style("content", "content")

  /**
    * The counter-increment CSS property is used to increase the value of CSS
    * Counters by a given value. The counter's value can be reset using the
    * counter-reset CSS property.
    *
    * MDN
    */
  lazy val counterIncrement: Style[String] = style("counterIncrement", "counter-increment")

  /**
    * The counter-reset CSS property is used to reset CSS Counters to a given
    * value.
    *
    * MDN
    */
  lazy val counterReset: Style[String] = style("counterReset", "counter-reset")


  /**
    * The orphans CSS property refers to the minimum number of lines in a block
    * container that must be left at the bottom of the page. This property is
    * normally used to control how page breaks occur.
    *
    * MDN
    */
  lazy val orphans: Style[Int] = style("orphans", "orphans")


  /**
    * The widows CSS property defines how many minimum lines must be left on top
    * of a new page, on a paged media. In typography, a widow is the last line of
    * a paragraph appearing alone at the top of a page. Setting the widows property
    * allows to prevent widows to be left.
    *
    * On a non-paged media, like screen, the widows CSS property has no effect.
    *
    * MDN
    */
  lazy val widows: Style[Int] = style("widows", "widows")


  /**
    * The page-break-after CSS property adjusts page breaks after the current
    * element.
    *
    * MDN
    */
  lazy val pageBreakAfter = new PageBreak("pageBreakAfter", "page-break-after")

  /**
    * The page-break-inside CSS property adjusts page breaks inside the current
    * element.
    *
    * MDN
    */
  lazy val pageBreakInside = new PageBreak("pageBreakInside", "page-break-inside")


  /**
    * The page-break-before CSS property adjusts page breaks before the current
    * element.
    *
    * This properties applies to block elements that generate a box. It won't
    * apply on an empty div that won't generate a box.
    *
    * MDN
    */
  lazy val pageBreakBefore = new PageBreak("pageBreakBefore", "page-break-before")


  /**
    * The perspective CSS property determines the distance between the z=0 plane
    * and the user in order to give to the 3D-positioned element some perspective.
    * Each 3D element with z>0 becomes larger; each 3D-element with z<0 becomes
    * smaller. The strength of the effect is determined by the value of this
    * property.
    *
    * MDN
    */
  lazy val perspective = new NoneOpenStyle[String]("perspective", "perspective")

  /**
    * The perspective-origin CSS property determines the position the viewer is
    * looking at. It is used as the vanishing point by the perspective property.
    *
    * MDN
    */
  lazy val perspectiveOrigin: Style[String] = style("perspectiveOrigin", "perspective-origin")


  /**
    * The CSS transform property lets you modify the coordinate space of the CSS
    * visual formatting model. Using it, elements can be translated, rotated,
    * scaled, and skewed according to the values set.
    *
    * If the property has a value different than none, a stacking context will be
    * created. In that case the object will act as a containing block for
    * position: fixed elements that it contains.
    *
    * MDN
    */
  lazy val transform: Style[String] = style("transform", "transform")


  /**
    * The transform-origin CSS property lets you modify the origin for
    * transformations of an element. For example, the transform-origin of the
    * rotate() function is the centre of rotation. (This property is applied by
    * first translating the element by the negated value of the property, then
    * applying the element's transform, then translating by the property value.)
    *
    * Not explicitely set values are reset to their corresponding values.
    *
    * MDN
    */
  lazy val transformOrigin: Style[String] = style("transformOrigin", "transform-origin")

  /**
    * The transform-style CSS property determines if the children of the element
    * are positioned in the 3D-space or are flattened in the plane of the element.
    *
    * MDN
    */
  object transformStyle extends Style[String]("transformStyle", "transform-style") {
    /**
      * Indicates that the children of the element should be positioned in the
      * 3D-space.
      *
      * MDN
      */
    lazy val `preserve-3d`: StyleSetter = buildStringStyleSetter(this, "preserve-3d")
    /**
      * Indicates that the children of the element are lying in the plane of the
      * element itself.
      *
      * MDN
      */
    lazy val flat: StyleSetter = buildStringStyleSetter(this, "flat")
  }

  /**
    * The unicode-bidi CSS property together with the direction property relates
    * to the handling of bidirectional text in a document. For example, if a block
    * of text contains both left-to-right and right-to-left text then the
    * user-agent uses a complex Unicode algorithm to decide how to display the
    * text. This property overrides this algorithm and allows the developer to
    * control the text embedding.
    *
    * MDN
    */
  object unicodeBidi extends Style[String]("unicodeBidi", "unicode-bidi") {
    /**
      * The element does not offer a additional level of embedding with respect
      * to the bidirectional algorithm. For inline elements implicit reordering
      * works across element boundaries.
      *
      * MDN
      */
    lazy val normal: StyleSetter = buildStringStyleSetter(this, "normal")
    /**
      * If the element is inline, this value opens an additional level of
      * embedding with respect to the bidirectional algorithm. The direction of
      * this embedding level is given by the direction property.
      *
      * MDN
      */
    lazy val embed: StyleSetter = buildStringStyleSetter(this, "embed")
    /**
      * For inline elements this creates an override. For block container elements
      * this creates an override for inline-level descendants not within another
      * block container element. This means that inside the element, reordering
      * is strictly in sequence according to the direction property; the implicit
      * part of the bidirectional algorithm is ignored.
      *
      * MDN
      */
    lazy val `bidi-override`: StyleSetter = buildStringStyleSetter(this, "bidi-override")
  }


  /**
    * The word-break CSS property specifies whether or not the browser should
    * insert line breaks wherever the text would otherwise overflow its content
    * box.
    *
    * MDN
    */
  object wordBreak extends Style[String]("wordBreak", "word-break") {
    /**
      * Use the default line break rule.
      *
      * MDN
      */
    lazy val normal: StyleSetter = buildStringStyleSetter(this, "normal")

    /**
      * To prevent overflow, word breaks should be inserted between any two
      * characters (excluding Chinese/Japanese/Korean text).
      *
      * MDN
      */
    lazy val breakAll: StyleSetter = buildStringStyleSetter(this, "break-all")

    /**
      * Word breaks should not be used for Chinese/Japanese/Korean (CJK) text.
      * Non-CJK text behavior is the same as for normal.
      *
      * MDN
      */
    lazy val keepAll: StyleSetter = buildStringStyleSetter(this, "keep-all")

    /**
      * To prevent overflow, normally unbreakable words may be broken at
      * arbitrary points if there are no otherwise acceptable break points in
      * the line.
      *
      * MDN
      */
    lazy val breakWord: StyleSetter = buildStringStyleSetter(this, "break-word")
  }
}
