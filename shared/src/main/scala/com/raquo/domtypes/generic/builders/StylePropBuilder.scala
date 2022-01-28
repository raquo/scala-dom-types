package com.raquo.domtypes.generic.builders

import com.raquo.domtypes.generic.defs.styles.{keywords, units}

/**
  * This trait contains functionality for creating CSS Styles and Style Setters.
  *
  * @tparam Prop     Representation of a DOM CSS style property, e.g. "background"
  * @tparam Setter   Representation of a key-value pair, for a specific style property and its value
  */
trait StylePropBuilder[Prop[_], Setter[_], DerivedProp[_], LengthNum] {

  type AutoStyle[V] = Prop[V] with keywords.AutoStyle[Setter[V]]

  type AlignContentStyle = Prop[String] with keywords.AlignContentStyle[Setter[String]]

  type BackgroundAttachmentStyle = Prop[String] with keywords.BackgroundAttachmentStyle[Setter[String]]

  type BackgroundSizeStyle = Prop[String] with keywords.BackgroundSizeStyle[Setter[String], DerivedProp, LengthNum]

  type BackfaceVisibilityStyle = Prop[String] with keywords.BackfaceVisibilityStyle[Setter[String]]

  type BorderCollapseStyle = Prop[String] with keywords.BorderCollapseStyle[Setter[String]]

  type BoxSizingStyle = Prop[String] with keywords.BoxSizingStyle[Setter[String]]

  type ClearStyle = Prop[String] with keywords.ClearStyle[Setter[String]]

  type ColorStyle = Prop[String] with keywords.ColorStyle[Setter[String]]

  type CursorStyle = Prop[String] with keywords.CursorStyle[Setter[String]]

  type DirectionStyle = Prop[String] with keywords.DirectionStyle[Setter[String]]

  type DisplayStyle = Prop[String] with keywords.DisplayStyle[Setter[String]]

  type EmptyCellsStyle = Prop[String] with keywords.EmptyCellsStyle[Setter[String]]

  type FlexWrapStyle = Prop[String] with keywords.FlexWrapStyle[Setter[String]]

  type FlexDirectionStyle = Prop[String] with keywords.FlexDirectionStyle[Setter[String]]

  type FlexPositionStyle = Prop[String] with keywords.FlexPositionStyle[Setter[String]]

  type FloatStyle = Prop[String] with keywords.FloatStyle[Setter[String]]

  type FontSizeStyle = Prop[String] with keywords.FontSizeStyle[Setter[String], DerivedProp, LengthNum]

  type FontStyleStyle = Prop[String] with keywords.FontStyleStyle[Setter[String]]

  type FontWeightStyle = Prop[String] with keywords.FontWeightStyle[Setter[String]]

  type JustifyContentStyle = Prop[String] with keywords.JustifyContentStyle[Setter[String]]

  type LengthStyle = Prop[String] with units.LengthUnits[DerivedProp, LengthNum] with StyleStringValueBuilder[Setter[String]]

  type LineStyle = Prop[String] with keywords.LineStyle[Setter[String]]

  type ListStylePositionStyle = Prop[String] with keywords.ListStylePositionStyle[Setter[String]]

  type MaxLengthStyle = Prop[String] with keywords.MinMaxLengthStyle[Setter[String], DerivedProp, LengthNum] with keywords.NoneStyle[Setter[String]]

  type MinLengthStyle = Prop[String] with keywords.MinMaxLengthStyle[Setter[String], DerivedProp, LengthNum] with keywords.AutoStyle[Setter[String]]

  type NoneStyle[V] = Prop[V] with keywords.NoneStyle[Setter[V]]

  type NormalStyle[V] = Prop[V] with keywords.NormalStyle[Setter[V]]

  type OverflowStyle = Prop[String] with keywords.OverflowStyle[Setter[String]]

  type OverflowWrapStyle = Prop[String] with keywords.OverflowWrapStyle[Setter[String]]

  type PaddingBoxSizingStyle = Prop[String] with keywords.PaddingBoxSizingStyle[Setter[String]]

  type PageBreakStyle = Prop[String] with keywords.PageBreakStyle[Setter[String]]

  type PointerEventsStyle = Prop[String] with keywords.PointerEventsStyle[Setter[String]]

  type PositionStyle = Prop[String] with keywords.PositionStyle[Setter[String]]

  type TableLayoutStyle = Prop[String] with keywords.TableLayoutStyle[Setter[String]]

  type TextAlignStyle = Prop[String] with keywords.TextAlignStyle[Setter[String]]

  type TextDecorationStyle = Prop[String] with keywords.TextDecorationStyle[Setter[String]]

  type TextOverflowStyle = Prop[String] with keywords.TextOverflowStyle[Setter[String]]

