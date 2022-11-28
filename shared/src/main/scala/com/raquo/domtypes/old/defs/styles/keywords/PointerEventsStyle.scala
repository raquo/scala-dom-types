package com.raquo.domtypes.old.defs.styles.keywords

/** @see https://developer.mozilla.org/en-US/docs/Web/CSS/pointer-events */
trait PointerEventsStyle[T] extends NoneStyle[T] with AutoStyle[T] {

  /**
    * The element behaves as it would if the pointer-events property was not
    * specified. In SVG content, this value and the value visiblePainted have
    * the same effect.  --MDN
    */
  override lazy val auto: T = buildStringValue("auto")

  /**
    * The element is never the target of mouse events; however, mouse events
    * may target its descendant elements if those descendants have pointer-events
    * set to some other value. In these circumstances, mouse events will trigger
    * event listeners on this parent element as appropriate on their way to/from
    * the descendant during the event capture/bubble phases.  --MDN
    */
  override lazy val none: T = buildStringValue("none")

  /**
    * SVG only. The element can only be the target of a mouse event when the
    * visibility property is set to visible and when the mouse cursor is over
    * the interior (i.e., 'fill') of the element and the fill property is set
    * to a value other than none, or when the mouse cursor is over the perimeter
    * (i.e., 'stroke') of the element and the stroke property is set to a value
    * other than none.  --MDN
    */
  lazy val visiblePainted: T = buildStringValue("visiblePainted")

  /**
    * SVG only. The element can only be the target of a mouse event when the
    * visibility property is set to visible and when the mouse cursor is over
    * the interior (i.e., fill) of the element. The value of the fill property
    * does not effect event processing.  --MDN
    */
  lazy val visibleFill: T = buildStringValue("visibleFill")

  /**
    * SVG only. The element can only be the target of a mouse event when the
    * visibility property is set to visible and when the mouse cursor is over
    * the perimeter (i.e., stroke) of the element. The value of the stroke
    * property does not effect event processing.  --MDN
    */
  lazy val visibleStroke: T = buildStringValue("visibleStroke")

  /**
    * SVG only. The element can be the target of a mouse event when the
    * visibility property is set to visible and the mouse cursor is over either
    * the interior (i.e., fill) or the perimeter (i.e., stroke) of the element.
    * The values of the fill and stroke do not effect event processing.  --MDN
    */
  lazy val visible: T = buildStringValue("visible")

  /**
    * SVG only. The element can only be the target of a mouse event when the
    * mouse cursor is over the interior (i.e., 'fill') of the element and the
    * fill property is set to a value other than none, or when the mouse cursor
    * is over the perimeter (i.e., 'stroke') of the element and the stroke
    * property is set to a value other than none. The value of the visibility
    * property does not effect event processing.  --MDN
    */
  lazy val painted: T = buildStringValue("painted")

  /**
    * SVG only. The element can only be the target of a mouse event when the
    * pointer is over the interior (i.e., fill) of the element. The values of
    * the fill and visibility properties do not effect event processing.  --MDN
    */
  lazy val fill: T = buildStringValue("fill")

  /**
    * SVG only. The element can only be the target of a mouse event when the
    * pointer is over the perimeter (i.e., stroke) of the element. The values
    * of the stroke and visibility properties do not effect event processing.
    * --MDN
    */
  lazy val stroke: T = buildStringValue("stroke")

  /**
    * SVG only. The element can only be the target of a mouse event when the
    * pointer is over the interior (i.e., fill) or the perimeter (i.e., stroke)
    * of the element. The values of the fill, stroke and visibility properties
    * do not effect event processing.  --MDN
    */
  lazy val all: T = buildStringValue("all")

}
