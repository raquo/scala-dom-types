package com.raquo.domtypes.generic.defs.attrs

import com.raquo.domtypes.generic.builders.AttrBuilder

/** @tparam A SVG Attribute, canonically [[com.raquo.domtypes.generic.keys.SvgAttr]] */
trait SvgAttrs[A[_]] { this: AttrBuilder[A] =>

  /**
    * This attribute defines the distance from the origin to the top of accent characters,
    * measured by a distance within the font coordinate system.
    * If the attribute is not specified, the effect is as if the attribute
    * were set to the value of the ascent attribute.
    *
    * Value 	<number>
    *
    * MDN
    */
  lazy val accentHeight: A[Double] = doubleAttr("accent-height")

  /**
    * This attribute controls whether or not the animation is cumulative.
    * It is frequently useful for repeated animations to build upon the previous results,
    * accumulating with each iteration. This attribute said to the animation if the value is added to
    * the previous animated attribute's value on each iteration.
    *
    * Value 	none | sum
    *
    * MDN
    */
  lazy val accumulate: A[String] = stringAttr("accumulate")

  /**
    * This attribute controls whether or not the animation is additive.
    * It is frequently useful to define animation as an offset or delta
    * to an attribute's value, rather than as absolute values. This
    * attribute said to the animation if their values are added to the
    * original animated attribute's value.
    *
    * Value 	replace | sum
    *
    * MDN
    */
  lazy val additive: A[String] = stringAttr("additive")

  /**
    * The alignment-baseline attribute specifies how an object is aligned
    * with respect to its parent. This property specifies which baseline
    * of this element is to be aligned with the corresponding baseline of
    * the parent. For example, this allows alphabetic baselines in Roman
    * text to stay aligned across font size changes. It defaults to the
    * baseline with the same name as the computed value of the
    * alignment-baseline property. As a presentation attribute, it also
    * can be used as a property directly inside a CSS stylesheet, see css
    * alignment-baseline for further information.
    *
    * Value: 	auto | baseline | before-edge | text-before-edge | middle | central | after-edge |
    * text-after-edge | ideographic | alphabetic | hanging | mathematical | inherit
    *
    * MDN
    */
  lazy val alignmentBaseline: A[String] = stringAttr("alignment-baseline")


  /**
    * This attribute defines the maximum unaccented depth of the font
    * within the font coordinate system. If the attribute is not specified,
    * the effect is as if the attribute were set to the vert-origin-y value
    * for the corresponding font.
    *
    * Value 	<number>
    *
    * MDN
    */
  lazy val ascent: A[Double] = doubleAttr("ascent")


  /**
    * This attribute indicates the name of the attribute in the parent element
    * that is going to be changed during an animation.
    *
    * Value 	<attributeName>
    *
    * MDN
    */
  lazy val attributeName: A[String] = stringAttr("attributeName")


  /**
    * This attribute specifies the namespace in which the target attribute
    * and its associated values are defined.
    *
    * Value 	CSS | XML | auto
    *
    * MDN
    */
  lazy val attributeType: A[String] = stringAttr("attributeType")


  /**
    * The azimuth attribute represent the direction angle for the light
    * source on the XY plane (clockwise), in degrees from the x axis.
    * If the attribute is not specified, then the effect is as if a
    * value of 0 were specified.
    *
    * Value 	<number>
    *
    * MDN
    */
  lazy val azimuth: A[Double] = doubleAttr("azimuth")


  /**
    * The baseFrequency attribute represent The base frequencies parameter
    * for the noise function of the <feturbulence> primitive. If two <number>s
    * are provided, the first number represents a base frequency in the X
    * direction and the second value represents a base frequency in the Y direction.
    * If one number is provided, then that value is used for both X and Y.
    * Negative values are forbidden.
    * If the attribute is not specified, then the effect is as if a value
    * of 0 were specified.
    *
    * Value 	<number-optional-number>
    *
    * MDN
    */
  lazy val baseFrequency: A[String] = stringAttr("baseFrequency")


  /**
    * The baseline-shift attribute allows repositioning of the dominant-baseline
    * relative to the dominant-baseline of the parent text content element.
    * The shifted object might be a sub- or superscript.
    * As a presentation attribute, it also can be used as a property directly
    * inside a CSS stylesheet, see css baseline-shift for further information.
    *
    * Value 	auto | baseline | sup | sub | <percentage> | <length> | inherit
    *
    * MDN
    */
  lazy val baselineShift: A[String] = stringAttr("baseline-shift")


