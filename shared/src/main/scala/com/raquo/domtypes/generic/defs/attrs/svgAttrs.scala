
package com.raquo.domtypes.generic.defs.attrs

import com.raquo.domtypes.generic.builders.AttrBuilder
import com.raquo.domtypes.generic.codecs.{BooleanAsOnOffStringCodec, BooleanAsTrueFalseStringCodec}

 
// adopted from : 
// https://github.com/lihaoyi/scalatags/blob/44cbd0602d40186d33d39b8d4a259f681d2e4a3b/scalatags/shared/src/main/scala/scalatags/generic/SvgAttrs.scala
  /** @tparam A svg Attribute, canonically [[com.raquo.domtypes.generic.keys.SvgAttr]] */
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
    lazy val accentHeight = stringAttr("accent-height")

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
    lazy val accumulate = stringAttr("accumulate")

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
    lazy val additive = stringAttr("additive")

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
    lazy val alignmentBaseline = stringAttr("alignment-baseline")


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
    lazy val ascent = stringAttr("ascent")


    /**
      * This attribute indicates the name of the attribute in the parent element
      * that is going to be changed during an animation.
      *
      * Value 	<attributeName>
      *
      * MDN
      */
    lazy val attributeName = stringAttr("attributeName")


    /**
      * This attribute specifies the namespace in which the target attribute
      * and its associated values are defined.
      *
      * Value 	CSS | XML | auto
      *
      * MDN
      */
    lazy val attributeType = stringAttr("attributeType")


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
    lazy val azimuth = stringAttr("azimuth")


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
    lazy val baseFrequency = stringAttr("baseFrequency")


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
    lazy val baselineShift = stringAttr("baseline-shift")


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
    lazy val begin = stringAttr("begin")


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
    lazy val bias = stringAttr("bias")


    /**
      * This attribute specifies the interpolation mode for the animation. The default
      * mode is linear, however if the attribute does not support linear interpolation
      * (e.g. for strings), the calcMode attribute is ignored and discrete interpolation is used.
      *
      * Value 	discrete | linear | paced | spline
      *
      * MDN
      */
    lazy val calcMode = stringAttr("calcMode")


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
    lazy val `class` = stringAttr("class")


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
    lazy val clip = stringAttr("clip")


    /**
      * The clip-path attribute bind the element is applied to with a given <clipPath> element
      * As a presentation attribute, it also can be used as a property directly inside a CSS stylesheet
      *
      * Value 	<FuncIRI> | none | inherit
      *
      * MDN
      */
    lazy val clipPathAttr = stringAttr("clip-path")

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
    lazy val clipPathUnits = stringAttr("clipPathUnits")

    /**
      * The clip-rule attribute only applies to graphics elements that are contained within a
      * <clipPath> element. The clip-rule attribute basically works as the fill-rule attribute,
      * except that it applies to <clipPath> definitions.
      *
      * Value 	nonezero | evenodd | inherit
      *
      * MDN
      */
    lazy val clipRule = stringAttr("clip-rule")

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
    lazy val color = stringAttr("color")


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
    lazy val colorInterpolation = stringAttr("color-interpolation")


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
    lazy val colorInterpolationFilters = stringAttr("color-interpolation-filters")


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
    lazy val colorProfile = stringAttr("color-profile")


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
    lazy val colorRendering = stringAttr("color-rendering")


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
    lazy val contentScriptType = stringAttr("contentScriptType")


    /**
      * This attribute specifies the style sheet language for the given document fragment.
      * The contentStyleType is specified on the <svg> element. By default, if it's not defined,
      * the value is text/css
      *
      * Value 	<content-type>
      *
      * MDN
      */
    lazy val contentStyleType = stringAttr("contentStyleType")


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
    lazy val cursorAttr = stringAttr("cursor")


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
    lazy val cx = stringAttr("cx")

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
    lazy val cy = stringAttr("cy")


    /**
      *
      *
      * MDN
      */
    lazy val d = stringAttr("d")


    /**
      *
      *
      * MDN
      */
    lazy val diffuseConstant = stringAttr("diffuseConstant")


    /**
      *
      *
      * MDN
      */
    lazy val direction = stringAttr("direction")


    /**
      *
      *
      * MDN
      */
    lazy val display = stringAttr("display")


    /**
      *
      *
      * MDN
      */
    lazy val divisor = stringAttr("divisor")


    /**
      *
      *
      * MDN
      */
    lazy val dominantBaseline = stringAttr("dominant-baseline")


    /**
      *
      *
      * MDN
      */
    lazy val dur = stringAttr("dur")


    /**
      *
      *
      * MDN
      */
    lazy val dx = stringAttr("dx")


    /**
      *
      *
      * MDN
      */
    lazy val dy = stringAttr("dy")


    /**
      *
      *
      * MDN
      */
    lazy val edgeMode = stringAttr("edgeMode")


    /**
      *
      *
      * MDN
      */
    lazy val elevation = stringAttr("elevation")


    /**
      *
      *
      * MDN
      */
    lazy val end = stringAttr("end")


    /**
      *
      *
      * MDN
      */
    lazy val externalResourcesRequired = stringAttr("externalResourcesRequired")


    /**
      *
      *
      * MDN
      */
    lazy val fill = stringAttr("fill")


    /**
      *
      *
      * MDN
      */
    lazy val fillOpacity = stringAttr("fill-opacity")


    /**
      *
      *
      * MDN
      */
    lazy val fillRule = stringAttr("fill-rule")


    /**
      *
      *
      * MDN
      */
    lazy val filterAttr = stringAttr("filter")


    /**
      *
      *
      * MDN
      */
    lazy val filterRes = stringAttr("filterRes")


    /**
      *
      *
      * MDN
      */
    lazy val filterUnits = stringAttr("filterUnits")


    /**
      *
      *
      * MDN
      */
    lazy val floodColor = stringAttr("flood-color")


    /**
      *
      *
      * MDN
      */
    lazy val floodOpacity = stringAttr("flood-opacity")


    /**
      *
      *
      * MDN
      */
    lazy val fontFamily = stringAttr("font-family")


    /**
      *
      *
      * MDN
      */
    lazy val fontSize = stringAttr("font-size")


    /**
      *
      *
      * MDN
      */
    lazy val fontSizeAdjust = stringAttr("font-size-adjust")


    /**
      *
      *
      * MDN
      */
    lazy val fontStretch = stringAttr("font-stretch")


    /**
      *
      *
      * MDN
      */
    lazy val fontVariant = stringAttr("font-variant")


    /**
      *
      *
      * MDN
      */
    lazy val fontWeight = stringAttr("font-weight")


    /**
      *
      *
      * MDN
      */
    lazy val from = stringAttr("from")


    /**
      *
      *
      * MDN
      */
    lazy val gradientTransform = stringAttr("gradientTransform")


    /**
      *
      *
      * MDN
      */
    lazy val gradientUnits = stringAttr("gradientUnits")


    /**
      *
      *
      * MDN
      */
    lazy val height = stringAttr("height")


    /**
      *
      *
      * MDN
      */
    lazy val imageRendering = stringAttr("imageRendering")

    lazy val id = stringAttr("id")

    /**
      *
      *
      * MDN
      */
    lazy val in = stringAttr("in")



    /**
      *
      *
      * MDN
      */
    lazy val in2 = stringAttr("in2")



    /**
      *
      *
      * MDN
      */
    lazy val k1 = stringAttr("k1")


    /**
      *
      *
      * MDN
      */
    lazy val k2 = stringAttr("k2")


    /**
      *
      *
      * MDN
      */
    lazy val k3 = stringAttr("k3")


    /**
      *
      *
      * MDN
      */
    lazy val k4 = stringAttr("k4")



    /**
      *
      *
      * MDN
      */
    lazy val kernelMatrix = stringAttr("kernelMatrix")



    /**
      *
      *
      * MDN
      */
    lazy val kernelUnitLength = stringAttr("kernelUnitLength")


    /**
      *
      *
      * MDN
      */
    lazy val kerning = stringAttr("kerning")


    /**
      *
      *
      * MDN
      */
    lazy val keySplines = stringAttr("keySplines")



    /**
      *
      *
      * MDN
      */
    lazy val keyTimes = stringAttr("keyTimes")




    /**
      *
      *
      * MDN
      */
    lazy val letterSpacing = stringAttr("letter-spacing")



    /**
      *
      *
      * MDN
      */
    lazy val lightingColor = stringAttr("lighting-color")



    /**
      *
      *
      * MDN
      */
    lazy val limitingConeAngle = stringAttr("limitingConeAngle")



    /**
      *
      *
      * MDN
      */
    lazy val local = stringAttr("local")



    /**
      *
      *
      * MDN
      */
    lazy val markerEnd = stringAttr("marker-end")


    /**
      *
      *
      * MDN
      */
    lazy val markerMid = stringAttr("marker-mid")


    /**
      *
      *
      * MDN
      */
    lazy val markerStart = stringAttr("marker-start")


    /**
      *
      *
      * MDN
      */
    lazy val markerHeight = stringAttr("markerHeight")


    /**
      *
      *
      * MDN
      */
    lazy val markerUnits = stringAttr("markerUnits")


    /**
      *
      *
      * MDN
      */
    lazy val markerWidth = stringAttr("markerWidth")


    /**
      *
      *
      * MDN
      */
    lazy val maskContentUnits = stringAttr("maskContentUnits")


    /**
      *
      *
      * MDN
      */
    lazy val maskUnits = stringAttr("maskUnits")


    /**
      *
      *
      * MDN
      */
    lazy val maskAttr = stringAttr("mak")



    /**
      *
      *
      * MDN
      */
    lazy val max = stringAttr("max")



    /**
      *
      *
      * MDN
      */
    lazy val min = stringAttr("min")


    /**
      *
      *
      * MDN
      */
    lazy val mode = stringAttr("mode")


    /**
      *
      *
      * MDN
      */
    lazy val numOctaves = stringAttr("numOctaves")


    lazy val offset = stringAttr("offset")

    /**
      *
      *
      * MDN
      */
    lazy val opacity = stringAttr("opacity")



    /**
      *
      *
      * MDN
      */
    lazy val operator = stringAttr("operator")


    /**
      *
      *
      * MDN
      */
    lazy val order = stringAttr("order")


    /**
      *
      *
      * MDN
      */
    lazy val overflow = stringAttr("overflow")



    /**
      *
      *
      * MDN
      */
    lazy val paintOrder = stringAttr("paint-order")



    /**
      *
      *
      * MDN
      */
    lazy val pathLength = stringAttr("pathLength")



    /**
      *
      *
      * MDN
      */
    lazy val patternContentUnits = stringAttr("patternContentUnits")


    /**
      *
      *
      * MDN
      */
    lazy val patternTransform = stringAttr("patternTransform")



    /**
      *
      *
      * MDN
      */
    lazy val patternUnits = stringAttr("patternUnits")



    /**
      *
      *
      * MDN
      */
    lazy val pointerEvents = stringAttr("pointer-events")


    /**
      *
      *
      * MDN
      */
    lazy val points = stringAttr("points")


    /**
      *
      *
      * MDN
      */
    lazy val pointsAtX = stringAttr("pointsAtX")


    /**
      *
      *
      * MDN
      */
    lazy val pointsAtY = stringAttr("pointsAtY")


    /**
      *
      *
      * MDN
      */
    lazy val pointsAtZ = stringAttr("pointsAtZ")


    /**
      *
      *
      * MDN
      */
    lazy val preserveAlpha = stringAttr("preserveAlpha")



    /**
      *
      *
      * MDN
      */
    lazy val preserveAspectRatio = stringAttr("preserveAspectRatio")



    /**
      *
      *
      * MDN
      */
    lazy val primitiveUnits = stringAttr("primitiveUnits")


    /**
      *
      *
      * MDN
      */
    lazy val r = stringAttr("r")



    /**
      *
      *
      * MDN
      */
    lazy val radius = stringAttr("radius")


    /**
      *
      *
      * MDN
      */
    lazy val repeatCount = stringAttr("repeatCount")


    /**
      *
      *
      * MDN
      */
    lazy val repeatDur = stringAttr("repeatDur")



    /**
      *
      *
      * MDN
      */
    lazy val requiredFeatures = stringAttr("requiredFeatures")



    /**
      *
      *
      * MDN
      */
    lazy val restart = stringAttr("restart")



    /**
      *
      *
      * MDN
      */
    lazy val result = stringAttr("result")



    /**
      *
      *
      * MDN
      */
    lazy val rx = stringAttr("rx")



    /**
      *
      *
      * MDN
      */
    lazy val ry = stringAttr("ry")



    /**
      *
      *
      * MDN
      */
    lazy val scale = stringAttr("scale")



    /**
      *
      *
      * MDN
      */
    lazy val seed = stringAttr("seed")



    /**
      *
      *
      * MDN
      */
    lazy val shapeRendering = stringAttr("shape-rendering")



    /**
      *
      *
      * MDN
      */
    lazy val specularConstant = stringAttr("specularConstant")



    /**
      *
      *
      * MDN
      */
    lazy val specularExponent = stringAttr("specularExponent")



    /**
      *
      *
      * MDN
      */
    lazy val spreadMethod = stringAttr("spreadMethod")



    /**
      *
      *
      * MDN
      */
    lazy val stdDeviation = stringAttr("stdDeviation")



    /**
      *
      *
      * MDN
      */
    lazy val stitchTiles = stringAttr("stitchTiles")



    /**
      *
      *
      * MDN
      */
    lazy val stopColor = stringAttr("stop-color")



    /**
      *
      *
      * MDN
      */
    lazy val stopOpacity = stringAttr("stop-opacity")



    /**
      *
      *
      * MDN
      */
    lazy val stroke = stringAttr("stroke")


    /**
      *
      *
      * MDN
      */
    lazy val strokeDasharray= stringAttr("stroke-dasharray")


    /**
      *
      *
      * MDN
      */
    lazy val strokeDashoffset = stringAttr("stroke-dashoffset")


    /**
      *
      *
      * MDN
      */
    lazy val strokeLinecap = stringAttr("stroke-linecap")


    /**
      *
      *
      * MDN
      */
    lazy val strokeLinejoin = stringAttr("stroke-linejoin")


    /**
      *
      *
      * MDN
      */
    lazy val strokeMiterlimit = stringAttr("stroke-miterlimit")


    /**
      *
      *
      * MDN
      */
    lazy val strokeOpacity = stringAttr("stroke-opacity")


    /**
      *
      *
      * MDN
      */
    lazy val strokeWidth = stringAttr("stroke-width")


    /**
      *
      *
      * MDN
      */
    lazy val style = stringAttr("style")



    /**
      *
      *
      * MDN
      */
    lazy val surfaceScale = stringAttr("surfaceScale")


    /**
      *
      *
      * MDN
      */
    lazy val targetX = stringAttr("targetX")


    /**
      *
      *
      * MDN
      */
    lazy val targetY = stringAttr("targetY")


    /**
      *
      *
      * MDN
      */
    lazy val textAnchor = stringAttr("text-anchor")


    /**
      *
      *
      * MDN
      */
    lazy val textDecoration = stringAttr("text-decoration")


    /**
      *
      *
      * MDN
      */
    lazy val textRendering = stringAttr("text-rendering")


    /**
      *
      *
      * MDN
      */
    lazy val to = stringAttr("to")


    /*
     *
     *
     * MDN
     */
    lazy val transform = stringAttr("transform")


    /*
     *
     *
     * MDN
     */
    lazy val `type`= stringAttr("type")


    /*
     *
     *
     * MDN
     */
    lazy val values = stringAttr("values")


    /**
      *
      *
      * MDN
      */
    lazy val viewBox = stringAttr("viewBox")


    /*
     *
     *
     * MDN
     */
    lazy val visibility = stringAttr("visibility")


    /*
     *
     *
     * MDN
     */
    lazy val width = stringAttr("width")


    /*
     *
     *
     * MDN
     */
    lazy val wordSpacing = stringAttr("word-spacing")

    /*
     *
     *
     * MDN
     */
    lazy val writingMode = stringAttr("writing-mode")


    /*
     *
     *
     * MDN
     */
    lazy val x = stringAttr("x")


    /*
     *
     *
     * MDN
     */
    lazy val x1 = stringAttr("x1")


    /*
     *
     *
     * MDN
     */
    lazy val x2 = stringAttr("x2")


    /*
     *
     *
     * MDN
     */
    lazy val xChannelSelector = stringAttr("xChannelSelector")


    /*
     *
     *
     * MDN
     */
    // TODO : this currently does not work,have to add namespace: Namespace.svgXlinkNamespaceConfig)
    lazy val xLinkHref= stringAttr("xlink:href")


    /*
     *
     *
     * MDN
     */
    lazy val xLink = stringAttr("xlink:role")


    /*
     *
     *
     * MDN
     */
    lazy val xLinkTitle = stringAttr("xlink:title")


    /*
     *
     *
     * MDN
     */
    lazy val xmlSpace = stringAttr("xml:space")


    /**
      *
      *
      * MDN
      */
    lazy val xmlns = stringAttr("xmlns")


    /**
      *
      *
      * MDN
      */
    lazy val xmlnsXlink = stringAttr("xmlns:xlink")


    /*
     *
     *
     * MDN
     */
    lazy val y = stringAttr("y")


    /*
     *
     *
     * MDN
     */
    lazy val y1 = stringAttr("y1")


    /*
     *
     *
     * MDN
     */
    lazy val y2 = stringAttr("y2")


    /*
     *
     *
     * MDN
     */
    lazy val yChannelSelector = stringAttr("yChannelSelector")


    /*
     *
     *
     * MDN
     */
    lazy val z = stringAttr("z")
  }
