package com.raquo.domtypes.common

/**
  * This type represents a set of keywords ("block", "black", etc.)
  * and units ("px", "ms", etc.) that can be used with a particular
  * CSS style property.
  *
  * @param scalaName        - suggested core name for this trait.
  * @param extendsTraits    - [[scalaName]]-s of `StyleTraitDef`-s that this trait extends
  * @param extendsUnits     - list of types of units that form valid values for style
  *                           properties extending this trait. #TODO
  * @param keywordDefGroups - list of keywords that are valid values for style properties
  *                           extending this trait. See [[StyleKeywordDef]]
  *                           - It's grouped by a comment string that will appear on top
  *                             of the first keyword in the group, e.g. see the "display"
  *                             keywords.
  */
case class StyleTraitDef (
  scalaName: String,
  extendsTraits: List[String],
  extendsUnits: List[String],
  keywordDefGroups: List[(String, List[StyleKeywordDef])]
) extends KeyDef {

  override def commentLines: List[String] = Nil

  override def docUrls: List[String] = Nil
}
