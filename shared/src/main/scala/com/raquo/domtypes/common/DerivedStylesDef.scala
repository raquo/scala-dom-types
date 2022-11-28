package com.raquo.domtypes.common

// #TODO
case class DerivedStylesDef(
  scalaName: String,
  extendsUnitsDefs: List[String],
  commentLines: List[String],
  unitDefs: List[DerivedStyleDef]
)
