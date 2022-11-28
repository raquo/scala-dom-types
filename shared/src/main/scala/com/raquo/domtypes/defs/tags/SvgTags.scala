package com.raquo.domtypes.defs.tags

import com.raquo.domtypes.common.{SvgTagType, TagDef}

object SvgTags {
  
  val defs: List[TagDef] = List(
    
    TagDef(
      tagType = SvgTagType,
      scalaName = "a",
      domName = "a",
      isVoid = false,
      scalaJsElementType = "dom.svg.A",
      javascriptElementType = "SVGAElement",
      implName = "svgTag",
      commentLines = List(
        "Represents a hyperlink, linking to another resource.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/a",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGAElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "altGlyph",
      domName = "altGlyph",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The altGlyph element allows sophisticated selection of the glyphs used to",
        "render its child character data.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/altGlyph",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "altGlyphDef",
      domName = "altGlyphDef",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The altGlyphDef element defines a substitution representation for glyphs.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/altGlyphDef",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "altGlyphItem",
      domName = "altGlyphItem",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The altGlyphItem element provides a set of candidates for glyph substitution",
        "by the altGlyph element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/altGlyphItem",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "animate",
      domName = "animate",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The animate element is put inside a shape element and defines how an",
        "attribute of an element changes over the animation",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/animate",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "animateMotion",
      domName = "animateMotion",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The animateMotion element causes a referenced element to move along a",
        "motion path.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/animateMotion",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "animateTransform",
      domName = "animateTransform",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The animateTransform element animates a transformation attribute on a target",
        "element, thereby allowing animations to control translation, scaling,",
        "rotation and/or skewing.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/animateTransform",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "circle",
      domName = "circle",
      isVoid = false,
      scalaJsElementType = "dom.svg.Circle",
      javascriptElementType = "SVGCircleElement",
      implName = "svgTag",
      commentLines = List(
        "The circle element is an SVG basic shape, used to create circles based on a",
        "center point and a radius.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/circle",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGCircleElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "clipPathTag",
      domName = "clipPath",
      isVoid = false,
      scalaJsElementType = "dom.svg.ClipPath",
      javascriptElementType = "SVGClipPathElement",
      implName = "svgTag",
      commentLines = List(
        "The clipping path restricts the region to which paint can be applied.",
        "Conceptually, any parts of the drawing that lie outside of the region",
        "bounded by the currently active clipping path are not drawn.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/clipPath",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGClipPathElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "colorProfileTag",
      domName = "color-profile",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The element allows describing the color profile used for the image.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/color-profile",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "cursor",
      domName = "cursor",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The cursor element can be used to define a platform-independent custom",
        "cursor. A recommended approach for defining a platform-independent custom",
        "cursor is to create a PNG image and define a cursor element that references",
        "the PNG image and identifies the exact position within the image which is",
        "the pointer position (i.e., the hot spot).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/cursor",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "defs",
      domName = "defs",
      isVoid = false,
      scalaJsElementType = "dom.svg.Defs",
      javascriptElementType = "SVGDefsElement",
      implName = "svgTag",
      commentLines = List(
        "SVG allows graphical objects to be defined for later reuse. It is",
        "recommended that, wherever possible, referenced elements be defined inside",
        "of a defs element. Defining these elements inside of a defs element",
        "promotes understandability of the SVG content and thus promotes",
        "accessibility. Graphical elements defined in a defs will not be directly",
        "rendered. You can use a use element to render those elements wherever you",
        "want on the viewport.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/defs",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGDefsElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "desc",
      domName = "desc",
      isVoid = false,
      scalaJsElementType = "dom.svg.Desc",
      javascriptElementType = "SVGDescElement",
      implName = "svgTag",
      commentLines = List(
        "Each container element or graphics element in an SVG drawing can supply a",
        "desc description string where the description is text-only. When the",
        "current SVG document fragment is rendered as SVG on visual media, desc",
        "elements are not rendered as part of the graphics. Alternate presentations",
        "are possible, both visual and aural, which display the desc element but do",
        "not display path elements or other graphics elements. The desc element",
        "generally improve accessibility of SVG documents",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/desc",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGDescElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "ellipse",
      domName = "ellipse",
      isVoid = false,
      scalaJsElementType = "dom.svg.Ellipse",
      javascriptElementType = "SVGEllipseElement",
      implName = "svgTag",
      commentLines = List(
        "The ellipse element is an SVG basic shape, used to create ellipses based",
        "on a center coordinate, and both their x and y radius.",
        "",
        "Ellipses are unable to specify the exact orientation of the ellipse (if,",
        "for example, you wanted to draw an ellipse titled at a 45 degree angle),",
        "but can be rotated by using the transform attribute.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/ellipse",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGEllipseElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feBlend",
      domName = "feBlend",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEBlend",
      javascriptElementType = "SVGFEBlendElement",
      implName = "svgTag",
      commentLines = List(
        "The feBlend filter composes two objects together ruled by a certain blending",
        "mode. This is similar to what is known from image editing software when",
        "blending two layers. The mode is defined by the mode attribute.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feBlend",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFEBlendElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feColorMatrix",
      domName = "feColorMatrix",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEColorMatrix",
      javascriptElementType = "SVGFEColorMatrixElement",
      implName = "svgTag",
      commentLines = List(
        "This filter changes colors based on a transformation matrix. Every pixel's",
        "color value (represented by an [R,G,B,A] vector) is matrix multiplied to",
        "create a new color.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feColorMatrix",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFEColorMatrixElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feComponentTransfer",
      domName = "feComponentTransfer",
      isVoid = false,
      scalaJsElementType = "dom.svg.ComponentTransferFunction",
      javascriptElementType = "SVGComponentTransferFunctionElement",
      implName = "svgTag",
      commentLines = List(
        "The color of each pixel is modified by changing each channel (R, G, B, and",
        "A) to the result of what the children feFuncR, feFuncB, feFuncG,",
        "and feFuncA return.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feComponentTransfer",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGComponentTransferFunctionElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feComposite",
      domName = "feComposite",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEComposite",
      javascriptElementType = "SVGFECompositeElement",
      implName = "svgTag",
      commentLines = List(
        "This filter primitive performs the combination of two input images pixel-wise",
        "in image space using one of the Porter-Duff compositing operations: over,",
        "in, atop, out, xor. Additionally, a component-wise arithmetic operation",
        "(with the result clamped between [0..1]) can be applied.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feComposite",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFECompositeElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feConvolveMatrix",
      domName = "feConvolveMatrix",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEConvolveMatrix",
      javascriptElementType = "SVGFEConvolveMatrixElement",
      implName = "svgTag",
      commentLines = List(
        "the feConvolveMatrix element applies a matrix convolution filter effect.",
        "A convolution combines pixels in the input image with neighboring pixels",
        "to produce a resulting image. A wide variety of imaging operations can be",
        "achieved through convolutions, including blurring, edge detection,",
        "sharpening, embossing and beveling.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feConvolveMatrix",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFEConvolveMatrixElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feDiffuseLighting",
      domName = "feDiffuseLighting",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEDiffuseLighting",
      javascriptElementType = "SVGFEDiffuseLightingElement",
      implName = "svgTag",
      commentLines = List(
        "This filter primitive lights an image using the alpha channel as a bump map.",
        "The resulting image, which is an RGBA opaque image, depends on the light",
        "color, light position and surface geometry of the input bump map.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feDiffuseLighting",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFEDiffuseLightingElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feDisplacementMap",
      domName = "feDisplacementMap",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEDisplacementMap",
      javascriptElementType = "SVGFEDisplacementMapElement",
      implName = "svgTag",
      commentLines = List(
        "This filter primitive uses the pixels values from the image from in2 to",
        "spatially displace the image from in.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feDisplacementMap",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFEDisplacementMapElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feDistantLighting",
      domName = "feDistantLighting",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEDistantLight",
      javascriptElementType = "SVGFEDistantLightElement",
      implName = "svgTag",
      commentLines = List(
        "This filter primitive define a distant light source that can be used",
        "within a lighting filter primitive: feDiffuseLighting or",
        "feSpecularLighting.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feDistantLighting",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFEDistantLightElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feFlood",
      domName = "feFlood",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEFlood",
      javascriptElementType = "SVGFEFloodElement",
      implName = "svgTag",
      commentLines = List(
        "The filter fills the filter subregion with the color and opacity defined by",
        "flood-color and flood-opacity.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feFlood",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFEFloodElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feFuncA",
      domName = "feFuncA",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEFuncA",
      javascriptElementType = "SVGFEFuncAElement",
      implName = "svgTag",
      commentLines = List(
        "This filter primitive defines the transfer function for the alpha component",
        "of the input graphic of its parent feComponentTransfer element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feFuncA",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFEFuncAElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feFuncB",
      domName = "feFuncB",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEFuncB",
      javascriptElementType = "SVGFEFuncBElement",
      implName = "svgTag",
      commentLines = List(
        "This filter primitive defines the transfer function for the blue component",
        "of the input graphic of its parent feComponentTransfer element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feFuncB",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFEFuncBElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feFuncG",
      domName = "feFuncG",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEFuncG",
      javascriptElementType = "SVGFEFuncGElement",
      implName = "svgTag",
      commentLines = List(
        "This filter primitive defines the transfer function for the green component",
        "of the input graphic of its parent feComponentTransfer element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feFuncG",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFEFuncGElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feFuncR",
      domName = "feFuncR",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEFuncR",
      javascriptElementType = "SVGFEFuncRElement",
      implName = "svgTag",
      commentLines = List(
        "This filter primitive defines the transfer function for the red component",
        "of the input graphic of its parent feComponentTransfer element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feFuncR",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFEFuncRElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feGaussianBlur",
      domName = "feGaussianBlur",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEGaussianBlur",
      javascriptElementType = "SVGFEGaussianBlurElement",
      implName = "svgTag",
      commentLines = List(
        "The filter blurs the input image by the amount specified in stdDeviation,",
        "which defines the bell-curve.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feGaussianBlur",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFEGaussianBlurElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feImage",
      domName = "feImage",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEImage",
      javascriptElementType = "SVGFEImageElement",
      implName = "svgTag",
      commentLines = List(
        "The feImage filter fetches image data from an external source and provides",
        "the pixel data as output (meaning, if the external source is an SVG image,",
        "it is rasterize).",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feImage",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFEImageElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feMerge",
      domName = "feMerge",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEMerge",
      javascriptElementType = "SVGFEMergeElement",
      implName = "svgTag",
      commentLines = List(
        "The feMerge filter allows filter effects to be applied concurrently",
        "instead of sequentially. This is achieved by other filters storing their",
        "output via the result attribute and then accessing it in a feMergeNode",
        "child.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feMerge",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFEMergeElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feMergeNode",
      domName = "feMergeNode",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEMergeNode",
      javascriptElementType = "SVGFEMergeNodeElement",
      implName = "svgTag",
      commentLines = List(
        "The feMergeNode takes the result of another filter to be processed by its",
        "parent feMerge.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feMergeNode",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFEMergeNodeElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feMorphology",
      domName = "feMorphology",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEMorphology",
      javascriptElementType = "SVGFEMorphologyElement",
      implName = "svgTag",
      commentLines = List(
        "This filter is used to erode or dilate the input image. It's usefulness",
        "lies especially in fattening or thinning effects.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feMorphology",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFEMorphologyElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feOffset",
      domName = "feOffset",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEOffset",
      javascriptElementType = "SVGFEOffsetElement",
      implName = "svgTag",
      commentLines = List(
        "The input image as a whole is offset by the values specified in the dx",
        "and dy attributes. It's used in creating drop-shadows.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feOffset",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFEOffsetElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "fePointLight",
      domName = "fePointLight",
      isVoid = false,
      scalaJsElementType = "dom.svg.FEPointLight",
      javascriptElementType = "SVGFEPointLightElement",
      implName = "svgTag",
      commentLines = Nil,
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/fePointLight",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFEPointLightElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feSpecularLighting",
      domName = "feSpecularLighting",
      isVoid = false,
      scalaJsElementType = "dom.svg.FESpecularLighting",
      javascriptElementType = "SVGFESpecularLightingElement",
      implName = "svgTag",
      commentLines = List(
        "This filter primitive lights a source graphic using the alpha channel as a",
        "bump map. The resulting image is an RGBA image based on the light color.",
        "The lighting calculation follows the standard specular component of the",
        "Phong lighting model. The resulting image depends on the light color, light",
        "position and surface geometry of the input bump map. The result of the",
        "lighting calculation is added. The filter primitive assumes that the viewer",
        "is at infinity in the z direction.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feSpecularLighting",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFESpecularLightingElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feSpotlight",
      domName = "feSpotlight",
      isVoid = false,
      scalaJsElementType = "dom.svg.FESpotLight",
      javascriptElementType = "SVGFESpotLightElement",
      implName = "svgTag",
      commentLines = Nil,
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feSpotlight",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFESpotLightElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feTile",
      domName = "feTile",
      isVoid = false,
      scalaJsElementType = "dom.svg.FETile",
      javascriptElementType = "SVGFETileElement",
      implName = "svgTag",
      commentLines = List(
        "An input image is tiled and the result used to fill a target. The effect",
        "is similar to the one of a pattern.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feTile",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFETileElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "feTurbulence",
      domName = "feTurbulence",
      isVoid = false,
      scalaJsElementType = "dom.svg.FETurbulence",
      javascriptElementType = "SVGFETurbulenceElement",
      implName = "svgTag",
      commentLines = List(
        "This filter primitive creates an image using the Perlin turbulence",
        "function. It allows the synthesis of artificial textures like clouds or",
        "marble.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/feTurbulence",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFETurbulenceElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "filter",
      domName = "filter",
      isVoid = false,
      scalaJsElementType = "dom.svg.Filter",
      javascriptElementType = "SVGFilterElement",
      implName = "svgTag",
      commentLines = List(
        "The filter element serves as container for atomic filter operations. It is",
        "never rendered directly. A filter is referenced by using the filter",
        "attribute on the target SVG element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/filter",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGFilterElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "font",
      domName = "font",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The font element defines a font to be used for text layout.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/font",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "fontFace",
      domName = "font-face",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The font-face element corresponds to the CSS @font-face declaration. It",
        "defines a font's outer properties.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/font-face",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "fontFaceFormat",
      domName = "font-face-format",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The font-face-format element describes the type of font referenced by its",
        "parent font-face-uri.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/font-face-format",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "fontFaceName",
      domName = "font-face-name",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The font-face-name element points to a locally installed copy of this font,",
        "identified by its name.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/font-face-name",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "fontFaceSrc",
      domName = "font-face-src",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The font-face-src element corresponds to the src property in CSS @font-face",
        "descriptions. It serves as container for font-face-name, pointing to",
        "locally installed copies of this font, and font-face-uri, utilizing",
        "remotely defined fonts.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/font-face-src",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "fontFaceUri",
      domName = "font-face-uri",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The font-face-uri element points to a remote definition of the current font.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/font-face-uri",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "foreignObject",
      domName = "foreignObject",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The foreignObject element allows for inclusion of a foreign XML namespace",
        "which has its graphical content drawn by a different user agent. The",
        "included foreign graphical content is subject to SVG transformations and",
        "compositing.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/foreignObject",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "g",
      domName = "g",
      isVoid = false,
      scalaJsElementType = "dom.svg.G",
      javascriptElementType = "SVGGElement",
      implName = "svgTag",
      commentLines = List(
        "The g element is a container used to group objects. Transformations applied",
        "to the g element are performed on all of its child elements. Attributes",
        "applied are inherited by child elements. In addition, it can be used to",
        "define complex objects that can later be referenced with the use element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/g",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGGElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "glyph",
      domName = "glyph",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "A glyph defines a single glyph in an SVG font.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/glyph",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "glyphRef",
      domName = "glyphRef",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The glyphRef element provides a single possible glyph to the referencing",
        "altGlyph substitution.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/glyphRef",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "hkern",
      domName = "hkern",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The horizontal distance between two glyphs can be fine-tweaked with an",
        "hkern Element. This process is known as Kerning.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/hkern",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "image",
      domName = "image",
      isVoid = false,
      scalaJsElementType = "dom.svg.Image",
      javascriptElementType = "SVGImageElement",
      implName = "svgTag",
      commentLines = List(
        "The SVG Image Element (image) allows a raster image into be included in",
        "an SVG document.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/image",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGImageElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "line",
      domName = "line",
      isVoid = false,
      scalaJsElementType = "dom.svg.Line",
      javascriptElementType = "SVGLineElement",
      implName = "svgTag",
      commentLines = List(
        "The line element is an SVG basic shape, used to create a line connecting",
        "two points.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/line",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGLineElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "linearGradient",
      domName = "linearGradient",
      isVoid = false,
      scalaJsElementType = "dom.svg.LinearGradient",
      javascriptElementType = "SVGLinearGradientElement",
      implName = "svgTag",
      commentLines = List(
        "linearGradient lets authors define linear gradients to fill or stroke",
        "graphical elements.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/linearGradient",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGLinearGradientElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "marker",
      domName = "marker",
      isVoid = false,
      scalaJsElementType = "dom.svg.Marker",
      javascriptElementType = "SVGMarkerElement",
      implName = "svgTag",
      commentLines = List(
        "The marker element defines the graphics that is to be used for drawing",
        "arrowheads or polymarkers on a given path, line, polyline or",
        "polygon element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/marker",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGMarkerElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "mask",
      domName = "mask",
      isVoid = false,
      scalaJsElementType = "dom.svg.Mask",
      javascriptElementType = "SVGMaskElement",
      implName = "svgTag",
      commentLines = List(
        "In SVG, you can specify that any other graphics object or g element can",
        "be used as an alpha mask for compositing the current object into the",
        "background. A mask is defined with the mask element. A mask is",
        "used/referenced using the mask property.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/mask",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGMaskElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "metadata",
      domName = "metadata",
      isVoid = false,
      scalaJsElementType = "dom.svg.Metadata",
      javascriptElementType = "SVGMetadataElement",
      implName = "svgTag",
      commentLines = List(
        "Metadata is structured data about data. Metadata which is included with SVG",
        "content should be specified within metadata elements. The contents of the",
        "metadata should be elements from other XML namespaces such as RDF, FOAF,",
        "etc.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/metadata",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGMetadataElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "missingGlyph",
      domName = "missing-glyph",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The missing-glyph's content is rendered, if for a given character the font",
        "doesn't define an appropriate glyph.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/missing-glyph",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "mpath",
      domName = "mpath",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "the mpath sub-element for the animateMotion element provides the ability",
        "to reference an external path element as the definition of a motion path.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/mpath",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "path",
      domName = "path",
      isVoid = false,
      scalaJsElementType = "dom.svg.Path",
      javascriptElementType = "SVGPathElement",
      implName = "svgTag",
      commentLines = List(
        "The path element is the generic element to define a shape. All the basic",
        "shapes can be created with a path element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/path",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGPathElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "pattern",
      domName = "pattern",
      isVoid = false,
      scalaJsElementType = "dom.svg.Pattern",
      javascriptElementType = "SVGPatternElement",
      implName = "svgTag",
      commentLines = List(
        "A pattern is used to fill or stroke an object using a pre-defined graphic",
        "object which can be replicated (\"tiled\") at fixed intervals in x and y to",
        "cover the areas to be painted. Patterns are defined using the pattern",
        "element and then referenced by properties fill and stroke on a given",
        "graphics element to indicate that the given element shall be filled or",
        "stroked with the referenced pattern.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/pattern",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGPatternElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "polygon",
      domName = "polygon",
      isVoid = false,
      scalaJsElementType = "dom.svg.Polygon",
      javascriptElementType = "SVGPolygonElement",
      implName = "svgTag",
      commentLines = List(
        "The polygon element defines a closed shape consisting of a set of connected",
        "straight line segments.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/polygon",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGPolygonElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "polyline",
      domName = "polyline",
      isVoid = false,
      scalaJsElementType = "dom.svg.Polyline",
      javascriptElementType = "SVGPolylineElement",
      implName = "svgTag",
      commentLines = List(
        "The polyline element is an SVG basic shape, used to create a series of",
        "straight lines connecting several points. Typically a polyline is used to",
        "create open shapes",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/polyline",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGPolylineElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "radialGradient",
      domName = "radialGradient",
      isVoid = false,
      scalaJsElementType = "dom.svg.RadialGradient",
      javascriptElementType = "SVGRadialGradientElement",
      implName = "svgTag",
      commentLines = List(
        "radialGradient lets authors define radial gradients to fill or stroke",
        "graphical elements.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/radialGradient",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGRadialGradientElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "rect",
      domName = "rect",
      isVoid = false,
      scalaJsElementType = "dom.svg.RectElement",
      javascriptElementType = "SVGRectElementElement",
      implName = "svgTag",
      commentLines = List(
        "The rect element is an SVG basic shape, used to create rectangles based on",
        "the position of a corner and their width and height. It may also be used to",
        "create rectangles with rounded corners.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/rect",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGRectElementElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "set",
      domName = "set",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The set element provides a simple means of just setting the value of an",
        "attribute for a specified duration. It supports all attribute types,",
        "including those that cannot reasonably be interpolated, such as string and",
        "boolean values. The set element is non-additive. The additive and",
        "accumulate attributes are not allowed, and will be ignored if specified.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/set",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "stop",
      domName = "stop",
      isVoid = false,
      scalaJsElementType = "dom.svg.Stop",
      javascriptElementType = "SVGStopElement",
      implName = "svgTag",
      commentLines = List(
        "The ramp of colors to use on a gradient is defined by the stop elements",
        "that are child elements to either the lineargradient element or the",
        "radialGradient element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/stop",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGStopElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "svg",
      domName = "svg",
      isVoid = false,
      scalaJsElementType = "dom.svg.",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "When it is not the root element, the svg element can be used to nest a",
        "standalone SVG fragment inside the current document (which can be an HTML",
        "document). This standalone fragment has its own viewPort and its own",
        "coordinate system.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/svg",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "switch",
      domName = "switch",
      isVoid = false,
      scalaJsElementType = "dom.svg.Switch",
      javascriptElementType = "SVGSwitchElement",
      implName = "svgTag",
      commentLines = List(
        "The switch element evaluates the requiredFeatures, requiredExtensions and",
        "systemLanguage attributes on its direct child elements in order, and then",
        "processes and renders the first child for which these attributes evaluate",
        "to true. All others will be bypassed and therefore not rendered. If the",
        "child element is a container element such as a g, then the entire",
        "subtree is either processed/rendered or bypassed/not rendered.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/switch",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGSwitchElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "symbol",
      domName = "symbol",
      isVoid = false,
      scalaJsElementType = "dom.svg.Symbol",
      javascriptElementType = "SVGSymbolElement",
      implName = "svgTag",
      commentLines = List(
        "The symbol element is used to define graphical template objects which can",
        "be instantiated by a use element. The use of symbol elements for",
        "graphics that are used multiple times in the same document adds structure",
        "and semantics. Documents that are rich in structure may be rendered",
        "graphically, as speech, or as braille, and thus promote accessibility.",
        "note that a symbol element itself is not rendered. Only instances of a",
        "symbol element (i.e., a reference to a symbol by a use element) are",
        "rendered.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/symbol",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGSymbolElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "text",
      domName = "text",
      isVoid = false,
      scalaJsElementType = "dom.svg.Text",
      javascriptElementType = "SVGTextElement",
      implName = "svgTag",
      commentLines = List(
        "The text element defines a graphics element consisting of text. Note that",
        "it is possible to apply a gradient, pattern, clipping path, mask or filter",
        "to text.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/text",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGTextElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "textPath",
      domName = "textPath",
      isVoid = false,
      scalaJsElementType = "dom.svg.TextPath",
      javascriptElementType = "SVGTextPathElement",
      implName = "svgTag",
      commentLines = List(
        "In addition to text drawn in a straight line, SVG also includes the",
        "ability to place text along the shape of a path element. To specify that",
        "a block of text is to be rendered along the shape of a path, include",
        "the given text within a textPath element which includes an xlink:href",
        "attribute with a reference to a path element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/textPath",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGTextPathElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "titleTag",
      domName = "title",
      isVoid = false,
      scalaJsElementType = "dom.svg.TextPath",
      javascriptElementType = "SVGTextPathElement",
      implName = "svgTag",
      commentLines = List(
        "Each container element or graphics element in an SVG drawing can supply a",
        "title description string where the description is text-only. When the",
        "current SVG document fragment is rendered as SVG on visual media, title",
        "elements are not rendered as part of the graphics. Alternate presentations",
        "are possible, both visual and aural, which display the title element but do",
        "not display path elements or other graphics elements. The title element",
        "generally improve accessibility of SVG documents.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/title",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGTextPathElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "tref",
      domName = "tref",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The textual content for a text can be either character data directly",
        "embedded within the text element or the character data content of a",
        "referenced element, where the referencing is specified with a tref element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/tref",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "tspan",
      domName = "tspan",
      isVoid = false,
      scalaJsElementType = "dom.svg.TSpan",
      javascriptElementType = "SVGTSpanElement",
      implName = "svgTag",
      commentLines = List(
        "Within a text element, text and font properties and the current text",
        "position can be adjusted with absolute or relative coordinate values by",
        "including a tspan element.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/tspan",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGTSpanElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "use",
      domName = "use",
      isVoid = false,
      scalaJsElementType = "dom.svg.Use",
      javascriptElementType = "SVGUseElement",
      implName = "svgTag",
      commentLines = List(
        "The use element takes nodes from within the SVG document, and duplicates",
        "them somewhere else. The effect is the same as if the nodes were deeply",
        "cloned into a non-exposed DOM, and then pasted where the use element is,",
        "much like anonymous content and XBL. Since the cloned nodes are not exposed,",
        "care must be taken when using CSS to style a use element and its hidden",
        "descendants. CSS attributes are not guaranteed to be inherited by the",
        "hidden, cloned DOM unless you explicitly request it using CSS inheritance.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/use",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGUseElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "view",
      domName = "view",
      isVoid = false,
      scalaJsElementType = "dom.svg.View",
      javascriptElementType = "SVGViewElement",
      implName = "svgTag",
      commentLines = List(
        "A view is a defined way to view the image, like a zoom level or a detail",
        "view.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/view",
        "https://developer.mozilla.org/en-US/docs/Web/API/SVGViewElement",
      ),
    ),

    TagDef(
      tagType = SvgTagType,
      scalaName = "vkern",
      domName = "vkern",
      isVoid = false,
      scalaJsElementType = "dom.svg.Element",
      javascriptElementType = "SVGElement",
      implName = "svgTag",
      commentLines = List(
        "The vertical distance between two glyphs in top-to-bottom fonts can be",
        "fine-tweaked with an vkern Element. This process is known as Kerning.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/SVG/Element/vkern",
      ),
    ),

  )
  
}
