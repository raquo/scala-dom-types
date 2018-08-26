package com.raquo.domtypes.generic.defs.attrs

import com.raquo.domtypes.generic.builders.SvgAttrBuilder

/** @tparam A SVG Attribute, canonically [[com.raquo.domtypes.generic.keys.SvgAttr]] */
trait SvgAttrs[A[_]] { this: SvgAttrBuilder[A] =>

  import SvgAttrs._

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
  lazy val accentHeight: A[Double] = doubleSvgAttr("accent-height")

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
  lazy val accumulate: A[String] = stringSvgAttr("accumulate")

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
  lazy val additive: A[String] = stringSvgAttr("additive")

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
  lazy val alignmentBaseline: A[String] = stringSvgAttr("alignment-baseline")


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
  lazy val ascent: A[Double] = doubleSvgAttr("ascent")


  /**
    * This attribute indicates the name of the attribute in the parent element
    * that is going to be changed during an animation.
    *
    * Value 	<attributeName>
    *
    * MDN
    */
  lazy val attributeName: A[String] = stringSvgAttr("attributeName")


  /**
    * This attribute specifies the namespace in which the target attribute
    * and its associated values are defined.
    *
    * Value 	CSS | XML | auto
    *
    * MDN
    */
  lazy val attributeType: A[String] = stringSvgAttr("attributeType")


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
  lazy val azimuth: A[Double] = doubleSvgAttr("azimuth")


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
  lazy val baseFrequency: A[String] = stringSvgAttr("baseFrequency")


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
  lazy val baselineShift: A[String] = stringSvgAttr("baseline-shift")


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
  lazy val begin: A[String] = stringSvgAttr("begin")


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
  lazy val bias: A[Double] = doubleSvgAttr("bias")


  /**
    * This attribute specifies the interpolation mode for the animation. The default
    * mode is linear, however if the attribute does not support linear interpolation
    * (e.g. for strings), the calcMode attribute is ignored and discrete interpolation is used.
    *
    * Value 	discrete | linear | paced | spline
    *
    * MDN
    */
  lazy val calcMode: A[String] = stringSvgAttr("calcMode")


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
  lazy val clip: A[String] = stringSvgAttr("clip")


  /**
    * The clip-path attribute bind the element is applied to with a given <clipPath> element
    * As a presentation attribute, it also can be used as a property directly inside a CSS stylesheet
    *
    * Value 	<FuncIRI> | none | inherit
    *
    * MDN
    */
  lazy val clipPathAttr: A[String] = stringSvgAttr("clip-path")

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
  lazy val clipPathUnits: A[String] = stringSvgAttr("clipPathUnits")

  /**
    * The clip-rule attribute only applies to graphics elements that are contained within a
    * <clipPath> element. The clip-rule attribute basically works as the fill-rule attribute,
    * except that it applies to <clipPath> definitions.
    *
    * Value 	nonezero | evenodd | inherit
    *
    * MDN
    */
  lazy val clipRule: A[String] = stringSvgAttr("clip-rule")

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
  lazy val color: A[String] = stringSvgAttr("color")


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
  lazy val colorInterpolation: A[String] = stringSvgAttr("color-interpolation")


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
  lazy val colorInterpolationFilters: A[String] = stringSvgAttr("color-interpolation-filters")


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
  lazy val colorProfileAttr: A[String] = stringSvgAttr("color-profile")


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
  lazy val colorRendering: A[String] = stringSvgAttr("color-rendering")


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
  lazy val contentScriptType: A[String] = stringSvgAttr("contentScriptType")


  /**
    * This attribute specifies the style sheet language for the given document fragment.
    * The contentStyleType is specified on the <svg> element. By default, if it's not defined,
    * the value is text/css
    *
    * Value 	<content-type>
    *
    * MDN
    */
  lazy val contentStyleType: A[String] = stringSvgAttr("contentStyleType")


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
  lazy val cursorAttr: A[String] = stringSvgAttr("cursor")


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
  lazy val cx: A[String] = stringSvgAttr("cx")

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
  lazy val cy: A[String] = stringSvgAttr("cy")


  /**
    *
    *
    * MDN
    */
  lazy val d: A[String] = stringSvgAttr("d")


  /**
    *
    *
    * MDN
    */
  lazy val diffuseConstant: A[String] = stringSvgAttr("diffuseConstant")


  /**
    *
    *
    * MDN
    */
  lazy val direction: A[String] = stringSvgAttr("direction")


  /**
    *
    *
    * MDN
    */
  lazy val display: A[String] = stringSvgAttr("display")