  /**
    * This attribute defines when an animation should begin.
    * The attribute value is a semicolon separated list of values. The interpretation
    * of a list of start times is detailed in the SMIL specification in "Evaluation
    * of begin and end time lists". Each individual value can be one of the following:
    * <offset-value>, <syncbase-value>, <event-value>, <repeat-value>, <accessKey-value>,
    * <wallclock-sync-value> or the keyword indefinite.
    *
    * Value 	<begin-value-list>
    *
    * MDN
    */
  lazy val begin: A[String] = stringAttr("begin")


  /**
    * The bias attribute shifts the range of the filter. After applying the kernelMatrix
    * of the <feConvolveMatrix> element to the input image to yield a number and applied
    * the divisor attribute, the bias attribute is added to each component. This allows
    * representation of values that would otherwise be clamped to 0 or 1.
    * If bias is not specified, then the effect is as if a value of 0 were specified.
    *
    * Value 	<number>
    *
    * MDN
    */
  lazy val bias: A[Double] = doubleAttr("bias")


  /**
    * This attribute specifies the interpolation mode for the animation. The default
    * mode is linear, however if the attribute does not support linear interpolation
    * (e.g. for strings), the calcMode attribute is ignored and discrete interpolation is used.
    *
    * Value 	discrete | linear | paced | spline
    *
    * MDN
    */
  lazy val calcMode: A[String] = stringAttr("calcMode")


  /**
    * Assigns a class name or set of class names to an element. You may assign the same
    * class name or names to any number of elements. If you specify multiple class names,
    * they must be separated by whitespace characters.
    * The class name of an element has two key roles:
    * -As a style sheet selector, for use when an author wants to assign style
    * information to a set of elements.
    * -For general usage by the browser.
    * The class can be used to style SVG content using CSS.
    *
    * Value 	<list-of-class-names>
    *
    * MDN
    */
  lazy val className: A[String] = stringAttr("class")

  lazy val cls: A[String] = className


  /**
    * The clip attribute has the same parameter values as defined for the css clip property.
    * Unitless values, which indicate current user coordinates, are permitted on the coordinate
    * values on the <shape>. The value of auto defines a clipping path along the bounds of
    * the viewport created by the given element.
    * As a presentation attribute, it also can be used as a property directly inside a
    * CSS stylesheet, see css clip for further information.
    *
    * Value 	auto | <shape> | inherit
    *
    * MDN
    */
  lazy val clip: A[String] = stringAttr("clip")


  /**
    * The clip-path attribute bind the element is applied to with a given <clipPath> element
    * As a presentation attribute, it also can be used as a property directly inside a CSS stylesheet
    *
    * Value 	<FuncIRI> | none | inherit
    *
    * MDN
    */
  lazy val clipPathAttr: A[String] = stringAttr("clip-path")

  /**
    * The clipPathUnits attribute defines the coordinate system for the contents
    * of the <clipPath> element. the clipPathUnits attribute is not specified,
    * then the effect is as if a value of userSpaceOnUse were specified.
    * Note that values defined as a percentage inside the content of the <clipPath>
    * are not affected by this attribute. It means that even if you set the value of
    * maskContentUnits to objectBoundingBox, percentage values will be calculated as
    * if the value of the attribute were userSpaceOnUse.
    *
    * Value 	userSpaceOnUse | objectBoundingBox
    *
    * MDN
    */
  lazy val clipPathUnits: A[String] = stringAttr("clipPathUnits")

  /**
    * The clip-rule attribute only applies to graphics elements that are contained within a
    * <clipPath> element. The clip-rule attribute basically works as the fill-rule attribute,
    * except that it applies to <clipPath> definitions.
    *
    * Value 	nonezero | evenodd | inherit
    *
    * MDN
    */
  lazy val clipRule: A[String] = stringAttr("clip-rule")

  /**
    * The color attribute is used to provide a potential indirect value (currentColor)
    * for the fill, stroke, stop-color, flood-color and lighting-color attributes.
    * As a presentation attribute, it also can be used as a property directly inside a CSS
    * stylesheet, see css color for further information.
    *
    * Value 	<color> | inherit
    *
    * MDN
    */
  lazy val color: A[String] = stringAttr("color")


