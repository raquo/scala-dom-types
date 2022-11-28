package com.raquo.domtypes.old.defs.styles.keywords

trait CursorStyle[T] extends AutoStyle[T] with NoneStyle[T] {

  /** Default cursor, typically an arrow.  --MDN */
  lazy val default: T = buildStringValue("default")

  /** A context menu is available under the cursor.  --MDN */
  lazy val contextMenu: T = buildStringValue("context-menu")

  /** Indicating help is available.  --MDN */
  lazy val help: T = buildStringValue("help")

  /**
    * E.g. used when hovering over links, typically a hand.  --MDN */
  lazy val pointer: T = buildStringValue("pointer")

  /**
    * The program is busy in the background but the user can still interact
    * with the interface (unlike for wait).  --MDN
    */
  lazy val progress: T = buildStringValue("progress")

  /** The program is busy (sometimes an hourglass or a watch).  --MDN */
  lazy val waitCss: T = buildStringValue("wait")

  /** Indicating that cells can be selected.  --MDN */
  lazy val cell: T = buildStringValue("cell")

  /** Cross cursor, often used to indicate selection in a bitmap.  --MDN */
  lazy val crosshair: T = buildStringValue("crosshair")

  /** Indicating text can be selected, typically an I-beam.  --MDN */
  lazy val text: T = buildStringValue("text")

  /** Indicating that vertical text can be selected, typically a sideways I-beam  --MDN */
  lazy val verticalText: T = buildStringValue("vertical-text")

  /** Indicating an alias or shortcut is to be created.  --MDN */
  lazy val alias: T = buildStringValue("alias")

  /** Indicating that something can be copied  --MDN */
  lazy val copy: T = buildStringValue("copy")

  /** The hovered object may be moved.  --MDN */
  lazy val move: T = buildStringValue("move")

  /** Cursor showing that a drop is not allowed at the current location.  --MDN */
  lazy val noDrop: T = buildStringValue("no-drop")

  /** Cursor showing that something cannot be done.  --MDN */
  lazy val notAllowed: T = buildStringValue("not-allowed")

  /** Cursor showing that something can be scrolled in any direction (panned).  --MDN */
  lazy val allScroll: T = buildStringValue("all-scroll")

  /**
    * The item/column can be resized horizontally. Often rendered as arrows
    * pointing left and right with a vertical separating.  --MDN
    */
  lazy val colResize: T = buildStringValue("col-resize")

  /**
    * The item/row can be resized vertically. Often rendered as arrows pointing
    * up and down with a horizontal bar separating them.  --MDN
    */
  lazy val rowResize: T = buildStringValue("row-resize")

  /** The top edge is to be moved.  --MDN */
  lazy val nResize: T = buildStringValue("n-resize")

  /** The right edge is to be moved.  --MDN */
  lazy val eResize: T = buildStringValue("e-resize")

  /** The bottom edge is to be moved.  --MDN */
  lazy val sResize: T = buildStringValue("s-resize")

  /** The left edge is to be moved.  --MDN */
  lazy val wResize: T = buildStringValue("w-resize")

  /** The top-right corner is to be moved.  --MDN */
  lazy val neResize: T = buildStringValue("ne-resize")

  /** The top-left corner is to be moved.  --MDN */
  lazy val nwResize: T = buildStringValue("nw-resize")

  /** The bottom-right corner is to be moved.  --MDN */
  lazy val seResize: T = buildStringValue("se-resize")

  /** The bottom-left corner is to be moved.  --MDN */
  lazy val swResize: T = buildStringValue("sw-resize")

  /** The left and right edges are to be moved. */
  lazy val ewResize: T = buildStringValue("ew-resize")

  /** The top and bottom edges are to be moved. */
  lazy val nsResize: T = buildStringValue("ns-resize")

  /** The top right and bottom left corners are to be moved. */
  lazy val neswResize: T = buildStringValue("nesw-resize")

  /** The top left and bottom right corners are to be moved. */
  lazy val nwseResize: T = buildStringValue("nwse-resize")

  /** Indicates that something can be zoomed (magnified) in.  --MDN */
  lazy val zoomIn: T = buildStringValue("zoom-in")

  /** Indicates that something can be zoomed (magnified) out.  --MDN */
  lazy val zoomOut: T = buildStringValue("zoom-out")

  /** Indicates that something can be grabbed (dragged to be moved).  --MDN */
  lazy val grab: T = buildStringValue("grab")

  /** Indicates that something can be grabbed (dragged to be moved).  --MDN */
  lazy val grabbing: T = buildStringValue("grabbing")
}