  /**
    *
    *
    * MDN
    */
  lazy val divisor: A[String] = stringSvgAttr("divisor")


  /**
    *
    *
    * MDN
    */
  lazy val dominantBaseline: A[String] = stringSvgAttr("dominant-baseline")


  /**
    *
    *
    * MDN
    */
  lazy val dur: A[String] = stringSvgAttr("dur")


  /**
    *
    *
    * MDN
    */
  lazy val dx: A[String] = stringSvgAttr("dx")


  /**
    *
    *
    * MDN
    */
  lazy val dy: A[String] = stringSvgAttr("dy")


  /**
    *
    *
    * MDN
    */
  lazy val edgeMode: A[String] = stringSvgAttr("edgeMode")


  /**
    *
    *
    * MDN
    */
  lazy val elevation: A[Double] = doubleSvgAttr("elevation")


  /**
    *
    *
    * MDN
    */
  lazy val end: A[String] = stringSvgAttr("end")


  /**
    *
    *
    * MDN
    */
  lazy val externalResourcesRequired: A[String] = stringSvgAttr("externalResourcesRequired")


  /**
    *
    *
    * MDN
    */
  lazy val fill: A[String] = stringSvgAttr("fill")


  /**
    *
    *
    * MDN
    */
  lazy val fillOpacity: A[String] = stringSvgAttr("fill-opacity")


  /**
    *
    *
    * MDN
    */
  lazy val fillRule: A[String] = stringSvgAttr("fill-rule")


  /**
    *
    *
    * MDN
    */
  lazy val filterAttr: A[String] = stringSvgAttr("filter")


  /**
    *
    *
    * MDN
    */
  lazy val filterRes: A[String] = stringSvgAttr("filterRes")


  /**
    *
    *
    * MDN
    */
  lazy val filterUnits: A[String] = stringSvgAttr("filterUnits")


  /**
    *
    *
    * MDN
    */
  lazy val floodColor: A[String] = stringSvgAttr("flood-color")


  /**
    *
    *
    * MDN
    */
  lazy val floodOpacity: A[String] = stringSvgAttr("flood-opacity")


  /**
    *
    *
    * MDN
    */
  lazy val fontFamily: A[String] = stringSvgAttr("font-family")


  /**
    *
    *
    * MDN
    */
  lazy val fontSize: A[String] = stringSvgAttr("font-size")


  /**
    *
    *
    * MDN
    */
  lazy val fontSizeAdjust: A[String] = stringSvgAttr("font-size-adjust")


  /**
    *
    *
    * MDN
    */
  lazy val fontStretch: A[String] = stringSvgAttr("font-stretch")


  /**
    *
    *
    * MDN
    */
  lazy val fontVariant: A[String] = stringSvgAttr("font-variant")


  /**
    *
    *
    * MDN
    */
  lazy val fontWeight: A[String] = stringSvgAttr("font-weight")


  /**
    *
    *
    * MDN
    */
  lazy val from: A[String] = stringSvgAttr("from")


  /**
    *
    *
    * MDN
    */
  lazy val gradientTransform: A[String] = stringSvgAttr("gradientTransform")


  /**
    *
    *
    * MDN
    */
  lazy val gradientUnits: A[String] = stringSvgAttr("gradientUnits")


  /**
    *
    *
    * MDN
    */
  lazy val height: A[String] = stringSvgAttr("height")


  /**
    *
    *
    * MDN
    */
  lazy val imageRendering: A[String] = stringSvgAttr("imageRendering")


  // @TODO[API] Ideally this should not be a distinct svg-specific attr, I think.
  lazy val id: A[String] = stringSvgAttr("id")


  /**
    *
    *
    * MDN
    */
  lazy val in: A[String] = stringSvgAttr("in")


  /**
    *
    *
    * MDN
    */
  lazy val in2: A[String] = stringSvgAttr("in2")


  /**
    *
    *
    * MDN
    */
  lazy val k1: A[Double] = doubleSvgAttr("k1")


  /**
    *
    *
    * MDN
    */
  lazy val k2: A[Double] = doubleSvgAttr("k2")


  /**
    *
    *
    * MDN
    */
  lazy val k3: A[Double] = doubleSvgAttr("k3")


  /**
    *
    *
    * MDN
    */
  lazy val k4: A[Double] = doubleSvgAttr("k4")


  /**
    *
    *
    * MDN
    */
  lazy val kernelMatrix: A[String] = stringSvgAttr("kernelMatrix")


  /**
    *
    *
    * MDN
    */
  lazy val kernelUnitLength: A[String] = stringSvgAttr("kernelUnitLength")


