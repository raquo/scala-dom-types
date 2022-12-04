package com.raquo.domtypes.defs.styles

/** Constants to be used in StylePropDefs and StyleTraitDefs */
object StyleDefs {

  object valueTypes {

    val String = "String"

    val Int = "Int"
  }

  object implNames {

    // -- Basic types --

    val stringStyle = "stringStyle"

    val intStyle = "intStyle"

    val doubleStyle = "doubleStyle"


    // -- Shared types --

    val autoStyle_ = "autoStyle[_]"

    val colorStyle = "colorStyle"

    val flexPositionStyle = "flexPositionStyle"

    val lengthStyle = "lengthStyle"

    val lengthAutoStyle = "lengthAutoStyle"

    val lineStyle = "lineStyle"

    val maxLengthStyle = "maxLengthStyle"

    val minLengthStyle = "minLengthStyle"

    val noneStyle_ = "noneStyle[_]"

    val normalStyle_ = "normalStyle[_]"

    val overflowStyle = "overflowStyle"

    val paddingBoxSizingStyle = "paddingBoxSizingStyle"

    val pageBreakStyle = "pageBreakStyle"

    val textAlignStyle = "textAlignStyle"

    val timeStyle = "timeStyle"

    val urlNoneStyle = "urlNoneStyle"

    val urlStyle = "urlStyle"


    // -- Unique types --

    val alignContentStyle = "alignContentStyle"

    val backfaceVisibilityStyle = "backfaceVisibilityStyle"

    val backgroundAttachmentStyle = "backgroundAttachmentStyle"

    val backgroundSizeStyle = "backgroundSizeStyle"

    val borderCollapseStyle = "borderCollapseStyle"

    val boxSizingStyle = "boxSizingStyle"

    val clearStyle = "clearStyle"

    val colorUrlStyle = "colorUrlStyle"

    val cursorStyle = "cursorStyle"

    val directionStyle = "directionStyle"

    val displayStyle = "displayStyle"

    val emptyCellsStyle = "emptyCellsStyle"

    val flexDirectionStyle = "flexDirectionStyle"

    val flexWrapStyle = "flexWrapStyle"

    val floatStyle = "floatStyle"

    val fontSizeStyle = "fontSizeStyle"

    val fontStyleStyle = "fontStyleStyle"

    val fontWeightStyle = "fontWeightStyle"

    val justifyContentStyle = "justifyContentStyle"

    val lengthNormalStyle = "lengthNormalStyle"

    val listStylePositionStyle = "listStylePositionStyle"

    val listStyleTypeStyle = "listStyleTypeStyle"

    val mixBlendModeStyle = "mixBlendModeStyle"

    val overflowWrapStyle = "overflowWrapStyle"

    val pointerEventsStyle = "pointerEventsStyle"

    val positionStyle = "positionStyle"

    val tableLayoutStyle = "tableLayoutStyle"

    val textDecorationStyle = "textDecorationStyle"

    val textOverflowStyle = "textOverflowStyle"

    val textTransformStyle = "textTransformStyle"

    val textUnderlinePositionStyle = "textUnderlinePositionStyle"

    val verticalAlignStyle = "verticalAlignStyle"

    val visibilityStyle = "visibilityStyle"

    val whiteSpaceStyle = "whiteSpaceStyle"

    val wordBreakStyle = "wordBreakStyle"


  }

  object valueTraits {

    /**
      * All value traits are assumed to extend this trait.
      * - Do NOT add it to the list of valueTraits / extendsValueTraits in the defs here.
      */
    val GlobalKeywords = "GlobalKeywords"

    // -- Shared traits --

    val Auto_ = "Auto[_]"

    val Color = "Color"

    val FlexPosition = "FlexPosition"

    val Line = "Line"

    val LineWidth = "LineWidth" // #TODO Unused for now. It's kind of a useless trait.

    val MinMaxLength = "MinMaxLength"

    val None_ = "None[_]"

    val Normal_ = "Normal[_]"

    val Overflow = "Overflow"

    val PageBreak = "PageBreak"

    val PaddingBoxSizing = "PaddingBoxSizing"

    val TextAlign = "TextAlign"


    // -- Unique traits --

    val AlignContent = "AlignContent"

    val BackfaceVisibility = "BackfaceVisibility"

    val BackgroundAttachment = "BackgroundAttachment"

    val BackgroundSize = "BackgroundSize"

    val BorderCollapse = "BorderCollapse"

    val BoxSizing = "BoxSizing"

    val Clear = "Clear"

    val Cursor = "Cursor"

    val Direction = "Direction"

    val Display = "Display"

    val EmptyCells = "EmptyCells"

    val FlexDirection = "FlexDirection"

    val FlexWrap = "FlexWrap"

    val Float = "Float"

    val FontSize = "FontSize"

    val FontStyle = "FontStyle"

    val FontWeight = "FontWeight"

    val JustifyContent = "JustifyContent"

    val ListStylePosition = "ListStylePosition"

    val ListStyleType = "ListStyleType"

    val MixBlendMode = "MixBlendMode"

    val OverflowWrap = "OverflowWrap"

    val PointerEvents = "PointerEvents"

    val Position = "Position"

    val TableLayout = "TableLayout"

    val TextDecoration = "TextDecoration"

    val TextOverflow = "TextOverflow"

    val TextTransform = "TextTransform"

    val TextUnderlinePosition = "TextUnderlinePosition"

    val VerticalAlign = "VerticalAlign"

    val Visibility = "Visibility"

    val WhiteSpace = "WhiteSpace"

    val WordBreak = "WordBreak"

  }

  object valueUnits {

    val Time = "Time"

    val Color = "Color"

    val Length = "Length"

    val Url = "Url"

    val Calc = "Calc"
  }

}