  /**
    * The color-interpolation attribute specifies the color space for gradient interpolations,
    * color animations and alpha compositing.When a child element is blended into a background,
    * the value of the color-interpolation attribute on the child determines the type of
    * blending, not the value of the color-interpolation on the parent. For gradients which
    * make use of the xlink:href attribute to reference another gradient, the gradient uses
    * the color-interpolation attribute value from the gradient element which is directly
    * referenced by the fill or stroke attribute. When animating colors, color interpolation
    * is performed according to the value of the color-interpolation attribute on the element
    * being animated.
    * As a presentation attribute, it also can be used as a property directly inside a CSS
    * stylesheet, see css color-interpolation for further information
    *
    * Value 	auto | sRGB | linearRGB | inherit
    *
    * MDN
    */
  lazy val colorInterpolation: A[String] = stringAttr("color-interpolation")


  /**
    * The color-interpolation-filters attribute specifies the color space for imaging operations
    * performed via filter effects. Note that color-interpolation-filters has a different
    * initial value than color-interpolation. color-interpolation-filters has an initial
    * value of linearRGB, whereas color-interpolation has an initial value of sRGB. Thus,
    * in the default case, filter effects operations occur in the linearRGB color space,
    * whereas all other color interpolations occur by default in the sRGB color space.
    * As a presentation attribute, it also can be used as a property directly inside a
    * CSS stylesheet, see css color-interpolation-filters for further information
    *
    * Value 	auto | sRGB | linearRGB | inherit
    *
    * MDN
    */
  lazy val colorInterpolationFilters: A[String] = stringAttr("color-interpolation-filters")


  /**
    * The color-profile attribute is used to define which color profile a raster image
    * included through the <image> element should use. As a presentation attribute, it
    * also can be used as a property directly inside a CSS stylesheet, see css color-profile
    * for further information.
    *
    * Value 	auto | sRGB | <name> | <IRI> | inherit
    *
    * MDN
    */
  lazy val colorProfileAttr: A[String] = stringAttr("color-profile")


  /**
    * The color-rendering attribute provides a hint to the SVG user agent about how to
    * optimize its color interpolation and compositing operations. color-rendering
    * takes precedence over color-interpolation-filters. For example, assume color-rendering:
    * optimizeSpeed and color-interpolation-filters: linearRGB. In this case, the SVG user
    * agent should perform color operations in a way that optimizes performance, which might
    * mean sacrificing the color interpolation precision as specified by
    * color-interpolation-filters: linearRGB.
    * As a presentation attribute, it also can be used as a property directly inside
    * a CSS stylesheet, see css color-rendering for further information
    *
    * Value 	auto | optimizeSpeed | optimizeQuality | inherit
    *
    * MDN
    */
  lazy val colorRendering: A[String] = stringAttr("color-rendering")


  /**
    * The contentScriptType attribute on the <svg> element specifies the default scripting
    * language for the given document fragment.
    * This attribute sets the default scripting language used to process the value strings
    * in event attributes. This language must be used for all instances of script that do not
    * specify their own scripting language. The value content-type specifies a media type,
    * per MIME Part Two: Media Types [RFC2046]. The default value is application/ecmascript
    *
    * Value 	<content-type>
    *
    * MDN
    */
  lazy val contentScriptType: A[String] = stringAttr("contentScriptType")


  /**
    * This attribute specifies the style sheet language for the given document fragment.
    * The contentStyleType is specified on the <svg> element. By default, if it's not defined,
    * the value is text/css
    *
    * Value 	<content-type>
    *
    * MDN
    */
  lazy val contentStyleType: A[String] = stringAttr("contentStyleType")


  /**
    * The cursor attribute specifies the mouse cursor displayed when the mouse pointer
    * is over an element.This attribute behave exactly like the css cursor property except
    * that if the browser suport the <cursor> element, it should allow to use it with the
    * <funciri> notation. As a presentation attribute, it also can be used as a property
    * directly inside a CSS stylesheet, see css cursor for further information.
    *
    * Value 	 auto | crosshair | default | pointer | move | e-resize |
    * ne-resize | nw-resize | n-resize | se-resize | sw-resize | s-resize | w-resize| text |
    * wait | help | inherit
    *
    * MDN
    */
  lazy val cursorAttr: A[String] = stringAttr("cursor")


