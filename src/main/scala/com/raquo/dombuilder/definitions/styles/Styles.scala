package com.raquo.dombuilder.definitions.styles

import com.raquo.dombuilder.{Builder, Style, StyleSetter}

import scala.scalajs.js.|

/**
  * Trait that contains the contents of the `Styles` object, so they can
  * be mixed in to other objects if needed.
  */
trait Styles[N] extends StyleMisc[N] { self: Builder[N] =>

  /**
    * If a background-image is specified, the background-attachment CSS
    * property determines whether that image's position is fixed within
    * the viewport, or scrolls along with its containing block.
    *
    * MDN
    */
  object backgroundAttachment extends Style[String, N]("backgroundAttachment", "background-attachment", this) {

    /**
      * This keyword means that the background image will scroll within the
      * viewport along with the block the image is contained within.
      *
      * MDN
      */
    lazy val scroll = this := "scroll"

    /**
      * This keyword means that the background image will not scroll with its
      * containing element, instead remaining stationary within the viewport.
      *
      * MDN
      */
    lazy val fixed = this := "fixed"

    /**
      * This keyword means that the background image will not scroll with its
      * containing element, but will scroll when the element's content scrolls:
      * it is fixed regarding the element's content.
      *
      * MDN
      */
    lazy val local = this := "local"
  }


  /**
    * The background CSS property is a shorthand for setting the individual
    * background values in a single place in the style sheet. background can be
    * used to set the values for one or more of: background-clip, background-color,
    * background-image, background-origin, background-position, background-repeat,
    * background-size, and background-attachment.
    *
    * MDN
    */
  lazy val background = style[String]("background", "background")

  /**
    * The background-repeat CSS property defines how background images are repeated.
    * A background image can be repeated along the horizontal axis, the vertical
    * axis, both, or not repeated at all. When the repetition of the image tiles
    * doesn't let them exactly cover the background, the way adjustments are done
    * can be controlled by the author: by default, the last image is clipped, but
    * the different tiles can instead be re-sized, or space can be inserted
    * between the tiles.
    *
    * MDN
    */
  lazy val backgroundRepeat = style[String]("backgroundRepeat", "background-repeat")


  /**
    * The background-position CSS property sets the initial position, relative to
    * the background position layer defined by background-origin for each defined
    * background image.
    *
    * MDN
    */
  lazy val backgroundPosition = style[String]("backgroundPosition", "background-position")

  /**
    * The background-color CSS property sets the background color of an element,
    * either through a color value or the keyword transparent.
    *
    * MDN
    */
  lazy val backgroundColor = style[String]("backgroundColor", "background-color")

  /**
    * The background-origin CSS property determines the background positioning
    * area, that is the position of the origin of an image specified using the
    * background-image CSS property.
    *
    * Note that background-origin is ignored when background-attachment is fixed.
    *
    * MDN
    */
  object backgroundOrigin extends Style[String, N]("backgroundOrigin", "background-origin", this) {

    /**
      * The background extends to the outside edge of the border (but underneath
      * the border in z-ordering).
      *
      * MDN
      */
    lazy val borderBox = this := "border-box"

    /**
      * No background is drawn below the border (background extends to the
      * outside edge of the padding).
      *
      * MDN
      */
    lazy val paddingBox = this := "border-box"

    /**
      * The background is painted within (clipped to) the content box.
      *
      * MDN
      */
    lazy val contentBox = this := "content-box"
  }

  /**
    * The background-clip CSS property specifies whether an element's background,
    * either the color or image, extends underneath its border.
    *
    * If there is no background image, this property has only visual effect when
    * the border has transparent regions (because of border-style) or partially
    * opaque regions; otherwise the border covers up the difference.
    *
    * MDN
    */
  object backgroundClip extends Style[String, N]("backgroundClip", "background-clip", this) {

    /**
      * The background extends to the outside edge of the border (but underneath
      * the border in z-ordering).
      *
      * MDN
      */
    lazy val borderBox = this := "border-box"

    /**
      * No background is drawn below the border (background extends to the
      * outside edge of the padding).
      *
      * MDN
      */
    lazy val paddingBox = this := "padding-box"

    /**
      * The background is painted within (clipped to) the content box.
      *
      * MDN
      */
    lazy val contentBox = this := "content-box"
  }

  /**
    * The background-size CSS property specifies the size of the background
    * images. The size of the image can be fully constrained or only partially in
    * order to preserve its intrinsic ratio.
    *
    * MDN
    */
  object backgroundSize extends Style[String, N]("backgroundSize", "background-size", this) {

    /**
      * The auto keyword that scales the background image in the corresponding
      * direction such that its intrinsic proportion is maintained.
      *
      * MDN
      */
    lazy val auto = this := "auto"

    /**
      * This keyword specifies that the background image should be scaled to be
      * as small as possible while ensuring both its dimensions are greater than
      * or equal to the corresponding dimensions of the background positioning
      * area.
      *
      * MDN
      */
    lazy val cover = this := "cover"

    /**
      * This keyword specifies that the background image should be scaled to be
      * as large as possible while ensuring both its dimensions are less than or
      * equal to the corresponding dimensions of the background positioning area.
      *
      * MDN
      */
    lazy val contain = this := "contain"
  }

  /**
    * The CSS background-image property sets one or several background images for
    * an element. The images are drawn on successive stacking context layers, with
    * the first specified being drawn as if it is the closest to the user. The
    * borders of the element are then drawn on top of them, and the background-color
    * is drawn beneath them.
    *
    * MDN
    */
  lazy val backgroundImage = new MultiImageStyle("backgroundImage", "background-image")

  /**
    * The border-top-color CSS property sets the color of the top border of an
    * element. Note that in many cases the shorthand CSS properties border-color
    * or border-top are more convenient and preferable.
    *
    * MDN
    */
  lazy val borderTopColor = style[String]("borderTopColor", "border-top-color")

  /**
    * The border-style CSS property is a shorthand property for setting the line
    * style for all four sides of the elements border.
    *
    * MDN
    */
  lazy val borderStyle = style[String]("borderStyle", "border-style")

  /**
    * The border-top-style CSS property sets the line style of the top border of a box.
    *
    * MDN
    */
  lazy val borderTopStyle = new BorderStyle("borderTopStyle", "border-top-style")

  /**
    * The border-right-style CSS property sets the line style of the right border
    * of a box.
    *
    * MDN
    */
  lazy val borderRightStyle = new BorderStyle("borderRightStyle", "border-right-style")

  /**
    * The border-right-width CSS property sets the width of the right border of
    * a box.
    *
    * MDN
    */
  lazy val borderRightWidth = new BorderWidth("borderRightWidth", "border-right-width")

  /**
    * The border-top-right-radius CSS property sets the rounding of the top-right
    * corner of the element. The rounding can be a circle or an ellipse, or if
    * one of the value is 0 no rounding is done and the corner is square.
    *
    * MDN
    */
  lazy val borderTopRightRadius = new BorderRadius("borderTopRightRadius", "border-top-right-radius")

  /**
    * The border-bottom-left-radius CSS property sets the rounding of the
    * bottom-left corner of the element. The rounding can be a circle or an
    * ellipse, or if one of the value is 0 no rounding is done and the corner is
    * square.
    *
    * MDN
    */
  lazy val borderBottomLeftRadius = new BorderRadius("borderBottomLeftRadius", "border-bottom-left-radius")

  /**
    * The border-right-color CSS property sets the color of the top border of an
    * element. Note that in many cases the shorthand CSS properties border-color
    * or border-right are more convenient and preferable.
    *
    * MDN
    */
  lazy val borderRightColor = style[String]("borderRightColor", "border-right-color")

  /**
    * The border-bottom CSS property is a shorthand that sets the values of
    * border-bottom-color, border-bottom-style, and border-bottom-width. These
    * properties describe the bottom border of elements.
    *
    * MDN
    */
  lazy val borderBottom = style[String]("borderBottom", "border-bottom")

  /**
    * The border CSS property is a shorthand property for setting the individual
    * border property values in a single place in the style sheet. border can be
    * used to set the values for one or more of: border-width, border-style,
    * border-color.
    *
    * MDN
    */
  lazy val border = style[String]("border", "border")

  /**
    * The border-bottom-width CSS property sets the width of the bottom border of
    * a box.
    *
    * MDN
    */
  lazy val borderBottomWidth = new BorderWidth("borderBottomWidth", "border-bottom-width")

  /**
    * The border-right-color CSS property sets the color of the right border of
    * an element. Note that in many cases the shorthand CSS properties
    * border-color or border-right are more convenient and preferable.
    *
    * MDN
    */
  lazy val borderLeftColor = style[String]("borderLeftColor", "border-left-color")

  /**
    * The border-bottom-color CSS property sets the color of the bottom border of
    * an element. Note that in many cases the shorthand CSS properties border-color
    * or border-bottom are more convenient and preferable.
    *
    * MDN
    */
  lazy val borderBottomColor = style[String]("borderBottomColor", "border-bottom-color")

  /**
    * The border-collapse CSS property selects a table's border model. This has
    * a big influence on the look and style of the table cells.
    *
    * MDN
    */
  object borderCollapse extends Style[String, N]("borderCollapse", "border-collapse", this) {

    /**
      * Is a keyword requesting the use of the separated-border table rendering
      * model. It is the default value.
      *
      * MDN
      */
    lazy val separate = this := "separate"

