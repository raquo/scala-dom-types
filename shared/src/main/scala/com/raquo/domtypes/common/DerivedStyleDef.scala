package com.raquo.domtypes.common

// #TODO
// "px", "calc()", etc.
case class DerivedStyleDef(
  scalaName: String,
  scalaInputType: String,
  encodeFn: String,
  override val commentLines: List[String],
  override val docUrls: List[String]
) extends KeyDef
