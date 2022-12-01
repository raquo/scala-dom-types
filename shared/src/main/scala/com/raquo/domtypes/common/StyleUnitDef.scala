package com.raquo.domtypes.common

case class StyleUnitDef(
  scalaName: String,
  valueType: String,
  encoderImpl: String,
  override val commentLines: List[String],
  override val docUrls: List[String]
) extends KeyDef
