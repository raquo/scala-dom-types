package com.raquo.domtypes.common

case class ComplexKeyDef(
  tagType: TagType,
  scalaName: String,
  domAttrName: String,
  domPropName: Option[String],
  commentLines: List[String],
  docUrls: List[String]
)
