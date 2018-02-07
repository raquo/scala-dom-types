package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.TagBuilder

trait SvgTags[T[_ <: DomElement], DomElement, SvgElement <: DomElement,
    SvgCircle <: SvgElement,
    SvgClipPath <: SvgElement,
    SvgDefs <: SvgElement,
    SvgDesc <: SvgElement,
    SvgEllipse <: SvgElement,
    SvgFEBlend <: SvgElement,
    SvgFEColorMatrix <: SvgElement,
    SvgComponentTransferFunction <: SvgElement,
    SvgFEComposite <: SvgElement,
    SvgFEConvolveMatrix <: SvgElement,
    SvgFEDiffuseLighting <: SvgElement,
    SvgFEDisplacementMap <: SvgElement,
    SvgFEDistantLight <: SvgElement,
    SvgFEFlood <: SvgElement,
    SvgFEFuncA <: SvgElement,
    SvgFEFuncB <: SvgElement,
    SvgFEFuncG <: SvgElement,
    SvgFEFuncR <: SvgElement,
    SvgFEGaussianBlur <: SvgElement,
    SvgFEImage <: SvgElement,
    SvgFEMerge <: SvgElement,
    SvgFEMergeNode <: SvgElement,
    SvgFEMorphology <: SvgElement,
    SvgFEOffset <: SvgElement,
    SvgFEPointLight <: SvgElement,
    SvgFESpecularLighting <: SvgElement,
    SvgFESpotLight <: SvgElement,
    SvgFETile <: SvgElement,
    SvgFETurbulence <: SvgElement,
    SvgFilter <: SvgElement,
    SvgG <: SvgElement,
    SvgImage <: SvgElement,
    SvgLine <: SvgElement,
    SvgLinearGradient <: SvgElement,
    SvgMarker <: SvgElement,
    SvgMask <: SvgElement,
    SvgMetadata <: SvgElement,
    SvgPath <: SvgElement,
    SvgPattern <: SvgElement,
    SvgPolygon <: SvgElement,
    SvgPolyline <: SvgElement,
    SvgRadialGradient <: SvgElement,
    SvgRectElement <: SvgElement,
    Svg <: SvgElement,
    SvgStop <: SvgElement,
    SvgSVG <: SvgElement,
    SvgSwitch <: SvgElement,
    SvgSymbol <: SvgElement,
    SvgText <: SvgElement,
    SvgTextPath <: SvgElement,
    SvgTSpan <: SvgElement,
    SvgUse <: SvgElement,
    SvgView <: SvgElement
  ] {
  this: TagBuilder[T, SvgElement] =>


  /**
   * The altGlyph element allows sophisticated selection of the glyphs used to
   * render its child character data.
   *
   * MDN
   */
  lazy val altGlyph:T[SvgElement] = tag("altGlyph")
  
  /**
   * The altGlyphDef element defines a substitution representation for glyphs.
   *
   * MDN
   */
  lazy val altGlyphDef:T[SvgElement] = tag("altGlyphDef")

  /**
   * The altGlyphItem element provides a set of candidates for glyph substitution
   * by the altGlyph element.
   *
   * MDN
   */
  lazy val altGlyphItem:T[SvgElement] = tag("altGlyphItem")
  
  /**
   * The animate element is put inside a shape element and defines how an
   * attribute of an element changes over the animation
   *
   * MDN
   */
  lazy val animate:T[SvgElement] = tag("animate")
  
  /**
   * The animateMotion element causes a referenced element to move along a
   * motion path.
   *
   * MDN
   */
  lazy val animateMotion:T[SvgElement] = tag("animateMotion")
  
  /**
   * The animateTransform element animates a transformation attribute on a target
   * element, thereby allowing animations to control translation, scaling,
   * rotation and/or skewing.
   *
   * MDN
   */
  lazy val animateTransform:T[SvgElement] = tag("animateTransform")
  
  /**
   * The circle element is an SVG basic shape, used to create circles based on a
   * center point and a radius.
   *
   * MDN
   */
  lazy val circle:T[SvgCircle] = tag("circle")
  
  /**
   * The clipping path restricts the region to which paint can be applied.
   * Conceptually, any parts of the drawing that lie outside of the region
   * bounded by the currently active clipping path are not drawn.
   *
   * MDN
   */
  lazy val clipPath:T[SvgClipPath] = tag("clipPath")
  
  /**
   * The element allows describing the color profile used for the image.
   *
   * MDN
   */
  lazy val `color-profile`:T[SvgElement] = tag("color-profile")
  
  /**
   * The cursor element can be used to define a platform-independent custom
   * cursor. A recommended approach for defining a platform-independent custom
   * cursor is to create a PNG image and define a cursor element that references
   * the PNG image and identifies the exact position within the image which is
   * the pointer position (i.e., the hot spot).
   *
   * MDN
   */
  lazy val cursor:T[SvgElement] = tag("cursor")
  
  /**
   * SVG allows graphical objects to be defined for later reuse. It is
   * recommended that, wherever possible, referenced elements be defined inside
   * of a defs element. Defining these elements inside of a defs element
   * promotes understandability of the SVG content and thus promotes
   * accessibility. Graphical elements defined in a defs will not be directly
   * rendered. You can use a use element to render those elements wherever you
   * want on the viewport.
   *
   * MDN
   */
  lazy val defs:T[SvgDefs] = tag("defs")
  
  /**
   * Each container element or graphics element in an SVG drawing can supply a
   * desc description string where the description is text-only. When the
   * current SVG document fragment is rendered as SVG on visual media, desc
   * elements are not rendered as part of the graphics. Alternate presentations
   * are possible, both visual and aural, which display the desc element but do
   * not display path elements or other graphics elements. The desc element
   * generally improve accessibility of SVG documents
   *
   * MDN
   */
  lazy val desc:T[SvgDesc] = tag("desc")
  
  /**
   * The ellipse element is an SVG basic shape, used to create ellipses based
   * on a center coordinate, and both their x and y radius.
   *
   * Ellipses are unable to specify the exact orientation of the ellipse (if,
   * for example, you wanted to draw an ellipse titled at a 45 degree angle),
   * but can be rotated by using the transform attribute.
   *
   * MDN
   */
  lazy val ellipse:T[SvgEllipse] = tag("ellipse")
  
  /**
   * The feBlend filter composes two objects together ruled by a certain blending
   * mode. This is similar to what is known from image editing software when
   * blending two layers. The mode is defined by the mode attribute.
   *
   * MDN
   */
  lazy val feBlend:T[SvgFEBlend] = tag("feBlend")
  
  /**
   * This filter changes colors based on a transformation matrix. Every pixel's
   * color value (represented by an [R,G,B,A] vector) is matrix multiplied to
   * create a new color.
   *
   * MDN
   */
  lazy val feColorMatrix:T[SvgFEColorMatrix] = tag("feColorMatrix")
  
  /**
   * The color of each pixel is modified by changing each channel (R, G, B, and
   * A) to the result of what the children feFuncR, feFuncB, feFuncG,
   * and feFuncA return.
   *
   * MDN
   */
  lazy val feComponentTransfer:T[SvgComponentTransferFunction] = tag("feComponentTransfer")
  
  /**
   * This filter primitive performs the combination of two input images pixel-wise
   * in image space using one of the Porter-Duff compositing operations: over,
   * in, atop, out, xor. Additionally, a component-wise arithmetic operation
   * (with the result clamped between [0..1]) can be applied.
   *
   * MDN
   */
  lazy val feComposite:T[SvgFEComposite] = tag("feComposite")
  
  /**
   * the feConvolveMatrix element applies a matrix convolution filter effect.
   * A convolution combines pixels in the input image with neighboring pixels
   * to produce a resulting image. A wide variety of imaging operations can be
   * achieved through convolutions, including blurring, edge detection,
   * sharpening, embossing and beveling.
   *
   * MDN
   */
  lazy val feConvolveMatrix:T[SvgFEConvolveMatrix] = tag("feConvolveMatrix")
  
  /**
   * This filter primitive lights an image using the alpha channel as a bump map.
   * The resulting image, which is an RGBA opaque image, depends on the light
   * color, light position and surface geometry of the input bump map.
   *
   * MDN
   */
  lazy val feDiffuseLighting:T[SvgFEDiffuseLighting] = tag("feDiffuseLighting")
  
  /**
   * This filter primitive uses the pixels values from the image from in2 to
   * spatially displace the image from in.
   *
   * MDN
   */
  lazy val feDisplacementMap:T[SvgFEDisplacementMap] = tag("feDisplacementMap")
  
  /**
   * This filter primitive define a distant light source that can be used
   * within a lighting filter primitive: feDiffuseLighting or
   * feSpecularLighting.
   *
   * MDN
   */
  lazy val feDistantLighting:T[SvgFEDistantLight] = tag("feDistantLighting")
  
  /**
   * The filter fills the filter subregion with the color and opacity defined by
   * flood-color and flood-opacity.
   *
   * MDN
   */
  lazy val feFlood:T[SvgFEFlood] = tag("feFlood")
  
  /**
   * This filter primitive defines the transfer function for the alpha component
   * of the input graphic of its parent feComponentTransfer element.
   *
   * MDN
   */
  lazy val feFuncA:T[SvgFEFuncA] = tag("feFuncA")
  
  /**
   * This filter primitive defines the transfer function for the blue component
   * of the input graphic of its parent feComponentTransfer element.
   *
   * MDN
   */
  lazy val feFuncB:T[SvgFEFuncB] = tag("feFuncB")
  
  /**
   * This filter primitive defines the transfer function for the green component
   * of the input graphic of its parent feComponentTransfer element.
   *
   * MDN
   */
  lazy val feFuncG:T[SvgFEFuncG] = tag("feFuncG")
  
  /**
   * This filter primitive defines the transfer function for the red component
   * of the input graphic of its parent feComponentTransfer element.
   *
   * MDN
   */
  lazy val feFuncR:T[SvgFEFuncR] = tag("feFuncR")
  
  /**
   * The filter blurs the input image by the amount specified in stdDeviation,
   * which defines the bell-curve.
   *
   * MDN
   */
  lazy val feGaussianBlur:T[SvgFEGaussianBlur] = tag("feGaussianBlur")

  /**
   * The feImage filter fetches image data from an external source and provides
   * the pixel data as output (meaning, if the external source is an SVG image,
   * it is rasterize).
   *
   * MDN
   */
  lazy val feImage:T[SvgFEImage] = tag("feImage")

  /**
   * The feMerge filter allows filter effects to be applied concurrently
   * instead of sequentially. This is achieved by other filters storing their
   * output via the result attribute and then accessing it in a feMergeNode
   * child.
   *
   * MDN
   */
  lazy val feMerge:T[SvgFEMerge] = tag("feMerge")

  /**
   * The feMergeNode takes the result of another filter to be processed by its
   * parent feMerge.
   *
   * MDN
   */
  lazy val feMergeNode:T[SvgFEMergeNode] = tag("feMergeNode")
  
  /**
   * This filter is used to erode or dilate the input image. It's usefulness
   * lies especially in fattening or thinning effects.
   *
   * MDN
   */
  lazy val feMorphology:T[SvgFEMorphology] = tag("feMorphology")
  
  /**
   * The input image as a whole is offset by the values specified in the dx
   * and dy attributes. It's used in creating drop-shadows.
   *
   * MDN
   */
  lazy val feOffset:T[SvgFEOffset] = tag("feOffset")
  
  /**
   *
   */
  lazy val fePointLight:T[SvgFEPointLight] = tag("fePointLight")
  
  /**
   * This filter primitive lights a source graphic using the alpha channel as a
   * bump map. The resulting image is an RGBA image based on the light color.
   * The lighting calculation follows the standard specular component of the
   * Phong lighting model. The resulting image depends on the light color, light
   * position and surface geometry of the input bump map. The result of the
   * lighting calculation is added. The filter primitive assumes that the viewer
   * is at infinity in the z direction.
   *
   * MDN
   */
  lazy val feSpecularLighting:T[SvgFESpecularLighting] = tag("feSpecularLighting")
  
  /**
   *
   */
  lazy val feSpotlight:T[SvgFESpotLight] = tag("feSpotlight")
  
  /**
   * An input image is tiled and the result used to fill a target. The effect
   * is similar to the one of a pattern.
   *
   * MDN
   */
  lazy val feTile:T[SvgFETile] = tag("feTile")
  
  /**
   * This filter primitive creates an image using the Perlin turbulence
   * function. It allows the synthesis of artificial textures like clouds or
   * marble.
   *
   * MDN
   */
  lazy val feTurbulance:T[SvgFETurbulence] = tag("feTurbulance")
  
  /**
   * The filter element serves as container for atomic filter operations. It is
   * never rendered directly. A filter is referenced by using the filter
   * attribute on the target SVG element.
   *
   * MDN
   */
  lazy val filter:T[SvgFilter] = tag("filter")
  
  /**
   * The font element defines a font to be used for text layout.
   *
   * MDN
   */
  lazy val font:T[SvgElement] = tag("font")
  
  /**
   * The font-face element corresponds to the CSS @font-face declaration. It
   * defines a font's outer properties.
   *
   * MDN
   */
  lazy val `font-face`:T[SvgElement] = tag("font-face")
  
  /**
   * The font-face-format element describes the type of font referenced by its
   * parent font-face-uri.
   *
   * MDN
   */
  lazy val `font-face-format`:T[SvgElement] = tag("font-face-format")
  
  /**
   * The font-face-name element points to a locally installed copy of this font,
   * identified by its name.
   *
   * MDN
   */
  lazy val `font-face-name`:T[SvgElement] = tag("font-face-name")
  
  /**
   * The font-face-src element corresponds to the src property in CSS @font-face
   * descriptions. It serves as container for font-face-name, pointing to
   * locally installed copies of this font, and font-face-uri, utilizing
   * remotely defined fonts.
   *
   * MDN
   */
  lazy val `font-face-src`:T[SvgElement] = tag("font-face-src")
  
  /**
   * The font-face-uri element points to a remote definition of the current font.
   *
   * MDN
   */
  lazy val `font-face-uri`:T[SvgElement] = tag("font-face-uri")
  
  /**
   * The foreignObject element allows for inclusion of a foreign XML namespace
   * which has its graphical content drawn by a different user agent. The
   * included foreign graphical content is subject to SVG transformations and
   * compositing.
   *
   * MDN
   */
  lazy val foreignObject:T[SvgElement] = tag("foreignObject")
  
  /**
   * The g element is a container used to group objects. Transformations applied
   * to the g element are performed on all of its child elements. Attributes
   * applied are inherited by child elements. In addition, it can be used to
   * define complex objects that can later be referenced with the use element.
   *
   * MDN
   */
  lazy val g:T[SvgG] = tag("g")
  
  /**
   * A glyph defines a single glyph in an SVG font.
   *
   * MDN
   */
  lazy val glyph:T[SvgElement] = tag("glyph")
  
  /**
   * The glyphRef element provides a single possible glyph to the referencing
   * altGlyph substitution.
   *
   * MDN
   */
  lazy val glyphRef:T[SvgElement] = tag("glyphRef")
  
  /**
   * The horizontal distance between two glyphs can be fine-tweaked with an
   * hkern Element. This process is known as Kerning.
   *
   * MDN
   */
  lazy val hkern:T[SvgElement] = tag("hkern")
  
  /**
   * The SVG Image Element (image) allows a raster image into be included in
   * an SVG document.
   *
   * MDN
   */
  lazy val image:T[SvgImage] = tag("image")
  
  /**
   * The line element is an SVG basic shape, used to create a line connecting
   * two points.
   *
   * MDN
   */
  lazy val line:T[SvgLine] = tag("line")
  
  /**
   * linearGradient lets authors define linear gradients to fill or stroke
   * graphical elements.
   *
   * MDN
   */
  lazy val linearGradient:T[SvgLinearGradient] = tag("linearGradient")
  
  /**
   * The marker element defines the graphics that is to be used for drawing
   * arrowheads or polymarkers on a given path, line, polyline or
   * polygon element.
   *
   * MDN
   */
  lazy val marker:T[SvgMarker] = tag("marker")
  
  /**
   * In SVG, you can specify that any other graphics object or g element can
   * be used as an alpha mask for compositing the current object into the
   * background. A mask is defined with the mask element. A mask is
   * used/referenced using the mask property.
   *
   * MDN
   */
  lazy val mask:T[SvgMask] = tag("mask")
  
  /**
   * Metadata is structured data about data. Metadata which is included with SVG
   * content should be specified within metadata elements. The contents of the
   * metadata should be elements from other XML namespaces such as RDF, FOAF,
   * etc.
   *
   * MDN
   */
  lazy val metadata:T[SvgMetadata] = tag("metadata")
  
  /**
   * The missing-glyph's content is rendered, if for a given character the font
   * doesn't define an appropriate glyph.
   *
   * MDN
   */
  lazy val `missing-glyph`:T[SvgElement] = tag("missing-glyph")
  
  /**
   * the mpath sub-element for the animateMotion element provides the ability
   * to reference an external path element as the definition of a motion path.
   *
   * MDN
   */
  lazy val mpath:T[SvgElement] = tag("mpath")
  
  /**
   * The path element is the generic element to define a shape. All the basic
   * shapes can be created with a path element.
   */
  lazy val path:T[SvgPath] = tag("path")
  
  /**
   * A pattern is used to fill or stroke an object using a pre-defined graphic
   * object which can be replicated ("tiled") at fixed intervals in x and y to
   * cover the areas to be painted. Patterns are defined using the pattern
   * element and then referenced by properties fill and stroke on a given
   * graphics element to indicate that the given element shall be filled or
   * stroked with the referenced pattern.
   *
   * MDN
   */
  lazy val pattern:T[SvgPattern] = tag("pattern")
  
  /**
   * The polygon element defines a closed shape consisting of a set of connected
   * straight line segments.
   *
   * MDN
   */
  lazy val polygon:T[SvgPolygon] = tag("polygon")
  
  /**
   * The polyline element is an SVG basic shape, used to create a series of
   * straight lines connecting several points. Typically a polyline is used to
   * create open shapes
   *
   * MDN
   */
  lazy val polyline:T[SvgPolyline] = tag("polyline")
  
  /**
   * radialGradient lets authors define radial gradients to fill or stroke
   * graphical elements.
   *
   * MDN
   */
  lazy val radialGradient:T[SvgRadialGradient] = tag("radialGradient")
  
  /**
   * The rect element is an SVG basic shape, used to create rectangles based on
   * the position of a corner and their width and height. It may also be used to
   * create rectangles with rounded corners.
   *
   * MDN
   */
  lazy val rect:T[SvgRectElement] = tag("rect")
  
  /**
   * The set element provides a simple means of just setting the value of an
   * attribute for a specified duration. It supports all attribute types,
   * including those that cannot reasonably be interpolated, such as string and
   * boolean values. The set element is non-additive. The additive and
   * accumulate attributes are not allowed, and will be ignored if specified.
   *
   * MDN
   */
  lazy val set:T[SvgElement] = tag("set")
  
  /**
   * The ramp of colors to use on a gradient is defined by the stop elements
   * that are child elements to either the lineargradient element or the
   * radialGradient element.
   *
   * MDN
   */
  lazy val stop:T[SvgStop] = tag("stop")
  
  /**
   * When it is not the root element, the svg element can be used to nest a
   * standalone SVG fragment inside the current document (which can be an HTML
   * document). This standalone fragment has its own viewPort and its own
   * coordinate system.
   *
   * MDN
   */
  lazy val svg:T[Svg] = tag("svg")
  
  /**
   * The switch element evaluates the requiredFeatures, requiredExtensions and
   * systemLanguage attributes on its direct child elements in order, and then
   * processes and renders the first child for which these attributes evaluate
   * to true. All others will be bypassed and therefore not rendered. If the
   * child element is a container element such as a g, then the entire
   * subtree is either processed/rendered or bypassed/not rendered.
   *
   * MDN
   */
  lazy val switch:T[SvgSwitch] = tag("switch")
  
  /**
   * The symbol element is used to define graphical template objects which can
   * be instantiated by a use element. The use of symbol elements for
   * graphics that are used multiple times in the same document adds structure
   * and semantics. Documents that are rich in structure may be rendered
   * graphically, as speech, or as braille, and thus promote accessibility.
   * note that a symbol element itself is not rendered. Only instances of a
   * symbol element (i.e., a reference to a symbol by a use element) are
   * rendered.
   *
   * MDN
   */
  lazy val symbol:T[SvgSymbol] = tag("symbol")
  
  /**
   * The text element defines a graphics element consisting of text. Note that
   * it is possible to apply a gradient, pattern, clipping path, mask or filter
   * to text.
   *
   * MDN
   */
  lazy val text:T[SvgText] = tag("text")
  
  /**
   * In addition to text drawn in a straight line, SVG also includes the
   * ability to place text along the shape of a path element. To specify that
   * a block of text is to be rendered along the shape of a path, include
   * the given text within a textPath element which includes an xlink:href
   * attribute with a reference to a path element.
   *
   * MDN
   */
  lazy val textPath:T[SvgTextPath] = tag("textPath")
  
  /**
   * The textual content for a text can be either character data directly
   * embedded within the text element or the character data content of a
   * referenced element, where the referencing is specified with a tref element.
   *
   * MDN
   */
  lazy val tref:T[SvgElement] = tag("tref")
  
  /**
   * Within a text element, text and font properties and the current text
   * position can be adjusted with absolute or relative coordinate values by
   * including a tspan element.
   *
   * MDN
   */
  lazy val tspan:T[SvgTSpan] = tag("tspan")
  
  /**
   * The use element takes nodes from within the SVG document, and duplicates
   * them somewhere else. The effect is the same as if the nodes were deeply
   * cloned into a non-exposed DOM, and then pasted where the use element is,
   * much like anonymous content and XBL. Since the cloned nodes are not exposed,
   * care must be taken when using CSS to style a use element and its hidden
   * descendants. CSS attributes are not guaranteed to be inherited by the
   * hidden, cloned DOM unless you explicitly request it using CSS inheritance.
   *
   * MDN
   */
  lazy val use:T[SvgUse] = tag("use")
  
  /**
   * A view is a defined way to view the image, like a zoom level or a detail
   * view.
   *
   * MDN
   */
  lazy val view:T[SvgView] = tag("view")
  
  /**
   * The vertical distance between two glyphs in top-to-bottom fonts can be
   * fine-tweaked with an vkern Element. This process is known as Kerning.
   *
   * MDN
   */
  lazy val vkern:T[SvgElement] = tag("vkern")
}