  /**
    * For the <circle> and the <ellipse> element, this attribute define the x-axis coordinate
    * of the center of the element. If the attribute is not specified, the effect is as if a
    * value of "0" were specified.For the <radialGradient> element, this attribute define
    * the x-axis coordinate of the largest (i.e., outermost) circle for the radial gradient.
    * The gradient will be drawn such that the 100% gradient stop is mapped to the perimeter
    * of this largest (i.e., outermost) circle. If the attribute is not specified, the effect
    * is as if a value of 50% were specified
    *
    * Value 	<coordinate>
    *
    * MDN
    */
  lazy val cx: A[String] = stringAttr("cx")

  /**
    * For the <circle> and the <ellipse> element, this attribute define the y-axis coordinate
    * of the center of the element. If the attribute is not specified, the effect is as if a
    * value of "0" were specified.For the <radialGradient> element, this attribute define
    * the x-axis coordinate of the largest (i.e., outermost) circle for the radial gradient.
    * The gradient will be drawn such that the 100% gradient stop is mapped to the perimeter
    * of this largest (i.e., outermost) circle. If the attribute is not specified, the effect
    * is as if a value of 50% were specified
    *
    * Value 	<coordinate>
    *
    * MDN
    */
  lazy val cy: A[String] = stringAttr("cy")


  /**
    *
    *
    * MDN
    */
  lazy val d: A[String] = stringAttr("d")


  /**
    *
    *
    * MDN
    */
  lazy val diffuseConstant: A[String] = stringAttr("diffuseConstant")


  /**
    *
    *
    * MDN
    */
  lazy val direction: A[String] = stringAttr("direction")


  /**
    *
    *
    * MDN
    */
  lazy val display: A[String] = stringAttr("display")


  /**
    *
    *
    * MDN
    */
  lazy val divisor: A[String] = stringAttr("divisor")


  /**
    *
    *
    * MDN
    */
  lazy val dominantBaseline: A[String] = stringAttr("dominant-baseline")


  /**
    *
    *
    * MDN
    */
  lazy val dur: A[String] = stringAttr("dur")


  /**
    *
    *
    * MDN
    */
  lazy val dx: A[String] = stringAttr("dx")


  /**
    *
    *
    * MDN
    */
  lazy val dy: A[String] = stringAttr("dy")


  /**
    *
    *
    * MDN
    */
  lazy val edgeMode: A[String] = stringAttr("edgeMode")


  /**
    *
    *
    * MDN
    */
  lazy val elevation: A[Double] = doubleAttr("elevation")


  /**
    *
    *
    * MDN
    */
  lazy val end: A[String] = stringAttr("end")


  /**
    *
    *
    * MDN
    */
  lazy val externalResourcesRequired: A[String] = stringAttr("externalResourcesRequired")


  /**
    *
    *
    * MDN
    */
  lazy val fill: A[String] = stringAttr("fill")


  /**
    *
    *
    * MDN
    */
  lazy val fillOpacity: A[String] = stringAttr("fill-opacity")


  /**
    *
    *
    * MDN
    */
  lazy val fillRule: A[String] = stringAttr("fill-rule")


  /**
    *
    *
    * MDN
    */
  lazy val filterAttr: A[String] = stringAttr("filter")


  /**
    *
    *
    * MDN
    */
  lazy val filterRes: A[String] = stringAttr("filterRes")


  /**
    *
    *
    * MDN
    */
  lazy val filterUnits: A[String] = stringAttr("filterUnits")


  /**
    *
    *
    * MDN
    */
  lazy val floodColor: A[String] = stringAttr("flood-color")


  /**
    *
    *
    * MDN
    */
  lazy val floodOpacity: A[String] = stringAttr("flood-opacity")


  /**
    *
    *
    * MDN
    */
  lazy val fontFamily: A[String] = stringAttr("font-family")


  /**
    *
    *
    * MDN
    */
  lazy val fontSize: A[String] = stringAttr("font-size")


  /**
    *
    *
    * MDN
    */
  lazy val fontSizeAdjust: A[String] = stringAttr("font-size-adjust")


  /**
    *
    *
    * MDN
    */
  lazy val fontStretch: A[String] = stringAttr("font-stretch")


  /**
    *
    *
    * MDN
    */
  lazy val fontVariant: A[String] = stringAttr("font-variant")


  /**
    *
    *
    * MDN
    */
  lazy val fontWeight: A[String] = stringAttr("font-weight")


