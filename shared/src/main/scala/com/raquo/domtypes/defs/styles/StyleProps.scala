package com.raquo.domtypes.defs.styles

import com.raquo.domtypes.common.StylePropDef

object StyleProps {
  
  val defs: List[StylePropDef] = List(
    
    StylePropDef(
      scalaName = "all",
      domName = "all",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The all shorthand CSS property resets all of an element's properties except",
        "unicode-bidi, direction, and CSS Custom Properties. It can set properties to",
        "their initial or inherited values, or to the values specified in another",
        "stylesheet origin.",
        "",
        "Note: IE does not support this property",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/all",
      ),
    ),

    StylePropDef(
      scalaName = "animation",
      domName = "animation",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The animation CSS property is a shorthand property for animation-name,",
        "animation-duration, animation-timing-function, animation-delay,",
        "animation-iteration-count and animation-direction.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/animation",
      ),
    ),

    StylePropDef(
      scalaName = "animationDelay",
      domName = "animation-delay",
      valueType = "String",
      valueTraits = List("Time"),
      implName = "timeStyle",
      commentLines = List(
        "The animation-delay CSS property specifies when the animation should start.",
        "This lets the animation sequence begin some time after it's applied to an",
        "element.",
        "",
        "A value of 0s, which is the default value of the property, indicates that",
        "the animation should begin as soon as it's applied. Otherwise, the value",
        "specifies an offset from the moment the animation is applied to the element;",
        "animation will begin that amount of time after being applied.",
        "",
        "Specifying a negative value for the animation delay causes the animation to",
        "begin executing immediately. However, it will appear to have begun executing",
        "partway through its cycle. For example, if you specify -1s as the animation",
        "delay time, the animation will begin immediately but will start 1 second",
        "into the animation sequence.",
        "",
        "If you specify a negative value for the animation delay, but the starting",
        "value is implicit, the starting value is taken from the moment the animation",
        "is applied to the element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/animation-delay",
      ),
    ),

    StylePropDef(
      scalaName = "animationDirection",
      domName = "animation-direction",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The animation-direction CSS property indicates whether the animation should",
        "play in reverse on alternate cycles.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/animation-direction",
      ),
    ),

    StylePropDef(
      scalaName = "animationDuration",
      domName = "animation-duration",
      valueType = "String",
      valueTraits = List("Time"),
      implName = "timeStyle",
      commentLines = List(
        "The animation-duration CSS property specifies the Length of time that an",
        "animation should take to complete one cycle.",
        "",
        "A value of 0s, which is the default value, indicates that no animation should",
        "occur.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/animation-duration",
      ),
    ),

    StylePropDef(
      scalaName = "animationFillMode",
      domName = "animation-fill-mode",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The animation-fill-mode CSS property specifies how a CSS animation should",
        "apply styles to its target before and after it is executing.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/animation-fill-mode",
      ),
    ),

    StylePropDef(
      scalaName = "animationIterationCount",
      domName = "animation-iteration-count",
      valueType = "Double",
      valueTraits = Nil,
      implName = "doubleStyle",
      commentLines = List(
        "The animation-iteration-count CSS property defines the number of times an",
        "animation cycle should be played before stopping.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/animation-iteration-count",
      ),
    ),

    StylePropDef(
      scalaName = "animationName",
      domName = "animation-name",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The animation-name CSS property specifies a list of animations that should",
        "be applied to the selected element. Each name indicates a @keyframes at-rule",
        "that defines the property values for the animation sequence.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/animation-name",
      ),
    ),

    StylePropDef(
      scalaName = "animationPlayState",
      domName = "animation-play-state",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The animation-play-state CSS property determines whether an animation is",
        "running or paused. You can query this property's value to determine whether",
        "or not the animation is currently running; in addition, you can set its",
        "value to pause and resume playback of an animation.",
        "",
        "Resuming a paused animation will start the animation from where it left off",
        "at the time it was paused, rather than starting over from the beginning of",
        "the animation sequence.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/animation-play-state",
      ),
    ),

    StylePropDef(
      scalaName = "animationTimingFunction",
      domName = "animation-timing-function",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The CSS animation-timing-function property specifies how a CSS animation",
        "should progress over the duration of each cycle. The possible values are",
        "one or several <timing-function>.",
        "",
        "For keyframed animations, the timing function applies between keyframes",
        "rather than over the entire animation. In other words, the timing function",
        "is applied at the start of the keyframe and at the end of the keyframe.",
        "",
        "An animation timing function defined within a keyframe block applies to that",
        "keyframe; otherwise. If no timing function is specified for the keyframe,",
        "the timing function specified for the overall animation is used.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/animation-timing-function",
      ),
    ),

    StylePropDef(
      scalaName = "alignContent",
      domName = "align-content",
      valueType = "String",
      valueTraits = List("AlignContent"),
      implName = "alignContentStyle",
      commentLines = List(
        "The CSS align-content property sets the distribution of space between and",
        "around content items along a flexbox's cross-axis or a grid's block axis.",
        "",
        "",
        "@see https://css-tricks.com/snippets/css/a-guide-to-flexbox/",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/align-content",
      ),
    ),

    StylePropDef(
      scalaName = "alignItems",
      domName = "align-items",
      valueType = "String",
      valueTraits = List("FlexPosition"),
      implName = "flexPositionStyle",
      commentLines = List(
        "The CSS align-items property sets the align-self value on all direct children",
        "as a group. In Flexbox, it controls the alignment of items on the Cross Axis.",
        "In Grid Layout, it controls the alignment of items on the Block Axis within",
        "their grid area.",
        "",
        "@see https://css-tricks.com/snippets/css/a-guide-to-flexbox/",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/align-items",
      ),
    ),

    StylePropDef(
      scalaName = "alignSelf",
      domName = "align-self",
      valueType = "String",
      valueTraits = List("FlexPosition"),
      implName = "flexPositionStyle",
      commentLines = List(
        "The align-self CSS property overrides a grid or flex item's align-items",
        "value. In Grid, it aligns the item inside the grid area. In Flexbox,",
        "it aligns the item on the cross axis.",
        "",
        "@see https://css-tricks.com/snippets/css/a-guide-to-flexbox/",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/align-self",
      ),
    ),

    StylePropDef(
      scalaName = "background",
      domName = "background",
      valueType = "String",
      valueTraits = List("Color", "Url"),
      implName = "colorUrlStyle",
      commentLines = List(
        "The background CSS property is a shorthand for setting the individual",
        "background values in a single place in the style sheet. background can be",
        "used to set the values for one or more of: background-clip, background-color,",
        "background-image, background-origin, background-position, background-repeat,",
        "background-size, and background-attachment.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/background",
      ),
    ),

    StylePropDef(
      scalaName = "backgroundAttachment",
      domName = "background-attachment",
      valueType = "String",
      valueTraits = List("BackgroundAttachment"),
      implName = "backgroundAttachmentStyle",
      commentLines = List(
        "If a background-image is specified, the background-attachment CSS",
        "property determines whether that image's position is fixed within",
        "the viewport, or scrolls along with its containing block.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/background-attachment",
      ),
    ),

    StylePropDef(
      scalaName = "backgroundClip",
      domName = "background-clip",
      valueType = "String",
      valueTraits = List("PaddingBoxSizing"),
      implName = "paddingBoxSizingStyle",
      commentLines = List(
        "The background-clip CSS property specifies whether an element's background,",
        "either the color or image, extends underneath its border.",
        "",
        "If there is no background image, this property has only visual effect when",
        "the border has transparent regions (because of border-style) or partially",
        "opaque regions; otherwise the border covers up the difference.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/background-clip",
      ),
    ),

    StylePropDef(
      scalaName = "backgroundColor",
      domName = "background-color",
      valueType = "String",
      valueTraits = List("Color"),
      implName = "colorStyle",
      commentLines = List(
        "The background-color CSS property sets the background color of an element,",
        "either through a color value or the keyword transparent.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/background-color",
      ),
    ),

    StylePropDef(
      scalaName = "backgroundImage",
      domName = "background-image",
      valueType = "String",
      valueTraits = List("Url"),
      implName = "urlStyle",
      commentLines = List(
        "The background-image CSS property sets one or more background images on an",
        "element. The background images are drawn on stacking context layers on top",
        "of each other. The first layer specified is drawn as if it is closest to",
        "the user. The borders of the element are then drawn on top of them, and the",
        "background-color is drawn beneath them.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/background-image",
      ),
    ),

    StylePropDef(
      scalaName = "backgroundOrigin",
      domName = "background-origin",
      valueType = "String",
      valueTraits = List("PaddingBoxSizing"),
      implName = "paddingBoxSizingStyle",
      commentLines = List(
        "The background-origin CSS property determines the background positioning",
        "area, that is the position of the origin of an image specified using the",
        "background-image CSS property.",
        "",
        "Note that background-origin is ignored when background-attachment is fixed.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/background-origin",
      ),
    ),

    StylePropDef(
      scalaName = "backgroundPosition",
      domName = "background-position",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The background-position CSS property sets the initial position, relative to",
        "the background position layer defined by background-origin for each defined",
        "background image.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/background-position",
      ),
    ),

    StylePropDef(
      scalaName = "backgroundRepeat",
      domName = "background-repeat",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The background-repeat CSS property defines how background images are repeated.",
        "A background image can be repeated along the horizontal axis, the vertical",
        "axis, both, or not repeated at all. When the repetition of the image tiles",
        "doesn't let them exactly cover the background, the way adjustments are done",
        "can be controlled by the author: by default, the last image is clipped, but",
        "the different tiles can instead be re-sized, or space can be inserted",
        "between the tiles.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/background-repeat",
      ),
    ),

    StylePropDef(
      scalaName = "backgroundSize",
      domName = "background-size",
      valueType = "String",
      valueTraits = List("BackgroundSize"),
      implName = "backgroundSizeStyle",
      commentLines = List(
        "The background-size CSS property specifies the size of the background",
        "images. The size of the image can be fully constrained or only partially in",
        "order to preserve its intrinsic ratio.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/background-size",
      ),
    ),

    StylePropDef(
      scalaName = "backfaceVisibility",
      domName = "backface-visibility",
      valueType = "String",
      valueTraits = List("BackfaceVisibility"),
      implName = "backfaceVisibilityStyle",
      commentLines = List(
        "The CSS backface-visibility property determines whether or not the back",
        "face of the element is visible when facing the user. The back face of an",
        "element always is a transparent background, letting, when visible, a mirror",
        "image of the front face be displayed.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/backface-visibility",
      ),
    ),

    StylePropDef(
      scalaName = "border",
      domName = "border",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The border CSS property is a shorthand property for setting the individual",
        "border property values in a single place in the style sheet. border can be",
        "used to set the values for one or more of: border-width, border-style,",
        "border-color.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border",
      ),
    ),

    StylePropDef(
      scalaName = "borderTop",
      domName = "border-top",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The border-top CSS property is a shorthand that sets the values of",
        "border-top-color, border-top-style, and border-top-width. These",
        "properties describe the top border of elements.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-top",
      ),
    ),

    StylePropDef(
      scalaName = "borderRight",
      domName = "border-right",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The border-right CSS property is a shorthand that sets the values of",
        "border-right-color, border-right-style, and border-right-width. These",
        "properties describe the right border of elements.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-right",
      ),
    ),

    StylePropDef(
      scalaName = "borderBottom",
      domName = "border-bottom",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The border-bottom CSS property is a shorthand that sets the values of",
        "border-bottom-color, border-bottom-style, and border-bottom-width. These",
        "properties describe the bottom border of elements.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom",
      ),
    ),

    StylePropDef(
      scalaName = "borderLeft",
      domName = "border-left",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The border-left CSS property is a shorthand that sets the values of",
        "border-left-color, border-left-style, and border-left-width. These",
        "properties describe the left border of elements.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-left",
      ),
    ),

    StylePropDef(
      scalaName = "borderColor",
      domName = "border-color",
      valueType = "String",
      valueTraits = List("Color"),
      implName = "colorStyle",
      commentLines = List(
        "The border-color CSS property is a shorthand for setting the color of the",
        "four sides of an element's border: border-top-color, border-right-color,",
        "border-bottom-color, border-left-color.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-color",
      ),
    ),

    StylePropDef(
      scalaName = "borderTopColor",
      domName = "border-top-color",
      valueType = "String",
      valueTraits = List("Color"),
      implName = "colorStyle",
      commentLines = List(
        "The border-top-color CSS property sets the color of the top border of an element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-color",
      ),
    ),

    StylePropDef(
      scalaName = "borderRightColor",
      domName = "border-right-color",
      valueType = "String",
      valueTraits = List("Color"),
      implName = "colorStyle",
      commentLines = List(
        "The border-right-color CSS property sets the color of the right border of an element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-color",
      ),
    ),

    StylePropDef(
      scalaName = "borderBottomColor",
      domName = "border-bottom-color",
      valueType = "String",
      valueTraits = List("Color"),
      implName = "colorStyle",
      commentLines = List(
        "The border-bottom-color CSS property sets the color of the bottom border of an element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-color",
      ),
    ),

    StylePropDef(
      scalaName = "borderLeftColor",
      domName = "border-left-color",
      valueType = "String",
      valueTraits = List("Color"),
      implName = "colorStyle",
      commentLines = List(
        "The border-left-color CSS property sets the color of the left border of an element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-color",
      ),
    ),

    StylePropDef(
      scalaName = "borderImage",
      domName = "border-image",
      valueType = "String",
      valueTraits = List("Url"),
      implName = "urlStyle",
      commentLines = List(
        "The border-image CSS property draws an image around a given element.",
        "It replaces the element's regular border.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-image",
      ),
    ),

    StylePropDef(
      scalaName = "borderStyle",
      domName = "border-style",
      valueType = "String",
      valueTraits = List("Line"),
      implName = "lineStyle",
      commentLines = List(
        "The border-style CSS property is a shorthand property for setting the line",
        "style for all four sides of the element's border.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-style",
      ),
    ),

    StylePropDef(
      scalaName = "borderTopStyle",
      domName = "border-top-style",
      valueType = "String",
      valueTraits = List("Line"),
      implName = "lineStyle",
      commentLines = List(
        "The border-top-style CSS property sets the line style of the top border of a box.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-style",
      ),
    ),

    StylePropDef(
      scalaName = "borderRightStyle",
      domName = "border-right-style",
      valueType = "String",
      valueTraits = List("Line"),
      implName = "lineStyle",
      commentLines = List(
        "The border-right-style CSS property sets the line style of the right border of a box.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-style",
      ),
    ),

    StylePropDef(
      scalaName = "borderBottomStyle",
      domName = "border-bottom-style",
      valueType = "String",
      valueTraits = List("Line"),
      implName = "lineStyle",
      commentLines = List(
        "The border-bottom-style CSS property sets the line style of the bottom border of a box.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-style",
      ),
    ),

    StylePropDef(
      scalaName = "borderLeftStyle",
      domName = "border-left-style",
      valueType = "String",
      valueTraits = List("Line"),
      implName = "lineStyle",
      commentLines = List(
        "The border-left-style CSS property sets the line style of the left border of a box.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-style",
      ),
    ),

    StylePropDef(
      scalaName = "borderWidth",
      domName = "border-width",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The border-width CSS property is a shorthand property for setting the width",
        "for all four sides of the element's border.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-width",
      ),
    ),

    StylePropDef(
      scalaName = "borderTopWidth",
      domName = "border-top-width",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The border-top-width CSS property sets the line width of the top border of a box.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-width",
      ),
    ),

    StylePropDef(
      scalaName = "borderRightWidth",
      domName = "border-right-width",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The border-right-width CSS property sets the line width of the right border of a box.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-width",
      ),
    ),

    StylePropDef(
      scalaName = "borderBottomWidth",
      domName = "border-bottom-width",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The border-bottom-width CSS property sets the line width of the bottom border of a box.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-width",
      ),
    ),

    StylePropDef(
      scalaName = "borderLeftWidth",
      domName = "border-left-width",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The border-left-width CSS property sets the line width of the left border of a box.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-width",
      ),
    ),

    StylePropDef(
      scalaName = "borderRadius",
      domName = "border-radius",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The border-radius CSS property allows Web authors to define how rounded",
        "border corners are. The curve of each corner is defined using one or two",
        "radii, defining its shape: circle or ellipse.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-radius",
      ),
    ),

    StylePropDef(
      scalaName = "borderTopLeftRadius",
      domName = "border-top-left-radius",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The border-top-left-radius CSS property sets the rounding of the",
        "top-left corner of the element. The rounding can be a circle or an",
        "ellipse, or if one of the value is 0 no rounding is done and the corner is",
        "square.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-left-radius",
      ),
    ),

    StylePropDef(
      scalaName = "borderTopRightRadius",
      domName = "border-top-right-radius",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The border-top-right-radius CSS property sets the rounding of the top-right",
        "corner of the element. The rounding can be a circle or an ellipse, or if",
        "one of the value is 0 no rounding is done and the corner is square.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-right-radius",
      ),
    ),

    StylePropDef(
      scalaName = "borderBottomRightRadius",
      domName = "border-bottom-right-radius",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The border-bottom-right-radius CSS property sets the rounding of the",
        "bottom-right corner of the element. The rounding can be a circle or an",
        "ellipse, or if one of the value is 0 no rounding is done and the corner is",
        "square.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-right-radius",
      ),
    ),

    StylePropDef(
      scalaName = "borderBottomLeftRadius",
      domName = "border-bottom-left-radius",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The border-bottom-left-radius CSS property sets the rounding of the",
        "bottom-left corner of the element. The rounding can be a circle or an",
        "ellipse, or if one of the value is 0 no rounding is done and the corner is",
        "square.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-left-radius",
      ),
    ),

    StylePropDef(
      scalaName = "borderCollapse",
      domName = "border-collapse",
      valueType = "String",
      valueTraits = List("BorderCollapse"),
      implName = "borderCollapseStyle",
      commentLines = List(
        "The border-collapse CSS property selects a table's border model. This has",
        "a big influence on the look and style of the table cells.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-collapse",
      ),
    ),

    StylePropDef(
      scalaName = "borderSpacing",
      domName = "border-spacing",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The border-spacing CSS property specifies the distance between the borders",
        "of adjacent cells (only for the separated borders model). This is equivalent",
        "to the cellspacing attribute in presentational HTML, but an optional second",
        "value can be used to set different horizontal and vertical spacing.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/border-spacing",
      ),
    ),

    StylePropDef(
      scalaName = "bottom",
      domName = "bottom",
      valueType = "String",
      valueTraits = List("Length", "Auto[_]"),
      implName = "lengthAutoStyle",
      commentLines = List(
        "The bottom CSS property participates in specifying the position of",
        "positioned elements.",
        "",
        "For absolutely positioned elements, that is those with position: absolute",
        "or position: fixed, it specifies the distance between the bottom margin edge",
        "of the element and the bottom edge of its containing block.",
        "",
        "For relatively positioned elements, that is those with position: relative,",
        "it specifies the distance the element is moved above its normal position.",
        "",
        "However, the top property overrides the bottom property, so if top is not",
        "auto, the computed value of bottom is the negative of the computed value of",
        "top.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/bottom",
      ),
    ),

    StylePropDef(
      scalaName = "boxShadow",
      domName = "box-shadow",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The box-shadow CSS property describes one or more shadow effects as a",
        "comma-separated list. It allows casting a drop shadow from the frame of",
        "almost any element. If a border-radius is specified on the element with a",
        "box shadow, the box shadow takes on the same rounded corners. The z-ordering",
        "of multiple box shadows is the same as multiple text shadows (the first",
        "specified shadow is on top).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/box-shadow",
      ),
    ),

    StylePropDef(
      scalaName = "boxSizing",
      domName = "box-sizing",
      valueType = "String",
      valueTraits = List("BoxSizing"),
      implName = "boxSizingStyle",
      commentLines = List(
        "The box-sizing CSS property is used to alter the default CSS box model used",
        "to calculate widths and heights of elements. It is possible to use this",
        "property to emulate the behavior of browsers that do not correctly support",
        "the CSS box model specification.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/box-sizing",
      ),
    ),

    StylePropDef(
      scalaName = "captionSide",
      domName = "caption-side",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The caption-side CSS property positions the content of a table's caption",
        "on the specified side (top or bottom).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/caption-side",
      ),
    ),

    StylePropDef(
      scalaName = "clear",
      domName = "clear",
      valueType = "String",
      valueTraits = List("Clear"),
      implName = "clearStyle",
      commentLines = List(
        "The clear CSS property specifies whether an element can be next to floating",
        "elements that precede it or must be moved down (cleared) below them.",
        "",
        "The clear property applies to both floating and non-floating elements.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/clear",
      ),
    ),

    StylePropDef(
      scalaName = "clip",
      domName = "clip",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The clip CSS property defines what portion of an element is visible. The",
        "clip property applies only to elements with position:absolute.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/clip",
      ),
    ),

    StylePropDef(
      scalaName = "color",
      domName = "color",
      valueType = "String",
      valueTraits = List("Color"),
      implName = "colorStyle",
      commentLines = List(
        "The CSS color property sets the foreground color of an element's text",
        "content, and its decorations. It doesn't affect any other characteristic of",
        "the element; it should really be called text-color and would have been",
        "named so, save for historical reasons.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/color",
      ),
    ),

    StylePropDef(
      scalaName = "columns",
      domName = "columns",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The columns CSS property is a shorthand property allowing to set both the",
        "column-width and the column-count properties at the same time.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/columns",
      ),
    ),

    StylePropDef(
      scalaName = "columnCount",
      domName = "column-count",
      valueType = "Int",
      valueTraits = List("Auto[_]"),
      implName = "autoStyle[_]",
      commentLines = List(
        "The column-count CSS property describes the number of columns of the element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/column-count",
      ),
    ),

    StylePropDef(
      scalaName = "columnFill",
      domName = "column-fill",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The column-fill CSS property controls how contents are partitioned into",
        "columns. Contents are either balanced, which means that contents in all",
        "columns will have the same height or, when using auto, just take up the",
        "room the content needs.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/column-fill",
      ),
    ),

    StylePropDef(
      scalaName = "columnGap",
      domName = "column-gap",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The column-gap CSS property sets the size of the gap between columns for",
        "elements which are specified to display as a multi-column element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/column-gap",
      ),
    ),

    StylePropDef(
      scalaName = "columnSpan",
      domName = "column-span",
      valueType = "Int",
      valueTraits = Nil,
      implName = "intStyle",
      commentLines = List(
        "The column-span CSS property makes it possible for an element to span across",
        "all columns when its value is set to `all`. An element that spans more than",
        "one column is called a spanning element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/column-span",
      ),
    ),

    StylePropDef(
      scalaName = "columnWidth",
      domName = "column-width",
      valueType = "String",
      valueTraits = List("Length", "Auto[_]"),
      implName = "lengthAutoStyle",
      commentLines = List(
        "The column-width CSS property suggests an optimal column width. This is not",
        "a absolute value but a mere hint. Browser will adjust the width of the",
        "column around that suggested value, allowing to achieve scalable designs",
        "that fit different screen size. Especially in presence of the column-count",
        "CSS property which has precedence, to set an exact column width, all Length",
        "values must be specified. In horizontal text these are width, column-width,",
        "column-gap, and column-rule-width",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/column-width",
      ),
    ),

    StylePropDef(
      scalaName = "columnRule",
      domName = "column-rule",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "In multi-column layouts, the column-rule CSS property specifies a straight",
        "line, or \"rule\", to be drawn between each column. It is a convenient",
        "shorthand to avoid setting each of the individual column-rule-* properties",
        "separately : column-rule-width, column-rule-style and column-rule-color.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/column-rule",
      ),
    ),

    StylePropDef(
      scalaName = "columnRuleColor",
      domName = "column-rule-color",
      valueType = "String",
      valueTraits = List("Color"),
      implName = "colorStyle",
      commentLines = List(
        "The column-rule-color CSS property lets you set the color of the rule drawn",
        "between columns in multi-column layouts.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/column-rule-color",
      ),
    ),

    StylePropDef(
      scalaName = "columnRuleWidth",
      domName = "column-rule-width",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The column-rule-width CSS property lets you set the width of the rule drawn",
        "between columns in multi-column layouts.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/column-rule-width",
      ),
    ),

    StylePropDef(
      scalaName = "columnRuleStyle",
      domName = "column-rule-style",
      valueType = "String",
      valueTraits = List("Line"),
      implName = "lineStyle",
      commentLines = List(
        "The column-rule-style CSS property lets you set the style of the rule drawn",
        "between columns in multi-column layouts.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/column-rule-style",
      ),
    ),

    StylePropDef(
      scalaName = "contentCss",
      domName = "content",
      valueType = "String",
      valueTraits = List("Url", "None[_]"),
      implName = "urlNoneStyle",
      commentLines = List(
        "The `content` CSS property is used with the ::before and ::after pseudo-elements",
        "to generate content in an element. Objects inserted using the content",
        "property are anonymous replaced elements.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/content",
      ),
    ),

    StylePropDef(
      scalaName = "counterIncrement",
      domName = "counter-increment",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The counter-increment CSS property is used to increase the value of CSS",
        "Counters by a given value. The counter's value can be reset using the",
        "counter-reset CSS property.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/counter-increment",
      ),
    ),

    StylePropDef(
      scalaName = "counterReset",
      domName = "counter-reset",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The counter-reset CSS property is used to reset CSS Counters to a given",
        "value.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/counter-reset",
      ),
    ),

    StylePropDef(
      scalaName = "cursor",
      domName = "cursor",
      valueType = "String",
      valueTraits = List("Cursor"),
      implName = "cursorStyle",
      commentLines = List(
        "The cursor CSS property specifies the mouse cursor displayed when the mouse",
        "pointer is over an element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/cursor",
      ),
    ),

    StylePropDef(
      scalaName = "direction",
      domName = "direction",
      valueType = "String",
      valueTraits = List("Direction"),
      implName = "directionStyle",
      commentLines = List(
        "Set the direction CSS property to match the direction of the text: rtl for",
        "Hebrew or Arabic text and ltr for other scripts. This is typically done as",
        "part of the document (e.g., using the dir attribute in HTML) rather than",
        "through direct use of CSS.",
        "",
        "The property sets the base text direction of block-level elements and the",
        "direction of embeddings created by the unicode-bidi property. It also sets",
        "the default alignment of text and block-level elements and the direction",
        "that cells flow within a table row.",
        "",
        "Unlike the dir attribute in HTML, the direction property is not inherited",
        "from table columns into table cells, since CSS inheritance follows the",
        "document tree, and table cells are inside of the rows but not inside of the",
        "columns.",
        "",
        "The direction and unicode-bidi properties are the two only properties which",
        "are not affected by the all shorthand.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/direction",
      ),
    ),

    StylePropDef(
      scalaName = "display",
      domName = "display",
      valueType = "String",
      valueTraits = List("Display"),
      implName = "displayStyle",
      commentLines = List(
        "The display CSS property specifies the type of rendering box used for an",
        "element. In HTML, default display property values are taken from behaviors",
        "described in the HTML specifications or from the browser/user default",
        "stylesheet. The default value in XML is inline.",
        "",
        "In addition to the many different display box types, the value none lets",
        "you turn off the display of an element; when you use none, all descendant",
        "elements also have their display turned off. The document is rendered as",
        "though the element doesn't exist in the document tree.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/display",
      ),
    ),

    StylePropDef(
      scalaName = "emptyCells",
      domName = "empty-cells",
      valueType = "String",
      valueTraits = List("EmptyCells"),
      implName = "emptyCellsStyle",
      commentLines = List(
        "The empty-cells CSS property specifies how user agents should render borders",
        "and backgrounds around cells that have no visible content.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/empty-cells",
      ),
    ),

    StylePropDef(
      scalaName = "flex",
      domName = "flex",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The flex CSS property is a shorthand property specifying the ability of a",
        "flex item to alter its dimensions to fill available space. Flex items can",
        "be stretched to use available space proportional to their flex grow factor",
        "or their flex shrink factor to prevent overflow.",
        "",
        "@see https://css-tricks.com/snippets/css/a-guide-to-flexbox/",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/flex",
      ),
    ),

    StylePropDef(
      scalaName = "flexBasis",
      domName = "flex-basis",
      valueType = "String",
      valueTraits = List("Length", "Auto[_]"),
      implName = "lengthAutoStyle",
      commentLines = List(
        "The CSS flex-basis property specifies the flex basis which is the initial",
        "main size of a flex item. The property determines the size of the",
        "content-box unless specified otherwise using box-sizing.",
        "",
        "@see https://css-tricks.com/snippets/css/a-guide-to-flexbox/",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/flex-basis",
      ),
    ),

    StylePropDef(
      scalaName = "flexDirection",
      domName = "flex-direction",
      valueType = "String",
      valueTraits = List("FlexDirection"),
      implName = "flexDirectionStyle",
      commentLines = List(
        "The CSS flex-direction property specifies how flex items are placed in the",
        "flex container defining the main axis and the direction (normal or reversed).",
        "",
        "Note that the value row and row-reverse are affected by the directionality",
        "of the flex container. If its dir attribute is ltr, row represents the",
        "horizontal axis oriented from the left to the right, and row-reverse from",
        "the right to the left; if the dir attribute is rtl, row represents the axis",
        "oriented from the right to the left, and row-reverse from the left to the",
        "right.",
        "",
        "@see https://css-tricks.com/snippets/css/a-guide-to-flexbox/",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction",
      ),
    ),

    StylePropDef(
      scalaName = "flexGrow",
      domName = "flex-grow",
      valueType = "Double",
      valueTraits = Nil,
      implName = "doubleStyle",
      commentLines = List(
        "The CSS flex-grow property specifies the flex grow factor of a flex item.",
        "",
        "Default value is 0.",
        "",
        "@see https://css-tricks.com/snippets/css/a-guide-to-flexbox/",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/flex-grow",
      ),
    ),

    StylePropDef(
      scalaName = "flexShrink",
      domName = "flex-shrink",
      valueType = "Double",
      valueTraits = Nil,
      implName = "doubleStyle",
      commentLines = List(
        "The CSS flex-shrink property specifies the flex shrink factor of a flex item.",
        "",
        "Default value is 1.",
        "",
        "@see https://css-tricks.com/snippets/css/a-guide-to-flexbox/",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/flex-shrink",
      ),
    ),

    StylePropDef(
      scalaName = "flexWrap",
      domName = "flex-wrap",
      valueType = "String",
      valueTraits = List("FlexWrap"),
      implName = "flexWrapStyle",
      commentLines = List(
        "The CSS flex-wrap property specifies whether the children are forced into",
        "a single line or if the items can be flowed on multiple lines.",
        "",
        "@see https://css-tricks.com/snippets/css/a-guide-to-flexbox/",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/flex-wrap",
      ),
    ),

    StylePropDef(
      scalaName = "float",
      domName = "float",
      valueType = "String",
      valueTraits = List("Float"),
      implName = "floatStyle",
      commentLines = List(
        "The float CSS property specifies that an element should be taken from the",
        "normal flow and placed along the left or right side of its container, where",
        "text and inline elements will wrap around it. A floating element is one",
        "where the computed value of float is not `none`.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/float",
      ),
    ),

    StylePropDef(
      scalaName = "font",
      domName = "font",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The font CSS property is either a shorthand property for setting font-style,",
        "font-variant, font-weight, font-size, line-height and font-family, or a way",
        "to set the element's font to a system font, using specific keywords.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/font",
      ),
    ),

    StylePropDef(
      scalaName = "fontFamily",
      domName = "font-family",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The font-family CSS property allows for a prioritized list of font family",
        "names and/or generic family names to be specified for the selected element.",
        "Unlike most other CSS properties, values are separated by a comma to indicate",
        "that they are alternatives. The browser will select the first font on the",
        "list that is installed on the computer, or that can be downloaded using the",
        "information provided by a @font-face at-rule.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/font-family",
      ),
    ),

    StylePropDef(
      scalaName = "fontFeatureSettings",
      domName = "font-feature-settings",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The font-feature-settings CSS property allows control over advanced",
        "typographic features in OpenType fonts.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/font-feature-settings",
      ),
    ),

    StylePropDef(
      scalaName = "fontSize",
      domName = "font-size",
      valueType = "String",
      valueTraits = List("FontSize"),
      implName = "fontSizeStyle",
      commentLines = List(
        "The font-size CSS property specifies the size of the font – specifically",
        "the desired height of glyphs from the font. Setting the font size may, in",
        "turn, change the size of other items, since it is used to compute the value",
        "of em and ex Length units.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/font-size",
      ),
    ),

    StylePropDef(
      scalaName = "fontSizeAdjust",
      domName = "font-size-adjust",
      valueType = "Double",
      valueTraits = List("None[_]"),
      implName = "noneStyle[_]",
      commentLines = List(
        "The font-size-adjust CSS property sets the size of lower-case letters",
        "relative to the current font size (which defines the size of upper-case",
        "letters).",
        "",
        "This is useful since the legibility of fonts, especially at small sizes, is",
        "determined more by the size of lowercase letters than by the size of capital",
        "letters. This can cause problems when the first-choice font-family is",
        "unavailable and its replacement has a significantly different aspect ratio",
        "(the ratio of the size of lowercase letters to the size of the font).",
        "",
        "Note: As of Dec 2021, only Firefox supports this",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/font-size-adjust",
      ),
    ),

    StylePropDef(
      scalaName = "fontStyle",
      domName = "font-style",
      valueType = "String",
      valueTraits = List("FontStyle"),
      implName = "fontStyleStyle",
      commentLines = List(
        "The font-style CSS property allows italic or oblique faces to be selected",
        "within a font-family.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/font-style",
      ),
    ),

    StylePropDef(
      scalaName = "fontWeight",
      domName = "font-weight",
      valueType = "String",
      valueTraits = List("FontWeight"),
      implName = "fontWeightStyle",
      commentLines = List(
        "The font-weight CSS property specifies the weight or boldness of the font.",
        "However, some fonts are not available in all weights; some are available",
        "only on normal and bold.",
        "",
        "Numeric font weights for fonts that provide more than just normal and bold.",
        "If the exact weight given is unavailable, then 600-900 use the closest",
        "available darker weight (or, if there is none, the closest available",
        "lighter weight), and 100-500 use the closest available lighter weight (or,",
        "if there is none, the closest available darker weight). This means that for",
        "fonts that provide only normal and bold, 100-500 are normal, and 600-900",
        "are bold.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight",
      ),
    ),

    StylePropDef(
      scalaName = "height",
      domName = "height",
      valueType = "String",
      valueTraits = List("Length", "Auto[_]"),
      implName = "lengthAutoStyle",
      commentLines = List(
        "The height CSS property specifies the height of the content area of an",
        "element. The content area is inside the padding, border, and margin of the",
        "element.",
        "",
        "The min-height and max-height properties override height.",
        "",
        "@see @see https://developer.mozilla.org/en-US/docs/Web/CSS/height",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/height",
      ),
    ),

    StylePropDef(
      scalaName = "justifyContent",
      domName = "justify-content",
      valueType = "String",
      valueTraits = List("JustifyContent"),
      implName = "justifyContentStyle",
      commentLines = List(
        "The CSS justify-content property defines how a browser distributes available",
        "space between and around elements when aligning flex items in the main-axis",
        "of the current line. The alignment is done after the lengths and auto margins",
        "are applied, meaning that, if there is at least one flexible element, with",
        "flex-grow different than 0, it will have no effect as there won't be any",
        "available space.",
        "",
        "@see https://css-tricks.com/snippets/css/a-guide-to-flexbox/",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/justify-content",
      ),
    ),

    StylePropDef(
      scalaName = "left",
      domName = "left",
      valueType = "String",
      valueTraits = List("Length", "Auto[_]"),
      implName = "lengthAutoStyle",
      commentLines = List(
        "The left CSS property specifies part of the position of positioned elements.",
        "",
        "For absolutely positioned elements (those with position: absolute or",
        "position: fixed), it specifies the distance between the left margin edge of",
        "the element and the left edge of its containing block.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/left",
      ),
    ),

    StylePropDef(
      scalaName = "letterSpacing",
      domName = "letter-spacing",
      valueType = "String",
      valueTraits = List("Normal[_]"),
      implName = "normalStyle[_]",
      commentLines = List(
        "The letter-spacing CSS property specifies spacing behavior between text",
        "characters.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/letter-spacing",
      ),
    ),

    StylePropDef(
      scalaName = "lineHeight",
      domName = "line-height",
      valueType = "String",
      valueTraits = List("Length", "Normal[_]"),
      implName = "lengthNormalStyle",
      commentLines = List(
        "On block level elements, the line-height CSS property specifies the minimal",
        "height of line boxes within the element.",
        "",
        "On non-replaced inline elements, line-height specifies the height that is",
        "used in the calculation of the line box height.",
        "",
        "On replaced inline elements, like buttons or other input element,",
        "line-height has no effect.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/line-height",
      ),
    ),

    StylePropDef(
      scalaName = "listStyle",
      domName = "list-style",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The list-style CSS property is a shorthand property for setting",
        "list-style-type, list-style-image and list-style-position.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/list-style",
      ),
    ),

    StylePropDef(
      scalaName = "listStyleImage",
      domName = "list-style-image",
      valueType = "String",
      valueTraits = List("Url", "None[_]"),
      implName = "urlNoneStyle",
      commentLines = List(
        "The list-style-image CSS property sets the image that will be used as the",
        "list item marker.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/list-style-image",
      ),
    ),

    StylePropDef(
      scalaName = "listStylePosition",
      domName = "list-style-position",
      valueType = "String",
      valueTraits = List("ListStylePosition"),
      implName = "listStylePositionStyle",
      commentLines = List(
        "The list-style-position CSS property specifies the position of the marker",
        "box in the principal block box.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/list-style-position",
      ),
    ),

    StylePropDef(
      scalaName = "listStyleType",
      domName = "list-style-type",
      valueType = "String",
      valueTraits = List("ListStyleType"),
      implName = "listStyleTypeStyle",
      commentLines = List(
        "The list-style-type CSS property sets the marker (such as a disc, character,",
        "or custom counter style) of a list item element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/list-style-type",
      ),
    ),

    StylePropDef(
      scalaName = "margin",
      domName = "margin",
      valueType = "String",
      valueTraits = List("Length", "Auto[_]"),
      implName = "lengthAutoStyle",
      commentLines = List(
        "The margin CSS property sets the margin for all four sides. It is a",
        "shorthand to avoid setting each side separately with the other margin",
        "properties: margin-top, margin-right, margin-bottom and margin-left.",
        "",
        "Negative values are also allowed.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/margin",
      ),
    ),

    StylePropDef(
      scalaName = "marginTop",
      domName = "margin-top",
      valueType = "String",
      valueTraits = List("Length", "Auto[_]"),
      implName = "lengthAutoStyle",
      commentLines = List(
        "The margin-top CSS property of an element sets the margin space required on",
        "the top of an element. A negative value is also allowed.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/margin-top",
      ),
    ),

    StylePropDef(
      scalaName = "marginRight",
      domName = "margin-right",
      valueType = "String",
      valueTraits = List("Length", "Auto[_]"),
      implName = "lengthAutoStyle",
      commentLines = List(
        "The margin-right CSS property of an element sets the margin space required on",
        "the right of an element. A negative value is also allowed.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/margin-right",
      ),
    ),

    StylePropDef(
      scalaName = "marginBottom",
      domName = "margin-bottom",
      valueType = "String",
      valueTraits = List("Length", "Auto[_]"),
      implName = "lengthAutoStyle",
      commentLines = List(
        "The margin-bottom CSS property of an element sets the margin space required on",
        "the bottom of an element. A negative value is also allowed.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/margin-bottom",
      ),
    ),

    StylePropDef(
      scalaName = "marginLeft",
      domName = "margin-left",
      valueType = "String",
      valueTraits = List("Length", "Auto[_]"),
      implName = "lengthAutoStyle",
      commentLines = List(
        "The margin-left CSS property of an element sets the margin space required on",
        "the left of an element. A negative value is also allowed.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/margin-left",
      ),
    ),

    StylePropDef(
      scalaName = "mask",
      domName = "mask",
      valueType = "String",
      valueTraits = List("Url", "None[_]"),
      implName = "urlNoneStyle",
      commentLines = List(
        "If the value is a URI value, the element pointed to by the URI is used as",
        "an SVG mask.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/mask",
      ),
    ),

    StylePropDef(
      scalaName = "maxHeight",
      domName = "max-height",
      valueType = "String",
      valueTraits = List("MaxLength"),
      implName = "maxLengthStyle",
      commentLines = List(
        "The max-height CSS property is used to set the maximum height of a given",
        "element. It prevents the used value of the height property from becoming",
        "larger than the value specified for max-height.",
        "",
        "max-height overrides height, but min-height overrides max-height.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/max-height",
      ),
    ),

    StylePropDef(
      scalaName = "maxWidth",
      domName = "max-width",
      valueType = "String",
      valueTraits = List("MaxLength"),
      implName = "maxLengthStyle",
      commentLines = List(
        "The max-width CSS property is used to set the maximum width of a given",
        "element. It prevents the used value of the width property from becoming",
        "larger than the value specified for max-width.",
        "",
        "max-width overrides width, but min-width overrides max-width.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/max-width",
      ),
    ),

    StylePropDef(
      scalaName = "minHeight",
      domName = "min-height",
      valueType = "String",
      valueTraits = List("MinLength"),
      implName = "minLengthStyle",
      commentLines = List(
        "The min-height CSS property is used to set the minimum height of a given",
        "element. It prevents the used value of the height property from becoming",
        "smaller than the value specified for min-height.",
        "",
        "The value of min-height overrides both max-height and height.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/min-height",
      ),
    ),

    StylePropDef(
      scalaName = "minWidth",
      domName = "min-width",
      valueType = "String",
      valueTraits = List("MinLength"),
      implName = "minLengthStyle",
      commentLines = List(
        "The min-width CSS property is used to set the minimum width of a given",
        "element. It prevents the used value of the width property from becoming",
        "smaller than the value specified for min-width.",
        "",
        "The value of min-width overrides both max-width and width.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/min-width",
      ),
    ),

    StylePropDef(
      scalaName = "opacity",
      domName = "opacity",
      valueType = "Double",
      valueTraits = Nil,
      implName = "doubleStyle",
      commentLines = List(
        "The opacity CSS property specifies the transparency of an element, that is,",
        "the degree to which the background behind the element is overlaid.",
        "",
        "The value applies to the element as a whole, including its contents, even",
        "though the value is not inherited by child elements. Thus, an element and",
        "its contained children all have the same opacity relative to the element's",
        "background, even if the element and its children have different opacities",
        "relative to one another.",
        "",
        "Using this property with a value different than 1 places the element in a",
        "new stacking context.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/opacity",
      ),
    ),

    StylePropDef(
      scalaName = "orphans",
      domName = "orphans",
      valueType = "Int",
      valueTraits = Nil,
      implName = "intStyle",
      commentLines = List(
        "The orphans CSS property refers to the minimum number of lines in a block",
        "container that must be left at the bottom of the page. This property is",
        "normally used to control how page breaks occur.",
        "",
        "Note: Firefox does not support this property",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/orphans",
      ),
    ),

    StylePropDef(
      scalaName = "outline",
      domName = "outline",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The CSS outline property is a shorthand property for setting one or more of",
        "the individual outline properties outline-style, outline-width and",
        "outline-color in a single rule. In most cases the use of this shortcut is",
        "preferable and more convenient.",
        "",
        "Outlines do not take up space, they are drawn above the content.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/outline",
      ),
    ),

    StylePropDef(
      scalaName = "outlineStyle",
      domName = "outline-style",
      valueType = "String",
      valueTraits = List("Line"),
      implName = "lineStyle",
      commentLines = List(
        "The outline-style CSS property is used to set the style of the outline of",
        "an element. An outline is a line that is drawn around elements, outside the",
        "border edge, to make the element stand out.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/outline-style",
      ),
    ),

    StylePropDef(
      scalaName = "outlineWidth",
      domName = "outline-width",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The outline-width CSS property is used to set the width of the outline of",
        "an element. An outline is a line that is drawn around elements, outside the",
        "border edge, to make the element stand out.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/outline-width",
      ),
    ),

    StylePropDef(
      scalaName = "outlineColor",
      domName = "outline-color",
      valueType = "String",
      valueTraits = List("Color"),
      implName = "colorStyle",
      commentLines = List(
        "The outline-color CSS property sets the color of the outline of an element.",
        "An outline is a line that is drawn around elements, outside the border edge,",
        "to make the element stand out.",
        "",
        "Note: \"invert\" is a special outline color you can use for high contrast.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/outline-color",
      ),
    ),

    StylePropDef(
      scalaName = "overflow",
      domName = "overflow",
      valueType = "String",
      valueTraits = List("Overflow"),
      implName = "overflowStyle",
      commentLines = List(
        "The overflow CSS property specifies whether to clip content, render scroll",
        "bars or display overflow content of a block-level element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/overflow",
      ),
    ),

    StylePropDef(
      scalaName = "overflowX",
      domName = "overflow-x",
      valueType = "String",
      valueTraits = List("Overflow"),
      implName = "overflowStyle",
      commentLines = List(
        "The overflow-x CSS property specifies whether to clip content, render a",
        "scroll bar or display overflow content of a block-level element, when it",
        "overflows at the left and right edges.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x",
      ),
    ),

    StylePropDef(
      scalaName = "overflowY",
      domName = "overflow-y",
      valueType = "String",
      valueTraits = List("Overflow"),
      implName = "overflowStyle",
      commentLines = List(
        "The overflow-y CSS property specifies whether to clip content, render a",
        "scroll bar, or display overflow content of a block-level element, when it",
        "overflows at the top and bottom edges.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y",
      ),
    ),

    StylePropDef(
      scalaName = "overflowWrap",
      domName = "overflow-wrap",
      valueType = "String",
      valueTraits = List("OverflowWrap"),
      implName = "overflowWrapStyle",
      commentLines = List(
        "The overflow-wrap CSS property specifies whether or not the browser should",
        "insert line breaks within words to prevent text from overflowing its",
        "content box.",
        "",
        "Alias for: [[wordWrap]]",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-wrap",
      ),
    ),

    StylePropDef(
      scalaName = "padding",
      domName = "padding",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The padding CSS property sets the required padding space on all sides of an",
        "element. The padding area is the space between the content of the element",
        "and its border. Negative values are not allowed.",
        "",
        "The padding property is a shorthand to avoid setting each side separately",
        "(padding-top, padding-right, padding-bottom, padding-left).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/padding",
      ),
    ),

    StylePropDef(
      scalaName = "paddingTop",
      domName = "padding-top",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The padding-top CSS property of an element sets the padding space required",
        "on the top of an element. The padding area is the space between the content",
        "of the element and its border. Contrary to margin-top values, negative",
        "values of padding-top are invalid.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/padding-top",
      ),
    ),

    StylePropDef(
      scalaName = "paddingRight",
      domName = "padding-right",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The padding-right CSS property of an element sets the padding space",
        "required on the right side of an element. The padding area is the space",
        "between the content of the element and its border. Negative values are not",
        "allowed.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/padding-right",
      ),
    ),

    StylePropDef(
      scalaName = "paddingBottom",
      domName = "padding-bottom",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The padding-bottom CSS property of an element sets the height of the padding",
        "area at the bottom of an element. The padding area is the space between the",
        "content of the element and it's border. Contrary to margin-bottom values,",
        "negative values of padding-bottom are invalid.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/padding-bottom",
      ),
    ),

    StylePropDef(
      scalaName = "paddingLeft",
      domName = "padding-left",
      valueType = "String",
      valueTraits = List("Length"),
      implName = "lengthStyle",
      commentLines = List(
        "The padding-left CSS property of an element sets the padding space required",
        "on the left side of an element. The padding area is the space between the",
        "content of the element and it's border. A negative value is not allowed.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/padding-left",
      ),
    ),

    StylePropDef(
      scalaName = "pageBreakAfter",
      domName = "page-break-after",
      valueType = "String",
      valueTraits = List("PageBreak"),
      implName = "pageBreakStyle",
      commentLines = List(
        "The page-break-after CSS property adjusts page breaks after the current",
        "element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/page-break-after",
      ),
    ),

    StylePropDef(
      scalaName = "pageBreakBefore",
      domName = "page-break-before",
      valueType = "String",
      valueTraits = List("PageBreak"),
      implName = "pageBreakStyle",
      commentLines = List(
        "The page-break-before CSS property adjusts page breaks before the current",
        "element.",
        "",
        "This properties applies to block elements that generate a box. It won't",
        "apply on an empty div that won't generate a box.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/page-break-before",
      ),
    ),

    StylePropDef(
      scalaName = "pageBreakInside",
      domName = "page-break-inside",
      valueType = "String",
      valueTraits = List("PageBreak"),
      implName = "pageBreakStyle",
      commentLines = List(
        "The page-break-inside CSS property adjusts page breaks inside the current",
        "element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/page-break-inside",
      ),
    ),

    StylePropDef(
      scalaName = "perspective",
      domName = "perspective",
      valueType = "String",
      valueTraits = List("None[_]"),
      implName = "noneStyle[_]",
      commentLines = List(
        "The perspective CSS property determines the distance between the z=0 plane",
        "and the user in order to give to the 3D-positioned element some perspective.",
        "Each 3D element with z>0 becomes larger; each 3D-element with z<0 becomes",
        "smaller. The strength of the effect is determined by the value of this",
        "property.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/perspective",
      ),
    ),

    StylePropDef(
      scalaName = "perspectiveOrigin",
      domName = "perspective-origin",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The perspective-origin CSS property determines the position the viewer is",
        "looking at. It is used as the vanishing point by the perspective property.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/perspective-origin",
      ),
    ),

    StylePropDef(
      scalaName = "pointerEvents",
      domName = "pointer-events",
      valueType = "String",
      valueTraits = List("PointerEvents"),
      implName = "pointerEventsStyle",
      commentLines = List(
        "The CSS property pointer-events allows authors to control under what",
        "circumstances (if any) a particular graphic element can become the target",
        "of mouse events. When this property is unspecified, the same characteristics",
        "of the visiblePainted value apply to SVG content.",
        "",
        "In addition to indicating that the element is not the target of mouse events,",
        "the value none instructs the mouse event to go \"through\" the element and",
        "target whatever is \"underneath\" that element instead.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/pointer-events",
      ),
    ),

    StylePropDef(
      scalaName = "position",
      domName = "position",
      valueType = "String",
      valueTraits = List("Position"),
      implName = "positionStyle",
      commentLines = List(
        "The position CSS property chooses alternative rules for positioning elements,",
        "designed to be useful for scripted animation effects.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/position",
      ),
    ),

    StylePropDef(
      scalaName = "quotes",
      domName = "quotes",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The quotes CSS property sets how the browser should render quotation marks",
        "that are added using the open-quotes or close-quotes values of the CSS",
        "content property.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/quotes",
      ),
    ),

    StylePropDef(
      scalaName = "resize",
      domName = "resize",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The resize CSS property sets whether an element is resizable, and if so,",
        "in which direction(s).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/resize",
      ),
    ),

    StylePropDef(
      scalaName = "right",
      domName = "right",
      valueType = "String",
      valueTraits = List("Length", "Auto[_]"),
      implName = "lengthAutoStyle",
      commentLines = List(
        "The right CSS property specifies part of the position of positioned elements.",
        "",
        "For absolutely positioned elements (those with position: absolute or",
        "position: fixed), it specifies the distance between the right margin edge",
        "of the element and the right edge of its containing block.",
        "",
        "The right property has no effect on non-positioned elements.",
        "",
        "When both the right CSS property and the left CSS property are defined, the",
        "position of the element is overspecified. In that case, the left value has",
        "precedence when the container is left-to-right (that is that the right",
        "computed value is set to -left), and the right value has precedence when",
        "the container is right-to-left (that is that the left computed value is set",
        "to -right).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/right",
      ),
    ),

    StylePropDef(
      scalaName = "tableLayout",
      domName = "table-layout",
      valueType = "String",
      valueTraits = List("TableLayout"),
      implName = "tableLayoutStyle",
      commentLines = List(
        "The table-layout CSS property sets the algorithm used to lay out <table>",
        "cells, rows, and columns.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/table-layout",
      ),
    ),

    StylePropDef(
      scalaName = "textAlign",
      domName = "text-align",
      valueType = "String",
      valueTraits = List("TextAlign"),
      implName = "textAlignStyle",
      commentLines = List(
        "The text-align CSS property describes how inline content like text is",
        "aligned in its parent block element. text-align does not control the",
        "alignment of block elements itself, only their inline content.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/text-align",
      ),
    ),

    StylePropDef(
      scalaName = "textAlignLast",
      domName = "text-align-last",
      valueType = "String",
      valueTraits = List("TextAlign"),
      implName = "textAlignStyle",
      commentLines = List(
        "The text-align-last CSS property describes how the last line of a block or",
        "a line, right before a forced line break, is aligned.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/text-align-last",
      ),
    ),

    StylePropDef(
      scalaName = "textDecoration",
      domName = "text-decoration",
      valueType = "String",
      valueTraits = List("TextDecoration"),
      implName = "textDecorationStyle",
      commentLines = List(
        "The text-decoration CSS property is used to set the text formatting to",
        "underline, overline, line-through or blink.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/text-decoration",
      ),
    ),

    StylePropDef(
      scalaName = "textIndent",
      domName = "text-indent",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The text-indent CSS property specifies how much horizontal space should be",
        "left before the beginning of the first line of the text content of an element.",
        "Horizontal spacing is with respect to the left (or right, for right-to-left",
        "layout) edge of the containing block element's box.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/text-indent",
      ),
    ),

    StylePropDef(
      scalaName = "textOverflow",
      domName = "text-overflow",
      valueType = "String",
      valueTraits = List("TextOverflow"),
      implName = "textOverflowStyle",
      commentLines = List(
        "The text-overflow CSS property determines how overflowed content that is",
        "not displayed is signaled to the users. It can be clipped, or display an",
        "ellipsis ('…', U+2026 HORIZONTAL ELLIPSIS) or a Web author-defined string.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/text-overflow",
      ),
    ),

    StylePropDef(
      scalaName = "textShadow",
      domName = "text-shadow",
      valueType = "String",
      valueTraits = List("None[_]"),
      implName = "noneStyle[_]",
      commentLines = List(
        "The text-shadow CSS property adds shadows to text. It accepts a comma-separated",
        "list of shadows to be applied to the text and text-decorations of the element.",
        "",
        "Each shadow is specified as an offset from the text, along with optional",
        "color and blur radius values.",
        "",
        "Multiple shadows are applied front-to-back, with the first-specified shadow",
        "on top.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/text-shadow",
      ),
    ),

    StylePropDef(
      scalaName = "textTransform",
      domName = "text-transform",
      valueType = "String",
      valueTraits = List("TextTransform"),
      implName = "textTransformStyle",
      commentLines = List(
        "The text-transform CSS property specifies how to capitalize an element's",
        "text. It can be used to make text appear in all-uppercase or all-lowercase,",
        "or with each word capitalized.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/text-transform",
      ),
    ),

    StylePropDef(
      scalaName = "textUnderlinePosition",
      domName = "text-underline-position",
      valueType = "String",
      valueTraits = List("TextUnderlinePosition"),
      implName = "textUnderlinePositionStyle",
      commentLines = List(
        "The CSS text-underline-position property specifies the position of the",
        "underline which is set using the text-decoration property underline value.",
        "",
        "This property inherits and is not reset by the text-decoration shorthand,",
        "allowing to easily set it globally for a given document.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/text-underline-position",
      ),
    ),

    StylePropDef(
      scalaName = "top",
      domName = "top",
      valueType = "String",
      valueTraits = List("Length", "Auto[_]"),
      implName = "lengthAutoStyle",
      commentLines = List(
        "The top CSS property specifies part of the position of positioned elements.",
        "It has no effect on non-positioned elements.",
        "",
        "For absolutely positioned elements (those with position: absolute or",
        "position: fixed), it specifies the distance between the top margin edge of",
        "the element and the top edge of its containing block.",
        "",
        "For relatively positioned elements (those with position: relative), it",
        "specifies the amount the element is moved below its normal position.",
        "",
        "When both top and bottom are specified, the element position is",
        "over-constrained and the top property has precedence: the computed value",
        "of bottom is set to -top, while its specified value is ignored.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/top",
      ),
    ),

    StylePropDef(
      scalaName = "transform",
      domName = "transform",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The CSS transform property lets you modify the coordinate space of the CSS",
        "visual formatting model. Using it, elements can be translated, rotated,",
        "scaled, and skewed according to the values set.",
        "",
        "If the property has a value different than none, a stacking context will be",
        "created. In that case the object will act as a containing block for",
        "position: fixed elements that it contains.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/transform",
      ),
    ),

    StylePropDef(
      scalaName = "transformOrigin",
      domName = "transform-origin",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The transform-origin CSS property lets you modify the origin for",
        "transformations of an element. For example, the transform-origin of the",
        "rotate() function is the centre of rotation. (This property is applied by",
        "first translating the element by the negated value of the property, then",
        "applying the element's transform, then translating by the property value.)",
        "",
        "Not explicitly set values are reset to their corresponding values.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/transform-origin",
      ),
    ),

    StylePropDef(
      scalaName = "transformStyle",
      domName = "transform-style",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The transform-style CSS property determines if the children of the element",
        "are positioned in the 3D-space or are flattened in the plane of the element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/transform-style",
      ),
    ),

    StylePropDef(
      scalaName = "transition",
      domName = "transition",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The CSS transition property is a shorthand property for transition-property,",
        "transition-duration, transition-timing-function, and transition-delay. It",
        "allows to define the transition between two states of an element. Different",
        "states may be defined using pseudo-classes like :hover or :active or",
        "dynamically set using JavaScript.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/transition",
      ),
    ),

    StylePropDef(
      scalaName = "transitionDelay",
      domName = "transition-delay",
      valueType = "String",
      valueTraits = List("Time"),
      implName = "timeStyle",
      commentLines = List(
        "The transition-delay CSS property specifies the amount of time to wait",
        "between a change being requested to a property that is to be transitioned",
        "and the start of the transition effect.",
        "",
        "A value of 0s, or 0ms, indicates that the property will begin to animate its",
        "transition immediately when the value changes; positive values will delay",
        "the start of the transition effect for the corresponding number of seconds.",
        "Negative values cause the transition to begin immediately, but to cause the",
        "transition to seem to begin partway through the animation effect.",
        "",
        "You may specify multiple delays; each delay will be applied to the",
        "corresponding property as specified by the transition-property property,",
        "which acts as a master list. If there are fewer delays specified than in the",
        "master list, missing values are set to the initial value (0s). If there are",
        "more delays, the list is simply truncated to the right size. In both case",
        "the CSS declaration stays valid.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/transition-delay",
      ),
    ),

    StylePropDef(
      scalaName = "transitionDuration",
      domName = "transition-duration",
      valueType = "String",
      valueTraits = List("Time"),
      implName = "timeStyle",
      commentLines = List(
        "The transition-duration CSS property specifies the number of seconds or",
        "milliseconds a transition animation should take to complete. By default,",
        "the value is 0s, meaning that no animation will occur.",
        "",
        "You may specify multiple durations; each duration will be applied to the",
        "corresponding property as specified by the transition-property property,",
        "which acts as a master list. If there are fewer durations specified than in",
        "the master list, the user agent repeat the list of durations. If there are",
        "more durations, the list is simply truncated to the right size. In both",
        "case the CSS declaration stays valid.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/transition-duration",
      ),
    ),

    StylePropDef(
      scalaName = "transitionTimingFunction",
      domName = "transition-timing-function",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The CSS transition-timing-function property is used to describe how the",
        "intermediate values of the CSS properties being affected by a transition",
        "effect are calculated. This in essence lets you establish an acceleration",
        "curve, so that the speed of the transition can vary over its duration.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/transition-timing-function",
      ),
    ),

    StylePropDef(
      scalaName = "transitionProperty",
      domName = "transition-property",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The transition-property CSS property is used to specify the names of CSS",
        "properties to which a transition effect should be applied.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/transition-property",
      ),
    ),

    StylePropDef(
      scalaName = "unicodeBidi",
      domName = "unicode-bidi",
      valueType = "String",
      valueTraits = Nil,
      implName = "stringStyle",
      commentLines = List(
        "The unicode-bidi CSS property together with the `direction` property relates",
        "to the handling of bidirectional text in a document. For example, if a block",
        "of text contains both left-to-right and right-to-left text then the",
        "user-agent uses a complex Unicode algorithm to decide how to display the",
        "text. This property overrides this algorithm and allows the developer to",
        "control the text embedding.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/unicode-bidi",
      ),
    ),

    StylePropDef(
      scalaName = "verticalAlign",
      domName = "vertical-align",
      valueType = "String",
      valueTraits = List("VerticalAlign"),
      implName = "verticalAlignStyle",
      commentLines = List(
        "The vertical-align CSS property specifies the vertical alignment of an",
        "inline or table-cell box. It does not apply to block-level elements.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align",
      ),
    ),

    StylePropDef(
      scalaName = "visibility",
      domName = "visibility",
      valueType = "String",
      valueTraits = List("Visibility"),
      implName = "visibilityStyle",
      commentLines = List(
        "The visibility CSS property shows or hides an element without changing the",
        "layout of a document. The property can also hide rows or columns in a <table>.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/visibility",
      ),
    ),

    StylePropDef(
      scalaName = "width",
      domName = "width",
      valueType = "String",
      valueTraits = List("Length", "Auto[_]"),
      implName = "lengthAutoStyle",
      commentLines = List(
        "The width CSS property specifies the width of the content area of an element.",
        "The content area is inside the padding, border, and margin of the element.",
        "",
        "The min-width and max-width properties override width.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/width",
      ),
    ),

    StylePropDef(
      scalaName = "whiteSpace",
      domName = "white-space",
      valueType = "String",
      valueTraits = List("WhiteSpace"),
      implName = "whiteSpaceStyle",
      commentLines = List(
        "The white-space CSS property is used to to describe how whitespace inside",
        "the element is handled.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/white-space",
      ),
    ),

    StylePropDef(
      scalaName = "widows",
      domName = "widows",
      valueType = "Int",
      valueTraits = Nil,
      implName = "intStyle",
      commentLines = List(
        "The widows CSS property defines how many minimum lines must be left on top",
        "of a new page, on a paged media. In typography, a widow is the last line of",
        "a paragraph appearing alone at the top of a page. Setting the widows property",
        "allows to prevent widows to be left.",
        "",
        "On a non-paged media, like screen, the widows CSS property has no effect.",
        "",
        "Note: Firefox does not support this property.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/widows",
      ),
    ),

    StylePropDef(
      scalaName = "wordBreak",
      domName = "word-break",
      valueType = "String",
      valueTraits = List("WordBreak"),
      implName = "wordBreakStyle",
      commentLines = List(
        "The word-break CSS property specifies whether or not the browser should",
        "insert line breaks wherever the text would otherwise overflow its content",
        "box.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/word-break",
      ),
    ),

    StylePropDef(
      scalaName = "wordSpacing",
      domName = "word-spacing",
      valueType = "String",
      valueTraits = List("Normal[_]"),
      implName = "normalStyle[_]",
      commentLines = List(
        "The word-spacing CSS property specifies spacing behavior between tags and",
        "words.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/word-spacing",
      ),
    ),

    StylePropDef(
      scalaName = "zIndex",
      domName = "z-index",
      valueType = "Int",
      valueTraits = List("Auto[_]"),
      implName = "autoStyle[_]",
      commentLines = List(
        "The z-index CSS property specifies the z-order of an element and its",
        "descendants. When elements overlap, z-order determines which one covers the",
        "other. An element with a larger z-index generally covers an element with a",
        "lower one.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/CSS/z-index",
      ),
    ),

  )
  
}
