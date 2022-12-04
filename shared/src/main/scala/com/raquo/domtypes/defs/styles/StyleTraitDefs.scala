package com.raquo.domtypes.defs.styles

import com.raquo.domtypes.common.{StyleKeywordDef, StyleTraitDef}

import StyleDefs.{valueTraits, valueUnits}

object StyleTraitDefs {
  
  def OneList(list: StyleKeywordDef*): List[(String, List[StyleKeywordDef])] = {
    List(
      "All" -> list.toList
    )
  }

  val defs: List[StyleTraitDef] = List(

    StyleTraitDef(
      scalaName = valueTraits.GlobalKeywords,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "initial",
          domName = "initial",
          commentLines = List(
            "The initial CSS keyword applies the initial (or default) value of a",
            "property to an element.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "inherit",
          domName = "inherit",
          commentLines = List(
            "The inherit CSS keyword causes the element for which it is specified to",
            "take the computed value of the property from its parent element.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "revert",
          domName = "revert",
          commentLines = List(
            "The revert CSS keyword reverts the cascaded value of the property from its",
            "current value to the value the property would have had if no changes had",
            "been made by the current style origin to the current element.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "unset",
          domName = "unset",
          commentLines = List(
            "The unset CSS keyword resets a property to its inherited value if the",
            "property naturally inherits from its parent, and to its initial value if",
            "not. In other words, it behaves like the inherit keyword in the first case,",
            "when the property is an inherited property, and like the initial keyword in",
            "the second case, when the property is a non-inherited property.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.AlignContent,
      extendsTraits = List(valueTraits.FlexPosition),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "spaceBetween",
          domName = "space-between",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "spaceAround",
          domName = "space-around",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "spaceEvenly",
          domName = "space-evenly",
          commentLines = Nil,
          docUrls = Nil,
        ),
      ),

    ),

    StyleTraitDef(
      scalaName = valueTraits.Auto_,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "auto",
          domName = "auto",
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.BackfaceVisibility,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "visible",
          domName = "visible",
          commentLines = List(
            "The back face is visible.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "hidden",
          domName = "hidden",
          commentLines = List(
            "The back face is not visible.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.BackgroundAttachment,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "fixed",
          domName = "fixed",
          commentLines = List(
            "The background is fixed relative to the viewport. Even if an element has",
            "a scrolling mechanism, the background doesn't move with the element.",
            "(This is not compatible with background-clip: text.)",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "local",
          domName = "local",
          commentLines = List(
            "The background is fixed relative to the element's contents. If the element",
            "has a scrolling mechanism, the background scrolls with the element's",
            "contents, and the background painting area and background positioning area",
            "are relative to the scrollable area of the element rather than to the",
            "border framing them.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "scroll",
          domName = "scroll",
          commentLines = List(
            "The background is fixed relative to the element itself and does not scroll",
            "with its contents. (It is effectively attached to the element's border.)",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.BackgroundSize,
      extendsTraits = List(valueTraits.Auto_),
      extendsUnits = List(valueUnits.Length),
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "cover",
          domName = "cover",
          commentLines = List(
            "This keyword specifies that the background image should be scaled to be",
            "as small as possible while ensuring both its dimensions are greater than",
            "or equal to the corresponding dimensions of the background positioning",
            "area.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "contain",
          domName = "contain",
          commentLines = List(
            "This keyword specifies that the background image should be scaled to be",
            "as large as possible while ensuring both its dimensions are less than or",
            "equal to the corresponding dimensions of the background positioning area.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.BorderCollapse,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "separate",
          domName = "separate",
          commentLines = List(
            "Use separated-border table rendering model. This is the default.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "collapse",
          domName = "collapse",
          commentLines = List(
            "Use collapsed-border table rendering model.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.BoxSizing,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "borderBox",
          domName = "border-box",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "contentBox",
          domName = "content-box",
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.Clear,
      extendsTraits = List(valueTraits.None_),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "left",
          domName = "left",
          commentLines = List(
            "The element is moved down to clear past left floats.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "right",
          domName = "right",
          commentLines = List(
            "The element is moved down to clear past right floats.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "both",
          domName = "both",
          commentLines = List(
            "The element is moved down to clear past both left and right floats.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.Color,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "black",
          domName = "black",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "blue",
          domName = "blue",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "cyan",
          domName = "cyan",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "gray",
          domName = "gray",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "green",
          domName = "green",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "purple",
          domName = "purple",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "silver",
          domName = "silver",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "red",
          domName = "red",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "white",
          domName = "white",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "yellow",
          domName = "yellow",
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.Cursor,
      extendsTraits = List(valueTraits.Auto_, valueTraits.None_),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "default",
          domName = "default",
          commentLines = List(
            "Default cursor, typically an arrow.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "contextMenu",
          domName = "context-menu",
          commentLines = List(
            "A context menu is available under the cursor.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "help",
          domName = "help",
          commentLines = List(
            "Indicating help is available.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "pointer",
          domName = "pointer",
          commentLines = List(
            "E.g. used when hovering over links, typically a hand.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "progress",
          domName = "progress",
          commentLines = List(
            "The program is busy in the background but the user can still interact",
            "with the interface (unlike for wait).",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "waitCss",
          domName = "wait",
          commentLines = List(
            "The program is busy (sometimes an hourglass or a watch).",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "cell",
          domName = "cell",
          commentLines = List(
            "Indicating that cells can be selected.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "crosshair",
          domName = "crosshair",
          commentLines = List(
            "Cross cursor, often used to indicate selection in a bitmap.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "text",
          domName = "text",
          commentLines = List(
            "Indicating text can be selected, typically an I-beam.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "verticalText",
          domName = "vertical-text",
          commentLines = List(
            "Indicating that vertical text can be selected, typically a sideways I-beam",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "alias",
          domName = "alias",
          commentLines = List(
            "Indicating an alias or shortcut is to be created.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "copy",
          domName = "copy",
          commentLines = List(
            "Indicating that something can be copied",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "move",
          domName = "move",
          commentLines = List(
            "The hovered object may be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "noDrop",
          domName = "no-drop",
          commentLines = List(
            "Cursor showing that a drop is not allowed at the current location.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "notAllowed",
          domName = "not-allowed",
          commentLines = List(
            "Cursor showing that something cannot be done.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "allScroll",
          domName = "all-scroll",
          commentLines = List(
            "Cursor showing that something can be scrolled in any direction (panned).",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "colResize",
          domName = "col-resize",
          commentLines = List(
            "The item/column can be resized horizontally. Often rendered as arrows",
            "pointing left and right with a vertical separating.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "rowResize",
          domName = "row-resize",
          commentLines = List(
            "The item/row can be resized vertically. Often rendered as arrows pointing",
            "up and down with a horizontal bar separating them.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "nResize",
          domName = "n-resize",
          commentLines = List(
            "The top edge is to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "eResize",
          domName = "e-resize",
          commentLines = List(
            "The right edge is to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "sResize",
          domName = "s-resize",
          commentLines = List(
            "The bottom edge is to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "wResize",
          domName = "w-resize",
          commentLines = List(
            "The left edge is to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "neResize",
          domName = "ne-resize",
          commentLines = List(
            "The top-right corner is to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "nwResize",
          domName = "nw-resize",
          commentLines = List(
            "The top-left corner is to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "seResize",
          domName = "se-resize",
          commentLines = List(
            "The bottom-right corner is to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "swResize",
          domName = "sw-resize",
          commentLines = List(
            "The bottom-left corner is to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "ewResize",
          domName = "ew-resize",
          commentLines = List(
            "The left and right edges are to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "nsResize",
          domName = "ns-resize",
          commentLines = List(
            "The top and bottom edges are to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "neswResize",
          domName = "nesw-resize",
          commentLines = List(
            "The top right and bottom left corners are to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "nwseResize",
          domName = "nwse-resize",
          commentLines = List(
            "The top left and bottom right corners are to be moved.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "zoomIn",
          domName = "zoom-in",
          commentLines = List(
            "Indicates that something can be zoomed (magnified) in.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "zoomOut",
          domName = "zoom-out",
          commentLines = List(
            "Indicates that something can be zoomed (magnified) out.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "grab",
          domName = "grab",
          commentLines = List(
            "Indicates that something can be grabbed (dragged to be moved).",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "grabbing",
          domName = "grabbing",
          commentLines = List(
            "Indicates that something can be grabbed (dragged to be moved).",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.Direction,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "ltr",
          domName = "ltr",
          commentLines = List(
            "Text and other elements go from left to right.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "rtl",
          domName = "rtl",
          commentLines = List(
            "Text and other elements go from right to left.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.Display,
      extendsTraits = List(valueTraits.None_),
      extendsUnits = Nil,
      keywordDefGroups =
        List(
          "Outside values" -> List(

            StyleKeywordDef(
              scalaName = "block",
              domName = "block",
                  commentLines = List(
                "The element generates a block element box",
              ),
              docUrls = Nil,
            ),

            StyleKeywordDef(
              scalaName = "inline",
              domName = "inline",
                  commentLines = List(
                "The element generates one or more inline element boxes",
              ),
              docUrls = Nil,
            ),
          ),

          "Inside values (except `table`, see below)" -> List(

            StyleKeywordDef(
              scalaName = "flow",
              domName = "flow",
                  commentLines = List(
                "The element lays out its contents using flow layout (block-and-inline layout).",
                "",
                "If its outer display type is inline or run-in, and it is participating in a",
                "block or inline formatting context, then it generates an inline box.",
                "Otherwise it generates a block container box.",
                "",
                "Depending on the value of other properties (such as position, float, or overflow)",
                "and whether it is itself participating in a block or inline formatting context,",
                "it either establishes a new block formatting context (BFC) for its contents or",
                "integrates its contents into its parent formatting context.",
              ),
              docUrls = Nil,
            ),

            StyleKeywordDef(
              scalaName = "flowRoot",
              domName = "flow-root",
                  commentLines = List(
                "The element generates a block element box that establishes a new block",
                "formatting context, defining where the formatting root lies",
              ),
              docUrls = Nil,
            ),

            StyleKeywordDef(
              scalaName = "flex",
              domName = "flex",
                  commentLines = List(
                "The element behaves like a block element and lays out its content according",
                "to the flexbox model",
              ),
              docUrls = Nil,
            ),

            StyleKeywordDef(
              scalaName = "grid",
              domName = "grid",
                  commentLines = List(
                "The element behaves like a block element and lays out its content according",
                "to the grid model",
              ),
              docUrls = Nil,
            ),

            StyleKeywordDef(
              scalaName = "ruby",
              domName = "ruby",
                  commentLines = List(
                "The element behaves like an inline element and lays out its content according",
                "to the ruby formatting model. It behaves like the corresponding HTML <ruby>",
                "elements.",
              ),
              docUrls = Nil,
            ),
          ),

          "Legacy values" -> List(

            StyleKeywordDef(
              scalaName = "inlineBlock",
              domName = "inline-block",
                  commentLines = List(
                "The element generates a block element box that will be flowed with",
                "surrounding content as if it were a single inline box.",
              ),
              docUrls = Nil,
            ),

            StyleKeywordDef(
              scalaName = "inlineFlex",
              domName = "inline-flex",
                  commentLines = List(
                "The element behaves like an inline element and lays out its content",
                "according to the flexbox model",
              ),
              docUrls = Nil,
            ),

            StyleKeywordDef(
              scalaName = "inlineGrid",
              domName = "inline-grid",
                  commentLines = List(
                "The element behaves like an inline element and lays out its content",
                "according to the grid model",
              ),
              docUrls = Nil,
            ),

            StyleKeywordDef(
              scalaName = "inlineTable",
              domName = "inline-table",
                  commentLines = List(
                "The inline-table value does not have a direct mapping in HTML. It behaves",
                "like a table HTML element, but as an inline box, rather than a",
                "block-level box. Inside the table box is a block-level context",
              ),
              docUrls = Nil,
            ),
          ),

          "Box generation" -> List(

            StyleKeywordDef(
              scalaName = "none",
              domName = "none",
              isOverride = true,
              commentLines = List(
                "Turns off the display of an element (it has no effect on layout); all",
                "descendant elements also have their display turned off. The document is",
                "rendered as though the element did not exist.",
                "",
                "To render an element box's dimensions, yet have its contents be invisible,",
                "see the visibility property.",
              ),
              docUrls = Nil,
            ),

            StyleKeywordDef(
              scalaName = "contents",
              domName = "contents",
                  commentLines = List(
                "These elements don't produce a specific box by themselves.",
                "They are replaced by their pseudo-box and their child boxes.",
              ),
              docUrls = Nil,
            ),
          ),

          "List item" -> List(

            StyleKeywordDef(
              scalaName = "listItem",
              domName = "list-item",
                  commentLines = List(
                "The element generates a block box for the content and a separate list-item",
                "inline box",
              ),
              docUrls = Nil,
            ),
          ),

          "Table" -> List(

            StyleKeywordDef(
              scalaName = "table",
              domName = "table",
                  commentLines = List(
                "Behaves like the table HTML element. It defines a block-level box",
              ),
              docUrls = Nil,
            ),

            StyleKeywordDef(
              scalaName = "tableCaption",
              domName = "table-caption",
                  commentLines = List(
                "Behaves like the caption HTML element",
              ),
              docUrls = Nil,
            ),

            StyleKeywordDef(
              scalaName = "tableCell",
              domName = "table-cell",
                  commentLines = List(
                "Behaves like the td HTML element",
              ),
              docUrls = Nil,
            ),

            StyleKeywordDef(
              scalaName = "tableColumn",
              domName = "table-column",
                  commentLines = List(
                "These elements behave like the corresponding col HTML elements",
              ),
              docUrls = Nil,
            ),

            StyleKeywordDef(
              scalaName = "tableColumnGroup",
              domName = "table-column-group",
                  commentLines = List(
                "These elements behave like the corresponding colgroup HTML elements",
              ),
              docUrls = Nil,
            ),

            StyleKeywordDef(
              scalaName = "tableFooterGroup",
              domName = "table-footer-group",
                  commentLines = List(
                "These elements behave like the corresponding tfoot HTML elements",
              ),
              docUrls = Nil,
            ),

            StyleKeywordDef(
              scalaName = "tableHeaderGroup",
              domName = "table-header-group",
                  commentLines = List(
                "These elements behave like the corresponding thead HTML elements",
              ),
              docUrls = Nil,
            ),

            StyleKeywordDef(
              scalaName = "tableRow",
              domName = "table-row",
                  commentLines = List(
                "Behaves like the tr HTML element",
              ),
              docUrls = Nil,
            ),

            StyleKeywordDef(
              scalaName = "tableRowGroup",
              domName = "table-row-group",
                  commentLines = List(
                "These elements behave like the corresponding tbody HTML elements",
              ),
              docUrls = Nil,
            ),
          )

        ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.EmptyCells,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "show",
          domName = "show",
          commentLines = List(
            "Borders and backgrounds should be drawn like in a normal cells.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "hide",
          domName = "hide",
          commentLines = List(
            "No border or backgrounds of empty cells should be drawn.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.FlexDirection,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "column",
          domName = "column",
          commentLines = List(
            "The flex container's main-axis is the same as the block-axis.",
            "The main-start and main-end points are the same as the before",
            "and after points of the writing-mode.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "columnReverse",
          domName = "column-reverse",
          commentLines = List(
            "Behaves the same as column but the main-start and main-end are permuted.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "row",
          domName = "row",
          commentLines = List(
            "The flex container's main-axis is defined to be the same as the text direction.",
            "The main-start and main-end points are the same as the content direction.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "rowReverse",
          domName = "row-reverse",
          commentLines = List(
            "Behaves the same as row but the main-start and main-end points are permuted.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.FlexPosition,
      extendsTraits = List(valueTraits.Normal_),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "flexStart",
          domName = "flex-start",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "flexEnd",
          domName = "flex-end",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "center",
          domName = "center",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "start",
          domName = "start",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "end",
          domName = "end",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "selfStart",
          domName = "self-start",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "selfEnd",
          domName = "self-end",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "baseline",
          domName = "baseline",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "firstBaseline",
          domName = "first baseline",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "lastBaseline",
          domName = "last baseline",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "stretch",
          domName = "stretch",
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.FlexWrap,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "nowrap",
          domName = "nowrap",
          commentLines = List(
            "The flex items are laid out in a single line which may cause the",
            "flex container to overflow. The cross-start is either equivalent",
            "to start or before depending flex-direction value.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "wrap",
          domName = "wrap",
          commentLines = List(
            "The flex items break into multiple lines. The cross-start is",
            "either equivalent to start or before depending flex-direction",
            "value and the cross-end is the opposite of the specified",
            "cross-start.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "wrapReverse",
          domName = "wrap-reverse",
          commentLines = List(
            "Behaves the same as wrap but cross-start and cross-end are",
            "permuted.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.Float,
      extendsTraits = List(valueTraits.None_),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "left",
          domName = "left",
          commentLines = List(
            "Element must float on the left side of its containing block.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "right",
          domName = "right",
          commentLines = List(
            "Element must float on the right side of its containing block.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.FontSize,
      extendsTraits = Nil,
      extendsUnits = List(valueUnits.Length),
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "xxSmall",
          domName = "xx-small",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "xSmall",
          domName = "x-small",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "small",
          domName = "small",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "medium",
          domName = "medium",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "large",
          domName = "large",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "xLarge",
          domName = "x-large",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "xxLarge",
          domName = "xx-large",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "larger",
          domName = "larger",
          commentLines = List(
            "Larger than the parent element's font size, by roughly the ratio used to",
            "separate the absolute size keywords above.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "smaller",
          domName = "smaller",
          commentLines = List(
            "Smaller than the parent element's font size, by roughly the ratio used to",
            "separate the absolute size keywords above.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.FontStyle,
      extendsTraits = List(valueTraits.Normal_),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "italic",
          domName = "italic",
          commentLines = List(
            "Selects a font that is labeled italic, if that is not available,",
            "one labeled oblique",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "oblique",
          domName = "oblique",
          commentLines = List(
            "Selects a font that is labeled oblique",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.FontWeight,
      extendsTraits = List(valueTraits.Normal_),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "normal",
          domName = "normal",
          isOverride = true,
          commentLines = List(
            "Normal font weight. Same as 400.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "bold",
          domName = "bold",
          commentLines = List(
            "Bold font weight. Same as 700.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "lighter",
          domName = "lighter",
          commentLines = List(
            "One font weight lighter than the parent element (among the available",
            "weights of the font).",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "bolder",
          domName = "bolder",
          commentLines = List(
            "One font weight darker than the parent element (among the available",
            "weights of the font)",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.JustifyContent,
      extendsTraits = List(valueTraits.AlignContent),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "left",
          domName = "left",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "right",
          domName = "right",
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.Line,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = List(
        "" -> List(

          StyleKeywordDef(
            scalaName = "dotted",
            domName = "dotted",
              commentLines = List(
              "Displays a series of rounded dots. The spacing of the dots are not",
              "defined by the specification and are implementation-specific. The radius",
              "of the dots is half the calculated border-right-width.",
            ),
            docUrls = Nil,
          ),

          StyleKeywordDef(
            scalaName = "dashed",
            domName = "dashed",
              commentLines = List(
              "Displays a series of short square-ended dashes or line segments. The exact",
              "size and Length of the segments are not defined by the specification and",
              "are implementation-specific.",
            ),
            docUrls = Nil,
          ),

          StyleKeywordDef(
            scalaName = "solid",
            domName = "solid",
              commentLines = List(
              "Displays a single, straight, solid line.",
            ),
            docUrls = Nil,
          ),

        ),

        "" -> List(

          StyleKeywordDef(
            scalaName = "double",
            domName = "double",
              commentLines = List(
              "Displays two straight lines that add up to the pixel amount defined as",
              "border-width or border-right-width.",
            ),
            docUrls = Nil,
          ),

        ),

        "" -> List(

          StyleKeywordDef(
            scalaName = "groove",
            domName = "groove",
              commentLines = List(
              "Displays a border leading to a carved effect. It is the opposite of ridge.",
            ),
            docUrls = Nil,
          ),

          StyleKeywordDef(
            scalaName = "ridge",
            domName = "ridge",
              commentLines = List(
              "Displays a border with a 3D effect, like if it is coming out of the page.",
              "It is the opposite of groove.",
            ),
            docUrls = Nil,
          ),

        ),

        "" -> List(

          StyleKeywordDef(
            scalaName = "inset",
            domName = "inset",
              commentLines = List(
              "Displays a border that makes the box appear embedded. It is the opposite",
              "of outset. When applied to a table cell with border-collapse set to",
              "collapsed, this value behaves like groove.",
            ),
            docUrls = Nil,
          ),

          StyleKeywordDef(
            scalaName = "outset",
            domName = "outset",
              commentLines = List(
              "Displays a border that makes the box appear in 3D, embossed. It is the",
              "opposite of inset. When applied to a table cell with border-collapse set",
              "to collapsed, this value behaves like ridge.",
            ),
            docUrls = Nil,
          ),

        )

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.LineWidth,
      extendsTraits = Nil,
      extendsUnits = List(valueUnits.Length),
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "thin",
          domName = "thin",
          commentLines = List(
            "Typically 1px in desktop browsers like Firefox.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "medium",
          domName = "medium",
          commentLines = List(
            "Typically 3px in desktop browsers like Firefox.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "thick",
          domName = "thick",
          commentLines = List(
            "Typically 5px in desktop browsers like Firefox.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.ListStylePosition,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "outside",
          domName = "outside",
          commentLines = List(
            "The marker box is outside the principal block box.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "inside",
          domName = "inside",
          commentLines = List(
            "The marker box is the first inline box in the principal block box, after",
            "which the element's content flows.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.ListStyleType,
      extendsTraits = List(valueTraits.None_),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "disc",
          domName = "disc",
          commentLines = List(
            "A filled circle (default value)",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "circle",
          domName = "circle",
          commentLines = List(
            "A hollow circle",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "square",
          domName = "square",
          commentLines = List(
            "A filled square",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "decimal",
          domName = "decimal",
          commentLines = List(
            "Decimal numbers begining with 1",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "cjkDecimal",
          domName = "cjk-decimal",
          commentLines = List(
            "Han decimal numbers",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "decimalLeadingZero",
          domName = "decimal-leading-zero",
          commentLines = List(
            "Decimal numbers padded by initial zeros",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "lowerRoman",
          domName = "lower-roman",
          commentLines = List(
            "Lowercase roman numerals",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "upperRoman",
          domName = "upper-roman",
          commentLines = List(
            "Uppercase roman numerals",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "lowerGreek",
          domName = "lower-greek",
          commentLines = List(
            "Lowercase classical greek",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "lowerAlpha",
          domName = "lower-alpha",
          commentLines = List(
            "Lowercase ASCII letters",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "lowerLatin",
          domName = "lower-latin",
          commentLines = List(
            "Lowercase ASCII letters",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "upperAlpha",
          domName = "upper-alpha",
          commentLines = List(
            "Uppercase ASCII letters",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "upperLatin",
          domName = "upper-latin",
          commentLines = List(
            "Uppercase ASCII letters",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "armenian",
          domName = "armenian",
          commentLines = List(
            "Traditional Armenian numbering",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "georgian",
          domName = "georgian",
          commentLines = List(
            "Traditional Georgian numbering",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "hebrew",
          domName = "hebrew",
          commentLines = List(
            "Traditional Hebrew numbering",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "hiragana",
          domName = "hiragana",
          commentLines = List(
            "Japanese Hiragana",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "hiraganaIroha",
          domName = "hiragana-iroha",
          commentLines = List(
            "Japanese Hiragana. Iroha is the old japanese ordering of syllables",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "katakana",
          domName = "katakana",
          commentLines = List(
            "Japanese Katakana",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "katakanaIroha",
          domName = "katakana-iroha",
          commentLines = List(
            "Japanese Katakana. Iroha is the old japanese ordering of syllables",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.MinMaxLength,
      extendsTraits = Nil,
      extendsUnits = List(valueUnits.Length),
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "maxContent",
          domName = "max-content",
          commentLines = List(
            "The intrinsic preferred length.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "minContent",
          domName = "min-content",
          commentLines = List(
            "The intrinsic minimum length.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "fitContent",
          domName = "fit-content",
          commentLines = List(
            "Defined as min(max-content, max(min-content, fill-available)).",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "fillAvailable",
          domName = "fill-available",
          commentLines = List(
            "The containing block width minus margin, border and padding.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.MixBlendMode,
      extendsTraits = List(valueTraits.Normal_),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "multiply",
          domName = "multiply",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "screen",
          domName = "screen",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "overlay",
          domName = "overlay",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "darken",
          domName = "darken",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "lighten",
          domName = "lighten",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "colorDodge",
          domName = "color-dodge",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "colorBurn",
          domName = "color-burn",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "hardLight",
          domName = "hard-light",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "softLight",
          domName = "soft-light",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "difference",
          domName = "difference",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "exclusion",
          domName = "exclusion",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "hue",
          domName = "hue",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "saturation",
          domName = "saturation",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "color",
          domName = "color",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "luminosity",
          domName = "luminosity",
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.None_,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "none",
          domName = "none",
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.Normal_,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "normal",
          domName = "normal",
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.Overflow,
      extendsTraits = List(valueTraits.Auto_),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "visible",
          domName = "visible",
          commentLines = List(
            "Default value. Content is not clipped, it may be rendered outside the",
            "content box.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "hidden",
          domName = "hidden",
          commentLines = List(
            "The content is clipped and no scrollbars are provided.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "scroll",
          domName = "scroll",
          commentLines = List(
            "The content is clipped and desktop browsers use scrollbars, whether or",
            "not any content is clipped. This avoids any problem with scrollbars",
            "appearing and disappearing in a dynamic environment. Printers may print",
            "overflowing content.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.OverflowWrap,
      extendsTraits = List(valueTraits.Normal_),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "normal",
          domName = "normal",
          isOverride = true,
          commentLines = List(
            "Indicates that lines may only break at normal word break points.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "breakWord",
          domName = "break-word",
          commentLines = List(
            "Indicates that normally unbreakable words may be broken at arbitrary",
            "points if there are no otherwise acceptable break points in the line.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.PaddingBoxSizing,
      extendsTraits = List(valueTraits.BoxSizing),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "paddingBox",
          domName = "padding-box",
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.PageBreak,
      extendsTraits = List(valueTraits.Auto_),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "always",
          domName = "always",
          commentLines = List(
            "Always force page breaks.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "avoid",
          domName = "avoid",
          commentLines = List(
            "Avoid page breaks.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "left",
          domName = "left",
          commentLines = List(
            "Force page breaks so that the next page is formatted as a left page.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "right",
          domName = "right",
          commentLines = List(
            "Force page breaks so that the next page is formatted as a right page.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.PointerEvents,
      extendsTraits = List(valueTraits.None_, valueTraits.Auto_),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "auto",
          domName = "auto",
          isOverride = true,
          commentLines = List(
            "The element behaves as it would if the pointer-events property was not",
            "specified. In SVG content, this value and the value visiblePainted have",
            "the same effect.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "none",
          domName = "none",
          isOverride = true,
          commentLines = List(
            "The element is never the target of mouse events; however, mouse events",
            "may target its descendant elements if those descendants have pointer-events",
            "set to some other value. In these circumstances, mouse events will trigger",
            "event listeners on this parent element as appropriate on their way to/from",
            "the descendant during the event capture/bubble phases.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "visiblePainted",
          domName = "visiblePainted",
          commentLines = List(
            "SVG only. The element can only be the target of a mouse event when the",
            "visibility property is set to visible and when the mouse cursor is over",
            "the interior (i.e., 'fill') of the element and the fill property is set",
            "to a value other than none, or when the mouse cursor is over the perimeter",
            "(i.e., 'stroke') of the element and the stroke property is set to a value",
            "other than none.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "visibleFill",
          domName = "visibleFill",
          commentLines = List(
            "SVG only. The element can only be the target of a mouse event when the",
            "visibility property is set to visible and when the mouse cursor is over",
            "the interior (i.e., fill) of the element. The value of the fill property",
            "does not effect event processing.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "visibleStroke",
          domName = "visibleStroke",
          commentLines = List(
            "SVG only. The element can only be the target of a mouse event when the",
            "visibility property is set to visible and when the mouse cursor is over",
            "the perimeter (i.e., stroke) of the element. The value of the stroke",
            "property does not effect event processing.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "visible",
          domName = "visible",
          commentLines = List(
            "SVG only. The element can be the target of a mouse event when the",
            "visibility property is set to visible and the mouse cursor is over either",
            "the interior (i.e., fill) or the perimeter (i.e., stroke) of the element.",
            "The values of the fill and stroke do not effect event processing.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "painted",
          domName = "painted",
          commentLines = List(
            "SVG only. The element can only be the target of a mouse event when the",
            "mouse cursor is over the interior (i.e., 'fill') of the element and the",
            "fill property is set to a value other than none, or when the mouse cursor",
            "is over the perimeter (i.e., 'stroke') of the element and the stroke",
            "property is set to a value other than none. The value of the visibility",
            "property does not effect event processing.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "fill",
          domName = "fill",
          commentLines = List(
            "SVG only. The element can only be the target of a mouse event when the",
            "pointer is over the interior (i.e., fill) of the element. The values of",
            "the fill and visibility properties do not effect event processing.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "stroke",
          domName = "stroke",
          commentLines = List(
            "SVG only. The element can only be the target of a mouse event when the",
            "pointer is over the perimeter (i.e., stroke) of the element. The values",
            "of the stroke and visibility properties do not effect event processing.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "all",
          domName = "all",
          commentLines = List(
            "SVG only. The element can only be the target of a mouse event when the",
            "pointer is over the interior (i.e., fill) or the perimeter (i.e., stroke)",
            "of the element. The values of the fill, stroke and visibility properties",
            "do not effect event processing.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.Position,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "static",
          domName = "static",
          commentLines = List(
            "This keyword let the element use the normal behavior, that is it is laid",
            "out in its current position in the flow.  The top, right, bottom, and left",
            "properties do not apply.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "relative",
          domName = "relative",
          commentLines = List(
            "This keyword lays out all elements as though the element were not",
            "positioned, and then adjust the element's position, without changing",
            "layout (and thus leaving a gap for the element where it would have been",
            "had it not been positioned). The effect of position:relative on",
            "table-*-group, table-row, table-column, table-cell, and table-caption",
            "elements is undefined.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "absolute",
          domName = "absolute",
          commentLines = List(
            "Do not leave space for the element. Instead, position it at a specified",
            "position relative to its closest positioned ancestor or to the containing",
            "block. Absolutely positioned boxes can have margins, they do not collapse",
            "with any other margins.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "fixed",
          domName = "fixed",
          commentLines = List(
            "Do not leave space for the element. Instead, position it at a specified",
            "position relative to the screen's viewport and doesn't move when scrolled.",
            "When printing, position it at that fixed position on every page.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.TableLayout,
      extendsTraits = List(valueTraits.Auto_),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "auto",
          domName = "auto",
          isOverride = true,
          commentLines = List(
            "An automatic table layout algorithm is commonly used by most browsers for",
            "table layout. The width of the table and its cells depends on the content",
            "thereof.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "fixed",
          domName = "fixed",
          commentLines = List(
            "Table and column widths are set by the widths of table and col elements",
            "or by the width of the first row of cells. Cells in subsequent rows do",
            "not affect column widths.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.TextAlign,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "start",
          domName = "start",
          commentLines = List(
            "`left` if direction is left-to-right and `right` otherwise.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "end",
          domName = "end",
          commentLines = List(
            "`right` if direction is left-to-right and `left` otherwise.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "left",
          domName = "left",
          commentLines = List(
            "The inline contents are aligned to the left edge of the line box.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "right",
          domName = "right",
          commentLines = List(
            "The inline contents are aligned to the right edge of the line box.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "center",
          domName = "center",
          commentLines = List(
            "The inline contents are centered within the line box.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "justify",
          domName = "justify",
          commentLines = List(
            "The text is justified. Text should line up their left and right edges to",
            "the left and right content edges of the paragraph.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.TextDecoration,
      extendsTraits = List(valueTraits.None_),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "underline",
          domName = "underline",
          commentLines = List(
            "Each line of text is underlined.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "overline",
          domName = "overline",
          commentLines = List(
            "Each line of text has a line above it.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "lineThrough",
          domName = "line-through",
          commentLines = List(
            "Each line of text has a line through the middle.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.TextOverflow,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "clip",
          domName = "clip",
          commentLines = List(
            "This keyword value indicates to truncate the text at the limit of the",
            "content area, therefore the truncation can happen in the middle of a",
            "character. To truncate at the transition between two characters, the",
            "empty string value must be used. The value clip is the default for",
            "this property.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "ellipsis",
          domName = "ellipsis",
          commentLines = List(
            "This keyword value indicates to display an ellipsis ('…', U+2026 HORIZONTAL",
            "ELLIPSIS) to represent clipped text. The ellipsis is displayed inside the",
            "content area, decreasing the amount of text displayed. If there is not",
            "enough space to display the ellipsis, it is clipped.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.TextTransform,
      extendsTraits = List(valueTraits.None_),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "capitalize",
          domName = "capitalize",
          commentLines = List(
            "Forces the first letter of each word to be converted to",
            "uppercase. Other characters are unchanged.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "uppercase",
          domName = "uppercase",
          commentLines = List(
            "Forces all characters to be converted to uppercase.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "lowercase",
          domName = "lowercase",
          commentLines = List(
            "Forces all characters to be converted to lowercase.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.TextUnderlinePosition,
      extendsTraits = List(valueTraits.Auto_),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "auto",
          domName = "auto",
          isOverride = true,
          commentLines = List(
            "This keyword allows the browser to use an algorithm to choose between",
            "under and alphabetic.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "under",
          domName = "under",
          commentLines = List(
            "This keyword forces the line to be set below the alphabetic baseline, at",
            "a position where it won't cross any descender. This is useful to prevent",
            "chemical or mathematical formulas, which make a large use of subscripts,",
            "to be illegible.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "left",
          domName = "left",
          commentLines = List(
            "In vertical writing-modes, this keyword forces the line to be placed on",
            "the left of the characters. In horizontal writing-modes, it is a synonym",
            "of under.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "right",
          domName = "right",
          commentLines = List(
            "In vertical writing-modes, this keyword forces the line to be placed on",
            "the right of the characters. In horizontal writing-modes, it is a synonym",
            "of under.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "underLeft",
          domName = "under left",
          commentLines = Nil,
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "underRight",
          domName = "under right",
          commentLines = Nil,
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.VerticalAlign,
      extendsTraits = Nil,
      extendsUnits = List(valueUnits.Length),
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "baseline",
          domName = "baseline",
          commentLines = List(
            "Aligns the baseline of the element with the baseline of its parent. The",
            "baseline of some replaced elements, like textarea is not specified by",
            "the HTML specification, meaning that their behavior with this keyword may",
            "change from one browser to the other.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "sub",
          domName = "sub",
          commentLines = List(
            "Aligns the baseline of the element with the subscript-baseline of its",
            "parent.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "`super`",
          domName = "super",
          commentLines = List(
            "Aligns the baseline of the element with the superscript-baseline of its",
            "parent.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "textTop",
          domName = "text-top",
          commentLines = List(
            "Aligns the top of the element with the top of the parent element's font.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "textBottom",
          domName = "text-bottom",
          commentLines = List(
            "Aligns the bottom of the element with the bottom of the parent element's",
            "font.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "middle",
          domName = "middle",
          commentLines = List(
            "Aligns the middle of the element with the middle of lowercase letters in",
            "the parent.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "top",
          domName = "top",
          commentLines = List(
            "Aligns the top of the element and its descendants with the top of the",
            "entire line.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "bottom",
          domName = "bottom",
          commentLines = List(
            "Aligns the bottom of the element and its descendants with the bottom of",
            "the entire line.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.Visibility,
      extendsTraits = Nil,
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "visible",
          domName = "visible",
          commentLines = List(
            "Default value, the box is visible",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "hidden",
          domName = "hidden",
          commentLines = List(
            "The box is invisible (fully transparent, nothing is drawn), but still",
            "affects layout.  Descendants of the element will be visible if they have",
            "visibility:visible",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "collapse",
          domName = "collapse",
          commentLines = List(
            "For table rows, columns, column groups, and row groups the row(s) or",
            "column(s) are hidden and the space they would have occupied is (as if",
            "display: none were applied to the column/row of the table)",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.WhiteSpace,
      extendsTraits = List(valueTraits.Normal_),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "normal",
          domName = "normal",
          isOverride = true,
          commentLines = List(
            "Sequences of whitespace are collapsed. Newline characters in the source",
            "are handled as other whitespace. Breaks lines as necessary to fill line",
            "boxes.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "nowrap",
          domName = "nowrap",
          commentLines = List(
            "Collapses whitespace as for normal, but suppresses line breaks (text",
            "wrapping) within text.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "pre",
          domName = "pre",
          commentLines = List(
            "Sequences of whitespace are preserved, lines are only broken at newline",
            "characters in the source and at br elements.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "preWrap",
          domName = "pre-wrap",
          commentLines = List(
            "Sequences of whitespace are preserved. Lines are broken at newline",
            "characters, at br, and as necessary to fill line boxes.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "preLine",
          domName = "pre-line",
          commentLines = List(
            "Sequences of whitespace are collapsed. Lines are broken at newline",
            "characters, at br, and as necessary to fill line boxes.",
          ),
          docUrls = Nil,
        ),

      ),
    ),

    StyleTraitDef(
      scalaName = valueTraits.WordBreak,
      extendsTraits = List(valueTraits.Normal_),
      extendsUnits = Nil,
      keywordDefGroups = OneList(
        StyleKeywordDef(
          scalaName = "breakAll",
          domName = "break-all",
          commentLines = List(
            "To prevent overflow, word breaks should be inserted between any two",
            "characters (excluding Chinese/Japanese/Korean text).",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "keepAll",
          domName = "keep-all",
          commentLines = List(
            "Word breaks should not be used for Chinese/Japanese/Korean (CJK) text.",
            "Non-CJK text behavior is the same as for normal.",
          ),
          docUrls = Nil,
        ),

        StyleKeywordDef(
          scalaName = "breakWord",
          domName = "break-word",
          commentLines = List(
            "To prevent overflow, normally unbreakable words may be broken at",
            "arbitrary points if there are no otherwise acceptable break points",
            "in the line.",
            "",
            "Note: IE does not support this value",
          ),
          docUrls = Nil,
        ),

      ),
    ),

  )

}