  /**
    *
    *
    * MDN
    */
  lazy val kerning: A[String] = stringSvgAttr("kerning")


  /**
    *
    *
    * MDN
    */
  lazy val keySplines: A[String] = stringSvgAttr("keySplines")


  /**
    *
    *
    * MDN
    */
  lazy val keyTimes: A[String] = stringSvgAttr("keyTimes")


  /**
    *
    *
    * MDN
    */
  lazy val letterSpacing: A[String] = stringSvgAttr("letter-spacing")


  /**
    *
    *
    * MDN
    */
  lazy val lightingColor: A[String] = stringSvgAttr("lighting-color")


  /**
    *
    *
    * MDN
    */
  lazy val limitingConeAngle: A[String] = stringSvgAttr("limitingConeAngle")


  /**
    *
    *
    * MDN
    */
  lazy val local: A[String] = stringSvgAttr("local")


  /**
    *
    *
    * MDN
    */
  lazy val markerEnd: A[String] = stringSvgAttr("marker-end")


  /**
    *
    *
    * MDN
    */
  lazy val markerMid: A[String] = stringSvgAttr("marker-mid")


  /**
    *
    *
    * MDN
    */
  lazy val markerStart: A[String] = stringSvgAttr("marker-start")


  /**
    *
    *
    * MDN
    */
  lazy val markerHeight: A[String] = stringSvgAttr("markerHeight")


  /**
    *
    *
    * MDN
    */
  lazy val markerUnits: A[String] = stringSvgAttr("markerUnits")


  /**
    *
    *
    * MDN
    */
  lazy val markerWidth: A[String] = stringSvgAttr("markerWidth")


  /**
    *
    *
    * MDN
    */
  lazy val maskContentUnits: A[String] = stringSvgAttr("maskContentUnits")


  /**
    *
    *
    * MDN
    */
  lazy val maskUnits: A[String] = stringSvgAttr("maskUnits")


  /**
    *
    *
    * MDN
    */
  lazy val maskAttr: A[String] = stringSvgAttr("mak")


  /**
    *
    *
    * MDN
    */
  lazy val max: A[String] = stringSvgAttr("max")


  /**
    *
    *
    * MDN
    */
  lazy val min: A[String] = stringSvgAttr("min")


  /**
    *
    *
    * MDN
    */
  lazy val mode: A[String] = stringSvgAttr("mode")


  /**
    *
    *
    * MDN
    */
  lazy val numOctaves: A[Int] = intSvgAttr("numOctaves")


  lazy val offset: A[String] = stringSvgAttr("offset")

  /**
    * This attribute defines the orientation of the marker relative to the shape it is attached to.
    *
    * Value type: auto|auto-start-reverse|<angle> ; Default value: 0; Animatable: yes
    *
    * MDN
    */
  lazy val orient: A[String] = stringSvgAttr("orient")

  /**
    *
    *
    * MDN
    */
  lazy val opacity: A[String] = stringSvgAttr("opacity")


  /**
    *
    *
    * MDN
    */
  lazy val operator: A[String] = stringSvgAttr("operator")


  /**
    *
    *
    * MDN
    */
  lazy val order: A[String] = stringSvgAttr("order")


  /**
    *
    *
    * MDN
    */
  lazy val overflow: A[String] = stringSvgAttr("overflow")


  /**
    *
    *
    * MDN
    */
  lazy val paintOrder: A[String] = stringSvgAttr("paint-order")


  /**
    *
    *
    * MDN
    */
  lazy val pathLength: A[String] = stringSvgAttr("pathLength")


  /**
    *
    *
    * MDN
    */
  lazy val patternContentUnits: A[String] = stringSvgAttr("patternContentUnits")


  /**
    *
    *
    * MDN
    */
  lazy val patternTransform: A[String] = stringSvgAttr("patternTransform")


  /**
    *
    *
    * MDN
    */
  lazy val patternUnits: A[String] = stringSvgAttr("patternUnits")


  /**
    *
    *
    * MDN
    */
  lazy val pointerEvents: A[String] = stringSvgAttr("pointer-events")


  /**
    *
    *
    * MDN
    */
  lazy val points: A[String] = stringSvgAttr("points")


  /**
    *
    *
    * MDN
    */
  lazy val pointsAtX: A[String] = stringSvgAttr("pointsAtX")


  /**
    *
    *
    * MDN
    */
  lazy val pointsAtY: A[String] = stringSvgAttr("pointsAtY")