    /**
      * Is a keyword requesting the use of the collapsed-border table rendering
      * model.
      *
      * MDN
      */
    lazy val collapse = this := "collapse"
  }

  /**
    * The border-left CSS property is a shorthand that sets the values of
    * border-left-color, border-left-style, and border-left-width. These
    * properties describe the left border of elements.
    *
    * The three values of the shorthand property can be specified in any order,
    * and one or two of them may be omitted.
    *
    * MDN
    */
  lazy val borderLeft = style[String]("borderLeft", "border-left")

  /**
    * The border-left-style CSS property sets the line style of the left border
    * of a box.
    *
    * MDN
    */
  lazy val borderLeftStyle = new BorderStyle("borderLeftStyle", "border-left-style")

  /**
    * The border-right CSS property is a shorthand that sets the values of
    * border-right-color, border-right-style, and border-right-width. These
    * properties describe the right border of elements.
    *
    * MDN
    */
  lazy val borderRight = style[String]("borderRight", "border-right")

  /**
    * The border-bottom-style CSS property sets the line style of the bottom
    * border of a box.
    *
    * MDN
    */
  lazy val borderBottomStyle = new BorderStyle("borderBottomStyle", "border-bottom-style")

  /**
    * The border-left-width CSS property sets the width of the left border of a box.
    *
    * MDN
    */
  lazy val borderLeftWidth = new BorderWidth("borderLeftWidth", "border-left-width")

  /**
    * The border-top-width CSS property sets the width of the top border of a box.
    *
    * MDN
    */
  lazy val borderTopWidth = new BorderWidth("borderTopWidth", "border-top-width")

  /**
    * The border-top CSS property is a shorthand that sets the values of
    * border-top-color, border-top-style, and border-top-width. These
    * properties describe the top border of elements.
    *
    * MDN
    */
  lazy val borderTop = style[String]("borderTop", "border-top")

  /**
    * The border-spacing CSS property specifies the distance between the borders
    * of adjacent cells (only for the separated borders model). This is equivalent
    * to the cellspacing attribute in presentational HTML, but an optional second
    * value can be used to set different horizontal and vertical spacing.
    *
    * MDN
    */
  object borderSpacing extends Style[String, N]("borderSpacing", "border-spacing", this) {
    def :=(horizontal: String, vertical: String): StyleSetter[String, N] = this := s"$horizontal $vertical"
  }

  /**
    * The border-radius CSS property allows Web authors to define how rounded
    * border corners are. The curve of each corner is defined using one or two
    * radii, defining its shape: circle or ellipse.
    *
    * MDN
    */
  lazy val borderRadius = style[String]("borderRadius", "border-radius")

  /**
    * The border-width CSS property sets the width of the border of a box. Using
    * the shorthand property border is often more convenient.
    *
    * MDN
    */
  lazy val borderWidth = style[String]("borderWidth", "border-width")

  /**
    * The border-bottom-right-radius CSS property sets the rounding of the
    * bottom-right corner of the element. The rounding can be a circle or an
    * ellipse, or if one of the value is 0 no rounding is done and the corner is
    * square.
    *
    * MDN
    */
  lazy val borderBottomRightRadius = new BorderRadius("borderBottomRightRadius", "border-bottom-right-radius")

  /**
    * The border-top-left-radius CSS property sets the rounding of the
    * top-left corner of the element. The rounding can be a circle or an
    * ellipse, or if one of the value is 0 no rounding is done and the corner is
    * square.
    *
    * MDN
    */
  lazy val borderTopLeftRadius = new BorderRadius("borderTopLeftRadius", "border-top-left-radius")

  /**
    * The border-color CSS property is a shorthand for setting the color of the
    * four sides of an element's border: border-top-color, border-right-color,
    * border-bottom-color, border-left-color
    *
    * MDN
    */
  lazy val borderColor = style[String]("borderColor", "border-color")

  /**
    * The box-sizing CSS property is used to alter the default CSS box model used
    * to calculate widths and heights of elements. It is possible to use this
    * property to emulate the behavior of browsers that do not correctly support
    * the CSS box model specification.
    *
    * MDN
    */
  object boxSizing extends Style[String, N]("boxSizing", "box-sizing", this) {

    /**
      * This is the default style as specified by the CSS standard. The width and
      * height properties are measured including only the content, but not the
      * border, margin, or padding.
      *
      * MDN
      */
    lazy val contentBox = this := "content-box"

    /**
      * The width and height properties include the padding and border, but not
      * the margin. This is the box model used by Internet Explorer when the
      * document is in Quirks mode.
      *
      * MDN
      */
    lazy val borderBox = this := "border-box"
  }

  /**
    * The CSS color property sets the foreground color of an element's text
    * content, and its decorations. It doesn't affect any other characteristic of
    * the element; it should really be called text-color and would have been
    * named so, save for historical reasons and its appearance in CSS Level 1.
    *
    * MDN
    */
  object color extends CurrentColor("color", "color") {
    lazy val black = this := "black"
    lazy val silver = this := "silver"
    lazy val gray = this := "gray"
    lazy val white = this := "white"
    lazy val maroon = this := "maroon"
    lazy val red = this := "red"
    lazy val purple = this := "purple"
    lazy val fuschia = this := "fuschia"
    lazy val green = this := "green"
    lazy val lime = this := "lime"
    lazy val olive = this := "olive"
    lazy val yellow = this := "yellow"
    lazy val navy = this := "navy"
    lazy val blue = this := "blue"
    lazy val teal = this := "teal"
    lazy val aqua = this := "aqua"
  }

  /**
    * The clip CSS property defines what portion of an element is visible. The
    * clip property applies only to elements with position:absolute.
    *
    * MDN
    */
  object clip extends Style[String, N]("clip", "clip", this) {
    def rect(top: String, right: String, bottom: String, left: String) =
      this := s"rect($top, $right, $bottom, $left)"

    def auto = this := "auto"
  }

  /**
    * The cursor CSS property specifies the mouse cursor displayed when the mouse
    * pointer is over an element.
    *
    * MDN
    */
  object cursor extends Style[String, N]("cursor", "cursor", this) {

    /**
      * The browser determines the cursor to display based on the current context.
      * E.g. equivalent to text when hovering text.
      *
      * MDN
      */
    lazy val auto = this := "auto"
    /**
      * Default cursor, typically an arrow.
      *
      * MDN
      */
    lazy val default = this := "default"
    /**
      * No cursor is rendered.
      *
      * MDN
      */
    lazy val none = this := "none"
    /**
      * A context menu is available under the cursor.
      *
      * MDN
      */
    lazy val contextMenu = this := "context-menu"
    /**
      * Indicating help is available.
      *
      * MDN
      */
    lazy val help = this := "help"
    /**
      * E.g. used when hovering over links, typically a hand.
      *
      * MDN
      */
    lazy val pointer = this := "pointer"
    /**
      * The program is busy in the background but the user can still interact
      * with the interface (unlike for wait).
      *
      * MDN
      */
    lazy val progress = this := "progress"
    /**
      * The program is busy (sometimes an hourglass or a watch).
      *
      * MDN
      */
    lazy val cssWait = this := "wait"
    /**
      * Indicating that cells can be selected.
      *
      * MDN
      */
    lazy val cell = this := "cell"
    /**
      * Cross cursor, often used to indicate selection in a bitmap.
      *
      * MDN
      */
    lazy val crosshair = this := "crosshair"
    /**
      * Indicating text can be selected, typically an I-beam.
      *
      * MDN
      */
    lazy val text = this := "text"
    /**
      * Indicating that vertical text can be selected, typically a sideways I-beam
      *
      * MDN
      */
    lazy val verticalText = this := "vertical-text"
    /**
      * Indicating an alias or shortcut is to be created.
      *
      * MDN
      */
    lazy val alias = this := "alias"
    /**
      * Indicating that something can be copied
      *
      * MDN
      */
    lazy val copy = this := "copy"
    /**
      * The hoevered object may be moved.
      *
      * MDN
      */
    lazy val move = this := "move"
    /**
      * Cursor showing that a drop is not allowed at the current location.
      *
      * MDN
      */
    lazy val noDrop = this := "no-drop"
    /**
      * Cursor showing that something cannot be done.
      *
      * MDN
      */
    lazy val notAllowed = this := "not-allowed"
    /**
      * Cursor showing that something can be scrolled in any direction (panned).
      *
      * MDN
      */
    lazy val allScroll = this := "all-scroll"
    /**
      * The item/column can be resized horizontally. Often rendered as arrows
      * pointing left and right with a vertical separating.
      *
      * MDN
      */
    lazy val colResize = this := "col-resize"
    /**
      * The item/row can be resized vertically. Often rendered as arrows pointing
      * up and down with a horizontal bar separating them.
      *
      * MDN
      */
    lazy val rowResize = this := "row-resize"
    /**
      * The top edge is to be moved.
      *
      * MDN
      */
    lazy val nResize = this := "n-resize"
    /**
      * The right edge is to be moved.
      *
      * MDN
      */
    lazy val eResize = this := "e-resize"
    /**
      * The bottom edge is to be moved.
      *
      * MDN
      */
    lazy val sResize = this := "s-resize"
    /**
      * The left edge is to be moved.
      *
      * MDN
      */
    lazy val wResize = this := "w-resize"
    /**
      * The top-right corner is to be moved.
      *
      * MDN
      */
    lazy val neResize = this := "ne-resize"
    /**
      * The top-left corner is to be moved.
      *
      * MDN
      */
    lazy val nwResize = this := "nw-resize"
    /**
      * The bottom-right corner is to be moved.
      *
      * MDN
      */
    lazy val seResize = this := "se-resize"
    /**
      * The bottom-left corner is to be moved.
      *
      * MDN
      */
    lazy val swResize = this := "sw-resize"

