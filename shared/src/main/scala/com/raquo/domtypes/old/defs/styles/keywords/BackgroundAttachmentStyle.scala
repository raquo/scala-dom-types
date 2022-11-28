package com.raquo.domtypes.old.defs.styles.keywords

import com.raquo.domtypes.old.builders.StyleStringValueBuilder

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/background-attachment */
trait BackgroundAttachmentStyle[T] extends StyleStringValueBuilder[T] {

  /**
    * The background is fixed relative to the viewport. Even if an element has
    * a scrolling mechanism, the background doesn't move with the element.
    * (This is not compatible with background-clip: text.)  --MDN
    */
  lazy val fixed: T = buildStringValue("fixed")

  /**
    * The background is fixed relative to the element's contents. If the element
    * has a scrolling mechanism, the background scrolls with the element's
    * contents, and the background painting area and background positioning area
    * are relative to the scrollable area of the element rather than to the
    * border framing them.  --MDN
    */
  lazy val local: T = buildStringValue("local")

  /**
    * The background is fixed relative to the element itself and does not scroll
    * with its contents. (It is effectively attached to the element's border.)
    * --MDN
    */
  lazy val scroll: T = buildStringValue("scroll")
}