  /**
    *
    *
    * MDN
    */
  lazy val pointsAtZ: A[String] = stringSvgAttr("pointsAtZ")


  /**
    *
    *
    * MDN
    */
  lazy val preserveAlpha: A[String] = stringSvgAttr("preserveAlpha")


  /**
    *
    *
    * MDN
    */
  lazy val preserveAspectRatio: A[String] = stringSvgAttr("preserveAspectRatio")


  /**
    *
    *
    * MDN
    */
  lazy val primitiveUnits: A[String] = stringSvgAttr("primitiveUnits")


  /**
    *
    *
    * MDN
    */
  lazy val r: A[String] = stringSvgAttr("r")


  /**
    *
    *
    * MDN
    */
  lazy val radius: A[String] = stringSvgAttr("radius")

  /**
    * The refX attribute is used alongside the refY attribute to provide coordinates for the location on the
    * marker where it will be joined to its markable element. Coordinates are relative to the marker's
    * coordinate system (after application of the ‘viewBox’ and ‘preserveAspectRatio’ attributes), and not
    * the markable element it is placed on.
    *
    * MDN
    */
  lazy val refX: A[String] = stringSvgAttr("refX")

  /**
    * The refY attribute is used alongside the refY attribute to provide coordinates for the location on the
    * marker where it will be joined to its markable element. Coordinates are relative to the marker's
    * coordinate system (after application of the ‘viewBox’ and ‘preserveAspectRatio’ attributes), and not
    * the markable element it is placed on.
    *
    * MDN
    */
  lazy val refY: A[String] = stringSvgAttr("refY")

  /**
    *
    *
    * MDN
    */
  lazy val repeatCount: A[String] = stringSvgAttr("repeatCount")


  /**
    *
    *
    * MDN
    */
  lazy val repeatDur: A[String] = stringSvgAttr("repeatDur")


  /**
    *
    *
    * MDN
    */
  lazy val requiredFeatures: A[String] = stringSvgAttr("requiredFeatures")


  /**
    *
    *
    * MDN
    */
  lazy val restart: A[String] = stringSvgAttr("restart")


  /**
    *
    *
    * MDN
    */
  lazy val result: A[String] = stringSvgAttr("result")


  /**
    *
    *
    * MDN
    */
  lazy val rx: A[String] = stringSvgAttr("rx")


  /**
    *
    *
    * MDN
    */
  lazy val ry: A[String] = stringSvgAttr("ry")


  /**
    *
    *
    * MDN
    */
  lazy val scale: A[String] = stringSvgAttr("scale")


  /**
    *
    *
    * MDN
    */
  lazy val seed: A[Double] = doubleSvgAttr("seed")


  /**
    *
    *
    * MDN
    */
  lazy val shapeRendering: A[String] = stringSvgAttr("shape-rendering")


  /**
    *
    *
    * MDN
    */
  lazy val specularConstant: A[Double] = doubleSvgAttr("specularConstant")


  /**
    *
    *
    * MDN
    */
  lazy val specularExponent: A[Double] = doubleSvgAttr("specularExponent")


  /**
    *
    *
    * MDN
    */
  lazy val spreadMethod: A[String] = stringSvgAttr("spreadMethod")


  /**
    *
    *
    * MDN
    */
  lazy val stdDeviation: A[String] = stringSvgAttr("stdDeviation")


  /**
    *
    *
    * MDN
    */
  lazy val stitchTiles: A[String] = stringSvgAttr("stitchTiles")


  /**
    *
    *
    * MDN
    */
  lazy val stopColor: A[String] = stringSvgAttr("stop-color")


  /**
    *
    *
    * MDN
    */
  lazy val stopOpacity: A[String] = stringSvgAttr("stop-opacity")


  /**
    *
    *
    * MDN
    */
  lazy val stroke: A[String] = stringSvgAttr("stroke")


  /**
    *
    *
    * MDN
    */
  lazy val strokeDashArray: A[String] = stringSvgAttr("stroke-dasharray")


  /**
    *
    *
    * MDN
    */
  lazy val strokeDashOffset: A[String] = stringSvgAttr("stroke-dashoffset")


  /**
    *
    *
    * MDN
    */
  lazy val strokeLineCap: A[String] = stringSvgAttr("stroke-linecap")


  /**
    *
    *
    * MDN
    */
  lazy val strokeLineJoin: A[String] = stringSvgAttr("stroke-linejoin")


  /**
    *
    *
    * MDN
    */
  lazy val strokeMiterLimit: A[String] = stringSvgAttr("stroke-miterlimit")