    lazy val ewResize = this := "ew-resize"
    lazy val nsResize = this := "ns-resize"
    lazy val neswResize = this := "nesw-resize"
    lazy val nwseResize = this := "nwse-resize"

    /**
      * Indicates that something can be zoomed (magnified) in.
      *
      * MDN
      */
    lazy val zoomIn = this := "zoom-in"
    /**
      * Indicates that something can be zoomed (magnified) out.
      *
      * MDN
      */
    lazy val zoomOut = this := "zoom-out"
    /**
      * Indicates that something can be grabbed (dragged to be moved).
      *
      * MDN
      */
    lazy val grab = this := "grab"
    /**
      * Indicates that something can be grabbed (dragged to be moved).
      *
      * MDN
      */
    lazy val grabbing = this := "grabbing"
  }


  /**
    * The float CSS property specifies that an element should be taken from the
    * normal flow and placed along the left or right side of its container, where
    * text and inline elements will wrap around it. A floating element is one
    * where the computed value of float is not none.
    *
    * MDN
    */
  object float extends Style[String, N]("cssFloat", "float", this) {
    /**
      * Is a keyword indicating that the element must float on the left side of
      * its containing block.
      *
      * MDN
      */
    lazy val left = this := "left"
    /**
      * Is a keyword indicating that the element must float on the right side of
      * its containing block.
      *
      * MDN
      */
    lazy val right = this := "right"
    /**
      * Is a keyword indicating that the element must not float
      *
      * MDN
      */
    lazy val none = this := "none"
  }


  /**
    * Set the direction CSS property to match the direction of the text: rtl for
    * Hebrew or Arabic text and ltr for other scripts. This is typically done as
    * part of the document (e.g., using the dir attribute in HTML) rather than
    * through direct use of CSS.
    *
    * The property sets the base text direction of block-level elements and the
    * direction of embeddings created by the unicode-bidi property. It also sets
    * the default alignment of text and block-level elements and the direction
    * that cells flow within a table row.
    *
    * Unlike the dir attribute in HTML, the direction property is not inherited
    * from table columns into table cells, since CSS inheritance follows the
    * document tree, and table cells are inside of the rows but not inside of the
    * columns.
    *
    * The direction and unicode-bidi properties are the two only properties which
    * are not affected by the all shorthand.
    *
    * MDN
    */
  object direction extends Style[String, N]("direction", "direction", this) {
    /**
      * The initial value of direction (that is, if not otherwise specified). Text
      * and other elements go from left to right.
      *
      * MDN
      */
    lazy val ltr = this := "ltr"
    /**
      * Text and other elements go from right to left
      *
      * MDN
      */
    lazy val rtl = this := "rtl"
  }

  /**
    * The display CSS property specifies the type of rendering box used for an
    * element. In HTML, default display property values are taken from behaviors
    * described in the HTML specifications or from the browser/user default
    * stylesheet. The default value in XML is inline.
    *
    * In addition to the many different display box types, the value none lets
    * you turn off the display of an element; when you use none, all descendant
    * elements also have their display turned off. The document is rendered as
    * though the element doesn't exist in the document tree.
    *
    * MDN
    */
  object display extends Style[String, N]("display", "display", this) {
    /**
      * Turns off the display of an element (it has no effect on layout); all
      * descendant elements also have their display turned off. The document is
      * rendered as though the element did not exist.
      *
      * To render an element box's dimensions, yet have its contents be invisible,
      * see the visibility property.
      *
      * MDN
      */
    lazy val none = this := "none"
    /**
      * The element generates one or more inline element boxes.
      *
      * MDN
      */
    lazy val inline = this := "inline"
    /**
      * The element generates a block element box.
      *
      * MDN
      */
    lazy val block = this := "block"
    /**
      * The element generates a block box for the content and a separate
      * list-item inline box.
      *
      * MDN
      */
    lazy val listItem = this := "list-item"
    /**
      * The element generates a block element box that will be flowed with
      * surrounding content as if it were a single inline box.
      *
      * MDN
      */
    lazy val inlineBlock = this := "inline-block"
    /**
      * The inline-table value does not have a direct mapping in HTML. It behaves
      * like a table HTML element, but as an inline box, rather than a
      * block-level box. Inside the table box is a block-level context
      *
      * MDN
      */
    lazy val inlineTable = this := "inline-table"
    /**
      * Behaves like the table HTML element. It defines a block-level box.
      *
      * MDN
      */
    lazy val table = this := "table"
    /**
      * Behaves like the caption HTML element.
      *
      * MDN
      */
    lazy val tableCaption = this := "table-caption"
    /**
      * Behaves like the td HTML element
      *
      * MDN
      */
    lazy val tableCell = this := "table-cell"
    /**
      * These elements behave like the corresponding col HTML elements.
      *
      * MDN
      */
    lazy val tableColumn = this := "table-column"
    /**
      * These elements behave like the corresponding colgroup HTML elements.
      *
      * MDN
      */
    lazy val tableColumnGroup = this := "table-column-group"
    /**
      * These elements behave like the corresponding tfoot HTML elements
      *
      * MDN
      */
    lazy val tableFooterGroup = this := "table-footer-group"
    /**
      * These elements behave like the corresponding thead HTML elements
      *
      * MDN
      */
    lazy val tableHeaderGroup = this := "table-header-group"
    /**
      * Behaves like the tr HTML element
      *
      * MDN
      */
    lazy val tableRow = this := "table-row"
    /**
      * These elements behave like the corresponding tbody HTML elements
      *
      * MDN
      */
    lazy val tableRowGroup = this := "table-row-group"
    /**
      * The element behaves like a block element and lays out its content according
      * to the flexbox model.
      *
      * MDN
      */
    lazy val flex = this := "flex"
    /**
      * The element behaves like an inline element and lays out its content
      * according to the flexbox model.
      *
      * MDN
      */
    lazy val inlineFlex = this := "inline-flex"
  }


  /**
    * The CSS property pointer-events allows authors to control under what
    * circumstances (if any) a particular graphic element can become the target
    * of mouse events. When this property is unspecified, the same characteristics
    * of the visiblePainted value apply to SVG content.
    *
    * In addition to indicating that the element is not the target of mouse events,
    * the value none instructs the mouse event to go "through" the element and
    * target whatever is "underneath" that element instead.
    *
    * MDN
    */
  object pointerEvents extends Style[String, N]("pointerEvents", "pointer-events", this) {
    /**
      * The element behaves as it would if the pointer-events property was not
      * specified. In SVG content, this value and the value visiblePainted have
      * the same effect.
      *
      * MDN
      */
    lazy val auto = this := "auto"
    /**
      * The element is never the target of mouse events; however, mouse events
      * may target its descendant elements if those descendants have pointer-events
      * set to some other value. In these circumstances, mouse events will trigger
      * event listeners on this parent element as appropriate on their way to/from
      * the descendant during the event capture/bubble phases.
      *
      * MDN
      */
    lazy val none = this := "none"
    /**
      * SVG only. The element can only be the target of a mouse event when the
      * visibility property is set to visible and when the mouse cursor is over
      * the interior (i.e., 'fill') of the element and the fill property is set
      * to a value other than none, or when the mouse cursor is over the perimeter
      * (i.e., 'stroke') of the element and the stroke property is set to a value
      * other than none.
      *
      * MDN
      */
    lazy val visiblePainted = this := "visiblePainted"
    /**
      * SVG only. The element can only be the target of a mouse event when the
      * visibility property is set to visible and when the mouse cursor is over
      * the interior (i.e., fill) of the element. The value of the fill property
      * does not effect event processing.
      *
      * MDN
      */
    lazy val visibleFill = this := "visibleFill"
    /**
      * SVG only. The element can only be the target of a mouse event when the
      * visibility property is set to visible and when the mouse cursor is over
      * the perimeter (i.e., stroke) of the element. The value of the stroke
      * property does not effect event processing.
      *
      * MDN
      */
    lazy val visibleStroke = this := "visibleStroke"
    /**
      * SVG only. The element can be the target of a mouse event when the
      * visibility property is set to visible and the mouse cursor is over either
      * the interior (i.e., fill) or the perimeter (i.e., stroke) of the element.
      * The values of the fill and stroke do not effect event processing.
      *
      * MDN
      */
    lazy val visible = this := "visible"
    /**
      * SVG only. The element can only be the target of a mouse event when the
      * mouse cursor is over the interior (i.e., 'fill') of the element and the
      * fill property is set to a value other than none, or when the mouse cursor
      * is over the perimeter (i.e., 'stroke') of the element and the stroke
      * property is set to a value other than none. The value of the visibility
      * property does not effect event processing.
      *
      * MDN
      */
    lazy val painted = this := "painted"
    /**
      * SVG only. The element can only be the target of a mouse event when the
      * pointer is over the interior (i.e., fill) of the element. The values of
      * the fill and visibility properties do not effect event processing.
      *
      * MDN
      */
    lazy val fill = this := "fill"
    /**
      * SVG only. The element can only be the target of a mouse event when the
      * pointer is over the perimeter (i.e., stroke) of the element. The values
      * of the stroke and visibility properties do not effect event processing.
      *
      * MDN
      */
    lazy val stroke = this := "stroke"
    /**
      * SVG only. The element can only be the target of a mouse event when the
      * pointer is over the interior (i.e., fill) or the perimeter (i.e., stroke)
      * of the element. The values of the fill, stroke and visibility properties
      * do not effect event processing.
      *
      * MDN
      */
    lazy val all = this := "all"
  }


