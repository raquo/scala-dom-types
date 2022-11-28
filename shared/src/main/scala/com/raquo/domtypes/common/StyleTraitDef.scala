package com.raquo.domtypes.common

/**
  * This type represents a set of keywords ("block", "black", etc.)
  * and units ("px", "ms", etc.) that can be used with a particular
  * CSS style property.
  *
  * @param scalaName     - suggested core name for this trait
  * @param extendsTraits - [[scalaName]]-s of `StyleTraitDef`-s that this trait extends
  * @param extendsUnits  - list of types of units that form valid values for style
  *                        properties extending this trait. #TODO
  * @param keywords      - list of keywords that are valid values for style properties
  *                        extending this trait. See [[StyleKeywordDef]]
  */
case class StyleTraitDef(
  scalaName: String,
  extendsTraits: List[String],
  extendsUnits: List[String],
  keywords: List[StyleKeywordDef]
)