  /**
    *
    *
    * MDN
    */
  lazy val strokeOpacity: A[String] = stringSvgAttr("stroke-opacity")


  /**
    *
    *
    * MDN
    */
  lazy val strokeWidth: A[String] = stringSvgAttr("stroke-width")


  /**
    *
    *
    * MDN
    */
  lazy val style: A[String] = stringSvgAttr("style")


  /**
    *
    *
    * MDN
    */
  lazy val surfaceScale: A[String] = stringSvgAttr("surfaceScale")


  /**
    *
    *
    * MDN
    */
  lazy val targetX: A[String] = stringSvgAttr("targetX")


  /**
    *
    *
    * MDN
    */
  lazy val targetY: A[String] = stringSvgAttr("targetY")


  /**
    *
    *
    * MDN
    */
  lazy val textAnchor: A[String] = stringSvgAttr("text-anchor")


  /**
    *
    *
    * MDN
    */
  lazy val textDecoration: A[String] = stringSvgAttr("text-decoration")


  /**
    *
    *
    * MDN
    */
  lazy val textRendering: A[String] = stringSvgAttr("text-rendering")


  /**
    *
    *
    * MDN
    */
  lazy val to: A[String] = stringSvgAttr("to")


  /*
   *
   *
   * MDN
   */
  lazy val transform: A[String] = stringSvgAttr("transform")


  /*
   *
   *
   * MDN
   */
  lazy val `type`: A[String] = stringSvgAttr("type")

  lazy val typ: A[String] = `type`

  lazy val tpe: A[String] = `type`


  /*
   *
   *
   * MDN
   */
  lazy val values: A[String] = stringSvgAttr("values")


  /**
    *
    *
    * MDN
    */
  lazy val viewBox: A[String] = stringSvgAttr("viewBox")


  /*
   *
   *
   * MDN
   */
  lazy val visibility: A[String] = stringSvgAttr("visibility")


  /*
   *
   *
   * MDN
   */
  lazy val width: A[String] = stringSvgAttr("width")


  /*
   *
   *
   * MDN
   */
  lazy val wordSpacing: A[String] = stringSvgAttr("word-spacing")

  /*
   *
   *
   * MDN
   */
  lazy val writingMode: A[String] = stringSvgAttr("writing-mode")


  /*
   *
   *
   * MDN
   */
  lazy val x: A[String] = stringSvgAttr("x")


  /*
   *
   *
   * MDN
   */
  lazy val x1: A[String] = stringSvgAttr("x1")


  /*
   *
   *
   * MDN
   */
  lazy val x2: A[String] = stringSvgAttr("x2")


  /*
   *
   *
   * MDN
   */
  lazy val xChannelSelector: A[String] = stringSvgAttr("xChannelSelector")


  /*
   *
   *
   * MDN
   */
  // TODO : this currently does not work,have to add namespace: Namespace.svgXlinkNamespaceConfig)
  lazy val xlinkHref: A[String] = stringSvgAttr("xlink:href", namespace = xlinkNamespace)


  /*
   *
   *
   * MDN
   */
  lazy val xlinkRole: A[String] = stringSvgAttr("xlink:role", namespace = xlinkNamespace)


  /*
   *
   *
   * MDN
   */
  lazy val xlinkTitle: A[String] = stringSvgAttr("xlink:title", namespace = xlinkNamespace)


  /*
   *
   *
   * MDN
   */
  lazy val xmlSpace: A[String] = stringSvgAttr("xml:space", namespace = xmlNamespace)


  /**
    *
    *
    * MDN
    */
  lazy val xmlns: A[String] = stringSvgAttr("xmlns")


  /**
    *
    *
    * MDN
    */
  lazy val xmlnsXlink: A[String] = stringSvgAttr("xmlns:xlink", namespace = xlinkNamespace)


  /*
   *
   *
   * MDN
   */
  lazy val y: A[String] = stringSvgAttr("y")


  /*
   *
   *
   * MDN
   */
  lazy val y1: A[String] = stringSvgAttr("y1")


  /*
   *
   *
   * MDN
   */
  lazy val y2: A[String] = stringSvgAttr("y2")


  /*
   *
   *
   * MDN
   */
  lazy val yChannelSelector: A[String] = stringSvgAttr("yChannelSelector")


  /*
   *
   *
   * MDN
   */
  lazy val z: A[String] = stringSvgAttr("z")
}

object SvgAttrs {

  private[SvgAttrs] val xlinkNamespace = Some("http://www.w3.org/1999/xlink")

  private[SvgAttrs] val xmlNamespace = Some("http://www.w3.org/XML/1998/namespace")
}