  /**
    * The list-style-image CSS property sets the image that will be used as the
    * list item marker. It is often more convenient to use the shorthand
    * list-style.
    *
    * MDN
    */
  object listStyleImage extends Style[String, N]("listStyleImage", "list-style-image", this) {

    def none = this := "none"
  }


  /**
    * The list-style-position CSS property specifies the position of the marker
    * box in the principal block box. It is often more convenient to use the
    * shortcut list-style.
    *
    * MDN
    */
  object listStylePosition extends Style[String, N]("listStylePosition", "list-style-position", this) {
    /**
      * The marker box is outside the principal block box.
      *
      * MDN
      */
    lazy val outside = this := "outside"
    /**
      * The marker box is the first inline box in the principal block box, after
      * which the element's content flows.
      *
      * MDN
      */
    lazy val inside = this := "inside"
  }

  object wordWrap extends Style[String, N]("wordWrap", "word-wrap", this) {
    /**
      * Indicates that lines may only break at normal word break points.
      *
      * MDN
      */
    lazy val normal = this := "normal"
    /**
      * Indicates that normally unbreakable words may be broken at arbitrary
      * points if there are no otherwise acceptable break points in the line.
      *
      * MDN
      */
    lazy val breakWord = this := "break-word"
  }


  /**
    * The opacity CSS property specifies the transparency of an element, that is,
    * the degree to which the background behind the element is overlaid.
    *
    * The value applies to the element as a whole, including its contents, even
    * though the value is not inherited by child elements. Thus, an element and
    * its contained children all have the same opacity relative to the element's
    * background, even if the element and its children have different opacities
    * relative to one another.
    *
    * Using this property with a value different than 1 places the element in a
    * new stacking context.
    *
    * MDN
    */
  lazy val opacity = style[Double]("opacity", "opacity")


  /**
    * The max-width CSS property is used to set the maximum width of a given
    * element. It prevents the used value of the width property from becoming
    * larger than the value specified for max-width.
    *
    * max-width overrides width, but min-width overrides max-width.
    *
    * MDN
    */
  lazy val maxWidth = new MaxLengthStyle("maxWidth", "max-width")


  /**
    * The vertical-align CSS property specifies the vertical alignment of an
    * inline or table-cell box.
    *
    * MDN
    */
  object verticalAlign extends Style[String, N]("verticalAlign", "vertical-align", this) {
    /**
      * Aligns the baseline of the element with the baseline of its parent. The
      * baseline of some replaced elements, like textarea is not specified by
      * the HTML specification, meaning that their behavior with this keyword may
      * change from one browser to the other.
      *
      * MDN
      */
    lazy val baseline = this := "baseline"
    /**
      * Aligns the baseline of the element with the subscript-baseline of its
      * parent.
      *
      * MDN
      */
    lazy val sub = this := "sub"
    /**
      * Aligns the baseline of the element with the superscript-baseline of its
      * parent.
      *
      * MDN
      */
    lazy val `super` = this := "super"
    /**
      * Aligns the top of the element with the top of the parent element's font.
      *
      * MDN
      */
    lazy val textTop = this := "text-top"
    /**
      * Aligns the bottom of the element with the bottom of the parent element's
      * font.
      *
      * MDN
      */
    lazy val textBottom = this := "text-bottom"
    /**
      * Aligns the middle of the element with the middle of lowercase letters in
      * the parent.
      *
      * MDN
      */
    lazy val middle = this := "middle"
  }


  /**
    * The overflow CSS property specifies whether to clip content, render scroll
    * bars or display overflow content of a block-level element.
    *
    * MDN
    */
  object overflow extends Overflow("overflow", "overflow")

  /**
    * If the value is a URI value, the element pointed to by the URI is used as
    * an SVG mask.
    *
    * MDN
    */
  object mask extends Style[String, N]("mask", "mask", this) {
    lazy val none = this := "none"

    def uri(s: String) = this := s"uri($s)"
  }


  /**
    * he empty-cells CSS property specifies how user agents should render borders
    * and backgrounds around cells that have no visible content.
    *
    * MDN
    */
  object emptyCells extends Style[String, N]("emptyCells", "empty-cells", this) {
    /**
      * Is a keyword indicating that borders and backgrounds should be drawn like
      * in a normal cells.
      *
      * MDN
      */
    lazy val show = this := "show"
    /**
      * Is a keyword indicating that no border or backgrounds should be drawn.
      *
      * MDN
      */
    lazy val hide = this := "hide"
  }


  /**
    * The height CSS property specifies the height of the content area of an
    * element. The content area is inside the padding, border, and margin of the
    * element.
    *
    * The min-height and max-height properties override height.
    *
    * MDN
    */
  lazy val height = new AutoStyle[String]("height", "height")


  /**
    * The padding-right CSS property of an element sets the padding space
    * required on the right side of an element. The padding area is the space
    * between the content of the element and its border. Negative values are not
    * allowed.
    *
    * MDN
    */
  lazy val paddingRight = style[String]("paddingRight", "padding-right")

  /**
    * The padding-top CSS property of an element sets the padding space required
    * on the top of an element. The padding area is the space between the content
    * of the element and its border. Contrary to margin-top values, negative
    * values of padding-top are invalid.
    *
    * MDN
    */
  lazy val paddingTop = style[String]("paddingTop", "padding-top")

  /**
    * The padding-left CSS property of an element sets the padding space required
    * on the left side of an element. The padding area is the space between the
    * content of the element and it's border. A negative value is not allowed.
    *
    * MDN
    */
  lazy val paddingLeft = style[String]("paddingLeft", "padding-left")

  /**
    * The padding CSS property sets the required padding space on all sides of an
    * element. The padding area is the space between the content of the element
    * and its border. Negative values are not allowed.
    *
    * The padding property is a shorthand to avoid setting each side separately
    * (padding-top, padding-right, padding-bottom, padding-left).
    *
    * MDN
    */
  lazy val padding = style[String]("padding", "padding")

  /**
    * The padding-bottom CSS property of an element sets the height of the padding
    * area at the bottom of an element. The padding area is the space between the
    * content of the element and it's border. Contrary to margin-bottom values,
    * negative values of padding-bottom are invalid.
    *
    * MDN
    */
  lazy val paddingBottom = style[String]("paddingBottom", "padding-bottom")

  /**
    * The right CSS property specifies part of the position of positioned elements.
    *
    * For absolutely positioned elements (those with position: absolute or
    * position: fixed), it specifies the distance between the right margin edge
    * of the element and the right edge of its containing block.
    *
    * The right property has no effect on non-positioned elements.
    *
    * When both the right CSS property and the left CSS property are defined, the
    * position of the element is overspecified. In that case, the left value has
    * precedence when the container is left-to-right (that is that the right
    * computed value is set to -left), and the right value has precedence when
    * the container is right-to-left (that is that the left computed value is set
    * to -right).
    *
    * MDN
    */
  lazy val right = new AutoStyle[String]("right", "right")


  /**
    * On block level elements, the line-height CSS property specifies the minimal
    * height of line boxes within the element.
    *
    * On non-replaced inline elements, line-height specifies the height that is
    * used in the calculation of the line box height.
    *
    * On replaced inline elements, like buttons or other input element, line-height has no effect.
    *
    * MDN
    */
  lazy val lineHeight = new NormalOpenStyle[String]("lineHeight", "line-height")

  /**
    * The left CSS property specifies part of the position of positioned elements.
    *
    * For absolutely positioned elements (those with position: absolute or
    * position: fixed), it specifies the distance between the left margin edge of
    * the element and the left edge of its containing block.
    *
    * MDN
    */
  lazy val left = new AutoStyle[String]("left", "left")