  /**
    *
    *
    * MDN
    */
  lazy val from: A[String] = stringAttr("from")


  /**
    *
    *
    * MDN
    */
  lazy val gradientTransform: A[String] = stringAttr("gradientTransform")


  /**
    *
    *
    * MDN
    */
  lazy val gradientUnits: A[String] = stringAttr("gradientUnits")


  /**
    *
    *
    * MDN
    */
  lazy val height: A[String] = stringAttr("height")


  /**
    *
    *
    * MDN
    */
  lazy val imageRendering: A[String] = stringAttr("imageRendering")


  // @TODO[API] Ideally this should not be a distinct svg-specific attr, I think.
  lazy val id: A[String] = stringAttr("id")


  /**
    *
    *
    * MDN
    */
  lazy val in: A[String] = stringAttr("in")


  /**
    *
    *
    * MDN
    */
  lazy val in2: A[String] = stringAttr("in2")


  /**
    *
    *
    * MDN
    */
  lazy val k1: A[Double] = doubleAttr("k1")


  /**
    *
    *
    * MDN
    */
  lazy val k2: A[Double] = doubleAttr("k2")


  /**
    *
    *
    * MDN
    */
  lazy val k3: A[Double] = doubleAttr("k3")


  /**
    *
    *
    * MDN
    */
  lazy val k4: A[Double] = doubleAttr("k4")


  /**
    *
    *
    * MDN
    */
  lazy val kernelMatrix: A[String] = stringAttr("kernelMatrix")


  /**
    *
    *
    * MDN
    */
  lazy val kernelUnitLength: A[String] = stringAttr("kernelUnitLength")


  /**
    *
    *
    * MDN
    */
  lazy val kerning: A[String] = stringAttr("kerning")


  /**
    *
    *
    * MDN
    */
  lazy val keySplines: A[String] = stringAttr("keySplines")


  /**
    *
    *
    * MDN
    */
  lazy val keyTimes: A[String] = stringAttr("keyTimes")


  /**
    *
    *
    * MDN
    */
  lazy val letterSpacing: A[String] = stringAttr("letter-spacing")


  /**
    *
    *
    * MDN
    */
  lazy val lightingColor: A[String] = stringAttr("lighting-color")


  /**
    *
    *
    * MDN
    */
  lazy val limitingConeAngle: A[String] = stringAttr("limitingConeAngle")


  /**
    *
    *
    * MDN
    */
  lazy val local: A[String] = stringAttr("local")


  /**
    *
    *
    * MDN
    */
  lazy val markerEnd: A[String] = stringAttr("marker-end")


  /**
    *
    *
    * MDN
    */
  lazy val markerMid: A[String] = stringAttr("marker-mid")


  /**
    *
    *
    * MDN
    */
  lazy val markerStart: A[String] = stringAttr("marker-start")


  /**
    *
    *
    * MDN
    */
  lazy val markerHeight: A[String] = stringAttr("markerHeight")


  /**
    *
    *
    * MDN
    */
  lazy val markerUnits: A[String] = stringAttr("markerUnits")


  /**
    *
    *
    * MDN
    */
  lazy val markerWidth: A[String] = stringAttr("markerWidth")


  /**
    *
    *
    * MDN
    */
  lazy val maskContentUnits: A[String] = stringAttr("maskContentUnits")


  /**
    *
    *
    * MDN
    */
  lazy val maskUnits: A[String] = stringAttr("maskUnits")


  /**
    *
    *
    * MDN
    */
  lazy val maskAttr: A[String] = stringAttr("mak")


  /**
    *
    *
    * MDN
    */
  lazy val max: A[String] = stringAttr("max")


  /**
    *
    *
    * MDN
    */
  lazy val min: A[String] = stringAttr("min")


  /**
    *
    *
    * MDN
    */
  lazy val mode: A[String] = stringAttr("mode")


  /**
    *
    *
    * MDN
    */
  lazy val numOctaves: A[Int] = intAttr("numOctaves")


  lazy val offset: A[String] = stringAttr("offset")

  /**
    *
    *
    * MDN
    */
  lazy val opacity: A[String] = stringAttr("opacity")


  /**
    *
    *
    * MDN
    */
  lazy val operator: A[String] = stringAttr("operator")


  /**
    *
    *
    * MDN
    */
  lazy val order: A[String] = stringAttr("order")