  type TextTransformStyle = Prop[String] with keywords.TextTransformStyle[Setter[String]]

  type TextUnderlinePositionStyle = Prop[String] with keywords.TextUnderlinePositionStyle[Setter[String]]

  type TimeStyle = Prop[String] with units.TimeUnits[DerivedProp] with StyleStringValueBuilder[Setter[String]]

  type UrlStyle = Prop[String] with units.UrlUnits[DerivedProp] with StyleStringValueBuilder[Setter[String]]

  type VerticalAlignStyle = Prop[String] with keywords.VerticalAlignStyle[Setter[String], DerivedProp, LengthNum]

  type VisibilityStyle = Prop[String] with keywords.VisibilityStyle[Setter[String]]

  type WhiteSpaceStyle = Prop[String] with keywords.WhiteSpaceStyle[Setter[String]]

  type WordBreakStyle = Prop[String] with keywords.WordBreakStyle[Setter[String]]




  // -- Basic style types --

  protected def stringStyle(key: String): Prop[String] with StyleStringValueBuilder[Setter[String]]

  protected def intStyle(key: String): Prop[Int] with units.CalcUnits[DerivedProp] with StyleStringValueBuilder[Setter[Int]]

  protected def doubleStyle(key: String): Prop[Double] with units.CalcUnits[DerivedProp] with StyleStringValueBuilder[Setter[Double]]




  // -- Shared custom types --

  protected def autoStyle[V](key: String): AutoStyle[V]

  protected def colorStyle(key: String): ColorStyle

  protected def colorUrlStyle(key: String): ColorStyle with UrlStyle

  protected def flexPositionStyle(key: String): FlexPositionStyle

  protected def lengthStyle(key: String): LengthStyle

  protected def lengthAutoStyle(key: String): LengthStyle with AutoStyle[String]

  protected def lengthNormalStyle(key: String): LengthStyle with NormalStyle[String]

  protected def lineStyle(key: String): LineStyle

  protected def maxLengthStyle(key: String): MaxLengthStyle

  protected def minLengthStyle(key: String): MinLengthStyle

  protected def noneStyle[V](key: String): NoneStyle[V]

  protected def normalStyle[V](key: String): NormalStyle[V]

  protected def overflowStyle(key: String): OverflowStyle

  protected def paddingBoxSizingStyle(key: String): PaddingBoxSizingStyle

  protected def pageBreakStyle(key: String): PageBreakStyle

  protected def textAlignStyle(key: String): TextAlignStyle

  protected def timeStyle(key: String): TimeStyle

  protected def urlStyle(key: String): UrlStyle

  protected def urlNoneStyle(key: String): UrlStyle with NoneStyle[String]




  // -- Unique custom types --

  protected def alignContentStyle(key: String): AlignContentStyle

  protected def backgroundAttachmentStyle(key: String): BackgroundAttachmentStyle

  protected def backgroundSizeStyle(key: String): BackgroundSizeStyle

  protected def backfaceVisibilityStyle(key: String): BackfaceVisibilityStyle

  protected def borderCollapse(key: String): BorderCollapseStyle

  protected def boxSizingStyle(key: String): BoxSizingStyle

  protected def clearStyle(key: String): ClearStyle

  protected def cursorStyle(key: String): CursorStyle

  protected def directionStyle(key: String): DirectionStyle

  protected def displayStyle(key: String): DisplayStyle

  protected def emptyCellsStyle(key: String): EmptyCellsStyle

  protected def flexWrapStyle(key: String): FlexWrapStyle

  protected def flexDirectionStyle(key: String): FlexDirectionStyle

  protected def floatStyle(key: String): FloatStyle

  protected def fontSizeStyle(key: String): FontSizeStyle

  protected def fontStyleStyle(key: String): FontStyleStyle

  protected def fontWeightStyle(key: String): FontWeightStyle

  protected def justifyContentStyle(key: String): JustifyContentStyle

  protected def listStylePositionStyle(key: String): ListStylePositionStyle

  protected def overflowWrapStyle(key: String): OverflowWrapStyle

  protected def pointerEventsStyle(key: String): PointerEventsStyle

  protected def positionStyle(key: String): PositionStyle

  protected def tableLayoutStyle(key: String): TableLayoutStyle

  protected def textDecorationStyle(key: String): TextDecorationStyle

  protected def textOverflowStyle(key: String): TextOverflowStyle

  protected def textTransformStyle(key: String): TextTransformStyle

  protected def textUnderlinePositionStyle(key: String): TextUnderlinePositionStyle

  protected def verticalAlignStyle(key: String): VerticalAlignStyle

  protected def visibilityStyle(key: String): VisibilityStyle

  protected def whiteSpaceStyle(key: String): WhiteSpaceStyle

  protected def wordBreakStyle(key: String): WordBreakStyle

}