  /**
    * The list-style-type CSS property specifies appearance of a list item element.
    * As it is the only one who defaults to display:list-item, this is usually a
    * li element, but can be any element with this display value.
    *
    * MDN
    */
  object listStyleType extends Style[String, N]("listStyleType", "list-style-type", this) {
    /**
      * No item marker is shown
      *
      * MDN
      */
    lazy val none = this := "none"
    /**
      * A filled circle (default value)
      *
      * MDN
      */
    lazy val disc = this := "disc"
    /**
      * A hollow circle
      *
      * MDN
      */
    lazy val circle = this := "circle"
    /**
      * A filled square
      *
      * MDN
      */
    lazy val square = this := "square"
    /**
      * Decimal numbers begining with 1
      *
      * MDN
      */
    lazy val decimal = this := "decimal"
    /**
      * Han decimal numbers
      *
      * MDN
      */
    lazy val cjkDecimal = this := "cjk-decimal"
    /**
      * Decimal numbers padded by initial zeros
      *
      * MDN
      */
    lazy val decimalLeadingZero = this := "decimal-leading-zero"
    /**
      * Lowercase roman numerals
      *
      * MDN
      */
    lazy val lowerRoman = this := "lower-roman"
    /**
      * Uppercase roman numerals
      *
      * MDN
      */
    lazy val upperRoman = this := "upper-roman"
    /**
      * Lowercase classical greek
      *
      * MDN
      */
    lazy val lowerGreek = this := "lower-greek"
    /**
      * Lowercase ASCII letters
      *
      * MDN
      */
    lazy val lowerAlpha = this := "lower-alpha"
    /**
      * Lowercase ASCII letters
      *
      * MDN
      */
    lazy val lowerLatin = this := "lower-latin"
    /**
      * Uppercase ASCII letters
      *
      * MDN
      */
    lazy val upperAlpha = this := "upper-alpha"
    /**
      * Uppercase ASCII letters
      *
      * MDN
      */
    lazy val upperLatin = this := "upper-latin"
    /**
      * Traditional Armenian numbering
      *
      * MDN
      */
    lazy val armenian = this := "armenian"
    /**
      * Traditional Georgian numbering
      *
      * MDN
      */
    lazy val georgian = this := "georgian"
    /**
      * Traditional Hebrew numbering
      *
      * MDN
      */
    lazy val hebrew = this := "hebrew"
    /**
      * Japanese Hiragana
      *
      * MDN
      */
    lazy val hiragana = this := "hiragana"
    /**
      * Japanese Hiragana
      *
      * Iroha is the old japanese ordering of syllabs
      *
      * MDN
      */
    lazy val hiraganaIroha = this := "hiragana-iroha"
    /**
      * Japanese Katakana
      *
      * MDN
      */
    lazy val katakana = this := "katakana"
    /**
      * Japanese Katakana
      *
      * Iroha is the old japanese ordering of syllabs
      *
      * MDN
      */
    lazy val katakanaIroha = this := "katakana-iroha"
  }


  /**
    * The list-style CSS property is a shorthand property for setting
    * list-style-type, list-style-image and list-style-position.
    *
    * MDN
    */
  lazy val listStyle = style[String]("listStyle", "list-style")

  /**
    * The overflow-y CSS property specifies whether to clip content, render a
    * scroll bar, or display overflow content of a block-level element, when it
    * overflows at the top and bottom edges.
    *
    * MDN
    */
  lazy val overflowY = new Overflow("overflowY", "overflow-y")

  /**
    * The caption-side CSS property positions the content of a table's caption
    * on the specified side.
    *
    * MDN
    */
  object captionSide extends Style[String, N]("captionSide", "caption-side", this) {
    /**
      * The caption box will be above the table.
      *
      * MDN
      */
    lazy val top = this := "top"
    /**
      * The caption box will be below the table.
      *
      * MDN
      */
    lazy val bottom = this := "bottom"
  }

  /**
    * The box-shadow CSS property describes one or more shadow effects as a
    * comma-separated list. It allows casting a drop shadow from the frame of
    * almost any element. If a border-radius is specified on the element with a
    * box shadow, the box shadow takes on the same rounded corners. The z-ordering
    * of multiple box shadows is the same as multiple text shadows (the first
    * specified shadow is on top).
    *
    * MDN
    */
  lazy val boxShadow = style[String]("boxShadow", "box-shadow")


  /**
    * The position CSS property chooses alternative rules for positioning elements,
    * designed to be useful for scripted animation effects.
    *
    * MDN
    */
  object position extends Style[String, N]("position", "position", this) {
    /**
      * This keyword let the element use the normal behavior, that is it is laid
      * out in its current position in the flow.  The top, right, bottom, and left
      * properties do not apply.
      *
      * MDN
      */
    lazy val static = this := "static"
    /**
      * This keyword lays out all elements as though the element were not
      * positioned, and then adjust the element's position, without changing
      * layout (and thus leaving a gap for the element where it would have been
      * had it not been positioned). The effect of position:relative on
      * table-*-group, table-row, table-column, table-cell, and table-caption
      * elements is undefined.
      *
      * MDN
      */
    lazy val relative = this := "relative"
    /**
      * Do not leave space for the element. Instead, position it at a specified
      * position relative to its closest positioned ancestor or to the containing
      * block. Absolutely positioned boxes can have margins, they do not collapse
      * with any other margins.
      *
      * MDN
      */
    lazy val absolute = this := "absolute"
    /**
      * Do not leave space for the element. Instead, position it at a specified
      * position relative to the screen's viewport and doesn't move when scrolled.
      * When printing, position it at that fixed position on every page.
      *
      * MDN
      */
    lazy val fixed = this := "fixed"
  }


  object quotes extends Style[String, N]("quotes", "quotes", this) {
    /**
      * The open-quote and close-quote values of the content property produce no
      * quotation marks.
      *
      * MDN
      */
    lazy val none = this := "none"

    def ~(pairs: (String, String)*) = {
      this := pairs.flatMap(x => Seq(x._1, x._2)).map('"' + _ + '"').mkString(" ")
    }

  }

  object tableLayout extends Style[String, N]("tableLayout", "table-layout", this) {
    /**
      * An automatic table layout algorithm is commonly used by most browsers for
      * table layout. The width of the table and its cells depends on the content
      * thereof.
      *
      * MDN
      */
    lazy val auto = this := "auto"
    /**
      * Table and column widths are set by the widths of table and col elements
      * or by the width of the first row of cells. Cells in subsequent rows do
      * not affect column widths.
      *
      * MDN
      */
    lazy val fixed = this := "fixed"
  }


  /**
    * The font-size CSS property specifies the size of the font – specifically
    * the desired height of glyphs from the font. Setting the font size may, in
    * turn, change the size of other items, since it is used to compute the value
    * of em and ex Length units.
    *
    * MDN
    */
  object fontSize extends Style[String, N]("fontSize", "font-size", this) {
    lazy val xxSmall = this := "xx-small"
    lazy val xSmall = this := "x-small"
    lazy val small = this := "small"
    lazy val medium = this := "medium"
    lazy val large = this := "large"
    lazy val xLarge = this := "x-large"
    lazy val xxLarge = this := "xx-large"
    /**
      * Larger than the parent element's font size, by roughly the ratio used to
      * separate the absolute size keywords above.
      *
      * MDN
      */
    lazy val larger = this := "larger"
    /**
      * Smaller than the parent element's font size, by roughly the ratio used to
      * separate the absolute size keywords above.
      *
      * MDN
      */
    lazy val smaller = this := "smaller"
  }


  /**
    * The font-size-adjust CSS property specifies that font size should be chosen
    * based on the height of lowercase letters rather than the height of capital
    * letters.
    *
    * This is useful since the legibility of fonts, especially at small sizes, is
    * determined more by the size of lowercase letters than by the size of capital
    * letters. This can cause problems when the first-choice font-family is
    * unavailable and its replacement has a significantly different aspect ratio
    * (the ratio of the size of lowercase letters to the size of the font).
    *
    * MDN
    */
  lazy val fontSizeAdjust = style[Double | String]("fontSizeAdjust", "font-size-adjust")

  /**
    * The font-family CSS property allows for a prioritized list of font family
    * names and/or generic family names to be specified for the selected element.
    * Unlike most other CSS properties, values are separated by a comma to indicate
    * that they are alternatives. The browser will select the first font on the
    * list that is installed on the computer, or that can be downloaded using the
    * information provided by a @font-face at-rule.
    *
    * MDN
    */
  lazy val fontFamily = style[String]("fontFamily", "font-family")


  /**
    * The font-weight CSS property specifies the weight or boldness of the font.
    * However, some fonts are not available in all weights; some are available
    * only on normal and bold.
    *
    * Numeric font weights for fonts that provide more than just normal and bold.
    * If the exact weight given is unavailable, then 600-900 use the closest
    * available darker weight (or, if there is none, the closest available
    * lighter weight), and 100-500 use the closest available lighter weight (or,
    * if there is none, the closest available darker weight). This means that for
    * fonts that provide only normal and bold, 100-500 are normal, and 600-900
    * are bold.
    *
    * MDN
    */
  // @TODO[API] This should accept numbers as well! XStream probably needs implicit conversions for |
  object fontWeight extends Style[/*Int | */String, N]("fontWeight", "font-weight", this) {
    /**
      * Normal font weight. Same as 400.
      *
      * MDN
      */
    lazy val normal = this := "normal"
    /**
      * Bold font weight. Same as 700.
      *
      * MDN
      */
    lazy val bold = this := "bold"
    /**
      * One font weight lighter than the parent element (among the available
      * weights of the font).
      *
      * MDN
      */
    lazy val lighter = this := "lighter"
    /**
      * One font weight darker than the parent element (among the available
      * weights of the font)
      *
      * MDN
      */
    lazy val bolder = this := "bolder"

  }

  /**
    * The font CSS property is either a shorthand property for setting font-style,
    * font-variant, font-weight, font-size, line-height and font-family, or a way
    * to set the element's font to a system font, using specific keywords.
    *
    * MDN
    */
  lazy val font = style[String]("font", "font")

