package com.raquo.domtypes.defs.attrs

import com.raquo.domtypes.common.{AttrDef, SvgTagType}

object SvgAttrDefs {

  val defs: List[AttrDef] = List(

    AttrDef(
      tagType = SvgTagType,
      scalaName = "accentHeight",
      domName = "accent-height",
      namespace = None,
      scalaValueType = "Double",
      codec = "DoubleAsString",
      reflectedProp = None,
      commentLines = List(
        "This attribute defines the distance from the origin to the top of accent characters,",
        "measured by a distance within the font coordinate system.",
        "If the attribute is not specified, the effect is as if the attribute",
        "were set to the value of the ascent attribute.",
        "",
        "Value 	`<number>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/accent-height",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "accumulate",
      domName = "accumulate",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "This attribute controls whether or not the animation is cumulative.",
        "It is frequently useful for repeated animations to build upon the previous results,",
        "accumulating with each iteration. This attribute said to the animation if the value is added to",
        "the previous animated attribute's value on each iteration.",
        "",
        "Value 	none | sum",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/accumulate",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "additive",
      domName = "additive",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "This attribute controls whether or not the animation is additive.",
        "It is frequently useful to define animation as an offset or delta",
        "to an attribute's value, rather than as absolute values. This",
        "attribute said to the animation if their values are added to the",
        "original animated attribute's value.",
        "",
        "Value 	replace | sum",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/additive",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "alignmentBaseline",
      domName = "alignment-baseline",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The alignment-baseline attribute specifies how an object is aligned",
        "with respect to its parent. This property specifies which baseline",
        "of this element is to be aligned with the corresponding baseline of",
        "the parent. For example, this allows alphabetic baselines in Roman",
        "text to stay aligned across font size changes. It defaults to the",
        "baseline with the same name as the computed value of the",
        "alignment-baseline property. As a presentation attribute, it also",
        "can be used as a property directly inside a CSS stylesheet, see css",
        "alignment-baseline for further information.",
        "",
        "Value: 	auto | baseline | before-edge | text-before-edge | middle | central | after-edge |",
        "text-after-edge | ideographic | alphabetic | hanging | mathematical | inherit",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/alignment-baseline",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "ascent",
      domName = "ascent",
      namespace = None,
      scalaValueType = "Double",
      codec = "DoubleAsString",
      reflectedProp = None,
      commentLines = List(
        "This attribute defines the maximum unaccented depth of the font",
        "within the font coordinate system. If the attribute is not specified,",
        "the effect is as if the attribute were set to the vert-origin-y value",
        "for the corresponding font.",
        "",
        "Value 	`<number>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/ascent",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "attributeName",
      domName = "attributeName",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "This attribute indicates the name of the attribute in the parent element",
        "that is going to be changed during an animation.",
        "",
        "Value 	`<attributeName>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/attributeName",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "attributeType",
      domName = "attributeType",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "This attribute specifies the namespace in which the target attribute",
        "and its associated values are defined.",
        "",
        "Value 	CSS | XML | auto",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/attributeType",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "azimuth",
      domName = "azimuth",
      namespace = None,
      scalaValueType = "Double",
      codec = "DoubleAsString",
      reflectedProp = None,
      commentLines = List(
        "The azimuth attribute represent the direction angle for the light",
        "source on the XY plane (clockwise), in degrees from the x axis.",
        "If the attribute is not specified, then the effect is as if a",
        "value of 0 were specified.",
        "",
        "Value 	`<number>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/azimuth",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "baseFrequency",
      domName = "baseFrequency",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The baseFrequency attribute represent The base frequencies parameter",
        "for the noise function of the `<feturbulence>` primitive. If two `<number>`s",
        "are provided, the first number represents a base frequency in the X",
        "direction and the second value represents a base frequency in the Y direction.",
        "If one number is provided, then that value is used for both X and Y.",
        "Negative values are forbidden.",
        "If the attribute is not specified, then the effect is as if a value",
        "of 0 were specified.",
        "",
        "Value 	`<number-optional-number>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/baseFrequency",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "baselineShift",
      domName = "baseline-shift",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The baseline-shift attribute allows repositioning of the dominant-baseline",
        "relative to the dominant-baseline of the parent text content element.",
        "The shifted object might be a sub- or superscript.",
        "As a presentation attribute, it also can be used as a property directly",
        "inside a CSS stylesheet, see css baseline-shift for further information.",
        "",
        "Value 	auto | baseline | sup | sub | <percentage> | <length> | inherit",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/baseline-shift",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "begin",
      domName = "begin",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "This attribute defines when an animation should begin.",
        "The attribute value is a semicolon separated list of values. The interpretation",
        "of a list of start times is detailed in the SMIL specification in \"Evaluation",
        "of begin and end time lists\". Each individual value can be one of the following:",
        "`<offset-value>`, `<syncbase-value>`, `<event-value>`, `<repeat-value>`, `<accessKey-value>`,",
        "`<wallclock-sync-value>` or the keyword indefinite.",
        "",
        "Value 	`<begin-value-list>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/begin",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "bias",
      domName = "bias",
      namespace = None,
      scalaValueType = "Double",
      codec = "DoubleAsString",
      reflectedProp = None,
      commentLines = List(
        "The bias attribute shifts the range of the filter. After applying the kernelMatrix",
        "of the `<feConvolveMatrix>` element to the input image to yield a number and applied",
        "the divisor attribute, the bias attribute is added to each component. This allows",
        "representation of values that would otherwise be clamped to 0 or 1.",
        "If bias is not specified, then the effect is as if a value of 0 were specified.",
        "",
        "Value 	`<number>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/bias",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "calcMode",
      domName = "calcMode",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "This attribute specifies the interpolation mode for the animation. The default",
        "mode is linear, however if the attribute does not support linear interpolation",
        "(e.g. for strings), the calcMode attribute is ignored and discrete interpolation is used.",
        "",
        "Value 	discrete | linear | paced | spline",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/calcMode",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "clip",
      domName = "clip",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The clip attribute has the same parameter values as defined for the css clip property.",
        "Unitless values, which indicate current user coordinates, are permitted on the coordinate",
        "values on the `<shape>`. The value of auto defines a clipping path along the bounds of",
        "the viewport created by the given element.",
        "As a presentation attribute, it also can be used as a property directly inside a",
        "CSS stylesheet, see css clip for further information.",
        "",
        "Value 	`auto | <shape> | inherit`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/clip",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "clipPathAttr",
      domName = "clip-path",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The clip-path attribute bind the element is applied to with a given `<clipPath>` element",
        "As a presentation attribute, it also can be used as a property directly inside a CSS stylesheet",
        "",
        "Value 	`<FuncIRI> | none | inherit`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/clip-path",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "clipPathUnits",
      domName = "clipPathUnits",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The clipPathUnits attribute defines the coordinate system for the contents",
        "of the `<clipPath>` element. the clipPathUnits attribute is not specified,",
        "then the effect is as if a value of userSpaceOnUse were specified.",
        "Note that values defined as a percentage inside the content of the `<clipPath>`",
        "are not affected by this attribute. It means that even if you set the value of",
        "maskContentUnits to objectBoundingBox, percentage values will be calculated as",
        "if the value of the attribute were userSpaceOnUse.",
        "",
        "Value 	userSpaceOnUse | objectBoundingBox",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/clipPathUnits",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "clipRule",
      domName = "clip-rule",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The clip-rule attribute only applies to graphics elements that are contained within a",
        "`<clipPath>` element. The clip-rule attribute basically works as the fill-rule attribute,",
        "except that it applies to `<clipPath>` definitions.",
        "",
        "Value 	nonezero | evenodd | inherit",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/clip-rule",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "color",
      domName = "color",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The color attribute is used to provide a potential indirect value (currentColor)",
        "for the fill, stroke, stop-color, flood-color and lighting-color attributes.",
        "As a presentation attribute, it also can be used as a property directly inside a CSS",
        "stylesheet, see css color for further information.",
        "",
        "Value 	`<color> | inherit`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/color",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "colorInterpolation",
      domName = "color-interpolation",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The color-interpolation attribute specifies the color space for gradient interpolations,",
        "color animations and alpha compositing.When a child element is blended into a background,",
        "the value of the color-interpolation attribute on the child determines the type of",
        "blending, not the value of the color-interpolation on the parent. For gradients which",
        "make use of the xlink:href attribute to reference another gradient, the gradient uses",
        "the color-interpolation attribute value from the gradient element which is directly",
        "referenced by the fill or stroke attribute. When animating colors, color interpolation",
        "is performed according to the value of the color-interpolation attribute on the element",
        "being animated.",
        "As a presentation attribute, it also can be used as a property directly inside a CSS",
        "stylesheet, see css color-interpolation for further information",
        "",
        "Value 	auto | sRGB | linearRGB | inherit",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/color-interpolation",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "colorInterpolationFilters",
      domName = "color-interpolation-filters",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The color-interpolation-filters attribute specifies the color space for imaging operations",
        "performed via filter effects. Note that color-interpolation-filters has a different",
        "initial value than color-interpolation. color-interpolation-filters has an initial",
        "value of linearRGB, whereas color-interpolation has an initial value of sRGB. Thus,",
        "in the default case, filter effects operations occur in the linearRGB color space,",
        "whereas all other color interpolations occur by default in the sRGB color space.",
        "As a presentation attribute, it also can be used as a property directly inside a",
        "CSS stylesheet, see css color-interpolation-filters for further information",
        "",
        "Value 	auto | sRGB | linearRGB | inherit",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/color-interpolation-filters",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "colorProfileAttr",
      domName = "color-profile",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The color-profile attribute is used to define which color profile a raster image",
        "included through the `<image>` element should use. As a presentation attribute, it",
        "also can be used as a property directly inside a CSS stylesheet, see css color-profile",
        "for further information.",
        "",
        "Value 	`auto | sRGB | <name> | <IRI> | inherit`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/color-profile",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "colorRendering",
      domName = "color-rendering",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The color-rendering attribute provides a hint to the SVG user agent about how to",
        "optimize its color interpolation and compositing operations. color-rendering",
        "takes precedence over color-interpolation-filters. For example, assume color-rendering:",
        "optimizeSpeed and color-interpolation-filters: linearRGB. In this case, the SVG user",
        "agent should perform color operations in a way that optimizes performance, which might",
        "mean sacrificing the color interpolation precision as specified by",
        "color-interpolation-filters: linearRGB.",
        "As a presentation attribute, it also can be used as a property directly inside",
        "a CSS stylesheet, see css color-rendering for further information",
        "",
        "Value 	auto | optimizeSpeed | optimizeQuality | inherit",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/color-rendering",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "contentScriptType",
      domName = "contentScriptType",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The contentScriptType attribute on the `<svg>` element specifies the default scripting",
        "language for the given document fragment.",
        "This attribute sets the default scripting language used to process the value strings",
        "in event attributes. This language must be used for all instances of script that do not",
        "specify their own scripting language. The value content-type specifies a media type,",
        "per MIME Part Two: Media Types [RFC2046]. The default value is application/ecmascript",
        "",
        "Value 	`<content-type>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/contentScriptType",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "contentStyleType",
      domName = "contentStyleType",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "This attribute specifies the style sheet language for the given document fragment.",
        "The contentStyleType is specified on the `<svg>` element. By default, if it's not defined,",
        "the value is text/css",
        "",
        "Value 	`<content-type>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/contentStyleType",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "cursorAttr",
      domName = "cursor",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The cursor attribute specifies the mouse cursor displayed when the mouse pointer",
        "is over an element.This attribute behave exactly like the css cursor property except",
        "that if the browser suport the `<cursor>` element, it should allow to use it with the",
        "`<funciri>` notation. As a presentation attribute, it also can be used as a property",
        "directly inside a CSS stylesheet, see css cursor for further information.",
        "",
        "Value 	 auto | crosshair | default | pointer | move | e-resize |",
        "ne-resize | nw-resize | n-resize | se-resize | sw-resize | s-resize | w-resize| text |",
        "wait | help | inherit",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/cursor",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "cx",
      domName = "cx",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "For the `<circle>` and the `<ellipse>` element, this attribute define the x-axis coordinate",
        "of the center of the element. If the attribute is not specified, the effect is as if a",
        "value of \"0\" were specified.For the `<radialGradient>` element, this attribute define",
        "the x-axis coordinate of the largest (i.e., outermost) circle for the radial gradient.",
        "The gradient will be drawn such that the 100% gradient stop is mapped to the perimeter",
        "of this largest (i.e., outermost) circle. If the attribute is not specified, the effect",
        "is as if a value of 50% were specified",
        "",
        "Value 	`<coordinate>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/cx",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "cy",
      domName = "cy",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "For the `<circle>` and the `<ellipse>` element, this attribute define the y-axis coordinate",
        "of the center of the element. If the attribute is not specified, the effect is as if a",
        "value of \"0\" were specified.For the `<radialGradient>` element, this attribute define",
        "the x-axis coordinate of the largest (i.e., outermost) circle for the radial gradient.",
        "The gradient will be drawn such that the 100% gradient stop is mapped to the perimeter",
        "of this largest (i.e., outermost) circle. If the attribute is not specified, the effect",
        "is as if a value of 50% were specified",
        "",
        "Value 	`<coordinate>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/cy",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "d",
      domName = "d",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The d attribute defines a path to be drawn. It contains a series of commands and parameters",
        "used by the path element. Each command is designated by a specific letter (e.g., M for 'move to',",
        "L for 'line to', C for 'curve to', etc.). Following the command letter are the parameters for",
        "that command, typically coordinate pairs or triplets.",
        "",
        "Value: `<path-data>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/d",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "diffuseConstant",
      domName = "diffuseConstant",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The diffuseConstant attribute represents the kd value in the Phong lighting model.",
        "In SVG, this can be any non-negative number.",
        "If the attribute is not specified, then the effect is as if a value of 1 were specified.",
        "",
        "Value: `<number>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/diffuseConstant",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "direction",
      domName = "direction",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The direction attribute specifies the base writing direction of text and the direction of embeddings",
        "and overrides for the Unicode bidirectional algorithm. It defines whether the text is rendered",
        "left-to-right (ltr) or right-to-left (rtl).",
        "As a presentation attribute, it also can be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: ltr | rtl | inherit",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/direction",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "display",
      domName = "display",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The display attribute lets you control the rendering of graphical or container elements.",
        "A value of display=\"none\" indicates that the given element and its children will not be rendered.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/display",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "divisor",
      domName = "divisor",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The divisor attribute specifies the value by which the resulting number of applying the kernelMatrix",
        "of the `<feConvolveMatrix>` element to the input image color value is divided to yield the destination",
        "color value.",
        "",
        "Value: `<number>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/divisor",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "dominantBaseline",
      domName = "dominant-baseline",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The dominant-baseline attribute specifies the dominant baseline, which is the baseline used to align",
        "the box's text and inline-level contents. It also indicates the default alignment baseline of any boxes",
        "participating in baseline alignment in the box's alignment context.",
        "",
        "Value: auto | use-script | no-change | reset-size | ideographic | alphabetic | hanging | mathematical |",
        "central | middle | text-after-edge | text-before-edge | inherit",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/dominant-baseline",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "dur",
      domName = "dur",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The dur attribute indicates the simple duration of an animation. The attribute value can be a",
        "`<clock-value>` or the indefinite keyword. A clock-value is a time value that can be used to control",
        "the timeline of the animation. It can be specified as hh:mm:ss.s or ms, where the former indicates",
        "hours, minutes, seconds, and milliseconds, and the latter indicates milliseconds.",
        "",
        "Value: `<clock-value>` | media | indefinite",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/dur",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "dx",
      domName = "dx",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The dx attribute indicates a shift along the x-axis on the position of an element or its content.",
        "The exact effect of this attribute is dependent on the element for which it's being used.",
        "For `<text>` elements, dx defines the distance to offset the current text position along the x-axis.",
        "For `<feOffset>`, dx defines the x offset of the filter input graphic.",
        "",
        "Value: `<number>` | `<percentage>` | `<length>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/dx",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "dy",
      domName = "dy",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The dy attribute indicates a shift along the y-axis on the position of an element or its content.",
        "The exact effect of this attribute is dependent on the element for which it's being used.",
        "For `<text>` elements, dy defines the distance to offset the current text position along the y-axis.",
        "For `<feOffset>`, dy defines the y offset of the filter input graphic.",
        "",
        "Value: `<number>` | `<percentage>` | `<length>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/dy",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "edgeMode",
      domName = "edgeMode",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The edgeMode attribute determines how to extend the input image as necessary with color values so that",
        "the matrix operations can be applied when the kernel is positioned at or near the edge of the input image.",
        "If attribute is not specified, then the effect is as if a value of duplicate were specified.",
        "",
        "Value: duplicate | wrap | none",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/edgeMode",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "elevation",
      domName = "elevation",
      namespace = None,
      scalaValueType = "Double",
      codec = "DoubleAsString",
      reflectedProp = None,
      commentLines = List(
        "The elevation attribute specifies the direction angle for a light source from the XY plane towards the Z-axis,",
        "in degrees. Note that the positive Z-axis points towards the viewer of the content.",
        "If the attribute is not specified, then the effect is as if a value of 0 were specified.",
        "",
        "Value: `<number>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/elevation",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "end",
      domName = "end",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The end attribute defines an end value for the animation that can constrain the active duration.",
        "The attribute value is a semicolon-separated list of values. Each value can be a `<clock-value>`,",
        "a `<syncbase-value>`, an `<event-value>`, a `<repeat-value>`, an `<accessKey-value>`,",
        "a `<wallclock-sync-value>` or the keyword indefinite.",
        "",
        "Value: `<end-value-list>`",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/end",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "externalResourcesRequired",
      domName = "externalResourcesRequired",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The externalResourcesRequired attribute is a hint to browsers about whether external resources",
        "need to be fetched for the current element to render correctly.",
        "Note: This attribute is deprecated and browsers may ignore it.",
        "",
        "Value: true | false",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/externalResourcesRequired",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "fill",
      domName = "fill",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The fill attribute is a presentation attribute defining the color used to paint the element's interior.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: <color> | <FuncIRI> | none | currentColor",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/fill",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "fillOpacity",
      domName = "fill-opacity",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The fill-opacity attribute is a presentation attribute defining the opacity of the paint",
        "server (color, gradient, pattern, etc.) applied to the fill of a shape.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: [0-1] | <percentage>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/fill-opacity",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "fillRule",
      domName = "fill-rule",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The fill-rule attribute is a presentation attribute defining the algorithm to use to determine",
        "the inside part of a shape. It's used by the fill operation to determine which areas of a shape",
        "are filled when the shape overlaps itself.",
        "",
        "Value: nonzero | evenodd | inherit",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/fill-rule",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "filterAttr",
      domName = "filter",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The filter attribute defines the filter effects to apply to the element.",
        "It contains a reference to a <filter> element which defines the filter to use.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: none | <FuncIRI>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/filter",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "filterRes",
      domName = "filterRes",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The filterRes attribute indicates the width and height of the intermediate images in pixels",
        "for a filter primitive. It takes the form of two numbers separated by whitespace.",
        "Note: This attribute is deprecated and may be removed in future SVG versions.",
        "",
        "Value: <number-optional-number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/filterRes",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "filterUnits",
      domName = "filterUnits",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The filterUnits attribute defines the coordinate system for the attributes x, y, width and height.",
        "If not specified, the effect is as if a value of objectBoundingBox were specified.",
        "",
        "Value: userSpaceOnUse | objectBoundingBox",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/filterUnits",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "floodColor",
      domName = "flood-color",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The flood-color attribute indicates what color to use to flood the current filter primitive.",
        "The keyword currentColor and ICC colors can be specified in the same manner as within a",
        "<paint> specification for the fill and stroke attributes.",
        "",
        "Value: currentColor | <color> | <icccolor>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/flood-color",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "floodOpacity",
      domName = "flood-opacity",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The flood-opacity attribute indicates the opacity value to use across the current filter",
        "primitive subregion. If a value is outside the range 0.0 to 1.0, it is clamped to the nearest",
        "valid value.",
        "",
        "Value: <alpha-value>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/flood-opacity",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "fontFamily",
      domName = "font-family",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The font-family attribute indicates which font family will be used to render the text.",
        "It works identically to the CSS font-family property.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: [[<family-name> | <generic-family>],]* [<family-name> | <generic-family>]",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/font-family",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "fontSize",
      domName = "font-size",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The font-size attribute refers to the size of the font from baseline to baseline when",
        "multiple lines of text are set solid in a multiline layout environment.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: <absolute-size> | <relative-size> | <length> | <percentage>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/font-size",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "fontSizeAdjust",
      domName = "font-size-adjust",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The font-size-adjust attribute allows authors to specify an aspect value for an element that will",
        "preserve the x-height of the first choice font in a substitute font.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: none | <number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/font-size-adjust",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "fontStretch",
      domName = "font-stretch",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The font-stretch attribute indicates the desired amount of condensing or expansion in the glyphs",
        "used to render the text.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: normal | wider | narrower | ultra-condensed | extra-condensed | condensed |",
        "semi-condensed | semi-expanded | expanded | extra-expanded | ultra-expanded | inherit",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/font-stretch",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "fontVariant",
      domName = "font-variant",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The font-variant attribute indicates whether the text is to be rendered using variations of the",
        "font's glyphs, such as small caps or ligatures.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: normal | small-caps | inherit",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/font-variant",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "fontWeight",
      domName = "font-weight",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The font-weight attribute refers to the boldness or lightness of the glyphs used to render the text.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: normal | bold | bolder | lighter | 100 | 200 | 300 | 400 | 500 | 600 | 700 | 800 | 900",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/font-weight",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "from",
      domName = "from",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The from attribute indicates the initial value of the attribute that will be modified during the",
        "animation. When used with the to attribute, the animation will change the modified attribute",
        "from the from value to the to value.",
        "",
        "Value: <value>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/from",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "gradientTransform",
      domName = "gradientTransform",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The gradientTransform attribute contains the definition of an optional additional transformation",
        "from the gradient coordinate system onto the target coordinate system.",
        "This allows for things such as skewing the gradient or rotating it.",
        "",
        "Value: <transform-list>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/gradientTransform",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "gradientUnits",
      domName = "gradientUnits",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The gradientUnits attribute defines the coordinate system used for attributes specified on the",
        "gradient elements. If not specified, the effect is as if a value of objectBoundingBox were specified.",
        "",
        "Value: userSpaceOnUse | objectBoundingBox",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/gradientUnits",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "height",
      domName = "height",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The height attribute defines the vertical length of an element in the user coordinate system.",
        "For SVG elements, it determines the height of the viewport or viewBox.",
        "",
        "Value: <length> | <percentage> | auto",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/height",
      ),
    ),

    // This is NOT a true reflected attribute - the `href` property contains the
    // absolute URL (`href` attribute value resolved relative to current page URL)
    AttrDef(
      tagType = SvgTagType,
      scalaName = "href",
      domName = "href",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The href attribute defines a link to a resource as a reference URL. The exact meaning of that",
        "link depends on the context of each element using it.",
        "Note: SVG 2 removed the xlink:href attribute in favor of simply href.",
        "",
        "Value: <URL>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/href",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "imageRendering",
      domName = "imageRendering",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The imageRendering attribute provides a hint to the browser about how to make speed vs. quality",
        "tradeoffs as it performs image processing.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: auto | optimizeSpeed | optimizeQuality",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/imageRendering",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "idAttr",
      domName = "id",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The id attribute assigns a unique name to an element. This can be used for referencing the element",
        "in JavaScript, CSS, and SVG animations. It's also used with fragment identifiers in URLs.",
        "",
        "Value: <id>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/id",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "in",
      domName = "in",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The in attribute identifies input for the given filter primitive.",
        "The value can be either a reference to a result from a previous filter primitive,",
        "or one of the standard filter input keywords.",
        "",
        "Value: SourceGraphic | SourceAlpha | BackgroundImage | BackgroundAlpha | FillPaint |",
        "StrokePaint | <filter-primitive-reference>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/in",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "in2",
      domName = "in2",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The in2 attribute identifies the second input for the given filter primitive. It works exactly",
        "like the in attribute.",
        "This attribute is only valid for the feBlend, feComposite, feDisplacementMap, and feMorphology",
        "filter primitives.",
        "",
        "Value: SourceGraphic | SourceAlpha | BackgroundImage | BackgroundAlpha | FillPaint |",
        "StrokePaint | <filter-primitive-reference>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/in2",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "k1",
      domName = "k1",
      namespace = None,
      scalaValueType = "Double",
      codec = "DoubleAsString",
      reflectedProp = None,
      commentLines = List(
        "The k1 attribute defines one of the values to be used within the arithmetic operation of the",
        "<feComposite> filter primitive.",
        "If this attribute is not set, the effect is as if a value of 0 were used.",
        "",
        "Value: <number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/k1",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "k2",
      domName = "k2",
      namespace = None,
      scalaValueType = "Double",
      codec = "DoubleAsString",
      reflectedProp = None,
      commentLines = List(
        "The k2 attribute defines one of the values to be used within the arithmetic operation of the",
        "<feComposite> filter primitive.",
        "If this attribute is not set, the effect is as if a value of 0 were used.",
        "",
        "Value: <number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/k2",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "k3",
      domName = "k3",
      namespace = None,
      scalaValueType = "Double",
      codec = "DoubleAsString",
      reflectedProp = None,
      commentLines = List(
        "The k3 attribute defines one of the values to be used within the arithmetic operation of the",
        "<feComposite> filter primitive.",
        "If this attribute is not set, the effect is as if a value of 0 were used.",
        "",
        "Value: <number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/k3",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "k4",
      domName = "k4",
      namespace = None,
      scalaValueType = "Double",
      codec = "DoubleAsString",
      reflectedProp = None,
      commentLines = List(
        "The k4 attribute defines one of the values to be used within the arithmetic operation of the",
        "<feComposite> filter primitive.",
        "If this attribute is not set, the effect is as if a value of 0 were used.",
        "",
        "Value: <number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/k4",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "kernelMatrix",
      domName = "kernelMatrix",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The kernelMatrix attribute defines the list of numbers that make up the kernel matrix for the",
        "<feConvolveMatrix> element.",
        "The number of entries in the list must equal to orderX times orderY.",
        "",
        "Value: <list-of-numbers>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/kernelMatrix",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "kernelUnitLength",
      domName = "kernelUnitLength",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The kernelUnitLength attribute has two meanings based on the context it's used in.",
        "For lighting filter primitives, it represents the x and y coordinates for the distance from the",
        "source to the surface. For feConvolveMatrix, it defines the intended distance in current filter",
        "units between successive columns and rows in the kernelMatrix.",
        "",
        "Value: <number-optional-number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/kernelUnitLength",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "kerning",
      domName = "kerning",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The kerning attribute indicates whether the browser should adjust inter-glyph spacing based on",
        "kerning tables in the font or not.",
        "Note: This attribute is deprecated and may be removed in future SVG versions.",
        "",
        "Value: auto | <length>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/kerning",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "keySplines",
      domName = "keySplines",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The keySplines attribute defines a set of Bézier control points associated with the keyTimes list,",
        "defining a cubic Bézier function that controls interval pacing.",
        "This attribute is ignored unless the calcMode attribute is set to spline.",
        "",
        "Value: <list-of-control-points>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/keySplines",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "keyTimes",
      domName = "keyTimes",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The keyTimes attribute represents a list of time values used to control the pacing of the animation.",
        "Each time in the list corresponds to a value in the values attribute list, and defines when",
        "the value is used in the animation.",
        "",
        "Value: <list-of-times>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/keyTimes",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "letterSpacing",
      domName = "letter-spacing",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The letter-spacing attribute controls spacing between text characters, in addition to any spacing",
        "from the kerning attribute.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: normal | <length>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/letter-spacing",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "lightingColor",
      domName = "lighting-color",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The lighting-color attribute defines the color of the light source for filter primitives",
        "<feDiffuseLighting> and <feSpecularLighting>.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: currentColor | <color> | <icccolor>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/lighting-color",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "limitingConeAngle",
      domName = "limitingConeAngle",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The limitingConeAngle attribute represents the angle in degrees between the spot light axis",
        "(i.e., the axis between the light source and the point to which it is pointing at) and the",
        "spot light cone. If no value is specified, then the effect is as if a value of 90 were specified.",
        "",
        "Value: <angle>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/limitingConeAngle",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "local",
      domName = "local",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The local attribute defines one side of a coordinate transformation to be applied to an element.",
        "It's used along with the 'from' attribute, which defines the other side of the transformation.",
        "",
        "Value: <string>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/local",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "markerEnd",
      domName = "marker-end",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The marker-end attribute defines the arrowhead or polymarker that will be drawn at the final",
        "vertex of the given shape.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: none | <FuncIRI>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/marker-end",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "markerMid",
      domName = "marker-mid",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The marker-mid attribute defines the arrowhead or polymarker that will be drawn at every vertex",
        "other than the first and last vertex of the given shape.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: none | <FuncIRI>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/marker-mid",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "markerStart",
      domName = "marker-start",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The marker-start attribute defines the arrowhead or polymarker that will be drawn at the first",
        "vertex of the given shape.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: none | <FuncIRI>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/marker-start",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "markerHeight",
      domName = "markerHeight",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The markerHeight attribute represents the height of the viewport into which the marker is to be",
        "fitted when it is rendered according to the viewBox and preserveAspectRatio attributes.",
        "",
        "Value: <length>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/markerHeight",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "markerUnits",
      domName = "markerUnits",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The markerUnits attribute defines the coordinate system for the markerWidth and markerHeight",
        "attributes and the contents of the <marker>.",
        "If not specified, the effect is as if a value of strokeWidth were specified.",
        "",
        "Value: userSpaceOnUse | strokeWidth",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/markerUnits",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "markerWidth",
      domName = "markerWidth",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The markerWidth attribute represents the width of the viewport into which the marker is to be",
        "fitted when it is rendered according to the viewBox and preserveAspectRatio attributes.",
        "",
        "Value: <length>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/markerWidth",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "maskContentUnits",
      domName = "maskContentUnits",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The maskContentUnits attribute indicates which coordinate system to use for the contents of the",
        "<mask> element.",
        "If not specified, the effect is as if a value of userSpaceOnUse were specified.",
        "",
        "Value: userSpaceOnUse | objectBoundingBox",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/maskContentUnits",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "maskUnits",
      domName = "maskUnits",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The maskUnits attribute indicates which coordinate system to use for the attributes x, y, width",
        "and height on the <mask> element.",
        "If not specified, the effect is as if a value of objectBoundingBox were specified.",
        "",
        "Value: userSpaceOnUse | objectBoundingBox",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/maskUnits",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "maskAttr",
      domName = "mask",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The mask attribute is a presentation attribute mainly used to bind a given <mask> element with",
        "the element the attribute belongs to.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: none | <FuncIRI>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/mask",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "maxAttr",
      domName = "max",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The max attribute defines the maximum value of the range input. It must be greater than or equal",
        "to the value of the min attribute.",
        "If the value is less than the minimum value, the minimum value is used instead.",
        "",
        "Value: <number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/max",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "minAttr",
      domName = "min",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The min attribute defines the minimum value of the range input. It must be less than or equal",
        "to the value of the max attribute.",
        "If the value is greater than the maximum value, the maximum value is used instead.",
        "",
        "Value: <number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/min",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "mode",
      domName = "mode",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The mode attribute defines the blending mode on the <feBlend> filter primitive.",
        "",
        "Value: normal | multiply | screen | darken | lighten",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/mode",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "numOctaves",
      domName = "numOctaves",
      namespace = None,
      scalaValueType = "Int",
      codec = "IntAsString",
      reflectedProp = None,
      commentLines = List(
        "The numOctaves attribute defines the number of octaves for the noise function of the",
        "<feTurbulence> primitive.",
        "If not specified, the effect is as if a value of 1 were specified.",
        "",
        "Value: <integer>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/numOctaves",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "offsetAttr",
      domName = "offset",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The offset attribute either defines the distance of an <stop> element from the start of the",
        "gradient, or defines the displacement value for a <feOffset> element.",
        "For <stop> elements, it's a percentage or a number between 0 and 1.",
        "For <feOffset>, it represents the displacement in the x or y direction.",
        "",
        "Value: <number> | <percentage>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/offset",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "orient",
      domName = "orient",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "This attribute defines the orientation of the marker relative to the shape it is attached to.",
        "",
        "Value type: `auto|auto-start-reverse|<angle>` ; Default value: 0; Animatable: yes",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/orient",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "opacity",
      domName = "opacity",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The opacity attribute specifies the transparency of an object or of a group of objects.",
        "It's a multiplier on the alpha channel and can take a value between 0 and 1 (or a percentage).",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: [0-1] | <percentage>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/opacity",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "operator",
      domName = "operator",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The operator attribute has different meanings based on the context where it's used.",
        "For feComposite, it defines the compositing operation to be performed.",
        "For feMorphology, it defines whether to erode or dilate the source graphic.",
        "",
        "Value: over | in | out | atop | xor | arithmetic (for feComposite)",
        "Value: erode | dilate (for feMorphology)",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/operator",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "order",
      domName = "order",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The order attribute indicates the size of the matrix to be used by the <feConvolveMatrix> element.",
        "It contains two numbers separated by whitespace which define the number of columns and rows",
        "in the matrix.",
        "",
        "Value: <number-pair>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/order",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "overflow",
      domName = "overflow",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The overflow attribute sets what to do when an element's content is too big to fit in its block",
        "formatting context. This attribute has the same parameter values as the CSS overflow property.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: visible | hidden | scroll | auto",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/overflow",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "paintOrder",
      domName = "paint-order",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The paint-order attribute specifies the order in which the fill, stroke, and markers of a given",
        "shape or text element are painted. By default, the order is: fill, stroke, markers.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: normal | [ fill || stroke || markers ]",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/paint-order",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "pathLength",
      domName = "pathLength",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The pathLength attribute lets authors specify a total length for the path, in user units.",
        "This value is used to calibrate the browser's distance calculations with those of the author,",
        "particularly useful for text on a path or motion animations.",
        "",
        "Value: <number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/pathLength",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "patternContentUnits",
      domName = "patternContentUnits",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The patternContentUnits attribute defines the coordinate system for the contents of the <pattern>.",
        "If not specified, the effect is as if a value of userSpaceOnUse were specified.",
        "",
        "Value: userSpaceOnUse | objectBoundingBox",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/patternContentUnits",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "patternTransform",
      domName = "patternTransform",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The patternTransform attribute contains the definition of an optional additional transformation",
        "from the pattern coordinate system onto the target coordinate system.",
        "This allows for effects like rotating or skewing the pattern tiles.",
        "",
        "Value: <transform-list>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/patternTransform",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "patternUnits",
      domName = "patternUnits",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The patternUnits attribute defines the coordinate system for attributes x, y, width, and height.",
        "If not specified, the effect is as if a value of objectBoundingBox were specified.",
        "",
        "Value: userSpaceOnUse | objectBoundingBox",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/patternUnits",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "pointerEvents",
      domName = "pointer-events",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The pointer-events attribute defines whether or when an element may be the target of a mouse event.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: bounding-box | visiblePainted | visibleFill | visibleStroke | visible |",
        "painted | fill | stroke | all | none",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/pointer-events",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "points",
      domName = "points",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The points attribute defines a list of points required to draw a <polyline> or <polygon> element.",
        "Each point is defined by a pair of X and Y coordinates in the user coordinate system.",
        "",
        "Value: <list-of-points>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/points",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "pointsAtX",
      domName = "pointsAtX",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The pointsAtX attribute represents the X location in the coordinate system established by the",
        "primitiveUnits attribute on the <filter> element of the point at which the light source is",
        "pointing.",
        "",
        "Value: <number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/pointsAtX",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "pointsAtY",
      domName = "pointsAtY",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The pointsAtY attribute represents the Y location in the coordinate system established by the",
        "primitiveUnits attribute on the <filter> element of the point at which the light source is",
        "pointing.",
        "",
        "Value: <number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/pointsAtY",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "pointsAtZ",
      domName = "pointsAtZ",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The pointsAtZ attribute represents the Z location in the coordinate system established by the",
        "primitiveUnits attribute on the <filter> element of the point at which the light source is",
        "pointing.",
        "",
        "Value: <number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/pointsAtZ",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "preserveAlpha",
      domName = "preserveAlpha",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The preserveAlpha attribute indicates how a <feConvolveMatrix> element handles alpha transparency.",
        "If set to false, the convolution matrix is applied to the alpha channel in the same way as the",
        "RGB color channels. If set to true, the alpha channel is kept unchanged.",
        "",
        "Value: true | false",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/preserveAlpha",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "preserveAspectRatio",
      domName = "preserveAspectRatio",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The preserveAspectRatio attribute indicates how an element with a viewBox providing a given",
        "aspect ratio should fit into a viewport with a different aspect ratio.",
        "It consists of an optional alignment parameter and an optional 'meet or slice' reference.",
        "",
        "Value: [none | xMinYMin | xMidYMin | xMaxYMin | xMinYMid | xMidYMid | xMaxYMid |",
        "xMinYMax | xMidYMax | xMaxYMax] [meet | slice]",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/preserveAspectRatio",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "primitiveUnits",
      domName = "primitiveUnits",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The primitiveUnits attribute defines the coordinate system for the various length values within",
        "the filter primitives and for the attributes that define the filter primitive subregion.",
        "If not specified, the effect is as if a value of userSpaceOnUse were specified.",
        "",
        "Value: userSpaceOnUse | objectBoundingBox",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/primitiveUnits",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "r",
      domName = "r",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The r attribute defines the radius of a circle. If the attribute is not specified, the effect",
        "is as if a value of 0 were specified.",
        "",
        "Value: <length> | <percentage>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/r",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "radius",
      domName = "radius",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The radius attribute represents the radius (or radii) for the operation on a given",
        "<feMorphology> filter primitive. If two numbers are provided, the first represents the",
        "x-radius and the second the y-radius. If one number is provided, then that value is used",
        "for both x and y.",
        "",
        "Value: <number-optional-number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/radius",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "refX",
      domName = "refX",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The refX attribute is used alongside the refY attribute to provide coordinates for the location on the",
        "marker where it will be joined to its markable element. Coordinates are relative to the marker's",
        "coordinate system (after application of the ‘viewBox’ and ‘preserveAspectRatio’ attributes), and not",
        "the markable element it is placed on.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/refX",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "refY",
      domName = "refY",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The refY attribute is used alongside the refY attribute to provide coordinates for the location on the",
        "marker where it will be joined to its markable element. Coordinates are relative to the marker's",
        "coordinate system (after application of the ‘viewBox’ and ‘preserveAspectRatio’ attributes), and not",
        "the markable element it is placed on.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/refY",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "repeatCount",
      domName = "repeatCount",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The repeatCount attribute indicates the number of times an animation will repeat.",
        "It can be a simple count or the keyword 'indefinite', which specifies that the animation",
        "will repeat indefinitely.",
        "",
        "Value: <number> | indefinite",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/repeatCount",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "repeatDur",
      domName = "repeatDur",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The repeatDur attribute specifies the total duration for repeating an animation.",
        "It can be a time value or the keyword 'indefinite', which specifies that the animation",
        "will repeat indefinitely.",
        "",
        "Value: <clock-value> | indefinite",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/repeatDur",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "requiredFeatures",
      domName = "requiredFeatures",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The requiredFeatures attribute takes a list of feature strings, with the element only being",
        "rendered if all features are supported by the browser.",
        "Note: This attribute is deprecated and may be removed in future SVG versions.",
        "",
        "Value: <list-of-features>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/requiredFeatures",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "restart",
      domName = "restart",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The restart attribute specifies whether or not an animation can restart.",
        "It can be set to always, never, or whenNotActive, with always being the default.",
        "",
        "Value: always | never | whenNotActive",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/restart",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "resultAttr",
      domName = "result",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The result attribute defines the assigned name for this filter primitive. If supplied, then",
        "graphics that result from processing this filter primitive can be referenced by an in attribute",
        "on a subsequent filter primitive within the same <filter> element.",
        "",
        "Value: <filter-primitive-reference>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/result",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "rx",
      domName = "rx",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The rx attribute defines the x-radius of a rounded corner for the element.",
        "For <rect> elements, this is used for rounded corners. For <ellipse> elements, this defines",
        "the x-radius of the ellipse. If the attribute is not specified, the effect is as if a value",
        "of 0 were specified.",
        "",
        "Value: <length> | <percentage> | auto",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/rx",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "ry",
      domName = "ry",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The ry attribute defines the y-radius of a rounded corner for the element.",
        "For <rect> elements, this is used for rounded corners. For <ellipse> elements, this defines",
        "the y-radius of the ellipse. If the attribute is not specified, the effect is as if a value",
        "of 0 were specified.",
        "",
        "Value: <length> | <percentage> | auto",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/ry",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "scale",
      domName = "scale",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The scale attribute defines the displacement scale factor to be used on a <feDisplacementMap>",
        "filter primitive. The amount is expressed in the coordinate system established by the",
        "primitiveUnits attribute on the <filter> element.",
        "",
        "Value: <number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/scale",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "seed",
      domName = "seed",
      namespace = None,
      scalaValueType = "Double",
      codec = "DoubleAsString",
      reflectedProp = None,
      commentLines = List(
        "The seed attribute represents the starting number for the pseudo random number generator of the",
        "<feTurbulence> primitive. If the attribute is not specified, the effect is as if a value of 0",
        "were specified.",
        "",
        "Value: <number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/seed",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "shapeRendering",
      domName = "shape-rendering",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The shape-rendering attribute provides hints to the renderer about what tradeoffs to make when",
        "rendering shapes like paths, circles, or rectangles.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: auto | optimizeSpeed | crispEdges | geometricPrecision",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/shape-rendering",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "specularConstant",
      domName = "specularConstant",
      namespace = None,
      scalaValueType = "Double",
      codec = "DoubleAsString",
      reflectedProp = None,
      commentLines = List(
        "The specularConstant attribute controls the ratio of reflection of the specular lighting.",
        "It represents the ks value in the Phong lighting model. The bigger the value, the more",
        "light is reflected. If not specified, the effect is as if a value of 1 were specified.",
        "",
        "Value: <number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/specularConstant",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "specularExponent",
      domName = "specularExponent",
      namespace = None,
      scalaValueType = "Double",
      codec = "DoubleAsString",
      reflectedProp = None,
      commentLines = List(
        "The specularExponent attribute controls the focus for the light source. The larger the value,",
        "the more focused the light source becomes. It represents the shininess of the surface and",
        "corresponds to the n value in the Phong lighting model.",
        "",
        "Value: <number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/specularExponent",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "spreadMethod",
      domName = "spreadMethod",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The spreadMethod attribute determines how a gradient behaves if it starts or ends inside the",
        "bounds of the target rectangle but the gradient does not fill the entire rectangle.",
        "If not specified, the effect is as if a value of pad were specified.",
        "",
        "Value: pad | reflect | repeat",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/spreadMethod",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "stdDeviation",
      domName = "stdDeviation",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The stdDeviation attribute defines the standard deviation for the blur operation in a Gaussian",
        "blur filter. If two <number>s are provided, the first number represents the standard deviation",
        "along the x-axis. The second value represents the standard deviation along the y-axis.",
        "",
        "Value: <number-optional-number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stdDeviation",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "stitchTiles",
      domName = "stitchTiles",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The stitchTiles attribute defines how the Perlin Noise tiles behave at the border.",
        "If not specified, the effect is as if a value of noStitch were specified.",
        "",
        "Value: stitch | noStitch",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stitchTiles",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "stopColor",
      domName = "stop-color",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The stop-color attribute indicates what color to use at a gradient stop.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: currentColor | <color> | <icccolor>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stop-color",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "stopOpacity",
      domName = "stop-opacity",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The stop-opacity attribute defines the opacity of a given color gradient stop.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: <opacity-value>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stop-opacity",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "stroke",
      domName = "stroke",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The stroke attribute defines the color of the outline on a given graphical element.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: <paint>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "strokeDashArray",
      domName = "stroke-dasharray",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The stroke-dasharray attribute defines the pattern of dashes and gaps used to paint the outline",
        "of the shape. It's a list of comma and/or white space separated <length>s and <percentage>s.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: none | <dasharray>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-dasharray",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "strokeDashOffset",
      domName = "stroke-dashoffset",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The stroke-dashoffset attribute specifies the distance into the dash pattern to start the dash.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: <percentage> | <length>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-dashoffset",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "strokeLineCap",
      domName = "stroke-linecap",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The stroke-linecap attribute specifies the shape to be used at the end of open subpaths",
        "when they are stroked.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: butt | round | square",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-linecap",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "strokeLineJoin",
      domName = "stroke-linejoin",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The stroke-linejoin attribute specifies the shape to be used at the corners of paths",
        "when they are stroked.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: arcs | bevel | miter | miter-clip | round",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-linejoin",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "strokeMiterLimit",
      domName = "stroke-miterlimit",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The stroke-miterlimit attribute specifies the limit on the ratio of the miter length to the",
        "stroke-width when two line segments meet at a sharp angle and miter joins have been specified.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: <number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-miterlimit",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "strokeOpacity",
      domName = "stroke-opacity",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The stroke-opacity attribute specifies the opacity of the outline on the current object.",
        "Its value ranges from 0 to 1 or as a percentage.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: [0-1] | <percentage>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-opacity",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "strokeWidth",
      domName = "stroke-width",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The stroke-width attribute specifies the width of the outline on the current object.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: <length> | <percentage>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-width",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "style",
      domName = "style",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The style attribute allows to style an element using CSS declarations. It functions identically",
        "to the style attribute in HTML.",
        "",
        "Value: <style>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/style",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "surfaceScale",
      domName = "surfaceScale",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The surfaceScale attribute represents the height of the surface for a light filter primitive.",
        "If the attribute is not specified, then the effect is as if a value of 1 were specified.",
        "",
        "Value: <number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/surfaceScale",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "tabIndex",
      domName = "tabindex",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The tabindex attribute allows you to control whether an element is focusable and to define",
        "the relative order of the element for the purposes of sequential focus navigation.",
        "",
        "Value: <integer>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/tabindex",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "target",
      domName = "target",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The target attribute specifies where to open the link referenced by the <a> element.",
        "It's similar to the target attribute in HTML.",
        "",
        "Value: _self | _parent | _top | _blank | <name>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/target",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "targetX",
      domName = "targetX",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The targetX attribute determines the positioning in X of the convolution matrix relative",
        "to a given target pixel in the input image. The leftmost column of the matrix is column number",
        "zero. The value must be such that: 0 <= targetX < orderX.",
        "",
        "Value: <integer>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/targetX",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "targetY",
      domName = "targetY",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The targetY attribute determines the positioning in Y of the convolution matrix relative",
        "to a given target pixel in the input image. The topmost row of the matrix is row number zero.",
        "The value must be such that: 0 <= targetY < orderY.",
        "",
        "Value: <integer>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/targetY",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "textAnchor",
      domName = "text-anchor",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The text-anchor attribute is used to align (start-, middle- or end-alignment) a string of",
        "pre-formatted text or auto-wrapped text where the wrapping area is determined from the",
        "inline-size property relative to a given point.",
        "",
        "Value: start | middle | end",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/text-anchor",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "textDecoration",
      domName = "text-decoration",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The text-decoration attribute defines whether text is decorated with an underline, overline",
        "and/or strike-through. It is a shorthand for the text-decoration-line and",
        "text-decoration-style properties.",
        "",
        "Value: none | [ underline || overline || line-through || blink ] | inherit",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/text-decoration",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "textRendering",
      domName = "text-rendering",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The text-rendering attribute provides hints to the renderer about what tradeoffs to make",
        "when rendering text.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: auto | optimizeSpeed | optimizeLegibility | geometricPrecision",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/text-rendering",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "to",
      domName = "to",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The to attribute indicates the final value of the attribute that will be modified during the",
        "animation. The value of the attribute will change between the from attribute value and this",
        "value.",
        "",
        "Value: <value>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/to",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "transform",
      domName = "transform",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The transform attribute defines a list of transform definitions that are applied to an element",
        "and the element's children. Transforms include rotate, scale, translate, skewX, skewY, and matrix.",
        "",
        "Value: <transform-list>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/transform",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "`type`",
      scalaAliases = List("typ", "tpe"),
      domName = "type",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The type attribute specifies the type of animation or filter. The meaning and allowed values",
        "depend on the element it's used on. For <animateTransform>, it defines the type of transformation.",
        "For <feColorMatrix>, it defines the type of matrix operation.",
        "",
        "Value: varies by element",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/type",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "values",
      domName = "values",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The values attribute has different meanings depending on the context where it's used.",
        "For animation elements, it defines a list of values to animate through. For <feColorMatrix>,",
        "it defines a list of values for the color transformation matrix.",
        "",
        "Value: <list-of-values>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/values",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "viewBox",
      domName = "viewBox",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The viewBox attribute defines the position and dimension, in user space, of an SVG viewport.",
        "It's specified as four numbers: min-x, min-y, width and height, separated by whitespace",
        "and/or a comma.",
        "",
        "Value: <min-x> <min-y> <width> <height>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/viewBox",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "visibility",
      domName = "visibility",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The visibility attribute lets you control the visibility of graphical elements.",
        "With a value of hidden or collapse, the element is not drawn. With a value of visible,",
        "the element is drawn.",
        "",
        "Value: visible | hidden | collapse | inherit",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/visibility",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "width",
      domName = "width",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The width attribute defines the horizontal length of an element in the user coordinate system.",
        "For SVG elements, it determines the width of the viewport or viewBox.",
        "",
        "Value: <length> | <percentage> | auto",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/width",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "wordSpacing",
      domName = "word-spacing",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The word-spacing attribute specifies spacing behavior between words.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: normal | <length>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/word-spacing",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "writingMode",
      domName = "writing-mode",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The writing-mode attribute specifies whether the initial inline-progression-direction for a",
        "text element is left-to-right, right-to-left, or top-to-bottom.",
        "As a presentation attribute, it can also be used as a property directly inside a CSS stylesheet.",
        "",
        "Value: lr-tb | rl-tb | tb-rl | lr | rl | tb | horizontal-tb | vertical-rl | vertical-lr",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/writing-mode",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "x",
      domName = "x",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The x attribute defines an x-axis coordinate in the user coordinate system.",
        "The exact effect of this coordinate depends on the element it's used on.",
        "",
        "Value: <coordinate>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/x",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "x1",
      domName = "x1",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The x1 attribute is used to specify the first x-coordinate for drawing an SVG element that",
        "requires more than one coordinate. Elements that use x1 include <line>, <linearGradient>,",
        "and other gradient elements.",
        "",
        "Value: <coordinate>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/x1",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "x2",
      domName = "x2",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The x2 attribute is used to specify the second x-coordinate for drawing an SVG element that",
        "requires more than one coordinate. Elements that use x2 include <line>, <linearGradient>,",
        "and other gradient elements.",
        "",
        "Value: <coordinate>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/x2",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "xChannelSelector",
      domName = "xChannelSelector",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The xChannelSelector attribute indicates which color channel from the input image to use",
        "to displace the pixels in the <feDisplacementMap> filter primitive.",
        "If not specified, the effect is as if a value of A were specified.",
        "",
        "Value: R | G | B | A",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/xChannelSelector",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "xlinkHref",
      domName = "href",
      namespace = Some("xlink"),
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The xlink:href attribute defines a reference to a resource as a reference IRI. The exact",
        "meaning of that link depends on the context of each element using it.",
        "Note: This attribute is deprecated in SVG 2 in favor of simply using href.",
        "",
        "Value: <IRI>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/xlink:href",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "xlinkRole",
      domName = "role",
      namespace = Some("xlink"),
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The xlink:role attribute indicates the role that the linked resource plays in the link",
        "relationship. The exact meaning of this attribute is defined by the language of the linked",
        "resource.",
        "Note: This attribute is deprecated in SVG 2.",
        "",
        "Value: <IRI>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/xlink:role",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "xlinkTitle",
      domName = "title",
      namespace = Some("xlink"),
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The xlink:title attribute provides a human-readable title for the link, which can be used",
        "by browsers or other user agents to provide additional information about the link.",
        "Note: This attribute is deprecated in SVG 2.",
        "",
        "Value: <string>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/xlink:title",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "xmlSpace",
      domName = "space",
      namespace = Some("xml"),
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The xml:space attribute specifies how white space inside the element is handled.",
        "Note: This attribute is deprecated in SVG 2. Use CSS white-space property instead.",
        "",
        "Value: default | preserve",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/xml:space",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "xmlns",
      domName = "xmlns",
      namespace = None, // https://github.com/raquo/Laminar/issues/143
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The xmlns attribute specifies the XML namespace for the SVG document.",
        "For SVG, the namespace is always http://www.w3.org/2000/svg.",
        "",
        "Value: http://www.w3.org/2000/svg",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/svg",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "xmlnsXlink",
      domName = "xlink",
      namespace = Some("xmlns"),
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The xmlns:xlink attribute specifies the XML namespace for the XLink attributes used by SVG.",
        "Note: This attribute is deprecated in SVG 2 as XLink features are now available in core XML.",
        "",
        "Value: http://www.w3.org/1999/xlink",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/xmlns:xlink",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "y",
      domName = "y",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The y attribute defines a y-axis coordinate in the user coordinate system.",
        "The exact effect of this coordinate depends on the element it's used on.",
        "",
        "Value: <coordinate>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/y",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "y1",
      domName = "y1",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The y1 attribute is used to specify the first y-coordinate for drawing an SVG element that",
        "requires more than one coordinate. Elements that use y1 include <line>, <linearGradient>,",
        "and other gradient elements.",
        "",
        "Value: <coordinate>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/y1",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "y2",
      domName = "y2",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The y2 attribute is used to specify the second y-coordinate for drawing an SVG element that",
        "requires more than one coordinate. Elements that use y2 include <line>, <linearGradient>,",
        "and other gradient elements.",
        "",
        "Value: <coordinate>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/y2",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "yChannelSelector",
      domName = "yChannelSelector",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The yChannelSelector attribute indicates which color channel from the input image to use",
        "to displace the pixels in the <feDisplacementMap> filter primitive.",
        "If not specified, the effect is as if a value of A were specified.",
        "",
        "Value: R | G | B | A",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/yChannelSelector",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "z",
      domName = "z",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      reflectedProp = None,
      commentLines = List(
        "The z attribute defines the location along the Z-axis for a light source in the coordinate",
        "system established by the primitiveUnits attribute on the <filter> element.",
        "If the attribute is not specified, the effect is as if a value of 0 were specified.",
        "",
        "Value: <number>",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/z",
      ),
    ),

  )

}
