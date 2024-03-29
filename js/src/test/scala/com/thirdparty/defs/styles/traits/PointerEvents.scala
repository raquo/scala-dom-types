package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait PointerEvents extends None with Auto { this: StyleProp[_] =>

  /**
    * The element behaves as it would if the pointer-events property was not
    * specified. In SVG content, this value and the value visiblePainted have
    * the same effect.
    */
  override lazy val auto: StyleSetter[_] = this := "auto"

  /**
    * The element is never the target of mouse events; however, mouse events
    * may target its descendant elements if those descendants have pointer-events
    * set to some other value. In these circumstances, mouse events will trigger
    * event listeners on this parent element as appropriate on their way to/from
    * the descendant during the event capture/bubble phases.
    */
  override lazy val none: StyleSetter[_] = this := "none"

  /**
    * SVG only. The element can only be the target of a mouse event when the
    * visibility property is set to visible and when the mouse cursor is over
    * the interior (i.e., 'fill') of the element and the fill property is set
    * to a value other than none, or when the mouse cursor is over the perimeter
    * (i.e., 'stroke') of the element and the stroke property is set to a value
    * other than none.
    */
  lazy val visiblePainted: StyleSetter[_] = this := "visiblePainted"

  /**
    * SVG only. The element can only be the target of a mouse event when the
    * visibility property is set to visible and when the mouse cursor is over
    * the interior (i.e., fill) of the element. The value of the fill property
    * does not effect event processing.
    */
  lazy val visibleFill: StyleSetter[_] = this := "visibleFill"

  /**
    * SVG only. The element can only be the target of a mouse event when the
    * visibility property is set to visible and when the mouse cursor is over
    * the perimeter (i.e., stroke) of the element. The value of the stroke
    * property does not effect event processing.
    */
  lazy val visibleStroke: StyleSetter[_] = this := "visibleStroke"

  /**
    * SVG only. The element can be the target of a mouse event when the
    * visibility property is set to visible and the mouse cursor is over either
    * the interior (i.e., fill) or the perimeter (i.e., stroke) of the element.
    * The values of the fill and stroke do not effect event processing.
    */
  lazy val visible: StyleSetter[_] = this := "visible"

  /**
    * SVG only. The element can only be the target of a mouse event when the
    * mouse cursor is over the interior (i.e., 'fill') of the element and the
    * fill property is set to a value other than none, or when the mouse cursor
    * is over the perimeter (i.e., 'stroke') of the element and the stroke
    * property is set to a value other than none. The value of the visibility
    * property does not effect event processing.
    */
  lazy val painted: StyleSetter[_] = this := "painted"

  /**
    * SVG only. The element can only be the target of a mouse event when the
    * pointer is over the interior (i.e., fill) of the element. The values of
    * the fill and visibility properties do not effect event processing.
    */
  lazy val fill: StyleSetter[_] = this := "fill"

  /**
    * SVG only. The element can only be the target of a mouse event when the
    * pointer is over the perimeter (i.e., stroke) of the element. The values
    * of the stroke and visibility properties do not effect event processing.
    */
  lazy val stroke: StyleSetter[_] = this := "stroke"

  /**
    * SVG only. The element can only be the target of a mouse event when the
    * pointer is over the interior (i.e., fill) or the perimeter (i.e., stroke)
    * of the element. The values of the fill, stroke and visibility properties
    * do not effect event processing.
    */
  lazy val all: StyleSetter[_] = this := "all"

}