  /**
    * The font-feature-settings CSS property allows control over advanced
    * typographic features in OpenType fonts.
    *
    * MDN
    */
  lazy val fontFeatureSettings = style[String]("fontFeatureSettings", "font-feature-settings")

  /**
    * The font-style CSS property allows italic or oblique faces to be selected
    * within a font-family.
    *
    * MDN
    */
  object fontStyle extends Style[String, N]("fontStyle", "font-style", this) {
    /**
      * Selects a font that is classified as normal within a font-family
      *
      * MDN
      */
    lazy val normal = this := "normal"
    /**
      * Selects a font that is labeled italic, if that is not available, one labeled oblique
      *
      * MDN
      */
    lazy val italic = this := "italic"
    /**
      * Selects a font that is labeled oblique
      *
      * MDN
      */
    lazy val oblique = this := "oblique"
  }

  /**
    * The clear CSS property specifies whether an element can be next to floating
    * elements that precede it or must be moved down (cleared) below them.
    *
    * The clear property applies to both floating and non-floating elements.
    *
    * MDN
    */
  object clear extends Style[String, N]("clear", "clear", this) {
    /**
      * The element is not moved down to clear past floating elements.
      *
      * MDN
      */
    lazy val none = this := "none"
    /**
      * The element is moved down to clear past left floats.
      *
      * MDN
      */
    lazy val left = this := "left"
    /**
      * The element is moved down to clear past right floats.
      *
      * MDN
      */
    lazy val right = this := "right"
    /**
      * The element is moved down to clear past both left and right floats.
      *
      * MDN
      */
    lazy val both = this := "both"
  }

  /**
    * The margin-bottom CSS property of an element sets the margin space required
    * on the bottom of an element. A negative value is also allowed.
    *
    * MDN
    */
  lazy val marginBottom = new AutoStyle[String]("marginBottom", "margin-bottom")

  /**
    * The margin-right CSS property of an element sets the margin space required
    * on the bottom of an element. A negative value is also allowed.
    *
    * MDN
    */
  lazy val marginRight = new Style[String, N]("marginRight", "margin-right", this) with MarginAuto


  /**
    * The margin-top CSS property of an element sets the margin space required on
    * the top of an element. A negative value is also allowed.
    *
    * MDN
    */
  lazy val marginTop = new Style[String, N]("marginTop", "margin-top", this) with MarginAuto


  /**
    * The margin-left CSS property of an element sets the margin space required
    * on the left side of a box associated with an element. A negative value is
    * also allowed.
    *
    * The vertical margins of two adjacent boxes may fuse. This is called margin
    * collapsing.
    *
    * MDN
    */
  lazy val marginLeft = new Style[String, N]("marginLeft", "margin-left", this) with MarginAuto

  /**
    * The margin CSS property sets the margin for all four sides. It is a
    * shorthand to avoid setting each side separately with the other margin
    * properties: margin-top, margin-right, margin-bottom and margin-left.
    *
    * Negative values are also allowed.
    *
    * MDN
    */
  object margin extends Style[String, N]("margin", "margin", this) {
    /**
      * auto is replaced by some suitable value, e.g. it can be used for
      * centering of blocks.
      *
      * MDN
      */
    lazy val auto = this := "auto"

  }


  /**
    * The top CSS property specifies part of the position of positioned elements.
    * It has no effect on non-positioned elements.
    *
    * For absolutely positioned elements (those with position: absolute or
    * position: fixed), it specifies the distance between the top margin edge of
    * the element and the top edge of its containing block.
    *
    * For relatively positioned elements (those with position: relative), it
    * specifies the amount the element is moved below its normal position.
    *
    * When both top and bottom are specified, the element position is
    * over-constrained and the top property has precedence: the computed value
    * of bottom is set to -top, while its specified value is ignored.
    *
    * MDN
    */
  lazy val top = new AutoStyle[String]("top", "top")


  /**
    * The width CSS property specifies the width of the content area of an element.
    * The content area is inside the padding, border, and margin of the element.
    *
    * The min-width and max-width properties override width.
    *
    * MDN
    */
  lazy val width = new AutoStyle[String]("width", "width")

  /**
    * The bottom CSS property participates in specifying the position of
    * positioned elements.
    *
    * For absolutely positioned elements, that is those with position: absolute
    * or position: fixed, it specifies the distance between the bottom margin edge
    * of the element and the bottom edge of its containing block.
    *
    * For relatively positioned elements, that is those with position: relative,
    * it specifies the distance the element is moved above its normal position.
    *
    * However, the top property overrides the bottom property, so if top is not
    * auto, the computed value of bottom is the negative of the computed value of
    * top.
    *
    * MDN
    */
  lazy val bottom = new AutoStyle[String]("bottom", "bottom")

  /**
    * The letter-spacing CSS property specifies spacing behavior between text
    * characters.
    *
    * MDN
    */
  lazy val letterSpacing = new NormalOpenStyle[String]("letterSpacing", "letter-spacing")


  /**
    * The max-height CSS property is used to set the maximum height of a given
    * element. It prevents the used value of the height property from becoming
    * larger than the value specified for max-height.
    *
    * max-height overrides height, but min-height overrides max-height.
    *
    * MDN
    */
  lazy val maxHeight = new MaxLengthStyle("maxHeight", "max-height")

  /**
    * The min-width CSS property is used to set the minimum width of a given
    * element. It prevents the used value of the width property from becoming
    * smaller than the value specified for min-width.
    *
    * The value of min-width overrides both max-width and width.
    *
    * MDN
    */
  lazy val minWidth = new MinLengthStyle("minWidth", "min-width")


  /**
    * The min-height CSS property is used to set the minimum height of a given
    * element. It prevents the used value of the height property from becoming
    * smaller than the value specified for min-height.
    *
    * The value of min-height overrides both max-height and height.
    *
    * MDN
    */
  lazy val minHeight = new MinLengthStyle("minHeight", "min-height")


  /**
    * The CSS outline property is a shorthand property for setting one or more of
    * the individual outline properties outline-style, outline-width and
    * outline-color in a single rule. In most cases the use of this shortcut is
    * preferable and more convenient.
    *
    * Outlines do not take up space, they are drawn above the content.
    *
    * MDN
    */
  lazy val outline = style[String]("outline", "outline")

  /**
    * The outline-style CSS property is used to set the style of the outline of
    * an element. An outline is a line that is drawn around elements, outside the
    * border edge, to make the element stand out.
    *
    * MDN
    */
  lazy val outlineStyle = new OutlineStyle("outlineStyle", "outline-style")

  /**
    * The outline-width CSS property is used to set the width of the outline of
    * an element. An outline is a line that is drawn around elements, outside the
    * border edge, to make the element stand out.
    *
    * MDN
    */
  object outlineWidth extends Style[String, N]("outlineWidth", "outline-width", this) {
    /**
      * Typically 1px in desktop browsers like Firefox.
      *
      * MDN
      */
    lazy val thin = this := "thin"
    /**
      * Typically 3px in desktop browsers like Firefox.
      *
      * MDN
      */
    lazy val medium = this := "medium"
    /**
      * Typically 5px in desktop browsers like Firefox.
      *
      * MDN
      */
    lazy val thick = this := "thick"
  }

  /**
    * The outline-color CSS property sets the color of the outline of an element.
    * An outline is a line that is drawn around elements, outside the border edge,
    * to make the element stand out.
    *
    * MDN
    */
  object outlineColor extends Style[String, N]("outlineColor", "outline-color", this) {
    /**
      * To ensure the outline is visible, performs a color inversion of the
      * background. This makes the focus border more salient, regardless of the
      * color in the background. Note that browser are not required to support
      * it. If not, they just consider the statement as invalid
      *
      * MDN
      */
    lazy val invert = this := "invert"
  }


  /**
    * The overflow-x CSS property specifies whether to clip content, render a
    * scroll bar or display overflow content of a block-level element, when it
    * overflows at the left and right edges.
    *
    * MDN
    */
  lazy val overflowX = new Overflow("overflowX", "overflow-x")


  /**
    * The text-align-last CSS property describes how the last line of a block or
    * a line, right before a forced line break, is aligned.
    *
    * MDN
    */
  lazy val textAlignLast = new Style[String, N]("textAlignLast", "text-align-last", this) with TextAlign

  trait TextAlign extends Style[String, N] {
    /**
      * The same as left if direction is left-to-right and right if direction is
      * right-to-left.
      *
      * MDN
      */
    lazy val start = this := "start"
    /**
      * The same as right if direction is left-to-right and left if direction is
      * right-to-left.
      *
      * MDN
      */
    lazy val end = this := "end"
    /**
      * The inline contents are aligned to the left edge of the line box.
      *
      * MDN
      */
    lazy val left = this := "left"
    /**
      * The inline contents are aligned to the right edge of the line box.
      *
      * MDN
      */
    lazy val right = this := "right"
    /**
      * The inline contents are centered within the line box.
      *
      * MDN
      */
    lazy val center = this := "center"
    /**
      * The text is justified. Text should line up their left and right edges to
      * the left and right content edges of the paragraph.
      *
      * MDN
      */
    lazy val justify = this := "justify"
  }

  /**
    * The text-align CSS property describes how inline content like text is
    * aligned in its parent block element. text-align does not control the
    * alignment of block elements itself, only their inline content.
    *
    * MDN
    */
  lazy val textAlign = new Style[String, N]("textAlign", "text-align", this) with TextAlign

