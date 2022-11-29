package com.raquo.domtypes.common

// #TODO
case class DerivedStylesDef(
  scalaName: String,
  extendsUnitsDefs: List[String],
  override val commentLines: List[String],
  unitDefs: List[DerivedStyleDef]
) extends KeyDef {

  override def docUrls: List[String] = Nil
}
