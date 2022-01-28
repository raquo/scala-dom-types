package com.raquo.domtypes.fixtures.styles

import com.raquo.domtypes.generic.builders.StylePropBuilder
import com.raquo.domtypes.generic.defs.styles.{keywords, units}

trait ExampleStylePropBuilder extends StylePropBuilder[
  ExampleStyleProp,
  ExampleStyleSetter,
  ExampleDerivedStyleProp.Base,
  Int
] {

  // -- Basic style types --

  override protected def stringStyle(key: String): ExampleStyleProp[String] =
    new ExampleStyleProp[String](key)

  override protected def intStyle(key: String): ExampleStyleProp[Int] with units.CalcUnits[ExampleDerivedStyleProp.Base] = {
    new ExampleStyleProp[Int](key) with units.CalcUnits[ExampleDerivedStyleProp.Base]
  }

  override protected def doubleStyle(key: String): ExampleStyleProp[Double] with units.CalcUnits[ExampleDerivedStyleProp.Base] =
    new ExampleStyleProp[Double](key) with units.CalcUnits[ExampleDerivedStyleProp.Base]




  // -- Shared custom types --

  override protected def autoStyle[V](key: String): AutoStyle[V] =
    new ExampleStyleProp[V](key) with keywords.AutoStyle[ExampleStyleSetter[V]]

  override protected def colorStyle(key: String): ColorStyle =
    new ExampleStyleProp[String](key) with keywords.ColorStyle[ExampleStyleSetter[String]]

  override protected def colorUrlStyle(key: String): ColorStyle with UrlStyle =
    new ExampleStyleProp[String](key) with keywords.ColorStyle[ExampleStyleSetter[String]] with units.UrlUnits[ExampleDerivedStyleProp.Base]

  override protected def flexPositionStyle(key: String): FlexPositionStyle =
    new ExampleStyleProp[String](key) with keywords.FlexPositionStyle[ExampleStyleSetter[String]]

  override protected def lengthStyle(key: String): LengthStyle =
    new ExampleStyleProp[String](key) with units.LengthUnits[ExampleDerivedStyleProp.Base, Int]

  override protected def lengthAutoStyle(key: String): LengthStyle with AutoStyle[String] =
    new ExampleStyleProp[String](key) with units.LengthUnits[ExampleDerivedStyleProp.Base, Int] with keywords.AutoStyle[ExampleStyleSetter[String]]

  override protected def lengthNormalStyle(key: String): LengthStyle with NormalStyle[String] =
    new ExampleStyleProp[String](key) with units.LengthUnits[ExampleDerivedStyleProp.Base, Int] with keywords.NormalStyle[ExampleStyleSetter[String]]

  override protected def lineStyle(key: String): LineStyle =
    new ExampleStyleProp[String](key) with keywords.LineStyle[ExampleStyleSetter[String]]

  override protected def maxLengthStyle(key: String): MaxLengthStyle =
    new ExampleStyleProp[String](key) with keywords.MinMaxLengthStyle[ExampleStyleSetter[String], ExampleDerivedStyleProp.Base, Int] with keywords.NoneStyle[ExampleStyleSetter[String]]

  override protected def minLengthStyle(key: String): MinLengthStyle =
    new ExampleStyleProp[String](key) with keywords.MinMaxLengthStyle[ExampleStyleSetter[String], ExampleDerivedStyleProp.Base, Int] with keywords.AutoStyle[ExampleStyleSetter[String]]

  override protected def noneStyle[V](key: String): NoneStyle[V] =
    new ExampleStyleProp[V](key) with keywords.NoneStyle[ExampleStyleSetter[V]]

  override protected def normalStyle[V](key: String): NormalStyle[V] =
    new ExampleStyleProp[V](key) with keywords.NormalStyle[ExampleStyleSetter[V]]

  override protected def overflowStyle(key: String): OverflowStyle =
    new ExampleStyleProp[String](key) with keywords.OverflowStyle[ExampleStyleSetter[String]]

  override protected def paddingBoxSizingStyle(key: String): PaddingBoxSizingStyle =
    new ExampleStyleProp[String](key) with keywords.PaddingBoxSizingStyle[ExampleStyleSetter[String]]

  override protected def pageBreakStyle(key: String): PageBreakStyle =
    new ExampleStyleProp[String](key) with keywords.PageBreakStyle[ExampleStyleSetter[String]]

  override protected def textAlignStyle(key: String): TextAlignStyle =
    new ExampleStyleProp[String](key) with keywords.TextAlignStyle[ExampleStyleSetter[String]]

  override protected def timeStyle(key: String): TimeStyle =
    new ExampleStyleProp[String](key) with units.TimeUnits[ExampleDerivedStyleProp.Base]

  override protected def urlStyle(key: String): UrlStyle =
    new ExampleStyleProp[String](key) with units.UrlUnits[ExampleDerivedStyleProp.Base]

  override protected def urlNoneStyle(key: String): UrlStyle with NoneStyle[String] =
    new ExampleStyleProp[String](key) with units.UrlUnits[ExampleDerivedStyleProp.Base] with keywords.NoneStyle[ExampleStyleSetter[String]]




  // -- Unique custom types --

  override protected def alignContentStyle(key: String): AlignContentStyle =
    new ExampleStyleProp[String](key) with keywords.AlignContentStyle[ExampleStyleSetter[String]]

  override protected def backgroundAttachmentStyle(key: String): BackgroundAttachmentStyle =
    new ExampleStyleProp[String](key) with keywords.BackgroundAttachmentStyle[ExampleStyleSetter[String]]

  override protected def backgroundSizeStyle(key: String): BackgroundSizeStyle =
    new ExampleStyleProp[String](key) with keywords.BackgroundSizeStyle[ExampleStyleSetter[String], ExampleDerivedStyleProp.Base, Int]

  override protected def backfaceVisibilityStyle(key: String): BackfaceVisibilityStyle =
    new ExampleStyleProp[String](key) with keywords.BackfaceVisibilityStyle[ExampleStyleSetter[String]]

  override protected def borderCollapse(key: String): BorderCollapseStyle =
    new ExampleStyleProp[String](key) with keywords.BorderCollapseStyle[ExampleStyleSetter[String]]

  override protected def boxSizingStyle(key: String): BoxSizingStyle =
    new ExampleStyleProp[String](key) with keywords.BoxSizingStyle[ExampleStyleSetter[String]]

  override protected def clearStyle(key: String): ClearStyle =
    new ExampleStyleProp[String](key) with keywords.ClearStyle[ExampleStyleSetter[String]]

  override protected def cursorStyle(key: String): CursorStyle =
    new ExampleStyleProp[String](key) with keywords.CursorStyle[ExampleStyleSetter[String]]

  override protected def directionStyle(key: String): DirectionStyle =
    new ExampleStyleProp[String](key) with keywords.DirectionStyle[ExampleStyleSetter[String]]

  override protected def displayStyle(key: String): DisplayStyle =
    new ExampleStyleProp[String](key) with keywords.DisplayStyle[ExampleStyleSetter[String]]

  override protected def emptyCellsStyle(key: String): EmptyCellsStyle =
    new ExampleStyleProp[String](key) with keywords.EmptyCellsStyle[ExampleStyleSetter[String]]

  override protected def flexWrapStyle(key: String): FlexWrapStyle =
    new ExampleStyleProp[String](key) with keywords.FlexWrapStyle[ExampleStyleSetter[String]]

  override protected def flexDirectionStyle(key: String): FlexDirectionStyle =
    new ExampleStyleProp[String](key) with keywords.FlexDirectionStyle[ExampleStyleSetter[String]]

  override protected def floatStyle(key: String): FloatStyle =
    new ExampleStyleProp[String](key) with keywords.FloatStyle[ExampleStyleSetter[String]]

  override protected def fontSizeStyle(key: String): FontSizeStyle =
    new ExampleStyleProp[String](key) with keywords.FontSizeStyle[ExampleStyleSetter[String], ExampleDerivedStyleProp.Base, Int]

  override protected def fontStyleStyle(key: String): FontStyleStyle =
    new ExampleStyleProp[String](key) with keywords.FontStyleStyle[ExampleStyleSetter[String]]

  override protected def fontWeightStyle(key: String): FontWeightStyle =
    new ExampleStyleProp[String](key) with keywords.FontWeightStyle[ExampleStyleSetter[String]]

  override protected def justifyContentStyle(key: String): JustifyContentStyle =
    new ExampleStyleProp[String](key) with keywords.JustifyContentStyle[ExampleStyleSetter[String]]

  override protected def listStylePositionStyle(key: String): ListStylePositionStyle =
    new ExampleStyleProp[String](key) with keywords.ListStylePositionStyle[ExampleStyleSetter[String]]

  override protected def overflowWrapStyle(key: String): OverflowWrapStyle =
    new ExampleStyleProp[String](key) with keywords.OverflowWrapStyle[ExampleStyleSetter[String]]

  override protected def pointerEventsStyle(key: String): PointerEventsStyle =
    new ExampleStyleProp[String](key) with keywords.PointerEventsStyle[ExampleStyleSetter[String]]

  override protected def positionStyle(key: String): PositionStyle =
    new ExampleStyleProp[String](key) with keywords.PositionStyle[ExampleStyleSetter[String]]

  override protected def tableLayoutStyle(key: String): TableLayoutStyle =
    new ExampleStyleProp[String](key) with keywords.TableLayoutStyle[ExampleStyleSetter[String]]

  override protected def textDecorationStyle(key: String): TextDecorationStyle =
    new ExampleStyleProp[String](key) with keywords.TextDecorationStyle[ExampleStyleSetter[String]]

  override protected def textOverflowStyle(key: String): TextOverflowStyle =
    new ExampleStyleProp[String](key) with keywords.TextOverflowStyle[ExampleStyleSetter[String]]

  override protected def textTransformStyle(key: String): TextTransformStyle =
    new ExampleStyleProp[String](key) with keywords.TextTransformStyle[ExampleStyleSetter[String]]

  override protected def textUnderlinePositionStyle(key: String): TextUnderlinePositionStyle =
    new ExampleStyleProp[String](key) with keywords.TextUnderlinePositionStyle[ExampleStyleSetter[String]]

  override protected def verticalAlignStyle(key: String): VerticalAlignStyle =
    new ExampleStyleProp[String](key) with keywords.VerticalAlignStyle[ExampleStyleSetter[String], ExampleDerivedStyleProp.Base, Int]

  override protected def visibilityStyle(key: String): VisibilityStyle =
    new ExampleStyleProp[String](key) with keywords.VisibilityStyle[ExampleStyleSetter[String]]

  override protected def whiteSpaceStyle(key: String): WhiteSpaceStyle =
    new ExampleStyleProp[String](key) with keywords.WhiteSpaceStyle[ExampleStyleSetter[String]]

  override protected def wordBreakStyle(key: String): WordBreakStyle =
    new ExampleStyleProp[String](key) with keywords.WordBreakStyle[ExampleStyleSetter[String]]

}