  /**
    * The text-decoration CSS property is used to set the text formatting to
    * underline, overline, line-through or blink.
    *
    * MDN
    */
  object textDecoration extends Style[String, N]("textDecoration", "text-decoration", this) {
    /**
      * Produces no text decoration.
      *
      * MDN
      */
    lazy val none = this := "none"
    /**
      * Each line of text is underlined.
      *
      * MDN
      */
    lazy val underline = this := "underline"
    /**
      * Each line of text has a line above it.
      *
      * MDN
      */
    lazy val overline = this := "overline"
    /**
      * Each line of text has a line through the middle.
      *
      * MDN
      */
    lazy val lineThrough = this := "line-through"
  }

  /**
    * The text-indent CSS property specifies how much horizontal space should be
    * left before the beginning of the first line of the text content of an element.
    * Horizontal spacing is with respect to the left (or right, for right-to-left
    * layout) edge of the containing block element's box.
    *
    * MDN
    */
  lazy val textIndent = style[String]("textIndent", "text-indent")

  /**
    * The text-overflow CSS property determines how overflowed content that is
    * not displayed is signaled to the users. It can be clipped, or display an
    * ellipsis ('…', U+2026 HORIZONTAL ELLIPSIS) or a Web author-defined string.
    *
    * MDN
    */
  object textOverflow extends Style[String, N]("textOverflow", "text-overflow", this) {
    /**
      * This keyword value indicates to truncate the text at the limit of the
      * content area, therefore the truncation can happen in the middle of a
      * character. To truncate at the transition between two characters, the
      * empty string value must be used. The value clip is the default for
      * this property.
      *
      * MDN
      */
    lazy val clip = this := "clip"
    /**
      * This keyword value indicates to display an ellipsis ('…', U+2026 HORIZONTAL
      * ELLIPSIS) to represent clipped text. The ellipsis is displayed inside the
      * content area, decreasing the amount of text displayed. If there is not
      * enough space to display the ellipsis, it is clipped.
      *
      * MDN
      */
    lazy val ellipsis = this := "ellipsis"
  }

  /**
    * The CSS text-underline-position property specifies the position of the
    * underline which is set using the text-decoration property underline value.
    *
    * This property inherits and is not reset by the text-decoration shorthand,
    * allowing to easily set it globally for a given document.
    *
    * MDN
    */
  object textUnderlinePosition extends Style[String, N]("textUnderlinePosition", "text-underline-position", this) {
    /**
      * This keyword allows the browser to use an algorithm to choose between
      * under and alphabetic.
      *
      * MDN
      */
    lazy val auto = this := "auto"
    /**
      * This keyword forces the line to be set below the alphabetic baseline, at
      * a position where it won't cross any descender. This is useful to prevent
      * chemical or mathematical formulas, which make a large use of subscripts,
      * to be illegible.
      *
      * MDN
      */
    lazy val under = this := "under"
    /**
      * In vertical writing-modes, this keyword forces the line to be placed on
      * the left of the characters. In horizontal writing-modes, it is a synonym
      * of under.
      *
      * MDN
      */
    lazy val left = this := "left"
    /**
      * In vertical writing-modes, this keyword forces the line to be placed on
      * the right of the characters. In horizontal writing-modes, it is a synonym
      * of under.
      *
      * MDN
      */
    lazy val right = this := "right"
    lazy val underLeft = this := "under left"
    lazy val underRight = this := "under right"
  }

  /**
    * The text-transform CSS property specifies how to capitalize an element's
    * text. It can be used to make text appear in all-uppercase or all-lowercase,
    * or with each word capitalized.
    *
    * MDN
    */
  object textTransform extends Style[String, N]("textTransform", "text-transform", this) {
    /**
      * Forces the first letter of each word to be converted to
      * uppercase. Other characters are unchanged.
      *
      * MDN
      */
    lazy val capitalize = this := "capitalize"
    /**
      * Forces all characters to be converted to uppercase.
      *
      * MDN
      */
    lazy val uppercase = this := "uppercase"
    /**
      * Forces all characters to be converted to lowercase.
      *
      * MDN
      */
    lazy val lowercase = this := "lowercase"
    /**
      * Prevents the case of all characters from being changed
      *
      * MDN
      */
    lazy val none = this := "none"
  }


  /**
    * The text-shadow CSS property adds shadows to text. It accepts a comma-separated
    * list of shadows to be applied to the text and text-decorations of the element.
    *
    * Each shadow is specified as an offset from the text, along with optional
    * color and blur radius values.
    *
    * Multiple shadows are applied front-to-back, with the first-specified shadow
    * on top.
    *
    * MDN
    */
  lazy val textShadow = new NoneOpenStyle[String]("textShadow", "text-shadow")


  /**
    * The transition-delay CSS property specifies the amount of time to wait
    * between a change being requested to a property that is to be transitioned
    * and the start of the transition effect.
    *
    * A value of 0s, or 0ms, indicates that the property will begin to animate its
    * transition immediately when the value changes; positive values will delay
    * the start of the transition effect for the corresponding number of seconds.
    * Negative values cause the transition to begin immediately, but to cause the
    * transition to seem to begin partway through the animation effect.
    *
    * You may specify multiple delays; each delay will be applied to the
    * corresponding property as specified by the transition-property property,
    * which acts as a master list. If there are fewer delays specified than in the
    * master list, missing values are set to the initial value (0s). If there are
    * more delays, the list is simply truncated to the right size. In both case
    * the CSS declaration stays valid.
    *
    * MDN
    */
  lazy val transitionDelay = new MultiTimeStyle("transitionDelay", "transition-delay")

  /**
    * The CSS transition property is a shorthand property for transition-property,
    * transition-duration, transition-timing-function, and transition-delay. It
    * allows to define the transition between two states of an element. Different
    * states may be defined using pseudo-classes like :hover or :active or
    * dynamically set using JavaScript.
    *
    * MDN
    */
  lazy val transition = style[String]("transition", "transition")

  /**
    * The CSS transition-timing-function property is used to describe how the
    * intermediate values of the CSS properties being affected by a transition
    * effect are calculated. This in essence lets you establish an acceleration
    * curve, so that the speed of the transition can vary over its duration.
    *
    * MDN
    */
  lazy val transitionTimingFunction = style[String]("transitionTimingFunction", "transition-timing-function")

  /**
    * The transition-duration CSS property specifies the number of seconds or
    * milliseconds a transition animation should take to complete. By default,
    * the value is 0s, meaning that no animation will occur.
    *
    * You may specify multiple durations; each duration will be applied to the
    * corresponding property as specified by the transition-property property,
    * which acts as a master list. If there are fewer durations specified than in
    * the master list, the user agent repeat the list of durations. If there are
    * more durations, the list is simply truncated to the right size. In both
    * case the CSS declaration stays valid.
    *
    * MDN
    */
  lazy val transitionDuration = new MultiTimeStyle("transitionDuration", "transition-duration")

  /**
    * The transition-property CSS property is used to specify the names of CSS
    * properties to which a transition effect should be applied.
    *
    * MDN
    */
  lazy val transitionProperty = style[String]("transitionProperty", "transition-property")


  object visibility extends Style[String, N]("visibility", "visibility", this) {
    /**
      * Default value, the box is visible
      *
      * MDN
      */
    lazy val visible = this := "visible"
    /**
      * The box is invisible (fully transparent, nothing is drawn), but still
      * affects layout.  Descendants of the element will be visible if they have
      * visibility:visible
      *
      * MDN
      */
    lazy val hidden = this := "hidden"
    /**
      * For table rows, columns, column groups, and row groups the row(s) or
      * column(s) are hidden and the space they would have occupied is (as if
      * display: none were applied to the column/row of the table)
      *
      * MDN
      */
    lazy val collapse = this := "collapse"
  }


  /**
    * The white-space CSS property is used to to describe how whitespace inside
    * the element is handled.
    *
    * MDN
    */
  object whiteSpace extends Style[String, N]("whiteSpace", "white-space", this) {
    /**
      * Sequences of whitespace are collapsed. Newline characters in the source
      * are handled as other whitespace. Breaks lines as necessary to fill line
      * boxes.
      *
      * MDN
      */
    lazy val normal = this := "normal"
    /**
      * Collapses whitespace as for normal, but suppresses line breaks (text
      * wrapping) within text.
      *
      * MDN
      */
    lazy val nowrap = this := "nowrap"
    /**
      * Sequences of whitespace are preserved, lines are only broken at newline
      * characters in the source and at br elements.
      *
      * MDN
      */
    lazy val pre = this := "pre"
    /**
      * Sequences of whitespace are preserved. Lines are broken at newline
      * characters, at br, and as necessary to fill line boxes.
      *
      * MDN
      */
    lazy val preWrap = this := "pre-wrap"
    /**
      * Sequences of whitespace are collapsed. Lines are broken at newline
      * characters, at br, and as necessary to fill line boxes.
      *
      * MDN
      */
    lazy val preLine = this := "pre-line"
  }

  /**
    * The word-spacing CSS property specifies spacing behavior between tags and
    * words.
    *
    * MDN
    */
  lazy val wordSpacing = new NormalOpenStyle[String]("wordSpacing", "word-spacing")
  /**
    * The z-index CSS property specifies the z-order of an element and its
    * descendants. When elements overlap, z-order determines which one covers the
    * other. An element with a larger z-index generally covers an element with a
    * lower one.
    *
    * MDN
    */
  lazy val zIndex = new AutoStyle[Int]("zIndex", "z-index")