  /**
    *
    *
    * MDN
    */
  lazy val overflow: A[String] = stringAttr("overflow")


  /**
    *
    *
    * MDN
    */
  lazy val paintOrder: A[String] = stringAttr("paint-order")


  /**
    *
    *
    * MDN
    */
  lazy val pathLength: A[String] = stringAttr("pathLength")


  /**
    *
    *
    * MDN
    */
  lazy val patternContentUnits: A[String] = stringAttr("patternContentUnits")


  /**
    *
    *
    * MDN
    */
  lazy val patternTransform: A[String] = stringAttr("patternTransform")


  /**
    *
    *
    * MDN
    */
  lazy val patternUnits: A[String] = stringAttr("patternUnits")


  /**
    *
    *
    * MDN
    */
  lazy val pointerEvents: A[String] = stringAttr("pointer-events")


  /**
    *
    *
    * MDN
    */
  lazy val points: A[String] = stringAttr("points")


  /**
    *
    *
    * MDN
    */
  lazy val pointsAtX: A[String] = stringAttr("pointsAtX")


  /**
    *
    *
    * MDN
    */
  lazy val pointsAtY: A[String] = stringAttr("pointsAtY")


  /**
    *
    *
    * MDN
    */
  lazy val pointsAtZ: A[String] = stringAttr("pointsAtZ")


  /**
    *
    *
    * MDN
    */
  lazy val preserveAlpha: A[String] = stringAttr("preserveAlpha")


  /**
    *
    *
    * MDN
    */
  lazy val preserveAspectRatio: A[String] = stringAttr("preserveAspectRatio")


  /**
    *
    *
    * MDN
    */
  lazy val primitiveUnits: A[String] = stringAttr("primitiveUnits")


  /**
    *
    *
    * MDN
    */
  lazy val r: A[String] = stringAttr("r")


  /**
    *
    *
    * MDN
    */
  lazy val radius: A[String] = stringAttr("radius")


  /**
    *
    *
    * MDN
    */
  lazy val repeatCount: A[String] = stringAttr("repeatCount")


  /**
    *
    *
    * MDN
    */
  lazy val repeatDur: A[String] = stringAttr("repeatDur")


  /**
    *
    *
    * MDN
    */
  lazy val requiredFeatures: A[String] = stringAttr("requiredFeatures")


  /**
    *
    *
    * MDN
    */
  lazy val restart: A[String] = stringAttr("restart")


  /**
    *
    *
    * MDN
    */
  lazy val result: A[String] = stringAttr("result")


  /**
    *
    *
    * MDN
    */
  lazy val rx: A[String] = stringAttr("rx")


  /**
    *
    *
    * MDN
    */
  lazy val ry: A[String] = stringAttr("ry")


  /**
    *
    *
    * MDN
    */
  lazy val scale: A[String] = stringAttr("scale")


  /**
    *
    *
    * MDN
    */
  lazy val seed: A[Double] = doubleAttr("seed")


  /**
    *
    *
    * MDN
    */
  lazy val shapeRendering: A[String] = stringAttr("shape-rendering")


  /**
    *
    *
    * MDN
    */
  lazy val specularConstant: A[Double] = doubleAttr("specularConstant")


  /**
    *
    *
    * MDN
    */
  lazy val specularExponent: A[Double] = doubleAttr("specularExponent")


  /**
    *
    *
    * MDN
    */
  lazy val spreadMethod: A[String] = stringAttr("spreadMethod")


  /**
    *
    *
    * MDN
    */
  lazy val stdDeviation: A[String] = stringAttr("stdDeviation")


  /**
    *
    *
    * MDN
    */
  lazy val stitchTiles: A[String] = stringAttr("stitchTiles")


  /**
    *
    *
    * MDN
    */
  lazy val stopColor: A[String] = stringAttr("stop-color")


  /**
    *
    *
    * MDN
    */
  lazy val stopOpacity: A[String] = stringAttr("stop-opacity")


  /**
    *
    *
    * MDN
    */
  lazy val stroke: A[String] = stringAttr("stroke")


  /**
    *
    *
    * MDN
    */
  lazy val strokeDashArray: A[String] = stringAttr("stroke-dasharray")


  /**
    *
    *
    * MDN
    */
  lazy val strokeDashOffset: A[String] = stringAttr("stroke-dashoffset")


