package com.raquo.domtypes.common

/**
  * This type represents a set of unit-related helpers ("px", "ms", etc.)
  * that can be used with a particular CSS style property.
  *
  * @param scalaName     - suggested core name for this trait.
  * @param extendsUnits  - list of scalaName-s of StyleUnitTraitDef-s that this trait extends
  * @param units         - list of helpers available to style properties extending this trait.
  *                        See [[StyleUnitDef]]
  */
case class StyleUnitTraitDef(
  scalaName: String,
  extendsUnits: List[String],
  units: List[(String, List[StyleUnitDef])],
  override val commentLines: List[String],
  override val docUrls: List[String]
) extends KeyDef