  /**
    * The flex CSS property is a shorthand property specifying the ability of a flex item to alter its dimensions to
    * fill available space. Flex items can be stretched to use available space proportional to their flex grow factor
    * or their flex shrink factor to prevent overflow.
    *
    * MDN
    */
  final lazy val flex = style[String]("flex", "flex")

  /**
    * The CSS flex-basis property specifies the flex basis which is the initial main size of a flex item.
    * The property determines the size of the content-box unless specified otherwise using box-sizing.
    *
    * MDN
    */
  final lazy val flexBasis = style[String]("flexBasis", "flex-basis")

  /**
    * The CSS flex-grow property specifies the flex grow factor of a flex item.
    *
    * MDN
    */
  final lazy val flexGrow = style[Double]("flexGrow", "flex-grow")

  /**
    * The CSS flex-shrink property specifies the flex shrink factor of a flex item.
    *
    * MDN
    */
  final lazy val flexShrink = style[Double]("flexShrink", "flex-shrink")

  /**
    * The CSS align-content property aligns a flex container's lines within the flex container when there is extra
    * space on the cross-axis. This property has no effect on single line flexible boxes.
    *
    * MDN
    */
  object alignContent extends Style[String, N]("alignContent", "align-content", this) {

    /**
      * Lines are packed starting from the cross-start. Cross-start edge of the first line and cross-start edge of
      * the flex container are flushed together. Each following line is flush with the preceding.
      *
      * MDN
      */
    lazy val flexStart = this := "flex-start"

    /**
      * Lines are packed starting from the cross-end. Cross-end of the last line and cross-end of the flex container
      * are flushed together. Each preceding line is flushed with the following line.
      *
      * MDN
      */
    lazy val flexEnd = this := "flex-end"

    /**
      * Lines are packed toward the center of the flex container. The lines are flushed with each other and aligned
      * in the center of the flex container. Space between the cross-start edge of the flex container and first line
      * and between cross-end of the flex container and the last line is the same.
      *
      * MDN
      */
    lazy val center = this := "center"

    /**
      * Lines are evenly distributed in the flex container. The spacing is done such as the space between two
      * adjacent items is the same. Cross-start edge and cross-end edge of the flex container are flushed with
      * respectively first and last line edges.
      *
      * MDN
      */
    lazy val spaceBeteween = this := "space-between"

    /**
      * Lines are evenly distributed so that the space between two adjacent lines is the same. The empty space before
      * the first and after the last lines equals half of the space between two adjacent lines.
      *
      * MDN
      */
    lazy val spaceAround = this := "space-around"

    /**
      * Lines stretch to use the remaining space. The free-space is split equally between all the lines.
      *
      * MDN
      */
    lazy val stretch = this := "stretch"
  }

  /**
    * The align-self CSS property aligns flex items of the current flex line overriding the align-items value. If any
    * of the flex item's cross-axis margin is set to auto, then align-self is ignored.
    *
    * MDN
    */
  object alignSelf extends Style[String, N]("alignSelf", "align-self", this) {
    /**
      * Computes to parent's align-items value or stretch if the element has no parent.
      *
      * MDN
      */
    lazy val auto = this := "auto"

    /**
      * The cross-start margin edge of the flex item is flushed with the cross-start edge of the line.
      *
      * MDN
      */
    lazy val flexStart = this := "flex-start"

    /**
      * The cross-end margin edge of the flex item is flushed with the cross-end edge of the line.
      *
      * MDN
      */
    lazy val flexEnd = this := "flex-end"

    /**
      * The flex item's margin box is centered within the line on the cross-axis. If the cross-size of the item is
      * larger than the flex container, it will overflow equally in both directions.
      *
      * MDN
      */
    lazy val center = this := "center"

    /**
      * All flex items are aligned such that their baselines align. The item with the largest distance between its
      * cross-start margin edge and its baseline is flushed with the cross-start edge of the line.
      *
      * MDN
      */
    lazy val baseline = this := "baseline"

    /**
      * Flex items are stretched such as the cross-size of the item's margin box is the same as the line while
      * respecting width and height constraints.
      *
      * MDN
      */
    lazy val stretch = this := "stretch"
  }

  /**
    * The CSS flex-wrap property specifies whether the children are forced into a single line or if the items can be
    * flowed on multiple lines.
    *
    * MDN
    */
  object flexWrap extends Style[String, N]("flexWrap", "flex-wrap", this) {

    /**
      * The flex items are laid out in a single line which may cause the flex container to overflow. The cross-start
      * is either equivalent to start or before depending flex-direction value.
      *
      * MDN
      */
    lazy val nowrap = this := "nowrap"

    /**
      * The flex items break into multiple lines. The cross-start is either equivalent to start or before depending
      * flex-direction value and the cross-end is the opposite of the specified cross-start.
      *
      * MDN
      */
    lazy val wrap = this := "wrap"

    /**
      * Behaves the same as wrap but cross-start and cross-end are permuted.
      *
      * MDN
      */
    lazy val wrapReverse = this := "wrapReverse"

  }

  /**
    * The CSS align-items property aligns flex items of the current flex line the same way as justify-content
    * but in the perpendicular direction.
    *
    * MDN
    */
  object alignItems extends Style[String, N]("alignItems", "align-items", this) {

    /**
      * The cross-start margin edge of the flex item is flushed with the cross-start edge of the line.
      *
      * MDN
      */
    lazy val flexStart = this := "flex-start"

    /**
      * The cross-end margin edge of the flex item is flushed with the cross-end edge of the line.
      *
      * MDN
      */
    lazy val flexEnd = this := "flex-end"

    /**
      * The flex item's margin box is centered within the line on the cross-axis. If the cross-size of the item
      * is larger than the flex container, it will overflow equally in both directions.
      *
      * MDN
      */
    lazy val center = this := "center"

    /**
      * All flex items are aligned such that their baselines align. The item with the largest distance between its
      * cross-start margin edge and its baseline is flushed with the cross-start edge of the line.
      *
      * MDN
      */
    lazy val baseline = this := "baseline"

    /**
      * Flex items are stretched such as the cross-size of the item's margin box is the same as the line while
      * respecting width and height constraints.
      *
      * MDN
      */
    lazy val stretch = this := "stretch"

  }


  /**
    * The CSS justify-content property defines how a browser distributes available space between and around elements
    * when aligning flex items in the main-axis of the current line. The alignment is done after the lengths and auto
    * margins are applied, meaning that, if there is at least one flexible element, with flex-grow different than 0, it
    * will have no effect as there won't be any available space.
    *
    * MDN
    */
  object justifyContent extends Style[String, N]("justifyContent", "justify-content", this) {

    /**
      * The flex items are packed starting from the main-start. Margins of the first flex item is flushed with the
      * main-start edge of the line and each following flex item is flushed with the preceding.
      *
      * MDN
      */
    lazy val flexStart = this := "flex-start"

    /**
      * The flex items are packed starting from the main-end. The margin edge of the last flex item is flushed with the
      * main-end edge of the line and each preceding flex item is flushed with the following.
      *
      * MDN
      */
    lazy val flexEnd = this := "flex-end"

    /**
      * The flex items are packed toward the center of the line. The flex items are flushed with each other and aligned
      * in the center of the line. Space between the main-start edge of the line and first item and between main-end
      * and the last item of the line is the same.
      *
      * MDN
      */
    lazy val center = this := "center"

    /**
      * Flex items are evenly distributed along the line. The spacing is done such as the space between two adjacent
      * items is the same. Main-start edge and main-end edge are flushed with respectively first and last flex item edges.
      *
      * MDN
      */
    lazy val spaceBetween = this := "space-between"

    /**
      * Flex items are evenly distributed so that the space between two adjacent items is the same. The empty space
      * before the first and after the last items equals half of the space between two adjacent items.
      *
      * MDN
      */
    lazy val spaceAround = this := "space-around"

  }

  /**
    * The CSS flex-direction property specifies how flex items are placed in the flex container defining the main
    * axis and the direction (normal or reversed).
    *
    * Note that the value row and row-reverse are affected by the directionality of the flex container.
    * If its dir attribute is ltr, row represents the horizontal axis oriented from the left to the right, and
    * row-reverse from the right to the left; if the dir attribute is rtl, row represents the axis oriented from the
    * right to the left, and row-reverse from the left to the right.
    *
    * MDN
    */
  object flexDirection extends Style[String, N]("flexDirection", "flex-direction", this) {

    /**
      * The flex container's main-axis is the same as the block-axis.
      * The main-start and main-end points are the same as the before and after points of the writing-mode.
      *
      * MDN
      */
    lazy val column = this := "column"

    /**
      * Behaves the same as column but the main-start and main-end are permuted.
      *
      * MDN
      */
    lazy val columnReverse = this := "column-reverse"

    /**
      * The flex container's main-axis is defined to be the same as the text direction.
      * The main-start and main-end points are the same as the content direction.
      *
      * MDN
      */
    lazy val row = this := "row"

    /**
      * Behaves the same as row but the main-start and main-end points are permuted.
      *
      * MDN
      */
    lazy val rowReverse = this := "row-reverse"
  }
}
