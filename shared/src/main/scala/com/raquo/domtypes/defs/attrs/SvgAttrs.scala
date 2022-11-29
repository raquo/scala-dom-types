package com.raquo.domtypes.defs.attrs

import com.raquo.domtypes.common.{AttrDef, SvgTagType, HtmlTagType}

object SvgAttrs {
  
  val defs: List[AttrDef] = List(
    
    AttrDef(
      tagType = SvgTagType,
      scalaName = "accentHeight",
      domName = "accent-height",
      namespace = None,
      scalaValueType = "Double",
      codec = "DoubleAsString",
      commentLines = List(
        "This attribute defines the distance from the origin to the top of accent characters,",
        "measured by a distance within the font coordinate system.",
        "If the attribute is not specified, the effect is as if the attribute",
        "were set to the value of the ascent attribute.",
        "",
        "Value 	<number>",
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
      commentLines = List(
        "This attribute defines the maximum unaccented depth of the font",
        "within the font coordinate system. If the attribute is not specified,",
        "the effect is as if the attribute were set to the vert-origin-y value",
        "for the corresponding font.",
        "",
        "Value 	<number>",
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
      commentLines = List(
        "This attribute indicates the name of the attribute in the parent element",
        "that is going to be changed during an animation.",
        "",
        "Value 	<attributeName>",
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
      commentLines = List(
        "The azimuth attribute represent the direction angle for the light",
        "source on the XY plane (clockwise), in degrees from the x axis.",
        "If the attribute is not specified, then the effect is as if a",
        "value of 0 were specified.",
        "",
        "Value 	<number>",
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
      commentLines = List(
        "The baseFrequency attribute represent The base frequencies parameter",
        "for the noise function of the <feturbulence> primitive. If two <number>s",
        "are provided, the first number represents a base frequency in the X",
        "direction and the second value represents a base frequency in the Y direction.",
        "If one number is provided, then that value is used for both X and Y.",
        "Negative values are forbidden.",
        "If the attribute is not specified, then the effect is as if a value",
        "of 0 were specified.",
        "",
        "Value 	<number-optional-number>",
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
      commentLines = List(
        "This attribute defines when an animation should begin.",
        "The attribute value is a semicolon separated list of values. The interpretation",
        "of a list of start times is detailed in the SMIL specification in \"Evaluation",
        "of begin and end time lists\". Each individual value can be one of the following:",
        "<offset-value>, <syncbase-value>, <event-value>, <repeat-value>, <accessKey-value>,",
        "<wallclock-sync-value> or the keyword indefinite.",
        "",
        "Value 	<begin-value-list>",
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
      commentLines = List(
        "The bias attribute shifts the range of the filter. After applying the kernelMatrix",
        "of the <feConvolveMatrix> element to the input image to yield a number and applied",
        "the divisor attribute, the bias attribute is added to each component. This allows",
        "representation of values that would otherwise be clamped to 0 or 1.",
        "If bias is not specified, then the effect is as if a value of 0 were specified.",
        "",
        "Value 	<number>",
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
      commentLines = List(
        "The clip attribute has the same parameter values as defined for the css clip property.",
        "Unitless values, which indicate current user coordinates, are permitted on the coordinate",
        "values on the <shape>. The value of auto defines a clipping path along the bounds of",
        "the viewport created by the given element.",
        "As a presentation attribute, it also can be used as a property directly inside a",
        "CSS stylesheet, see css clip for further information.",
        "",
        "Value 	auto | <shape> | inherit",
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
      commentLines = List(
        "The clip-path attribute bind the element is applied to with a given <clipPath> element",
        "As a presentation attribute, it also can be used as a property directly inside a CSS stylesheet",
        "",
        "Value 	<FuncIRI> | none | inherit",
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
      commentLines = List(
        "The clipPathUnits attribute defines the coordinate system for the contents",
        "of the <clipPath> element. the clipPathUnits attribute is not specified,",
        "then the effect is as if a value of userSpaceOnUse were specified.",
        "Note that values defined as a percentage inside the content of the <clipPath>",
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
      commentLines = List(
        "The clip-rule attribute only applies to graphics elements that are contained within a",
        "<clipPath> element. The clip-rule attribute basically works as the fill-rule attribute,",
        "except that it applies to <clipPath> definitions.",
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
      commentLines = List(
        "The color attribute is used to provide a potential indirect value (currentColor)",
        "for the fill, stroke, stop-color, flood-color and lighting-color attributes.",
        "As a presentation attribute, it also can be used as a property directly inside a CSS",
        "stylesheet, see css color for further information.",
        "",
        "Value 	<color> | inherit",
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
      commentLines = List(
        "The color-profile attribute is used to define which color profile a raster image",
        "included through the <image> element should use. As a presentation attribute, it",
        "also can be used as a property directly inside a CSS stylesheet, see css color-profile",
        "for further information.",
        "",
        "Value 	auto | sRGB | <name> | <IRI> | inherit",
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
      commentLines = List(
        "The contentScriptType attribute on the <svg> element specifies the default scripting",
        "language for the given document fragment.",
        "This attribute sets the default scripting language used to process the value strings",
        "in event attributes. This language must be used for all instances of script that do not",
        "specify their own scripting language. The value content-type specifies a media type,",
        "per MIME Part Two: Media Types [RFC2046]. The default value is application/ecmascript",
        "",
        "Value 	<content-type>",
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
      commentLines = List(
        "This attribute specifies the style sheet language for the given document fragment.",
        "The contentStyleType is specified on the <svg> element. By default, if it's not defined,",
        "the value is text/css",
        "",
        "Value 	<content-type>",
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
      commentLines = List(
        "The cursor attribute specifies the mouse cursor displayed when the mouse pointer",
        "is over an element.This attribute behave exactly like the css cursor property except",
        "that if the browser suport the <cursor> element, it should allow to use it with the",
        "<funciri> notation. As a presentation attribute, it also can be used as a property",
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
      commentLines = List(
        "For the <circle> and the <ellipse> element, this attribute define the x-axis coordinate",
        "of the center of the element. If the attribute is not specified, the effect is as if a",
        "value of \"0\" were specified.For the <radialGradient> element, this attribute define",
        "the x-axis coordinate of the largest (i.e., outermost) circle for the radial gradient.",
        "The gradient will be drawn such that the 100% gradient stop is mapped to the perimeter",
        "of this largest (i.e., outermost) circle. If the attribute is not specified, the effect",
        "is as if a value of 50% were specified",
        "",
        "Value 	<coordinate>",
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
      commentLines = List(
        "For the <circle> and the <ellipse> element, this attribute define the y-axis coordinate",
        "of the center of the element. If the attribute is not specified, the effect is as if a",
        "value of \"0\" were specified.For the <radialGradient> element, this attribute define",
        "the x-axis coordinate of the largest (i.e., outermost) circle for the radial gradient.",
        "The gradient will be drawn such that the 100% gradient stop is mapped to the perimeter",
        "of this largest (i.e., outermost) circle. If the attribute is not specified, the effect",
        "is as if a value of 50% were specified",
        "",
        "Value 	<coordinate>",
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/height",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "href",
      domName = "href",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = List(
        "This attribute defines the orientation of the marker relative to the shape it is attached to.",
        "",
        "Value type: auto|auto-start-reverse|<angle> ; Default value: 0; Animatable: yes",
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/surfaceScale",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "target",
      domName = "target",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/transform",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "`type`",
      domName = "type",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/xml:space",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "xmlns",
      domName = "xmlns",
      namespace = None,
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = Nil,
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/xmlns",
      ),
    ),

    AttrDef(
      tagType = SvgTagType,
      scalaName = "xmlnsXlink",
      domName = "xlink",
      namespace = Some("xmlns"),
      scalaValueType = "String",
      codec = "StringAsIs",
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
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
      commentLines = Nil,
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/z",
      ),
    ),

  )
  
}