  /**
    *
    *
    * MDN
    */
  lazy val strokeLineCap: A[String] = stringAttr("stroke-linecap")


  /**
    *
    *
    * MDN
    */
  lazy val strokeLineJoin: A[String] = stringAttr("stroke-linejoin")


  /**
    *
    *
    * MDN
    */
  lazy val strokeMiterLimit: A[String] = stringAttr("stroke-miterlimit")


  /**
    *
    *
    * MDN
    */
  lazy val strokeOpacity: A[String] = stringAttr("stroke-opacity")


  /**
    *
    *
    * MDN
    */
  lazy val strokeWidth: A[String] = stringAttr("stroke-width")


  /**
    *
    *
    * MDN
    */
  lazy val style: A[String] = stringAttr("style")


  /**
    *
    *
    * MDN
    */
  lazy val surfaceScale: A[String] = stringAttr("surfaceScale")


  /**
    *
    *
    * MDN
    */
  lazy val targetX: A[String] = stringAttr("targetX")


  /**
    *
    *
    * MDN
    */
  lazy val targetY: A[String] = stringAttr("targetY")


  /**
    *
    *
    * MDN
    */
  lazy val textAnchor: A[String] = stringAttr("text-anchor")


  /**
    *
    *
    * MDN
    */
  lazy val textDecoration: A[String] = stringAttr("text-decoration")


  /**
    *
    *
    * MDN
    */
  lazy val textRendering: A[String] = stringAttr("text-rendering")


  /**
    *
    *
    * MDN
    */
  lazy val to: A[String] = stringAttr("to")


  /*
   *
   *
   * MDN
   */
  lazy val transform: A[String] = stringAttr("transform")


  /*
   *
   *
   * MDN
   */
  lazy val `type`: A[String] = stringAttr("type")

  lazy val typ: A[String] = `type`

  lazy val tpe: A[String] = `type`


  /*
   *
   *
   * MDN
   */
  lazy val values: A[String] = stringAttr("values")


  /**
    *
    *
    * MDN
    */
  lazy val viewBox: A[String] = stringAttr("viewBox")


  /*
   *
   *
   * MDN
   */
  lazy val visibility: A[String] = stringAttr("visibility")


  /*
   *
   *
   * MDN
   */
  lazy val width: A[String] = stringAttr("width")


  /*
   *
   *
   * MDN
   */
  lazy val wordSpacing: A[String] = stringAttr("word-spacing")

  /*
   *
   *
   * MDN
   */
  lazy val writingMode: A[String] = stringAttr("writing-mode")


  /*
   *
   *
   * MDN
   */
  lazy val x: A[String] = stringAttr("x")


  /*
   *
   *
   * MDN
   */
  lazy val x1: A[String] = stringAttr("x1")


  /*
   *
   *
   * MDN
   */
  lazy val x2: A[String] = stringAttr("x2")


  /*
   *
   *
   * MDN
   */
  lazy val xChannelSelector: A[String] = stringAttr("xChannelSelector")


  /*
   *
   *
   * MDN
   */
  // TODO : this currently does not work,have to add namespace: Namespace.svgXlinkNamespaceConfig)
  lazy val xlinkHref: A[String] = stringAttr("xlink:href")


  /*
   *
   *
   * MDN
   */
  lazy val xlink: A[String] = stringAttr("xlink:role")


  /*
   *
   *
   * MDN
   */
  lazy val xlinkTitle: A[String] = stringAttr("xlink:title")


  /*
   *
   *
   * MDN
   */
  lazy val xmlSpace: A[String] = stringAttr("xml:space")


  /**
    *
    *
    * MDN
    */
  lazy val xmlns: A[String] = stringAttr("xmlns")


  /**
    *
    *
    * MDN
    */
  lazy val xmlnsXlink: A[String] = stringAttr("xmlns:xlink")


  /*
   *
   *
   * MDN
   */
  lazy val y: A[String] = stringAttr("y")


  /*
   *
   *
   * MDN
   */
  lazy val y1: A[String] = stringAttr("y1")


  /*
   *
   *
   * MDN
   */
  lazy val y2: A[String] = stringAttr("y2")


  /*
   *
   *
   * MDN
   */
  lazy val yChannelSelector: A[String] = stringAttr("yChannelSelector")


  /*
   *
   *
   * MDN
   */
  lazy val z: A[String] = stringAttr("z")
}
