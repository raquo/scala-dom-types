package com.raquo.domtypes.common

case class ComplexKeyDef(
  tagType: TagType,
  scalaName: String,
  domAttrName: String,
  domPropName: Option[String],
  override val commentLines: List[String],
  override val docUrls: List[String]
) extends KeyDef
